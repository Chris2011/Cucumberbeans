/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.antlr.output;

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
        MISSING_FEATURE
    }    
    
    public SyntaxError(RecognitionException exception, String message) {
        this.exception = exception;
        this.message = message;
        this.line = exception.line;
        this.charPositionInLine = exception.charPositionInLine;
        this.index= exception.index;
        if(message.startsWith("missing FEATURE")){
            this.errorType=ErrorType.MISSING_FEATURE;
            String tokenFound = message.substring("missing FEATURE at ".length());
            this.messageToDispaly = "A 'Feature:' was expected here, but "+tokenFound+" was found.";
        }else if(message.startsWith("mismatched input '<EOF>' expecting FEATURE")){
            this.errorType=ErrorType.MISSING_FEATURE;
            this.messageToDispaly = "End of file reached, a 'Feature:' is required.";
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
