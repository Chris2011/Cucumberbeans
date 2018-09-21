package me.dsnet.cetriolo.findimpl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.api.project.FileOwnerQuery;
import org.openide.filesystems.FileUtil;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.loaders.DataObject;
import org.openide.windows.TopComponent;

/**
 *
 * @author sessonad
 */
public class CucumberImplementationUtils {

    static List<File> files = null;
    static List<File> modifiedFiles = null;
    static List<FileObject> projectRoots = null;

    static {
        OpenProjects.getDefault().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                CucumberImplData.isMapDirty = true;
                CucumberImplData.getImplementationsMap();
            }
        });
    }

    public enum Extensions {
        FEATURE(".feature"),
        JAVA(".java");

        String extension;

        private Extensions(String extension) {
            this.extension = extension;
        }

        public String getExtension() {
            return extension;
        }
    }

    public static List<File> getFiles(Extensions ext) {
        Project p = TopComponent.getRegistry().getActivated().getLookup().lookup(Project.class);

        if (p == null) {
            DataObject dob = TopComponent.getRegistry().getActivated().getLookup().lookup(DataObject.class);

            if (dob != null) {
                FileObject fo = dob.getPrimaryFile();
//                p = FileOwnerQuery.getOwner(fo);

                files = new ArrayList<>();
                projectRoots = new ArrayList<>();

//                for (Project p : projects) {
//                    FileObject fo = p.getProjectDirectory();
//                    if (ext == Extensions.JAVA) {
//                        fo.addRecursiveListener(new FileChangeListenerImpl());
//
//                        projectRoots.add(fo);
//                    }

//                    p.getProjectDirectory();
                    addFiles(FileUtil.toFile(p.getProjectDirectory()), ext.getExtension());
//                }
            }
        }

//        Project[] projects

        return files;
    }

//    public static void setFiles(Extensions ext) {
//        Project[] projects = OpenProjects.getDefault().getOpenProjects();
//        files = new ArrayList<>();
//        projectRoots = new ArrayList<>();
//
//        for(Project p:projects){
//            FileObject fo = p.getProjectDirectory();
//            if(ext == Extensions.JAVA){
//                fo.addRecursiveListener(new FileChangeListenerImpl());
//
//                projectRoots.add(fo);
//            }
//            p.getProjectDirectory();
//            addFiles(FileUtil.toFile(p.getProjectDirectory()),ext.getExtension());
//        }
//    }
    private static void getModifiedFiles(File root, final String ext) {
        FileFilter ff = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return (pathname.isDirectory() || pathname.getName().endsWith(ext));
            }
        };
        for (File f : root.listFiles(ff)) {
            if (f.isDirectory()) {
                addFiles(f, ext);
            } else {
                modifiedFiles.add(f);
            }
        }
    }

    private static void addFiles(File root, final String ext) {
        FileFilter ff = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return (pathname.isDirectory() || pathname.getName().endsWith(ext));
            }
        };

        for (File f : root.listFiles(ff)) {
            if (f.isDirectory()) {
                addFiles(f, ext);
            } else {
                files.add(f);
            }
        }
    }

    private static class FileChangeListenerImpl implements FileChangeListener {

        @Override
        public void fileFolderCreated(FileEvent fe) {
            File created = FileUtil.toFile(fe.getFile());
            modifiedFiles = new ArrayList<>();
            getModifiedFiles(created, Extensions.JAVA.getExtension());
            for (File f : modifiedFiles) {
                CucumberImplData.updateFileInImplementationMap(f);
            }
            getModifiedFiles(created, Extensions.FEATURE.getExtension());
            for (File f : modifiedFiles) {
                CucumberImplData.updateFileInStepMap(f);
            }
        }

        @Override
        public void fileDataCreated(FileEvent fe) {
            File changed = FileUtil.toFile(fe.getFile());
            if (changed.getName().endsWith(Extensions.JAVA.getExtension())) {
                CucumberImplData.updateFileInImplementationMap(changed);
            } else if (changed.getName().endsWith(Extensions.FEATURE.getExtension())) {
                CucumberImplData.updateFileInStepMap(changed);
            }
        }

        @Override
        public void fileChanged(FileEvent fe) {
            File changed = FileUtil.toFile(fe.getFile());
            if (changed.getName().endsWith(Extensions.JAVA.getExtension())) {
                CucumberImplData.updateFileInImplementationMap(changed);
            } else if (changed.getName().endsWith(Extensions.FEATURE.getExtension())) {
                CucumberImplData.updateFileInStepMap(changed);
            }
        }

        @Override
        public void fileDeleted(FileEvent fe) {
            File changed = FileUtil.toFile(fe.getFile());
            if (!changed.isDirectory()) {
                if (changed.getName().endsWith(Extensions.JAVA.getExtension())) {
                    CucumberImplData.removeFileinImplementationMap(changed, Extensions.JAVA);
                } else if (changed.getName().endsWith(Extensions.FEATURE.getExtension())) {
                    CucumberImplData.removeFileinImplementationMap(changed, Extensions.FEATURE);
                }
            }
        }

        @Override
        public void fileRenamed(FileRenameEvent fre) {
        }

        @Override
        public void fileAttributeChanged(FileAttributeEvent fae) {
        }
    }
}
