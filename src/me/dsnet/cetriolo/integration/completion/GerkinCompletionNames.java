/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.completion;

/**
 *
 * @author SessonaD
 */
public enum GerkinCompletionNames {
    
    FEATURE ("feature","Feature: "),
    SCENOUT ("scenario outline:","Scenario Outline: "),
    SCENARIO("scenario:","Scenario: "),
    IN_ORDER("in order","In order "),
    I_WANT  ("i want","I want "),
    THEN    ("then","Then "),
    GIVEN   ("given","Given "),
    AND     ("and","And "),
    AS_A    ("as a","As a ");
    
    public String word;
    public String display;    
    
    private GerkinCompletionNames(String word, String display) {
        this.word = word;
        this.display = display;
    }

    public String getWord() {
        return word;
    }

    public String getDisplay() {
        return display;
    }
    
    
    
}
