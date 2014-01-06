/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.relationships;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;
import me.dsnet.cetriolo.findimpl.CucumberImplElement;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.text.Line;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
    dtd = "-//me.dsnet.cetriolo.relationships//Feature//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "FeatureTopComponent",
iconBase = "me/dsnet/cetriolo/resources/icons/step.png",
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "bottomSlidingSide", openAtStartup = false)
@ActionID(category = "Window", id = "me.dsnet.cetriolo.relationships.FeatureTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_FeatureAction",
preferredID = "FeatureTopComponent")
@Messages({
    "CTL_FeatureAction=Steps",
    "CTL_FeatureTopComponent=Steps Window",
    "HINT_FeatureTopComponent=This is a Feature window"
})
public final class FeatureTopComponent extends TopComponent {

    public FeatureTopComponent() {
        initComponents();
        setName(Bundle.CTL_FeatureTopComponent());
        setToolTipText(Bundle.HINT_FeatureTopComponent());
        putClientProperty(TopComponent.PROP_UNDOCKING_DISABLED, Boolean.TRUE);
        setAnnotationTableModel(null);
        setStepTableModel(null);
        setTablesWidth();
        annotationTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        stepTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jSplitPane1.setDividerLocation(500);     
        annotationTable.getColumnModel().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                ImplementationGotoButton.setEnabled(!annotationTable.getSelectionModel().isSelectionEmpty());
                showMatchingDefsButton.setEnabled(!annotationTable.getSelectionModel().isSelectionEmpty());
            }            
        });
        stepTable.getColumnModel().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                StepGotoButton.setEnabled(!stepTable.getSelectionModel().isSelectionEmpty());
                showMatchingImpls.setEnabled(!stepTable.getSelectionModel().isSelectionEmpty());
            }            
        });
        
    }
    
    private void setTablesWidth(){
        annotationTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        annotationTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        annotationTable.getColumnModel().getColumn(2).setMaxWidth(30);
        annotationTable.getColumnModel().getColumn(2).setMinWidth(30);
        annotationTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        annotationTable.getColumnModel().getColumn(1).setMaxWidth(150);
        annotationTable.getColumnModel().getColumn(1).setMinWidth(150);
        stepTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        stepTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        stepTable.getColumnModel().getColumn(2).setMaxWidth(30);
        stepTable.getColumnModel().getColumn(2).setMinWidth(30);
        stepTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        stepTable.getColumnModel().getColumn(1).setMaxWidth(150);
        stepTable.getColumnModel().getColumn(1).setMinWidth(150);        
    }
    
    private void setAnnotationTableModel(String filter){
        annotationTable.setModel(new AnnotationTableModel(false,filter));
        setTablesWidth();
    }
    
    private void setStepTableModel(String filter){
        stepTable.setModel(new AnnotationTableModel(true,filter));
        setTablesWidth();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stepTable = new JTable(){
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
                Component returnComp = super.prepareRenderer(renderer, row, column);
                Color alternateColor = new Color(230,251,233);
                Color whiteColor = Color.WHITE;
                if (!returnComp.getBackground().equals(getSelectionBackground())){
                    Color bg = (row % 2 == 1 ? whiteColor : alternateColor);
                    returnComp .setBackground(bg);
                    bg = null;
                }
                return returnComp;
            }
        };
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        annotationTable = new JTable(){
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
                Component returnComp = super.prepareRenderer(renderer, row, column);
                Color alternateColor = new Color(226,238,252);
                Color whiteColor = Color.WHITE;
                if (!returnComp.getBackground().equals(getSelectionBackground())){
                    Color bg = (row % 2 == 1 ? alternateColor : whiteColor);
                    returnComp .setBackground(bg);
                    bg = null;
                }
                return returnComp;
            }
        };
        jButton1 = new javax.swing.JButton();
        ImplementationGotoButton = new javax.swing.JButton();
        StepGotoButton = new javax.swing.JButton();
        showMatchingDefsButton = new javax.swing.JButton();
        showMatchingImpls = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setDividerSize(15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/step24.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(FeatureTopComponent.class, "FeatureTopComponent.jLabel2.text")); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jScrollPane1.setBorder(null);

        stepTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Text", "File", "Line"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stepTable.setFillsViewportHeight(true);
        stepTable.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(stepTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/mail24.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(FeatureTopComponent.class, "FeatureTopComponent.jLabel1.text")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jScrollPane2.setBorder(null);

        annotationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Text", "File", "Line"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        annotationTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        annotationTable.setFillsViewportHeight(true);
        annotationTable.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(annotationTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/reload.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(FeatureTopComponent.class, "FeatureTopComponent.jButton1.text")); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ImplementationGotoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/mail16.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(ImplementationGotoButton, org.openide.util.NbBundle.getMessage(FeatureTopComponent.class, "FeatureTopComponent.ImplementationGotoButton.text")); // NOI18N
        ImplementationGotoButton.setBorderPainted(false);
        ImplementationGotoButton.setEnabled(false);
        ImplementationGotoButton.setFocusPainted(false);
        ImplementationGotoButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ImplementationGotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImplementationGotoButtonActionPerformed(evt);
            }
        });

        StepGotoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/step.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(StepGotoButton, org.openide.util.NbBundle.getMessage(FeatureTopComponent.class, "FeatureTopComponent.StepGotoButton.text")); // NOI18N
        StepGotoButton.setBorderPainted(false);
        StepGotoButton.setEnabled(false);
        StepGotoButton.setFocusPainted(false);
        StepGotoButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StepGotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StepGotoButtonActionPerformed(evt);
            }
        });

        showMatchingDefsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/filter.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(showMatchingDefsButton, org.openide.util.NbBundle.getMessage(FeatureTopComponent.class, "FeatureTopComponent.showMatchingDefsButton.text")); // NOI18N
        showMatchingDefsButton.setBorderPainted(false);
        showMatchingDefsButton.setEnabled(false);
        showMatchingDefsButton.setFocusPainted(false);
        showMatchingDefsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        showMatchingDefsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMatchingDefsButtonActionPerformed(evt);
            }
        });

        showMatchingImpls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/filter.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(showMatchingImpls, org.openide.util.NbBundle.getMessage(FeatureTopComponent.class, "FeatureTopComponent.showMatchingImpls.text")); // NOI18N
        showMatchingImpls.setBorderPainted(false);
        showMatchingImpls.setEnabled(false);
        showMatchingImpls.setFocusPainted(false);
        showMatchingImpls.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        showMatchingImpls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMatchingImplsActionPerformed(evt);
            }
        });

        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/reset.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(resetButton, org.openide.util.NbBundle.getMessage(FeatureTopComponent.class, "FeatureTopComponent.resetButton.text")); // NOI18N
        resetButton.setBorderPainted(false);
        resetButton.setFocusPainted(false);
        resetButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showMatchingImpls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showMatchingDefsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ImplementationGotoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StepGotoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ImplementationGotoButton)
                    .addComponent(showMatchingDefsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(StepGotoButton)
                    .addComponent(showMatchingImpls))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String filterStep =((AnnotationTableModel) stepTable.getModel()).getFilter();
        String filterImpls=((AnnotationTableModel) annotationTable.getModel()).getFilter();
        setAnnotationTableModel(filterImpls);
        setStepTableModel(filterStep);
        setTablesWidth();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ImplementationGotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImplementationGotoButtonActionPerformed
        int rowselected = annotationTable.getSelectedRow();
        if(rowselected!=-1){
            CucumberImplElement elem = ((AnnotationTableModel) annotationTable.getModel()).getElementAtRow(rowselected);
            try{
                openDoc(elem);
            }catch(Exception e){}            
        }
    }//GEN-LAST:event_ImplementationGotoButtonActionPerformed

    private void StepGotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StepGotoButtonActionPerformed
        int rowselected = stepTable.getSelectedRow();
        if(rowselected!=-1){
            CucumberImplElement elem = ((AnnotationTableModel) stepTable.getModel()).getElementAtRow(rowselected);
            try{
                openDoc(elem);
            }catch(Exception e){}            
        }
    }//GEN-LAST:event_StepGotoButtonActionPerformed

    private void showMatchingDefsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMatchingDefsButtonActionPerformed
        int rowselected = annotationTable.getSelectedRow();
        if(rowselected!=-1){
            CucumberImplElement elem = ((AnnotationTableModel) annotationTable.getModel()).getElementAtRow(rowselected);
            setStepTableModel(elem.getName());            
        }        
    }//GEN-LAST:event_showMatchingDefsButtonActionPerformed

    private void showMatchingImplsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMatchingImplsActionPerformed
        int rowselected = stepTable.getSelectedRow();
        if(rowselected!=-1){
            CucumberImplElement elem = ((AnnotationTableModel) stepTable.getModel()).getElementAtRow(rowselected);
            setAnnotationTableModel(elem.getName());            
        }      
    }//GEN-LAST:event_showMatchingImplsActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        setAnnotationTableModel(null);
        setStepTableModel(null);
        setTablesWidth();
    }//GEN-LAST:event_resetButtonActionPerformed

     public void openDoc(final CucumberImplElement elem) throws Exception{
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ImplementationGotoButton;
    private javax.swing.JButton StepGotoButton;
    private javax.swing.JTable annotationTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton showMatchingDefsButton;
    private javax.swing.JButton showMatchingImpls;
    private javax.swing.JTable stepTable;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
