/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.hints;

import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.java.hints.ConstraintVariableType;
import org.netbeans.spi.java.hints.ErrorDescriptionFactory;
import org.netbeans.spi.java.hints.Hint;
import org.netbeans.spi.java.hints.HintContext;
import org.netbeans.spi.java.hints.TriggerPattern;
import org.openide.util.NbBundle.Messages;

@Hint(displayName = "#DN_JOptionPaneHint", description = "#DESC_JOptionPaneHint", category = "general")
@Messages({
    "DN_JOptionPaneHint=JOptionPane.showMessageDialog",
    "DESC_JOptionPaneHint=checks for JOptionPane.showMessageDialog"
})
public class JOptionPaneHint {

    @TriggerPattern(
            value = "$1.showMessageDialog", 
            constraints = 
                @ConstraintVariableType(
                    variable = "$1", 
                    type = "javax.swing.JOptionPane"))
//    constraints =
//    @ConstraintVariableType(variable = "$str", type = "java.lang.String"))
    @Messages("ERR_JOptionPaneHint=is JOptionPane.showMessageDialog needed?")
    public static ErrorDescription computeWarning(HintContext ctx) {
        return ErrorDescriptionFactory.forName(ctx, ctx.getPath(), Bundle.ERR_JOptionPaneHint());
    }
}
