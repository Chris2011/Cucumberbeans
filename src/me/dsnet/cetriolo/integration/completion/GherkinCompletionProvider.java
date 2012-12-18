/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.completion;

import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;

/**
 *
 * @author SessonaD
 */
public class GherkinCompletionProvider implements CompletionProvider {

    @Override
    public CompletionTask createTask(int queryType, JTextComponent jtc) {
        if (queryType != CompletionProvider.COMPLETION_QUERY_TYPE) {
            return null;
        }
        return new AsyncCompletionTask(new AsyncCompletionQuery() {
            @Override
            protected void query(CompletionResultSet completionResultSet, Document document, int caretOffset) {
                for (GerkinCompletionNames name:GerkinCompletionNames.values()) {
                    final String keyname = name.getDisplay();
                    if (!keyname.equals("")) {
                        completionResultSet.addItem(new GherkinCompletionItem(keyname, caretOffset));
                    }
                }
                completionResultSet.finish();
            }
        });

    }

    @Override
    public int getAutoQueryTypes(JTextComponent jtc, String string) {
//        autoComplete(jtc);
        return 0;
    }

//    private void autoComplete(JTextComponent component) {
//        try {
//            int offset = component.getCaretPosition();
//            String fragment = component.getText(0, offset);
//            if (fragment.endsWith("fe")) {
//                complete(component, offset, "ature");
//            }
//        } catch (BadLocationException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private void complete(JTextComponent component, int offset, String s) throws BadLocationException {
//        component.getDocument().insertString(offset, s, null);
//        component.setCaretPosition(offset);
//    }
    
    
}
