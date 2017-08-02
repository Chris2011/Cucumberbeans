/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.antlr;

import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author sessonad
 */
public class SyntaxError {

    RecognitionException exception;
    String message;
    String messageToDispaly;
    int line;
    int charPositionInLine;
    int index;
    ErrorType errorType;
    
    public enum ErrorType{        
        MISSING_FEATURE,
        MISSING_SCENARIO,
        MISSING_STEP,
        MISSING_STEP_DESC,
        MISSING_TITLE,
        NOT_VIABLE_SCENARIO,
        NOT_VIABLE_BACKGROUND,
        NOT_VIABLE_FEATURE,
        MISMATCHED_FEATURE
    }    
    
    public SyntaxError(RecognitionException exception, String message,ErrorType type) {
        this.exception = exception;
        this.message = message;
        this.line = exception.line;
        this.charPositionInLine = exception.charPositionInLine;
        this.index= exception.index;
        this.errorType = type;
        if(exception instanceof NoViableAltException){
            if(errorType == ErrorType.NOT_VIABLE_SCENARIO){
                String tokenFound = message.substring("no viable alternative at input ".length());
                this.messageToDispaly = tokenFound +" was found, but either 'Scenario:' or 'Scenario Outline:' is expected here.";
            }else if(errorType == ErrorType.NOT_VIABLE_FEATURE){
                String tokenFound = message.substring("no viable alternative at input ".length());
                this.messageToDispaly = tokenFound +" was found, but it wasn't expected here.";
            }else if(errorType == ErrorType.NOT_VIABLE_BACKGROUND){
                String tokenFound = message.substring("no viable alternative at input ".length());
                this.messageToDispaly = tokenFound +" was found, but it wasn't expected here.";
            }
        }else if (errorType == ErrorType.MISMATCHED_FEATURE){
            String tokenExpected = message.substring(message.lastIndexOf(" "));
            this.messageToDispaly = "Expecting " + tokenExpected;
        }else if(message.startsWith("missing FEATURE")){
            this.errorType=ErrorType.MISSING_FEATURE;
            String tokenFound = message.substring("missing FEATURE at ".length());
            this.messageToDispaly = "A 'Feature:' was expected here, but "+tokenFound+" was found.";
        }else if(message.startsWith("mismatched input '<EOF>' expecting FEATURE")){
            this.errorType=ErrorType.MISSING_FEATURE;
            this.messageToDispaly = "End of file reached, a 'Feature:' is required.";
        }else if(message.startsWith("required (...)+ loop")){
            if(errorType == ErrorType.MISSING_SCENARIO){
                this.messageToDispaly = "End of file reached, a 'Scenario:' or 'Scenario Outline:' is required.";
            }else if (errorType == ErrorType.MISSING_STEP){
                this.messageToDispaly = "A step ('Given:' or 'When:' or 'Then:' or 'And:' or 'But') is required.";
            }else if(errorType == ErrorType.MISSING_STEP){
                this.messageToDispaly = "The step definition is missing.";
            }
        }else if(message.startsWith("mismatched input") && errorType == ErrorType.MISSING_TITLE){
            
            this.messageToDispaly = "The title is missing.";
        }
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }
    
    public String getMessageToDispaly() {
        return messageToDispaly;
    }
    
    public void setMessageToDispaly(String messageToDispaly) {
        this.messageToDispaly = messageToDispaly;
    }    
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public RecognitionException getException() {
        return exception;
    }

    public void setException(RecognitionException exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    public void setCharPositionInLine(int charPositionInLine) {
        this.charPositionInLine = charPositionInLine;
    }
    
    
}
