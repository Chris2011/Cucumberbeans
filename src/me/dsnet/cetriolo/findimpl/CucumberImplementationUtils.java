/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.findimpl;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import org.openide.filesystems.FileUtil;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.filesystems.FileObject;
/**
 *
 * @author sessonad
 */
public class CucumberImplementationUtils {
    
    static List<File> files = null;
    static File projectRoot = null;
    
    public enum Extensions{
        
        JAVA(".java");
        
        String extension;

        private Extensions(String extension) {
            this.extension = extension;
        }
        
        public String getExtension() {
            return extension;
        }
    }
    
    public static List<File> getFiles(Extensions ext){        
        if(projectRoot == null || projectRoot != getMainProjectRoot()){
            setFiles(ext);
        }
        return files;
    }
    
    public static void setFiles(Extensions ext){
        projectRoot = getMainProjectRoot();
        files = new ArrayList<File>();
        addFiles(projectRoot,ext.getExtension());
    }
    
    private static void addFiles(File root,final String ext){        
        FileFilter ff = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return (pathname.isDirectory() || pathname.getName().endsWith(ext));
            }
        };        
        for(File f:root.listFiles(ff)){
            if(f.isDirectory()){
                addFiles(f,ext);
            }else{
                files.add(f);
            }
        }
    }
    
    public static File getMainProjectRoot(){
        try {
            Project project = OpenProjects.getDefault().getMainProject();
            FileObject root = project.getProjectDirectory();
            return FileUtil.toFile(root);
        } catch (Exception e) {
            return null;
        }
    }
    
}
