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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;
import me.dsnet.cetriolo.findimpl.CucumberImplementationUtils.Extensions;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.awt.StatusDisplayer;

/**
 *
 * @author sessonad
 */
public class CucumberImplData {

    static Map<String, List<CucumberImplElement>> implementations;  
    static Map<String, List<CucumberImplElement>> steps;  
    static boolean isMapDirty = true;
    static boolean isStepMapDirty = true;
    
    public static List<CucumberImplElement> getImplementationList(){
        List<CucumberImplElement> implementationSet = new ArrayList<CucumberImplElement>();
        if (isMapDirty || implementations == null) { loadMap();}
        for (Entry<String, List<CucumberImplElement>> e : implementations.entrySet()) {
            for (CucumberImplElement elem : e.getValue()) {
                implementationSet.add(elem);
            }
        }
        return implementationSet;
    }
    
    public static List<CucumberImplElement> getStepsList(){
        List<CucumberImplElement> stepSet = new ArrayList<CucumberImplElement>();
        if (isStepMapDirty || steps == null) { loadStepMap();}
        for (Entry<String, List<CucumberImplElement>> e : steps.entrySet()) {
            for (CucumberImplElement elem : e.getValue()) {
                stepSet.add(elem);
            }
        }
        return stepSet;
    }
    
    public static Map<String, List<CucumberImplElement>> getStepsMap() {
        if (isStepMapDirty || steps == null) {
            loadStepMap();
            return steps;
        } else {
            return steps;
        }
    }

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
    
    private static void loadStepMap() {
        ProgressHandle handle = ProgressHandleFactory.createHandle("Searching for Cucumber steps...");
        handle.switchToIndeterminate();
        handle.start();
        long start = Calendar.getInstance().getTimeInMillis();
        List<File> files = CucumberImplementationUtils.getFiles(CucumberImplementationUtils.Extensions.FEATURE);
        steps = new Hashtable<String, List<CucumberImplElement>>();
        for (File f : files) {
            updateFileInStepMap(f);
        }        
        handle.finish();
        //printImplementationMap(implementations);
        StatusDisplayer.getDefault().setStatusText("Cucumber steps map loaded, took :" +(Calendar.getInstance().getTimeInMillis() - start ) +" milliseconds");
        isStepMapDirty = false;
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
                    CucumberImplElement impl = new CucumberImplElement(annotationText, line, fileToUpdate);
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
    
    public static void updateFileInStepMap(File fileToUpdate){        
        try {
            long start = Calendar.getInstance().getTimeInMillis();
            String path =fileToUpdate.getAbsolutePath();
            List<CucumberImplElement> currlist = new ArrayList<CucumberImplElement>();                
            BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(fileToUpdate))));
            String strLine;
            int line=1;
            while ((strLine = br.readLine()) != null) {
                strLine = strLine.trim();
                System.out.println("strline step: " +strLine);
                if(strLine.startsWith("Given ")||strLine.startsWith("When ")||strLine.startsWith("Then ")||strLine.startsWith("But ")||strLine.startsWith("And ")){                        
                    String annotationText=strLine.substring(strLine.indexOf(" ")+1);
                    CucumberImplElement impl = new CucumberImplElement(annotationText, line, fileToUpdate);
                    currlist.add(impl);
                }
                line++;
            }
            steps.put(path, currlist);
            br.close();
            System.out.println("updated in the stepmap: "+fileToUpdate.getAbsolutePath()+" time: " +(Calendar.getInstance().getTimeInMillis() - start ) + " milliseconds");
        } catch (Exception e) {
            e.printStackTrace();                
        }        
    }
    
    public static void removeFileinImplementationMap(File fileToRemove, Extensions ext){
        long start = Calendar.getInstance().getTimeInMillis();
        if(ext == Extensions.JAVA){
            implementations.remove(fileToRemove.getAbsolutePath());
        }else{
            steps.remove(fileToRemove.getAbsolutePath());
        }        
        System.out.println("removed in the map: ("+ext.getExtension() +") " +fileToRemove.getAbsolutePath()+" time: " +(Calendar.getInstance().getTimeInMillis() - start ) + " milliseconds");
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
        String annotation1= annotation.replaceAll("\\\\d", "\\d");     
        if(Pattern.matches(annotation1, stepDesc.trim())){
            isMatch =true;
        }
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
