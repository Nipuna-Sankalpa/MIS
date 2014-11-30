/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.student;

import controller.student.StudentDetailController;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.student.Student;
import utilities.DBConnection;
import utilities.DBImageHandler;
import view.classes.AddClass;

/**
 *
 * @author Mampitiya
 */
public class AddStudent extends javax.swing.JInternalFrame {
    private String filePath;
    private StudentDetailController controller;
    private String oldId;
    private String empID;
    private String studentID;

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();   
        
        imageLbl.setMaximumSize(new Dimension(128, 128));
        imageLbl.setPreferredSize(new Dimension(128, 128));
        imageLbl.setMinimumSize(new Dimension(128, 128));
    }

    public AddStudent(StudentDetailController studentDetailController) {
        initComponents();
        imageLbl.setMaximumSize(new Dimension(128, 128));
        imageLbl.setPreferredSize(new Dimension(128, 128));
        imageLbl.setMinimumSize(new Dimension(128, 128));
        this.controller = studentDetailController;
        controller.setAddView(this);
    }    
    
    public void setEmpID(String id){
        this.empID = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblMobile = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        yearTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        browseBtn = new javax.swing.JButton();
        imageLbl = new javax.swing.JLabel();
        detailLbl1 = new javax.swing.JLabel();
        detailLbl2 = new javax.swing.JLabel();
        detailLbl3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        genderCmbx = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        lblNameGu = new javax.swing.JLabel();
        txtNameGu = new javax.swing.JTextField();
        lblContactGu = new javax.swing.JLabel();
        txtContactGu = new javax.swing.JTextField();
        detailLbl4 = new javax.swing.JLabel();
        detailLbl5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        addToClsBtn = new javax.swing.JButton();

        setBorder(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Student Details"));
        jPanel1.setToolTipText("");
        jPanel1.setName("panelAdd"); // NOI18N

        lblID.setText("Year * :");
        lblID.setName("lblID"); // NOI18N

        lblFirstName.setText("Student First Name * :");
        lblFirstName.setName("lblFirstName"); // NOI18N

        lblLastName.setText("Student Last Name * :");
        lblLastName.setName("lblLastName"); // NOI18N

        lblAddress.setText("Address * :");
        lblAddress.setName("lblAddress"); // NOI18N

        lblMobile.setText("Mobile No * :");
        lblMobile.setName("lblMobileNo"); // NOI18N

        txtMobile.setName("txtMobile"); // NOI18N
        txtMobile.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMobileCaretUpdate(evt);
            }
        });

        txtLastName.setName("txtLastName"); // NOI18N
        txtLastName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtLastNameCaretUpdate(evt);
            }
        });

        txtFirstName.setName("txtFirstName"); // NOI18N
        txtFirstName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFirstNameCaretUpdate(evt);
            }
        });

        yearTxt.setName("yearTxt"); // NOI18N

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Picture"));

        browseBtn.setText("Browse");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        imageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/student_images/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageLbl))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(browseBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(browseBtn)
                .addContainerGap())
        );

        detailLbl1.setForeground(new java.awt.Color(255, 0, 0));

        detailLbl2.setForeground(new java.awt.Color(255, 0, 0));

        detailLbl3.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Gender * : ");

        genderCmbx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Male", "Female" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMobile)
                    .addComponent(lblAddress)
                    .addComponent(lblLastName)
                    .addComponent(lblFirstName)
                    .addComponent(lblID))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yearTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(detailLbl1)
                                    .addComponent(detailLbl2))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(genderCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(detailLbl3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(detailLbl1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(detailLbl2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobile)
                    .addComponent(detailLbl3)
                    .addComponent(jLabel1)
                    .addComponent(genderCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Guardian Details"));

        lblNameGu.setText("Name of the Guardian * :");
        lblNameGu.setName("lblNameGu"); // NOI18N

        txtNameGu.setName(""); // NOI18N
        txtNameGu.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNameGuCaretUpdate(evt);
            }
        });

        lblContactGu.setText("Guardian's Contact No * :");
        lblContactGu.setName("lblContactGu"); // NOI18N

        txtContactGu.setName("txtContactGu"); // NOI18N
        txtContactGu.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtContactGuCaretUpdate(evt);
            }
        });

        detailLbl4.setForeground(new java.awt.Color(255, 0, 0));

        detailLbl5.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameGu)
                    .addComponent(lblContactGu))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtContactGu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(detailLbl5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtNameGu, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detailLbl4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameGu)
                    .addComponent(txtNameGu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailLbl4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactGu)
                    .addComponent(txtContactGu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailLbl5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Note that the fields that are indicated by * must be filled");

        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.setName("saveBtn"); // NOI18N
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        addToClsBtn.setText("Add to Class");
        addToClsBtn.setEnabled(false);
        addToClsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToClsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(121, 121, 121)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToClsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(clearBtn)
                    .addComponent(jLabel8)
                    .addComponent(addToClsBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        studentID = controller.updateId(yearTxt.getText());
        oldId = studentID;        
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String address = txtAddress.getText();
        String mobile = txtMobile.getText();
        String guardName = txtNameGu.getText();
        String guardMob = txtContactGu.getText();
        boolean gender = (genderCmbx.getSelectedIndex()== 1);
        
        Student student = new Student(studentID, firstName, lastName, address, mobile, guardName, guardMob, gender);
        student.setYear(yearTxt.getText()); 
        student.setFilePath(filePath);
        
        int res = controller.addStudent(student);
        try {
            int res1=DBImageHandler.updateImage(DBConnection.getConnection(), filePath, "student",student.getStudentID() );
        } catch (FileNotFoundException | SQLException | ClassNotFoundException ex) {
            
        }
        if (res == 1) {
            JOptionPane.showMessageDialog(this, "Successfully Added!");
            addToClsBtn.setEnabled(true);
        }    
    }//GEN-LAST:event_saveBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearFields();
        saveBtn.setEnabled(false); 
    }//GEN-LAST:event_clearBtnActionPerformed

    private void clearFields(){       
        txtAddress.setText("");
        yearTxt.setText("");
        txtContactGu.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtMobile.setText("");
        txtNameGu.setText("");
        genderCmbx.setSelectedIndex(0);
        imageLbl.setIcon(new ImageIcon(getClass().getResource("/resources/student_images/user.png")));
    }
    
    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            filePath = file.getAbsolutePath();
            imageLbl.setIcon(new ImageIcon(filePath));
            saveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_browseBtnActionPerformed

    private void txtFirstNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFirstNameCaretUpdate
        String name = txtFirstName.getText();
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i)) & !Character.isSpaceChar(name.charAt(i))) {
                detailLbl1.setText("Invalid name");
                break;
            } else {
                detailLbl1.setText("");
            }
        }
    }//GEN-LAST:event_txtFirstNameCaretUpdate

    private void txtLastNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtLastNameCaretUpdate
        String name = txtLastName.getText();
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i)) & !Character.isSpaceChar(name.charAt(i))) {
                detailLbl2.setText("Invalid name");
                break;
            } else {
                detailLbl2.setText("");
            }
        }
    }//GEN-LAST:event_txtLastNameCaretUpdate

    private void txtMobileCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMobileCaretUpdate
        String tel = txtMobile.getText();
        boolean isLetter = false;
        for (int i = 0; i < tel.length(); i++) {
            if (!Character.isDigit(tel.charAt(i))) {
                isLetter = true;
                break;
            }
        }
        if (isLetter || tel.length() > 10) {
            detailLbl3.setText("Invalid number");
        } else {
            detailLbl3.setText("");
        }
    }//GEN-LAST:event_txtMobileCaretUpdate

    private void txtNameGuCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNameGuCaretUpdate
        String name = txtNameGu.getText();
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i)) & !Character.isSpaceChar(name.charAt(i))) {
                detailLbl4.setText("Invalid name");
                break;
            } else {
                detailLbl4.setText("");
            }
        }
    }//GEN-LAST:event_txtNameGuCaretUpdate

    private void txtContactGuCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtContactGuCaretUpdate
        String tel = txtContactGu.getText();
        boolean isLetter = false;
        for (int i = 0; i < tel.length(); i++) {
            if (!Character.isDigit(tel.charAt(i))) {
                isLetter = true;
                break;
            }
        }
        if (isLetter || tel.length() > 10) {
            detailLbl5.setText("Invalid number");
        } else {
            detailLbl5.setText("");
        }
    }//GEN-LAST:event_txtContactGuCaretUpdate

    private void addToClsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToClsBtnActionPerformed
        AddClass addClass = new AddClass();
        addClass.setEmpID(empID);
        addClass.setVisible(true); 
        addClass.setID(oldId);
    }//GEN-LAST:event_addToClsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToClsBtn;
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel detailLbl1;
    private javax.swing.JLabel detailLbl2;
    private javax.swing.JLabel detailLbl3;
    private javax.swing.JLabel detailLbl4;
    private javax.swing.JLabel detailLbl5;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JComboBox genderCmbx;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactGu;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblNameGu;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContactGu;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtNameGu;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables
}
