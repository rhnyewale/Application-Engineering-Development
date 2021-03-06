/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CabInformation;
import Business.Car;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author rhnye
 */
public class ViewCarEntryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCarEntryJPanel
     */
    private JPanel userProcessContainer;
    private Car car;
    private CabInformation cabInformation;
    
    ViewCarEntryJPanel(JPanel userProcessContainer, Car car) {
    initComponents();
    this.userProcessContainer = userProcessContainer;
    this.car = car;
    
    populateCarDetails();
    
    btnSave.setEnabled(false);
    btnUpdate.setEnabled(true);
    }

    private void populateCarDetails(){
    txtBrandName.setText(car.getBrand());
    txtCity.setText(car.getAvailable_city());
    txtModelNumber.setText(car.getModel_num()); 
    txtSerialNumber.setText(String.valueOf(car.getSerial_num()));
    txtMinSeats.setText(String.valueOf(car.getMin_seats()));
    txtMaxSeats.setText(String.valueOf(car.getMax_seats()));
    txtManufacterYear.setText(String.valueOf(car.getManufactured_year()));
        if (car.isAvailable()==true) {
            checkBoxYesAvailable.setSelected(true);
            checkBoxYesAvailable.setEnabled(false);
            checkBoxNoAvailable.setEnabled(false);
        }
        else{
            checkBoxNoAvailable.setSelected(true);
            checkBoxYesAvailable.setEnabled(false);
            checkBoxNoAvailable.setEnabled(false);
        }
        
        if (car.isMaintenance_certificate()==true) {
            checkBoxYesCertify.setSelected(true);
            checkBoxYesCertify.setEnabled(false);
            checkBoxNoCertify.setEnabled(false);
        }
        else{
        checkBoxNoCertify.setSelected(true);
        checkBoxYesCertify.setEnabled(false);
        checkBoxNoCertify.setEnabled(false);
        }
    

   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMinSeats = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMaxSeats = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtManufacterYear = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        checkBoxYesCertify = new javax.swing.JCheckBox();
        checkBoxNoCertify = new javax.swing.JCheckBox();
        checkBoxYesAvailable = new javax.swing.JCheckBox();
        checkBoxNoAvailable = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtTimeStamp = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("<<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Car Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Brand Name:");

        txtBrandName.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Model Number:");

        txtModelNumber.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Serial Number:");

        txtSerialNumber.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Minimum Seats:");

        txtMinSeats.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Maximum Seats:");

        txtMaxSeats.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Manufactered Year:");

        txtManufacterYear.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Maintenance Certificate:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Available:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Available City:");

        txtCity.setEnabled(false);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        buttonGroup1.add(checkBoxYesCertify);
        checkBoxYesCertify.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        checkBoxYesCertify.setText("Yes");
        checkBoxYesCertify.setEnabled(false);

        buttonGroup1.add(checkBoxNoCertify);
        checkBoxNoCertify.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        checkBoxNoCertify.setText("No");
        checkBoxNoCertify.setEnabled(false);

        buttonGroup2.add(checkBoxYesAvailable);
        checkBoxYesAvailable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        checkBoxYesAvailable.setText("Yes");
        checkBoxYesAvailable.setEnabled(false);

        buttonGroup2.add(checkBoxNoAvailable);
        checkBoxNoAvailable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        checkBoxNoAvailable.setText("No");
        checkBoxNoAvailable.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Time Stamp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(79, 79, 79)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtBrandName)
                                                .addComponent(txtModelNumber)
                                                .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtMinSeats, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtMaxSeats, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtManufacterYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(checkBoxYesAvailable)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(checkBoxNoAvailable))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(checkBoxYesCertify)
                                        .addGap(25, 25, 25)
                                        .addComponent(checkBoxNoCertify)))))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtManufacterYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(checkBoxYesCertify)
                    .addComponent(checkBoxNoCertify))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(checkBoxYesAvailable)
                    .addComponent(checkBoxNoAvailable)
                    .addComponent(jLabel11))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        
        Component[] cmp = this.userProcessContainer.getComponents();
        for (Component cmpnnt : cmp) {
            if (cmpnnt instanceof ManageCarJPanel) {
                ManageCarJPanel manageCar = (ManageCarJPanel) cmpnnt;
                manageCar.populateTable(cabInformation,"updatecar");
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        
        
//        String brandName = txtBrandName.getText();
//        String modelNumber = txtModelNumber.getText();
//        String city = txtCity.getText();
//        int serialNumber = Integer.parseInt(txtSerialNumber.getText());
//        int minSeats = Integer.parseInt(txtMinSeats.getText());
//        int maxSeats = Integer.parseInt(txtMinSeats.getText());
//        int manufYear = Integer.parseInt(txtManufacterYear.getText());   
//        
//        
//        car.setBrand(brandName);
//        car.setModel_num(modelNumber);
//        car.setAvailable_city(city);
//        car.setMin_seats(minSeats);
//        car.setMax_seats(maxSeats);
//        car.setSerial_num(serialNumber);
//        car.setManufactured_year(manufYear);
//        car.setAvailable(checkBoxYesAvailable.isSelected());
//        car.setMaintenance_certificate(checkBoxYesCertify.isSelected());

         String brandName = txtBrandName.getText();
        if(brandName == null || brandName.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Brand Name");
                return;
            }
        
        //int makeYear = Integer.parseInt(txtMakeYear.getText());
        String manufYear = txtManufacterYear.getText();
        if(manufYear == null || manufYear.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Manufacturing Year");
                return;}
         try{
                Double.parseDouble(txtManufacterYear.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Enter Number for Manufacturing Year");
            }
        
        //int minSeats = Integer.parseInt(txtMinSeats.getText());
        String minSeats = txtMinSeats.getText();
        if(minSeats == null || minSeats.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Minimum Seats");
                return;}
         try{
                Double.parseDouble(txtMinSeats.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Enter Number for Minimum Seats");
            }
        
        //int maxSeats = Integer.parseInt(txtMaxSeats.getText());
        String maxSeats = txtMaxSeats.getText();
        if(maxSeats == null || maxSeats.equals("")){
                JOptionPane.showMessageDialog(null, "Enter the Maximum No. of Seats");
                return;}
        try{
                Double.parseDouble(txtMaxSeats.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Enter Number for Maximum Seats");
            }
       // int serialNum = Integer.parseInt(txtSerialNum.getText());
        String serialNum = txtSerialNumber.getText();
        if(serialNum == null || serialNum.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the Serial Number");
                return;}
        try{
                Double.parseDouble(txtSerialNumber.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Enter Number for Serial Number");
            }
        
        String modelNumber = txtModelNumber.getText();
        if(modelNumber == null || modelNumber.equals("")){
                JOptionPane.showMessageDialog(null, "Enter the Model Name");
                return;
            }
        String city= txtCity.getText();
        if(city == null || city.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the City");
                return;
            }
        if(checkBoxYesAvailable.isSelected() == false && checkBoxNoAvailable.isSelected()==false){
                JOptionPane.showMessageDialog(null, "Please select Yes or No checkbox for Availibilty");
                return;
            }
        if(checkBoxNoCertify.isSelected() == false && checkBoxYesCertify.isSelected()==false){
                JOptionPane.showMessageDialog(null, "Please select Yes or No checkbox for Maintenance Certificate");
                return;
            }

        
        
//        Car car = cabInformation.addCar();
        car.setBrand(brandName);
        car.setModel_num(modelNumber);
        car.setAvailable_city(city);
        car.setManufactured_year(Integer.parseInt(txtManufacterYear.getText()));
        car.setMin_seats(Integer.parseInt(txtMinSeats.getText()));
        car.setMax_seats(Integer.parseInt(txtMaxSeats.getText()));
        car.setSerial_num(Integer.parseInt(txtSerialNumber.getText()));
        car.setAvailable(checkBoxYesAvailable.isSelected());
        car.setMaintenance_certificate(checkBoxYesCertify.isSelected());


        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
        JOptionPane.showMessageDialog(null, "Uber Service Updated Successfully");
        
        SimpleDateFormat time = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date d = new Date();
        txtTimeStamp.setText(time.format(d));
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtBrandName.setEnabled(true);
        txtCity.setEnabled(true);
        txtModelNumber.setEnabled(true);
        txtSerialNumber.setEnabled(true);
        txtMinSeats.setEnabled(true);
        txtMaxSeats.setEnabled(true);
        txtManufacterYear.setEnabled(true);
        checkBoxNoAvailable.setEnabled(true);
        checkBoxNoCertify.setEnabled(true);
        checkBoxYesAvailable.setEnabled(true);
        checkBoxYesCertify.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkBoxNoAvailable;
    private javax.swing.JCheckBox checkBoxNoCertify;
    private javax.swing.JCheckBox checkBoxYesAvailable;
    private javax.swing.JCheckBox checkBoxYesCertify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtManufacterYear;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtTimeStamp;
    // End of variables declaration//GEN-END:variables
}
