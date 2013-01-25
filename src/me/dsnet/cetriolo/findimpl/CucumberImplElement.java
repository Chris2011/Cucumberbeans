/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.findimpl;

import java.io.File;

/**
 *
 * @author sessonad
 */
public class CucumberImplElement implements Comparable{
    
    private String name;
    private Integer line;
    private File file;

    public CucumberImplElement(String name, Integer line, File file) {
        this.name = name;
        this.line = line;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public String getFilename() {
        return file.getName();
    }
    
    public String getFilePath() {
        return file.getAbsolutePath();
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    

    @Override
    public String toString() {
        return "CucumberImplElement{" + "name=" + name + ", line=" + line + ", filename=" + file.getName() + '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof CucumberImplElement){
            return this.getName().compareTo(((CucumberImplElement)o).getName());
        }
        return 0;
    }
    
    
}
