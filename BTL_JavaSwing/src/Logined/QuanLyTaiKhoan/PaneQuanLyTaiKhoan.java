/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logined.QuanLyTaiKhoan;

/**
 *
 * @author Admin
 */
public class PaneQuanLyTaiKhoan extends javax.swing.JPanel {

    /**
     * Creates new form PaneQuanLyTaiKhoan
     */
    public PaneQuanLyTaiKhoan() {
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

        LayerQLTK = new javax.swing.JLayeredPane();
        homeQuanLyTaiKhoan1 = new Logined.QuanLyTaiKhoan.HomeQuanLyTaiKhoan();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LayerQLTK.setAlignmentX(0.0F);
        LayerQLTK.setAlignmentY(0.0F);
        LayerQLTK.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        LayerQLTK.setMinimumSize(new java.awt.Dimension(760, 770));
        LayerQLTK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LayerQLTK.add(homeQuanLyTaiKhoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(LayerQLTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 770));
    }// </editor-fold>//GEN-END:initComponents

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LayerQLTK;
    private Logined.QuanLyTaiKhoan.HomeQuanLyTaiKhoan homeQuanLyTaiKhoan1;
    // End of variables declaration//GEN-END:variables
}
