/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author SpellCaster
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addProject = new javax.swing.JButton();
        addTeamLead = new javax.swing.JButton();
        editMembers = new javax.swing.JButton();
        addDonors = new javax.swing.JButton();
        searchProject = new javax.swing.JButton();
        searchDonor = new javax.swing.JButton();
        teamMember = new javax.swing.JButton();
        addApplicant = new javax.swing.JButton();
        shortListApplicant = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        searchBeneficiary = new javax.swing.JButton();
        Donate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DONATION MANAGEMENT SYSTEM");

        addProject.setText("addProject");
        addProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjectActionPerformed(evt);
            }
        });

        addTeamLead.setText("addTeamLead");
        addTeamLead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeamLeadActionPerformed(evt);
            }
        });

        editMembers.setText("addRemoveVolunteer");
        editMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMembersActionPerformed(evt);
            }
        });

        addDonors.setText("addDonors");
        addDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDonorsActionPerformed(evt);
            }
        });

        searchProject.setText("Search Project");
        searchProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProjectActionPerformed(evt);
            }
        });

        searchDonor.setText("searchDonor");
        searchDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDonorActionPerformed(evt);
            }
        });

        teamMember.setText("addTeamMember");
        teamMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamMemberActionPerformed(evt);
            }
        });

        addApplicant.setText("addApplicant");
        addApplicant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addApplicantActionPerformed(evt);
            }
        });

        shortListApplicant.setText("shortListApplicant");
        shortListApplicant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortListApplicantActionPerformed(evt);
            }
        });

        jButton1.setText("replaceVolunteer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchBeneficiary.setText("searchBeneficiary");
        searchBeneficiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBeneficiaryActionPerformed(evt);
            }
        });

        Donate.setText("DONATE");
        Donate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDonors)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProject)
                            .addComponent(addApplicant)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addTeamLead)
                                    .addComponent(searchDonor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamMember)
                                    .addComponent(editMembers)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Donate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchBeneficiary))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(searchProject)
                                    .addGap(18, 18, 18)
                                    .addComponent(shortListApplicant))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProject)
                    .addComponent(addTeamLead)
                    .addComponent(editMembers))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDonors)
                    .addComponent(searchDonor)
                    .addComponent(teamMember))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchProject)
                    .addComponent(addApplicant)
                    .addComponent(shortListApplicant))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(searchBeneficiary)
                    .addComponent(Donate))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProjectActionPerformed
        // TODO add your handling code here:
        addProject p2 = new addProject();
        p2.start();
    }//GEN-LAST:event_addProjectActionPerformed

    private void addTeamLeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeamLeadActionPerformed
        // TODO add your handling code here:
        addTeamLead p3 = new addTeamLead();
        p3.start();
    }//GEN-LAST:event_addTeamLeadActionPerformed

    private void editMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMembersActionPerformed
        // TODO add your handling code here:
        addRemoveVolunteer p4 = new addRemoveVolunteer();
        p4.start();
    }//GEN-LAST:event_editMembersActionPerformed

    private void addDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDonorsActionPerformed
        // TODO add your handling code here:
        addDonors p5 = new addDonors();
        p5.start();
    }//GEN-LAST:event_addDonorsActionPerformed

    private void searchProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProjectActionPerformed
        // TODO add your handling code here:
        searchProject p6 = new searchProject();
        p6.start();
    }//GEN-LAST:event_searchProjectActionPerformed

    private void searchDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDonorActionPerformed
        // TODO add your handling code here:
        searchDonor p7 = new searchDonor();
        p7.start();
    }//GEN-LAST:event_searchDonorActionPerformed

    private void teamMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamMemberActionPerformed
        // TODO add your handling code here:
        addTeamMember p8 = new addTeamMember();
        p8.start();
    }//GEN-LAST:event_teamMemberActionPerformed

    private void addApplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addApplicantActionPerformed
        // TODO add your handling code here:
        addApplicant p9 = new addApplicant();
        p9.start();
    }//GEN-LAST:event_addApplicantActionPerformed

    private void shortListApplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortListApplicantActionPerformed
        // TODO add your handling code here:
        shortListApplicants p10 = new shortListApplicants();
        p10.start();
    }//GEN-LAST:event_shortListApplicantActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        replaceVolunteer p11 = new replaceVolunteer();
        p11.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchBeneficiaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBeneficiaryActionPerformed
        // TODO add your handling code here:
        searchBeneficiary p12 = new searchBeneficiary();
        p12.start();
    }//GEN-LAST:event_searchBeneficiaryActionPerformed

    private void DonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonateActionPerformed
        // TODO add your handling code here:
        issueDonations p13 = new issueDonations();
        p13.start();
    }//GEN-LAST:event_DonateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Donate;
    private javax.swing.JButton addApplicant;
    private javax.swing.JButton addDonors;
    private javax.swing.JButton addProject;
    private javax.swing.JButton addTeamLead;
    private javax.swing.JButton editMembers;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton searchBeneficiary;
    private javax.swing.JButton searchDonor;
    private javax.swing.JButton searchProject;
    private javax.swing.JButton shortListApplicant;
    private javax.swing.JButton teamMember;
    // End of variables declaration//GEN-END:variables
}
