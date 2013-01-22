/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.findimpl;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.api.search.SearchRoot;
import org.netbeans.api.search.SearchScopeOptions;
import org.netbeans.api.search.provider.SearchInfo;
import org.netbeans.api.search.provider.SearchListener;
import org.openide.awt.StatusDisplayer;
import org.openide.filesystems.FileObject;

/**
 *
 * @author sessonad
 */
public class CucumberImplData {

    static Map<String, List<CucumberImplElement>> implementations;
    static boolean isMapDirty = true;
    
    

    public static Map<String, List<CucumberImplElement>> getImplementationsMap() {
        if (isMapDirty || implementations == null) {
            loadMap();
            return implementations;
        } else {
            return implementations;
        }
    }

    private static void loadMap() {
        ProgressHandle handle = ProgressHandleFactory.createHandle("Searching for Cucumber annotations...");
        handle.switchToIndeterminate();
        handle.start();
        long start = Calendar.getInstance().getTimeInMillis();
        List<File> files = CucumberImplementationUtils.getFiles(CucumberImplementationUtils.Extensions.JAVA);
        implementations = new Hashtable<String, List<CucumberImplElement>>();
        for (File f : files) {
            updateFileInImplementationMap(f);
        }        
        handle.finish();
        //printImplementationMap(implementations);
        StatusDisplayer.getDefault().setStatusText("Cucumber annotations map loaded, took :" +(Calendar.getInstance().getTimeInMillis() - start ) +" milliseconds");
        isMapDirty = false;
    }
    
    public static void updateFileInImplementationMap(File fileToUpdate){        
        try {
            long start = Calendar.getInstance().getTimeInMillis();
            String path =fileToUpdate.getAbsolutePath();
            List<CucumberImplElement> currlist = new ArrayList<CucumberImplElement>();                
            BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(fileToUpdate))));
            String strLine;
            int line=1;
            while ((strLine = br.readLine()) != null) {
                if(strLine.contains("@When")||strLine.contains("@Given")||strLine.contains("@Then")||strLine.contains("@And")||strLine.contains("@But")){                        
                    String annotationText=strLine.substring(strLine.indexOf("(\"") + 2,strLine.lastIndexOf("\")"));
                    CucumberImplElement impl = new CucumberImplElement(annotationText, line, path);
                    currlist.add(impl);
                }
                line++;
            }
            implementations.put(path, currlist);
            br.close();
            System.out.println("updated in the map: "+fileToUpdate.getAbsolutePath()+" time: " +(Calendar.getInstance().getTimeInMillis() - start ) + " milliseconds");
        } catch (Exception e) {
            e.printStackTrace();                
        }        
    }
    
    public static void removeFileinImplementationMap(File fileToRemove){
        long start = Calendar.getInstance().getTimeInMillis();
        implementations.remove(fileToRemove.getAbsolutePath());
        System.out.println("removed in the map: "+fileToRemove.getAbsolutePath()+" time: " +(Calendar.getInstance().getTimeInMillis() - start ) + " milliseconds");
    }
    
    public static Set<CucumberImplElement> getMatchingImpls(String steppDefinition){
        Set<CucumberImplElement> found = new HashSet<CucumberImplElement>();
        if(steppDefinition == null || steppDefinition.isEmpty()){
            return found;
        }
        try{            
            Map<String, List<CucumberImplElement>> mio = getImplementationsMap();
            for (Entry <String, List<CucumberImplElement>> e : mio.entrySet()) {
                for(CucumberImplElement elem : e.getValue()){
                    if(isValidMatch(steppDefinition, elem.getName())){
                        found.add(elem);
                    }
                }
            }
        }catch(Exception e){}
        return found;
    }
    
    private static boolean isValidMatch(String stepDesc,String annotation){
        boolean isMatch = false;
        //System.out.println("step: " + stepDesc);
        //System.out.println("annota: " +annotation);
        if(Pattern.matches(annotation, stepDesc.trim())){
            isMatch =true;
        }
        //System.out.println("matches: " + isMatch);
        return isMatch;
    }
    
    public static void printImplementationMap(Map<String, List<CucumberImplElement>> map){
        for(Entry<String, List<CucumberImplElement>> e:map.entrySet() ){
            System.out.println("***********************" + e.getKey());
            for(CucumberImplElement imp:e.getValue()){
                System.out.println("\t " + imp);
            }
        }
    }
    
}
