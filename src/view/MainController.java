package view;

import controller.ControllerRoom;


public class MainController extends ControllerRoom {
    
    
    public MainController() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        msgArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        txtField = new javax.swing.JTextField();
        checkBox = new javax.swing.JCheckBox();
        cmbBox = new javax.swing.JComboBox<>();
        slider = new javax.swing.JSlider();
        areaClearCheckBox = new javax.swing.JCheckBox();
        sendBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        msgArea.setEditable(false);
        msgArea.setColumns(20);
        msgArea.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        msgArea.setRows(5);
        jScrollPane1.setViewportView(msgArea);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldActionPerformed(evt);
            }
        });

        checkBox.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        checkBox.setText("Send Private");

        cmbBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Tank", "Helicopter", "Submarine" }));

        slider.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setValue(0);

        areaClearCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        areaClearCheckBox.setText("Set Area Clear");
        areaClearCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                areaClearCheckBoxStateChanged(evt);
            }
        });

        sendBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(checkBox)
                                .addGap(18, 18, 18)
                                .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(areaClearCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(areaClearCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBox)
                            .addComponent(sendBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        if(checkBox.isSelected()){
            sendPrivateMessage(String.valueOf(cmbBox.getSelectedItem()),"Controller Room : "+txtField.getText());
        }else{
            sendMessage("Controller Room : "+txtField.getText());
        }
    }//GEN-LAST:event_sendBtnActionPerformed

    private void areaClearCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_areaClearCheckBoxStateChanged
        if(areaClearCheckBox.isSelected()){
            setAreaClear(areaClearCheckBox.isSelected(),"Area is Clear");
        }else{
            setAreaClear(areaClearCheckBox.isSelected(),"Area is Not Clear");
        }
    }//GEN-LAST:event_areaClearCheckBoxStateChanged

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox areaClearCheckBox;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JComboBox<String> cmbBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea msgArea;
    private javax.swing.JButton sendBtn;
    private javax.swing.JSlider slider;
    private javax.swing.JTextField txtField;
    // End of variables declaration//GEN-END:variables
}
