package development.downright.cucumberbeans.integration.hints;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.netbeans.spi.editor.hints.ChangeInfo;
import org.netbeans.spi.editor.hints.Fix;

/**
 *
 * @author sessonad
 */
public class DeleteLineFix implements Fix {
    Document document;
    int offset;
    int end;

    public DeleteLineFix(Document document, int offset, int end) {
        this.document = document;
        this.offset = offset;
        this.end = end;
    }

    @Override
    public String getText() {
        return "Delete this line ...";
    }

    @Override
    public ChangeInfo implement() throws Exception {
        ChangeInfo changes = new ChangeInfo();

        try {
            document.remove(offset, end - offset);
        } catch (BadLocationException e) {
            System.out.println(e.getMessage());
        }

        return changes;
    }
}
