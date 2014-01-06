/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.hints;

import javax.swing.text.Document;
import org.netbeans.spi.editor.hints.ChangeInfo;
import org.netbeans.spi.editor.hints.Fix;

/**
 *
 * @author sessonad
 */
public class DeleteLineFix implements Fix{
    
    Document document;
    int offset;
    int end;
    
    public DeleteLineFix(Document document, int offset, int end) {            
        this.document=document;
        this.offset = offset;
        this.end=end;
    }
    
    @Override
    public String getText() {
        return "Delete this line ..." ;
    }

    @Override
    public ChangeInfo implement() throws Exception {        
        ChangeInfo changes = new ChangeInfo();
        try{
            document.remove(offset, end - offset);
        }catch(Exception e){}
        return changes;
    }
    
    
}
