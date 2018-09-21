package me.dsnet.cetriolo;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.util.NbBundle.Messages;

@Messages({"LBL_Cuc_LOADER=Files of Cuc"})
@DataObject.Registration(iconBase = "me/dsnet/cetriolo/resources/icons/cuc.png", displayName = "#LBL_Cuc_LOADER", mimeType = "text/x-gherkin", position = 300)
public class GherkingDataObject extends MultiDataObject {
    public GherkingDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        registerEditor("text/x-gherkin", false);
    }

    @Override
    protected int associateLookup() {
        return 1;
    }
}
