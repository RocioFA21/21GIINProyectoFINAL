package Controlador;


import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Esta calse define el proceso de escucha para las acciones/eventos
 * de botones especificos pertenecientes al paquete Vista relacionado con las
 * convocatorias
 * @author Rocio Fontecha
 * @version 01/01/2022/A
 * 
 */

public class ConvocatoriaControlador implements ActionListener{
    
    ConvocatoriaDAO mdao=new ConvocatoriaDAO();
    ConvocatoriaEntidad me=new ConvocatoriaEntidad();
    ManageConvocatoria manageconvocatoria=new ManageConvocatoria();
    DefaultTableModel modelo=new DefaultTableModel();

    public ConvocatoriaControlador(ManageConvocatoria mc) {
        //acceder a los botones del menu convocatorias
        this.manageconvocatoria=mc;
        this.manageconvocatoria.btnListar.addActionListener(this);
        this.manageconvocatoria.jButton_editar.addActionListener(this);
        this.manageconvocatoria.jButton_actualizar.addActionListener(this);
        this.manageconvocatoria.jButton_registrarconvocatoria.addActionListener(this);
        this.manageconvocatoria.jButton_nuevo.addActionListener(this);
        this.manageconvocatoria.jButton_eliminarconvocatoria.addActionListener(this);
    }
    
