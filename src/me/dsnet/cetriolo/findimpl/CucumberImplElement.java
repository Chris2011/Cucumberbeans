/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.findimpl;

/**
 *
 * @author sessonad
 */
public class CucumberImplElement {
    
    private String name;
    private Integer line;
    private String filename;

    public CucumberImplElement(String name, Integer line, String filename) {
        this.name = name;
        this.line = line;
        this.filename = filename;
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
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "CucumberImplElement{" + "name=" + name + ", line=" + line + ", filename=" + filename + '}';
    }
    
    
}
