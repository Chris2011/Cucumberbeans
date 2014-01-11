/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.hints;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import me.dsnet.cetriolo.findimpl.CucumberImplElement;
import org.netbeans.spi.editor.hints.ChangeInfo;
import org.netbeans.spi.editor.hints.Fix;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.text.Line;
import org.openide.windows.WindowManager;

/**
 *
 * @author sessonad
 */
public class GotoStepImplHint implements Fix{
    
    final CucumberImplElement elem;
    
    public GotoStepImplHint(CucumberImplElement elem) {               
        this.elem=elem;        
    }
    
    @Override
    public String getText() {
        return "Go to: <b>&quot;" + elem.getName() +"&quot;</b> ("+elem.getFilename().substring(elem.getFilename().lastIndexOf("\\") + 1 ) +")" ;
    }

    @Override
    public ChangeInfo implement() throws Exception {        
        ChangeInfo changes = new ChangeInfo();
        try{
            openDoc();                      
        }catch(Exception e){}
        return changes;
    }
    
    public void openDoc() throws Exception{
        File f = elem.getFile();
        FileObject fo = FileUtil.toFileObject(f);
        DataObject d = DataObject.find(fo);
        final EditorCookie ec = (EditorCookie) d.getLookup().lookup(EditorCookie.class);
        ec.open();        
        ec.openDocument();
        WindowManager.getDefault().invokeWhenUIReady(new Runnable() {
            @Override
            public void run() { 
                ec.getLineSet().getCurrent(elem.getLine()).show(Line.ShowOpenType.OPEN, Line.ShowVisibilityType.FOCUS);
            }
        });
        
    }
    
}
