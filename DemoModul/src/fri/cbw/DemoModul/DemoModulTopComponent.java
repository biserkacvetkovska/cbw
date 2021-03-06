/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fri.cbw.DemoModul;

import fri.cbw.CBWutil.InboundConnectionException;
import fri.cbw.GenericTool.AbstractEngineTool;
import fri.cbw.GenericTool.AbstractGenericTool;
import fri.cbw.GenericTool.AbstractModelTool;
import fri.cbw.GenericTool.ToolTopComponent;
import fri.cbw.GenericTool.ToolWrapper;
import java.util.logging.Logger;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.netbeans.api.visual.graph.GraphScene;
import org.netbeans.api.visual.widget.general.IconNodeWidget;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;

/**
 * Top component which displays something.
 */
@TopComponent.Description(
    preferredID = "DemoModulTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_NEVER)
@TopComponent.Registration(mode = "editor", openAtStartup = false)
@ActionID(category = "Window", id = "fri.cbw.DemoModul.DemoModulTopComponent")
//@ActionReference(path = "Menu/Window" /*, position = 333 */)
@Messages({
    "CTL_DemoModulAction=DemoModul",
    "CTL_DemoModulTopComponent=DemoModul Window",
    "HINT_DemoModulTopComponent=This is a DemoModul window"
})
public final class DemoModulTopComponent extends ToolTopComponent {

    public DemoModulTopComponent(AbstractGenericTool gt) {
        super(gt);
        initComponents();
        setName(Bundle.CTL_DemoModulTopComponent());
        setToolTipText(Bundle.HINT_DemoModulTopComponent());
        
        jTextField1.setText(((DemoModulTool)getGenericTool()).getSavedText());
    }
    public String test;
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(DemoModulTopComponent.class, "DemoModulTopComponent.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(DemoModulTopComponent.class, "DemoModulTopComponent.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText(org.openide.util.NbBundle.getMessage(DemoModulTopComponent.class, "DemoModulTopComponent.jTextField1.text")); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    /*
     Visual Library API
     ToolGraph
     Dialogs API
     */
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NotifyDescriptor nd = new NotifyDescriptor.Message("Predhodni modul JE ModelTool");
        
        try{
            AbstractModelTool gt = (AbstractModelTool) getGenericTool().getFirstInboundModul();
            
            nd = new NotifyDescriptor.Message("Predhodni modul JE ModelTool");
            
        }catch(ClassCastException e){
            Logger.getAnonymousLogger().severe(e.getMessage());
            nd = new NotifyDescriptor.Message("Predhodni modul NI ModelTool");
        }catch(InboundConnectionException e){
            Logger.getAnonymousLogger().severe(e.getMessage());
            nd = new NotifyDescriptor.Message("Predhodni modul ne obstaja");   
        }
        finally {
            DialogDisplayer.getDefault().notify(nd);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        ((DemoModulTool)getGenericTool()).setSavedText(jTextField1.getText());
    }//GEN-LAST:event_jTextField1FocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
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

    @Override
    public void doSave() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
