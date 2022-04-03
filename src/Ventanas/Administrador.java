/* Parqueadero - 11 B - 2018 / 2019
    Hecho por:
    -Carlos Ausguto Hernández Zamora
    -Janiert Sebastián Salas Castillo
    -Natalia Vasquez Mora
    -Diego Fernando Victoria López
 */
package Ventanas;

//Importación de clases necesarias
import com.sun.awt.AWTUtilities;
import java.awt.HeadlessException;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//Fin importación de clases necesarias

public class Administrador extends javax.swing.JFrame { //Inicio clase Administrador

    //Inicio definición de variables, íconos y objetos globales
    static Login RegresarALogin = new Login(); //Objeto con la clase Login
    Conector Llamado = new Conector(); //Objeto con la clase Conector
    Connection Con = Llamado.Conexion();
    //Fin definición de variables, íconos y objetos globales    

    public Administrador() { //Inicio constructor clase Administrador
        initComponents();
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27); //Código que dá a la ventana bordes redondos
        AWTUtilities.setWindowShape(this, FormaVentana); //Código que dá a la ventana bordes redondos
        this.setLocationRelativeTo(null); //Se centra a la pantalla la ventana
        this.setResizable(false); //Se desactiva la posibilidad de cambiar el tamaño de la ventana
    } //Fin constructor clase Administrador

    public void ActualizarTablaMetodo() { //Inicio método mostrar valores de la base de datos en la tabla
        String[] Titulos = {"ID Usuario", "Nombre", "Contraseña", "Placa vehículo"}; //Columnas de la tabla
        String[] Registros = new String[4];
        DefaultTableModel Modelo = new DefaultTableModel(null, Titulos) { //Inicio configuración parámetros de la tabla
            @Override
            public boolean isCellEditable(int Filas, int Columnas) {
                if (Columnas == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        }; //Fin configuración parámetros de la tabla
        String SQL = "Select * from informacionusuario"; //Mensaje que se envia a SQL para que consulte todos lo usuarios registrados
        try { //Inicio capturador de errores
            Statement ST = Con.createStatement();
            ResultSet RS = ST.executeQuery(SQL);
            while (RS.next()) { //Inicio ciclo que actualiza la tabla
                Registros[0] = RS.getString("idusuario");
                Registros[1]
                        = RS.getString("nombre");
                Registros[2] = RS.getString("password");
                Registros[3] = RS.getString("placa");
                Modelo.addRow(Registros);
            } //Fin ciclo que actualiza la tabla
            JT_TablaUsuarios.setModel(Modelo);
        } catch (SQLException e) { //Capturador del error
            this.setState(1); //Minimizar ventana
            JOptionPane.showMessageDialog(null, "Un error inesperado ha ocurrido\nIntente de nuevo", "Ha ocurrido un error", JOptionPane.ERROR_MESSAGE);
            this.setState(0); //Levantar ventana
            System.out.println("Eror al mostrar los datos");
        } //Fin capturador de errores
    } //Fin método mostrar valores de la base de datos en la tabla

    public void EliminarRegistros() { //Inicio método EliminarRegistros
        if (this.JT_TablaUsuarios.getRowCount() != 0 && this.JT_TablaUsuarios.getSelectedRow() != -1) { //Condicional que evalua si hay algún usuario seleccionado para eliminar
            try { //Inicio capturador de errores
                int FilaSeleccionada = JT_TablaUsuarios.getSelectedRow(); //Variable que toma el número de la fila seleccionada por el administrador
                String SQL = "Delete from informacionusuario Where idusuario = " + JT_TablaUsuarios.getValueAt(FilaSeleccionada, 0);
                Statement ST = Con.createStatement();
                int n = ST.executeUpdate(SQL);
                if (n >= 0) { //Si el valor devuelto de SQL es igual o mayor a cero, el registro ha sido eliminado
                    this.setState(1); //Minimizar ventana
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente", "Usuario eliminado", JOptionPane.INFORMATION_MESSAGE);
                    this.setState(0); //Levantar ventana
                } else { //Si el valor devuelto de SQL es menor a cero, el registro no se ha logrado eliminar
                    this.setState(1); //Minimizar ventana
                    JOptionPane.showMessageDialog(null, "Se ha producido un error al eliminar el usuario\nIntente nuevamente", "Un error ha ocurrido", JOptionPane.ERROR_MESSAGE);
                    this.setState(0); //Levantar ventana
                }
            } catch (HeadlessException | SQLException e) { //Capturador del error
                JOptionPane.showMessageDialog(null, "Se ha producido un error al eliminar el usuario\nIntente nuevamente", "Un error ha ocurrido", JOptionPane.ERROR_MESSAGE);
            } //Fin capturador de errores
        } else { //En caso de no tener ningún usuario seleccionado para eliminarlo
            this.setState(1); //Minimizar ventana
            JOptionPane.showMessageDialog(null, "No hay ningún usuario seleccionado para eliminar", "Eliminar usuario", JOptionPane.INFORMATION_MESSAGE);
            this.setState(0); //Levantar ventana
        } //Fin condicional que evalua si hay algún usuario seleccionado para eliminar
    } //Fin método EliminarRegistros

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Inferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_TablaUsuarios = new javax.swing.JTable();
        JB_Eliminar = new javax.swing.JButton();
        JB_Actualizar = new javax.swing.JButton();
        JP_Superior = new javax.swing.JPanel();
        JL_Superior = new javax.swing.JLabel();
        Bt_Cerrar = new javax.swing.JButton();
        Bt_Minimizar = new javax.swing.JButton();
        Bt_Volver = new javax.swing.JButton();
        JL_Inferior = new javax.swing.JLabel();
        JS_SeparadorSuperior = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de usuarios");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setName("Administrador"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_Inferior.setBackground(new java.awt.Color(33, 45, 62));
        JP_Inferior.setMinimumSize(new java.awt.Dimension(600, 400));
        JP_Inferior.setPreferredSize(new java.awt.Dimension(600, 400));

        JT_TablaUsuarios.setBackground(new java.awt.Color(33, 45, 62));
        JT_TablaUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JT_TablaUsuarios.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JT_TablaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        JT_TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JT_TablaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JT_TablaUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        JT_TablaUsuarios.setSelectionBackground(new java.awt.Color(153, 153, 153));
        JT_TablaUsuarios.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(JT_TablaUsuarios);

        JB_Eliminar.setBackground(new java.awt.Color(33, 45, 62));
        JB_Eliminar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JB_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        JB_Eliminar.setText("Eliminar registro");
        JB_Eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_EliminarMouseClicked(evt);
            }
        });

        JB_Actualizar.setBackground(new java.awt.Color(33, 45, 62));
        JB_Actualizar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JB_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        JB_Actualizar.setText("Actualizar tabla");
        JB_Actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_ActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JP_InferiorLayout = new javax.swing.GroupLayout(JP_Inferior);
        JP_Inferior.setLayout(JP_InferiorLayout);
        JP_InferiorLayout.setHorizontalGroup(
            JP_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_InferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JB_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(JB_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JP_InferiorLayout.setVerticalGroup(
            JP_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_InferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(JP_InferiorLayout.createSequentialGroup()
                        .addComponent(JB_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JB_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 196, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(JP_Inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 600, 310));

        JP_Superior.setBackground(new java.awt.Color(73, 181, 172));
        JP_Superior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_Superior.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JL_Superior.setForeground(new java.awt.Color(255, 255, 255));
        JL_Superior.setText("Administración de usuarios");
        JP_Superior.add(JL_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 294, 38));

        Bt_Cerrar.setBackground(new java.awt.Color(73, 181, 172));
        Bt_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        Bt_Cerrar.setBorder(null);
        Bt_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bt_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_CerrarMouseClicked(evt);
            }
        });
        JP_Superior.add(Bt_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        Bt_Minimizar.setBackground(new java.awt.Color(73, 181, 172));
        Bt_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contraer.png"))); // NOI18N
        Bt_Minimizar.setBorder(null);
        Bt_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_MinimizarMouseClicked(evt);
            }
        });
        JP_Superior.add(Bt_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 33));

        Bt_Volver.setBackground(new java.awt.Color(73, 181, 172));
        Bt_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        Bt_Volver.setBorder(null);
        Bt_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_VolverMouseClicked(evt);
            }
        });
        JP_Superior.add(Bt_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 33, 33));

        JL_Inferior.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_Inferior.setForeground(new java.awt.Color(255, 255, 255));
        JL_Inferior.setText("Elimine los usuarios que considere pertinentes");
        JP_Superior.add(JL_Inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 56, -1, -1));

        JS_SeparadorSuperior.setBackground(new java.awt.Color(73, 181, 172));
        JS_SeparadorSuperior.setForeground(new java.awt.Color(255, 255, 255));
        JP_Superior.add(JS_SeparadorSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 20));

        getContentPane().add(JP_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_CerrarMouseClicked
        //Inicio botón cerrar ventana RegistroUsuario
        System.exit(0); //Cerrar ventana
        //Fin botón cerrar ventana RegistroUsuario
    }//GEN-LAST:event_Bt_CerrarMouseClicked

    private void Bt_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_MinimizarMouseClicked
        //Inicio botón minimizar Administrador
        this.setState(Login.ICONIFIED); //Minimizar ventana
        Bt_Minimizar.setSelected(false);
        //Fin botón minimizar Administrador
    }//GEN-LAST:event_Bt_MinimizarMouseClicked

    private void Bt_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_VolverMouseClicked
        //Inicio click sobre botón cerrar 
        this.setVisible(false); //Se oculta la ventana actual
        RegresarALogin.setVisible(true); //Abrir nuevamente la ventana Login
        //Fin click sobre botón cerrar
    }//GEN-LAST:event_Bt_VolverMouseClicked

    private void JB_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_EliminarMouseClicked
        //Inicio click sobre botón Eliminar
        EliminarRegistros();
        ActualizarTablaMetodo();
        //Fin click sobre botón Eliminar
    }//GEN-LAST:event_JB_EliminarMouseClicked

    private void JB_ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_ActualizarMouseClicked
        //Inicio click sobre botón Actualizar Tabla 
        ActualizarTablaMetodo();
        //Fin click sobre botón Actualizar Tabla 
    }//GEN-LAST:event_JB_ActualizarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Cerrar;
    private javax.swing.JButton Bt_Minimizar;
    public javax.swing.JButton Bt_Volver;
    private javax.swing.JButton JB_Actualizar;
    private javax.swing.JButton JB_Eliminar;
    private javax.swing.JLabel JL_Inferior;
    private javax.swing.JLabel JL_Superior;
    private javax.swing.JPanel JP_Inferior;
    private javax.swing.JPanel JP_Superior;
    private javax.swing.JSeparator JS_SeparadorSuperior;
    private javax.swing.JTable JT_TablaUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
} //Fin clase Administrador