    @Override
    /**
     * Acciones sobre las convocatorias
     */
    public void actionPerformed(ActionEvent e) {
        /**
         * Al hacer click sobre el el boton Refrescar
         * Cargar/refrescar los valores de la tabla perteneciente
         * a ManageConvocatoria donde se muestran las convocatorias
         * registradas en el sistema con todos sus datos
         */
        if (e.getSource() == manageconvocatoria.btnListar) {
            //Vaciar la tabla
            limpiarTabla();
            //Mostrar los datos de las convocatorias en la tabla del menu
            listar(manageconvocatoria.jTable_data);
            //Vaciar los campos del menu de convocatorias
            nuevo();
        }
        /**
         * Al hacer click sobre el el boton Registrar
         * agregar convocatorias nuevas en el sistema
         */
        if (e.getSource() == manageconvocatoria.jButton_registrarconvocatoria) {
            //prepara los datos de la convocatoria que sera registrados
            add();
            //Mostrar los datos de la convocatoria en la tabla del menu
            listar(manageconvocatoria.jTable_data);
            //Vaciar los campos del menu de convocatorias
            nuevo();
        }
        /**
         * Al hacer click sobre el el boton Editar
         * modifica los valores de la convocatoria seleccionada
         * y actualiza sus valores en la base de datos
         */
        if (e.getSource() == manageconvocatoria.jButton_editar) {
            /**
             * Almacena en la variable "fila" el indice de la fila de la tabla
             * del menu de convocatorias
             */
            int fila = manageconvocatoria.jTable_data.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(manageconvocatoria, "Debes seleccionar una fila");
            }else{
                /**
                 * Pasar los valores de la tabla al 
                 * formulario de convocatorias
                 */
                int id = Integer.parseInt((String) manageconvocatoria.jTable_data.getValueAt(fila, 0).toString());
                String nombre = (String) manageconvocatoria.jTable_data.getValueAt(fila, 1);
                String descrip = (String) manageconvocatoria.jTable_data.getValueAt(fila, 2);
                Date fechaA = (Date) manageconvocatoria.jTable_data.getValueAt(fila, 3);
                Date fechaC = (Date) manageconvocatoria.jTable_data.getValueAt(fila, 4);
                Boolean estado = (Boolean) manageconvocatoria.jTable_data.getValueAt(fila, 5);
                String docs = (String) manageconvocatoria.jTable_data.getValueAt(fila, 6);
                manageconvocatoria.jTextField_id.setText("" + id);
                manageconvocatoria.jTextField_nombre.setText(nombre);
                manageconvocatoria.jTextField_descrip.setText(descrip);
                if (estado.equals(true)) {
                    manageconvocatoria.jTextField_estado.setText("Abierta");
                }
                if (estado.equals(false)) {
                    manageconvocatoria.jTextField_estado.setText("Cerrada");
                }
                manageconvocatoria.jTextField_docs.setText(docs);
                
            }
        }
        /**
         * Ejecutar la actualizacion de los datos de la convocatoria
         * en la base de datos
         */
        if (e.getSource() == manageconvocatoria.jButton_actualizar) {
            // Update en la base de datos
            actualizar();
            listar(manageconvocatoria.jTable_data);
            nuevo();
        }
        /**
         * Vaciar los campos del menu de convocatorias
         */
        if (e.getSource() == manageconvocatoria.jButton_nuevo) {
            nuevo();
        }
        /**
         * Elimina la convocatoria seleccionado
         */
        if (e.getSource() == manageconvocatoria.jButton_eliminarconvocatoria) {
            delete();
            listar(manageconvocatoria.jTable_data);
            nuevo();
        }
        
    }
    /**
     * Mostrar los datos de las convocatorias en la tabla del menu
     * @param jTable_data 
     */
    public void listar(JTable jTable_data) {
        modelo=(DefaultTableModel) jTable_data.getModel();

        jTable_data.setModel(modelo);
        List<ConvocatoriaEntidad>lista=mdao.listar();
        Object[]objeto=new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0]=lista.get(i).getId();
            objeto[1]=lista.get(i).getNombre();
            objeto[2]=lista.get(i).getDescrip();
            objeto[3]=lista.get(i).getFechaA();
            objeto[4]=lista.get(i).getFechaC();
            objeto[5]=lista.get(i).isEstado();
            objeto[6]=lista.get(i).getDocs();
            modelo.addRow(objeto);
        }
        
        jTable_data.setRowHeight(35);
        jTable_data.setRowMargin(10);
    }
    /**
     * Vaciar los campos del menu de convocatorias
     */
    void nuevo() {
        manageconvocatoria.jTextField_id.setText("");
        manageconvocatoria.jTextField_nombre.setText("");
        manageconvocatoria.jTextField_descrip.setText("");
        manageconvocatoria.jTextField_estado.setText("");
        manageconvocatoria.jTextField_docs.setText("");
        manageconvocatoria.jTextField_nombre.requestFocus();
    }
    /**
     * prepara los datos de la convocatoria que sera registrada
     */
    public void add() {
        String nombre = manageconvocatoria.jTextField_nombre.getText();
        String descrip = manageconvocatoria.jTextField_descrip.getText();
        String estado = manageconvocatoria.jComboBox_estado.getSelectedItem().toString();
        String docs = manageconvocatoria.jTextField_docs.getText();
        me.setNombre(nombre);
        me.setDescrip(descrip);
        if (estado.equals("Abierta")) {
            me.setEstado(true);
        }
        if (estado.equals("Cerrada")) {
            me.setEstado(false);
        }
        me.setDocs(docs);
        int r = mdao.insertar(me);
        if (r == 1) {
            JOptionPane.showMessageDialog(manageconvocatoria, "Convocatoria Agregada con Exito.");
        } 
        limpiarTabla();
    }
    /**
     * Metodo para ejecutar el Update
     */
    public void actualizar() {
        if (manageconvocatoria.jTextField_id.getText().equals("")) {
            
            JOptionPane.showMessageDialog(manageconvocatoria, "No se Identifica el Id debe selecionar la opcion Editar");
        } else {
            int id = Integer.parseInt(manageconvocatoria.jTextField_id.getText());
            String nombre = manageconvocatoria.jTextField_nombre.getText();
            String descrip = manageconvocatoria.jTextField_descrip.getText();        
            String estado = manageconvocatoria.jComboBox_estado.getSelectedItem().toString();
            String docs = manageconvocatoria.jTextField_docs.getText();
            
            java.sql.Date fechaC = new java.sql.Date(System.currentTimeMillis());
            
            me.setId(id);
            me.setNombre(nombre);
            me.setDescrip(descrip);            
            if (estado.equals("Abierta")) {
                me.setEstado(true);
                me.setFechaC(null);
            }
            if (estado.equals("Cerrada")) {
                me.setEstado(false);
                me.setFechaC(fechaC);
            }
            me.setDocs(docs);

            int r = mdao.actualizar(me);
            if (r == 1) {
                JOptionPane.showMessageDialog(manageconvocatoria, "Convocatoria Actualizada con Exito.");
            } else {
                JOptionPane.showMessageDialog(manageconvocatoria, "Error");
            }
        }
        limpiarTabla();
    }
    /**
     * Metodo para ejecutar el Delete
     */
    public void delete() {
        int fila = manageconvocatoria.jTable_data.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(manageconvocatoria, "Debe Seleccionar una Fila");
        } else {
            int id = Integer.parseInt((String) manageconvocatoria.jTable_data.getValueAt(fila, 0).toString());
            mdao.Delete(id);
            System.out.println("El Reusltado es" + id);
            JOptionPane.showMessageDialog(manageconvocatoria, "Convocatoria Eliminada");
        }
        limpiarTabla();
    }
    /**
     * Vaciar la tabla del menu de convocatorias
     */
    void limpiarTabla() {
        for (int i = 0; i < manageconvocatoria.jTable_data.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
}
