/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.PublisherDAO;
import model.PublisherDTO;

/**
 *
 * @author yj
 */
public class PublisherAdd extends javax.swing.JFrame implements ActionListener{
    private PublisherDAO Dao;
    private String puId;
    
    private boolean usepuid=false; //사업자 번호 사용 불가
    private boolean dupChecked;  //아이디 중복확인 했는지 여부
    
    /**
     * Creates new form PublisherAdd
     */
    public PublisherAdd() {
        initComponents();
        init();
        addEvent();
        setLocationRelativeTo(null); //가운데 배치
    }
    
    
        private void init() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dao = new PublisherDAO();
        setLocationRelativeTo(null); //가운데 배치
        setTitle("출판사 등록");
    }//init

    private void addEvent() {
        bt_Dup.addActionListener(this);
        bt_add.addActionListener(this);

        tf_puId.addActionListener(this);
        tf_puName.addActionListener(this);
        tf_puTel.addActionListener(this);
        tf_puManager.addActionListener(this);
        tf_puHp.addActionListener(this);
    }

    PublisherAdd(String inNo) {
        this();
        this.puId = puId;

    }
    public boolean isDupChecked() {
        return dupChecked;
    }
    
    public void setDupChecked(boolean dupChecked) {
        this.dupChecked = dupChecked;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt_Dup) {
            try {
                checkPuid();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }else if (e.getSource() == bt_add && usepuid == false) {
            JOptionPane.showMessageDialog(this, "사업자 등록번호를 확인하세요.");
        }else if (e.getSource() == bt_add && usepuid == true){  
            try {
                Addpublisher();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } 
    }//actionPerformed

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_puNo = new javax.swing.JLabel();
        lb_puName = new javax.swing.JLabel();
        lb_puTel = new javax.swing.JLabel();
        lb_puManager = new javax.swing.JLabel();
        lb_puHp = new javax.swing.JLabel();
        bt_add = new javax.swing.JButton();
        tf_puId = new javax.swing.JTextField();
        tf_puManager = new javax.swing.JTextField();
        tf_puHp = new javax.swing.JTextField();
        bt_Dup = new javax.swing.JButton();
        tf_puName = new javax.swing.JTextField();
        tf_puTel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_puNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_puNo.setText("사업자 등록번호");

        lb_puName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_puName.setText("출판사명");

        lb_puTel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_puTel.setText("회사대표번호");

        lb_puManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_puManager.setText("담당자명");

        lb_puHp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_puHp.setText("담당자연락처");

        bt_add.setText("등록");

        bt_Dup.setText("검색");
        bt_Dup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_puNo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lb_puName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_puId, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_Dup))
                            .addComponent(tf_puName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_puHp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_puHp))
                    .addComponent(bt_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_puTel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lb_puManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_puManager)
                            .addComponent(tf_puTel))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_puNo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_puId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_Dup)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_puName)
                    .addComponent(tf_puName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_puTel)
                    .addComponent(tf_puTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_puManager)
                    .addComponent(tf_puManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_puHp)
                    .addComponent(tf_puHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_add)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_DupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_DupActionPerformed

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
            java.util.logging.Logger.getLogger(PublisherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PublisherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PublisherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PublisherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PublisherAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Dup;
    private javax.swing.JButton bt_add;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_puHp;
    private javax.swing.JLabel lb_puManager;
    private javax.swing.JLabel lb_puName;
    private javax.swing.JLabel lb_puNo;
    private javax.swing.JLabel lb_puTel;
    private javax.swing.JTextField tf_puHp;
    private javax.swing.JTextField tf_puId;
    private javax.swing.JTextField tf_puManager;
    private javax.swing.JTextField tf_puName;
    private javax.swing.JTextField tf_puTel;
    // End of variables declaration//GEN-END:variables

    //추가
    private void Addpublisher() throws SQLException {

        //1 사용자 값 받기
        String puId = tf_puId.getText();
        String puName = tf_puName.getText();
        String puTel = tf_puTel.getText();
        String puManager = tf_puManager.getText();
        String puHp = tf_puHp.getText();

        // + 유효성 검사
        if (puId == null || puId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "사업자 번호를 입력하세요.");
            tf_puId.requestFocus();
            return;
        } else if (puName == null || puName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "출판사명를 입력하세요.");
            tf_puName.requestFocus();
            return;
        } else if (puTel == null || puTel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "회사 번호를 입력하세요.");
            tf_puTel.requestFocus();
            return;
        } else if (puManager == null || puManager.isEmpty()) {
            JOptionPane.showMessageDialog(this, "담당자 이름을 입력하세요.");
            tf_puManager.requestFocus();
            return;
        } else if (puHp == null || puHp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "담당자 번호를 입력하세요.");
            tf_puHp.requestFocus();
            return;
        }

        //2. sql 로직 처리하기
        PublisherDTO dto = new PublisherDTO(puId, puName, puTel, puManager, puHp);
        int result = Dao.AddPu(dto);
        
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "등록이 완료되었습니다.");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "정보를 다시 확인해주세요.");
            return;
        }

    }

    //사업자번호 검사
    private void checkPuid() throws SQLException {
        //1 값 받기
        String puid = tf_puId.getText();
        // 유효성 검사
        if (puid == null || puid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "사업자 등록번호를 입력하세요");
            return;
        } 
        
        //2 sql 쿼리 받아오기
        Dao = new PublisherDAO();
        int result = Dao.checkPuId(puid);
        //3 사업자 번호 조회하기
        if(result > 0){
            JOptionPane.showMessageDialog(this, "이미 등록된 사업자 번호 입니다.");
            tf_puId.setText(puid);
            usepuid=false;
            return;
        }else if(result == 0){
            JOptionPane.showMessageDialog(this, "사용 가능한 사업자 번호입니다.");
            tf_puName.setText(puid);
            usepuid=true;
            return;
        }
        }//checkPuid
}
