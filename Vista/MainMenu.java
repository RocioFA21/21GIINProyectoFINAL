package Vista;

import Controlador.Controlador;
import Controlador.ConvocatoriaControlador;
import Controlador.MunicipioControlador;
import Controlador.PresentacionesControlador;
import Modelo.UsuarioDAO;
import Modelo.UsuarioEntidad;
import javax.swing.JFrame;
import Vista.*;

/**
 * Clase Login
 * Verifica el tipo de usuario y determina las caracteristicas del
 * usuario y sus posibles acciones
 * @author Rocio Fontecha
 * @version 01/01/2022/A
 * 
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    UsuarioDAO udao=new UsuarioDAO();
    UsuarioEntidad ue=new UsuarioEntidad();
    
    public MainMenu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * Este metodo es llamado en el constructor 
     * para inicializar el formulario
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_mcpocount = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_convocount = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelpresencount = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel_usercount = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuRegistrarUsuario = new javax.swing.JMenu();
        jMenuItemControlUsuario = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItemControlMunicipios = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItemControlConvocatoria = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItemControlPresentaciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 10));

        jLabel_username.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_username.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel_username.setText("Bienvenido <#####>");

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel_mcpocount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_mcpocount.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel_mcpocount.setText("MUNICIPIOS=");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_mcpocount)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel_mcpocount)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));

        jLabel_convocount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_convocount.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel_convocount.setText("CONVOCATORIAS=");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel_convocount)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel_convocount)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 51, 255));

        jLabelpresencount.setBackground(new java.awt.Color(255, 255, 255));
        jLabelpresencount.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabelpresencount.setText("PRESENTACIONES=");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelpresencount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelpresencount)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));

        jLabel_usercount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_usercount.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel_usercount.setText("USUARIOS=");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel_usercount)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel_usercount)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_username)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 623, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(961, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel_username)
                .addGap(39, 39, 39)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(389, Short.MAX_VALUE)))
        );

        jMenuRegistrarUsuario.setText("Usuarios");
        jMenuRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistrarUsuarioActionPerformed(evt);
            }
        });

        jMenuItemControlUsuario.setText("Control de Usuarios");
        jMenuItemControlUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControlUsuarioActionPerformed(evt);
            }
        });
        jMenuRegistrarUsuario.add(jMenuItemControlUsuario);

        jMenuBar1.add(jMenuRegistrarUsuario);

        jMenu7.setText("Municipios");

        jMenuItemControlMunicipios.setText("Control de Municipios");
        jMenuItemControlMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControlMunicipiosActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItemControlMunicipios);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Convocatoria");
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });

        jMenuItemControlConvocatoria.setText("Control de Convocatoria");
        jMenuItemControlConvocatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControlConvocatoriaActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItemControlConvocatoria);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Presentaciones");
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });

        jMenuItemControlPresentaciones.setText("Control de Presentaciones");
        jMenuItemControlPresentaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControlPresentacionesActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItemControlPresentaciones);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * ABRE EL MENU DE CONTROL DE CONVOCATORIAS
     * @param evt 
     */
    private void jMenuItemControlMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControlMunicipiosActionPerformed
        // ABRE EL MENU DE CONTROL DE municipios
        ManageMunicipios m= new ManageMunicipios();
        MunicipioControlador muni=new MunicipioControlador(m);
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        //Cerrar la ventana
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItemControlMunicipiosActionPerformed
    /**
     * ABRE EL MENU DE CONTROL DE CONVOCATORIAS
     * @param evt 
     */
    private void jMenuItemControlConvocatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControlConvocatoriaActionPerformed
        ManageConvocatoria conv= new ManageConvocatoria();
        ConvocatoriaControlador muni=new ConvocatoriaControlador(conv);
        conv.setVisible(true);
        conv.setLocationRelativeTo(null);
        //Cerrar la ventana
        conv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItemControlConvocatoriaActionPerformed

    private void jMenuRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistrarUsuarioActionPerformed

    }//GEN-LAST:event_jMenuRegistrarUsuarioActionPerformed
    /**
     * ABRE EL MENU DE CONTROL DE USUARIOS
     * @param evt 
     */
    private void jMenuItemControlUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControlUsuarioActionPerformed
        ManageUsuarios u= new ManageUsuarios();
        Controlador user=new Controlador(u);
        u.setVisible(true);
        u.setLocationRelativeTo(null);
        //Cerrar la ventana
        u.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItemControlUsuarioActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        
    }//GEN-LAST:event_jMenu8ActionPerformed
    /**
     * ABRE EL MENU DE CONTROL DE Presentaciones
     * @param evt 
     */
    private void jMenuItemControlPresentacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControlPresentacionesActionPerformed
        ManagePresentaciones mp= new ManagePresentaciones();
        PresentacionesControlador p=new PresentacionesControlador(mp);
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        //Cerrar la ventana
        mp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItemControlPresentacionesActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        
    }//GEN-LAST:event_jMenu9ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel_convocount;
    public static javax.swing.JLabel jLabel_mcpocount;
    public static javax.swing.JLabel jLabel_usercount;
    public static javax.swing.JLabel jLabel_username;
    public static javax.swing.JLabel jLabelpresencount;
    public static javax.swing.JMenu jMenu7;
    public static javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenuItem jMenuItemControlConvocatoria;
    public static javax.swing.JMenuItem jMenuItemControlMunicipios;
    private javax.swing.JMenuItem jMenuItemControlPresentaciones;
    public static javax.swing.JMenuItem jMenuItemControlUsuario;
    public static javax.swing.JMenu jMenuRegistrarUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

    void setLocationTelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
