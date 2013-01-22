/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.findimpl;

import java.util.concurrent.atomic.AtomicBoolean;
import org.netbeans.api.search.SearchScopeOptions;
import org.netbeans.api.search.provider.SearchInfo;
import org.netbeans.api.search.provider.SearchListener;
import org.netbeans.spi.search.provider.SearchComposition;
import org.netbeans.spi.search.provider.SearchResultsDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;

/**
 *
 * @author sessonad
 */
public class AnnotationSearchComposition extends SearchComposition<DataObject>{

    AtomicBoolean terminated = new AtomicBoolean(false);    
    SearchScopeOptions searchScopeOptions;
    SearchInfo searchInfo;
    SearchResultsDisplayer<DataObject> resultsDisplayer;

    public AnnotationSearchComposition(SearchScopeOptions searchScopeOptions, SearchInfo searchInfo, SearchResultsDisplayer<DataObject> resultsDisplayer) {
        this.searchScopeOptions = searchScopeOptions;
        this.searchInfo = searchInfo;
        this.resultsDisplayer = resultsDisplayer;
    }    
    
    
    @Override
    public void start(SearchListener sl) {
        for (FileObject fo : searchInfo.getFilesToSearch(
                searchScopeOptions, sl, terminated)) {
            try {
                DataObject dob = DataObject.find(fo);
                getSearchResultsDisplayer().addMatchingObject(dob);
            } catch (DataObjectNotFoundException ex) {
                sl.fileContentMatchingError(fo.getPath(), ex);
            }
        }
    }

    @Override
    public void terminate() {
        terminated.set(true);
    }

    @Override
    public boolean isTerminated() {
        return terminated.get();
    }

    @Override
    public SearchResultsDisplayer<DataObject> getSearchResultsDisplayer() {
        if (resultsDisplayer == null) {
           resultsDisplayer = createResultsDisplayer();
       }
       return resultsDisplayer;
    }

    private SearchResultsDisplayer<DataObject> createResultsDisplayer() {
        
        SearchResultsDisplayer.NodeDisplayer<DataObject> nd = new SearchResultsDisplayer.NodeDisplayer<DataObject>() {

            @Override
            public Node matchToNode(final DataObject t) {
                return new FilterNode(t.getNodeDelegate()) {
                           @Override
                           public String getDisplayName() {
                               return super.getDisplayName()
                                       + " (" + (t.getPrimaryFile().getName()) ;
                           }
                       };
            }
        };
        
        return SearchResultsDisplayer.createDefault(nd, this, null, null);
    }
    
}
