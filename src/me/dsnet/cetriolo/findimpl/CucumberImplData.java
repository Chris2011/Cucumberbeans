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

/**
 *
 * @author sessonad
 */
public class CucumberImplData {

    static Map<String, List<CucumberImplElement>> implementations;

    public static Map<String, List<CucumberImplElement>> getImplementationsMap() {
        if (implementations != null && CucumberImplementationUtils.projectRoot != null && CucumberImplementationUtils.projectRoot.equals(CucumberImplementationUtils.getMainProjectRoot())) {
            return implementations;
        } else {
            loadMap();
            return implementations;
        }
    }

    private static void loadMap() {
        long start = Calendar.getInstance().getTimeInMillis();
        List<File> files = CucumberImplementationUtils.getFiles(CucumberImplementationUtils.Extensions.JAVA);
        implementations = new Hashtable<String, List<CucumberImplElement>>();
        for (File f : files) {
            try {
                String path =f.getAbsolutePath();
                List<CucumberImplElement> currlist= implementations.get(path);
                if(currlist == null){
                    currlist= new ArrayList<CucumberImplElement>();
                }
                BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(f))));
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
                //Close the input stream
                br.close();
            } catch (Exception e) {
                e.printStackTrace();                
            }
        }
        printImplementationMap(implementations);
        System.out.println("#####################################");
        System.out.println("## map loaded, took :" +(Calendar.getInstance().getTimeInMillis() - start ) +" milliseconds");
        System.out.println("#####################################");
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
        System.out.println("step: " + stepDesc);
        System.out.println("annota: " +annotation);
        if(Pattern.matches(annotation, stepDesc.trim())){
            isMatch =true;
        }
        System.out.println("matches: " + isMatch);
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
