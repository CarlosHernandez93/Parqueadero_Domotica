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
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import java.sql.*;
//Fin importación de clases

public class RegistroUsuario extends javax.swing.JFrame { //Inicio clase RegistroUsuario

    Login Regresar = new Login(); //Objeto con la clase "Login"
    String Placa, Nombre, Password;
    Conector ObjetoClaseConector2 = new Conector(); //Objeto con la clase Conector
    Connection cn2 = ObjetoClaseConector2.Conexion();

    public RegistroUsuario() { //Inicio constructor clase RegistroUsuario
        initComponents();
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27); //Código que dá a la ventana bordes redondos
        AWTUtilities.setWindowShape(this, FormaVentana); //Código que dá a la ventana bordes redondos
        JT_IngresoNombre.setText(null);
        JT_IngresoPassword.setText(null);
        JT_IngresoPlaca.setText(null);
    } //Fin constructor clase RegistroUsuario

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Superior = new javax.swing.JPanel();
        Bt_Cerrar = new javax.swing.JButton();
        Bt_Minimizar = new javax.swing.JButton();
        Bt_Volver = new javax.swing.JButton();
        LB_Titulo = new javax.swing.JLabel();
        JP_Inferior = new javax.swing.JPanel();
        JS_Separador = new javax.swing.JSeparator();
        LB_NombreUsuario = new javax.swing.JLabel();
        JS_Separador1 = new javax.swing.JSeparator();
        JT_IngresoNombre = new javax.swing.JTextField();
        JL_PasswordUsuario = new javax.swing.JLabel();
        JS_Separador2 = new javax.swing.JSeparator();
        JT_IngresoPassword = new javax.swing.JTextField();
        JL_PlacaVehiculo = new javax.swing.JLabel();
        JS_Separador3 = new javax.swing.JSeparator();
        JT_IngresoPlaca = new javax.swing.JTextField();
        Bt_CulminarUsuario = new javax.swing.JButton();
        JL_IconoUsuario = new javax.swing.JLabel();
        JL_Password = new javax.swing.JLabel();
        JL_Moto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setName("RegistroNuevoUsuario"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_Superior.setBackground(new java.awt.Color(73, 181, 172));

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

        Bt_Minimizar.setBackground(new java.awt.Color(73, 181, 172));
        Bt_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contraer.png"))); // NOI18N
        Bt_Minimizar.setBorder(null);
        Bt_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_MinimizarMouseClicked(evt);
            }
        });

        Bt_Volver.setBackground(new java.awt.Color(73, 181, 172));
        Bt_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        Bt_Volver.setBorder(null);
        Bt_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_VolverMouseClicked(evt);
            }
        });

        LB_Titulo.setBackground(new java.awt.Color(73, 181, 172));
        LB_Titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LB_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        LB_Titulo.setText("Registro de nuevo usuario");

        javax.swing.GroupLayout JP_SuperiorLayout = new javax.swing.GroupLayout(JP_Superior);
        JP_Superior.setLayout(JP_SuperiorLayout);
        JP_SuperiorLayout.setHorizontalGroup(
            JP_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bt_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bt_Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bt_Cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP_SuperiorLayout.setVerticalGroup(
            JP_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_SuperiorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(JP_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bt_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JP_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bt_Cerrar)
                        .addComponent(Bt_Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(JP_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(JP_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 80));

        JP_Inferior.setBackground(new java.awt.Color(33, 45, 62));
        JP_Inferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JS_Separador.setBackground(new java.awt.Color(255, 255, 255));
        JP_Inferior.add(JS_Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        LB_NombreUsuario.setBackground(new java.awt.Color(33, 45, 62));
        LB_NombreUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LB_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LB_NombreUsuario.setText("Nombre de usuario");
        JP_Inferior.add(LB_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 8, 326, 32));

        JS_Separador1.setBackground(new java.awt.Color(33, 45, 62));
        JS_Separador1.setForeground(new java.awt.Color(255, 255, 255));
        JP_Inferior.add(JS_Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, 326, 10));

        JT_IngresoNombre.setBackground(new java.awt.Color(33, 45, 62));
        JT_IngresoNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JT_IngresoNombre.setForeground(new java.awt.Color(255, 255, 255));
        JT_IngresoNombre.setBorder(null);
        JT_IngresoNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        JT_IngresoNombre.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JT_IngresoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_IngresoNombreKeyTyped(evt);
            }
        });
        JP_Inferior.add(JT_IngresoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 290, 30));

        JL_PasswordUsuario.setBackground(new java.awt.Color(33, 45, 62));
        JL_PasswordUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_PasswordUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JL_PasswordUsuario.setText("Contraseña");
        JP_Inferior.add(JL_PasswordUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 106, -1, -1));

        JS_Separador2.setBackground(new java.awt.Color(33, 45, 62));
        JS_Separador2.setForeground(new java.awt.Color(255, 255, 255));
        JP_Inferior.add(JS_Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 171, 326, 10));

        JT_IngresoPassword.setBackground(new java.awt.Color(33, 45, 62));
        JT_IngresoPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JT_IngresoPassword.setForeground(new java.awt.Color(255, 255, 255));
        JT_IngresoPassword.setBorder(null);
        JT_IngresoPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        JT_IngresoPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JP_Inferior.add(JT_IngresoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 290, 30));

        JL_PlacaVehiculo.setBackground(new java.awt.Color(33, 45, 62));
        JL_PlacaVehiculo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_PlacaVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        JL_PlacaVehiculo.setText("Placa del vehículo");
        JP_Inferior.add(JL_PlacaVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 320, 32));

        JS_Separador3.setBackground(new java.awt.Color(33, 45, 62));
        JS_Separador3.setForeground(new java.awt.Color(255, 255, 255));
        JP_Inferior.add(JS_Separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 320, -1));

        JT_IngresoPlaca.setBackground(new java.awt.Color(33, 45, 62));
        JT_IngresoPlaca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JT_IngresoPlaca.setForeground(new java.awt.Color(255, 255, 255));
        JT_IngresoPlaca.setBorder(null);
        JT_IngresoPlaca.setCaretColor(new java.awt.Color(255, 255, 255));
        JT_IngresoPlaca.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JP_Inferior.add(JT_IngresoPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 280, 30));

        Bt_CulminarUsuario.setBackground(new java.awt.Color(33, 45, 62));
        Bt_CulminarUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Bt_CulminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Bt_CulminarUsuario.setText("Añadir usuario");
        Bt_CulminarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt_CulminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_CulminarUsuarioMouseClicked(evt);
            }
        });
        JP_Inferior.add(Bt_CulminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 326, 34));

        JL_IconoUsuario.setBackground(new java.awt.Color(33, 45, 62));
        JL_IconoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_IconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        JP_Inferior.add(JL_IconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, 40));

        JL_Password.setBackground(new java.awt.Color(33, 45, 62));
        JL_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerradura.png"))); // NOI18N
        JP_Inferior.add(JL_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 40));

        JL_Moto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Moto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Moto.png"))); // NOI18N
        JP_Inferior.add(JL_Moto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, 40));

        getContentPane().add(JP_Inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 350, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_CerrarMouseClicked
        //Inicio botón cerrar ventana RegistroUsuario
        System.exit(0); //Cerrar ventana
        //Fin botón cerrar ventana RegistroUsuario
    }//GEN-LAST:event_Bt_CerrarMouseClicked

    private void Bt_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_MinimizarMouseClicked
        //Inicio botón minimizar RegistroUsuario
        this.setState(Login.ICONIFIED); //Minimizar ventana
        Bt_Minimizar.setSelected(false);
        //Fin botón minimizar RegistroUsuario
    }//GEN-LAST:event_Bt_MinimizarMouseClicked

    private void Bt_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_VolverMouseClicked
        int ConfirmarRegreso = JOptionPane.showConfirmDialog(null, "¿Desea regresar al login?\nPerderá cualquier dato que haya ingresado\ny no haya registrado", "Volver al menú principal", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); //Pregunta para salir de este menú
        if (ConfirmarRegreso == JOptionPane.YES_OPTION) { //Condicional que comprueba la respuesta del usuario
            JOptionPane.showMessageDialog(null, "Regresando al menú principal", "Menú principal", JOptionPane.INFORMATION_MESSAGE);
            Regresar.setVisible(true); //Abrir nuevamente la ventana Login
            this.setVisible(false); //Se oculta la ventana actual
        } else { //Si la respuesta para salir del usuario es negativa
            JOptionPane.showMessageDialog(null, "Continuando en el menú de registro de usuarios", "Registro de usuarios", JOptionPane.INFORMATION_MESSAGE);
        } //Fin condicional
    }//GEN-LAST:event_Bt_VolverMouseClicked

    private void Bt_CulminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_CulminarUsuarioMouseClicked
        //Método ingresar un nuevo usuario
        Nombre = JT_IngresoNombre.getText();
        Password = JT_IngresoPassword.getText();
        Placa = JT_IngresoPlaca.getText();
        if (Nombre.equals("") || Password.equals("") || Placa.equals("")) { //Condicional que comprueba que se haya ingresado un nombre y contraseña de usuario
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos para\npoder ingresar un nuevo usuario", "Campos incompletos", JOptionPane.ERROR_MESSAGE);
        } else { //En caso de tener todos los datos ingresador, se ingresa el nuevo usuario a la BD, y se llama a la clase Login
            AgregarUsuarios(); //Llamado al método AgregarUsuarios
            this.setVisible(false); //Se oculta esta ventana
            Regresar.setVisible(true); //Se enseña la ventana Login
        } //Fin condicional que comprueba que se haya ingresado un nombre y contraseña de usuario
        //Fin método ingresar un nuevo usuario
    }//GEN-LAST:event_Bt_CulminarUsuarioMouseClicked

    private void JT_IngresoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_IngresoNombreKeyTyped
        //Inicio ingreso de letra en el campo Nombre de esta clase
        char LetraIngresa = evt.getKeyChar(); //Variable a la que se le asigna la letra ingresada
        if ((LetraIngresa < 'a' || LetraIngresa > 'z') && (LetraIngresa < 'A' || LetraIngresa > 'Z') && (LetraIngresa != KeyEvent.VK_SPACE)) { //Condicional que comprueba que sólo se ingresen letras
            evt.consume();
        } //Fin condicional que comprueba que sólo se ingresen letras
        //Fin ingreso de letra en el campo Nombre de esta clase
    }//GEN-LAST:event_JT_IngresoNombreKeyTyped

    public void AgregarUsuarios() { //Inicio método agregar usuario
        Nombre = String.valueOf(JT_IngresoNombre.getText()); //Se asigna a una variable el valor escrito en el recuadro nombre de esta clase
        Password = String.valueOf(JT_IngresoPassword.getText()); //Se asigna a una variable el valor escrito en el recuadro apellido de esta clase
        Placa = String.valueOf(JT_IngresoPlaca.getText()); //Se asigna a una variable el valor escrito en el recuadro placa del vehículo de esta clase
        String SQL = "INSERT INTO informacionusuario (nombre, password, placa) VALUES (?,?,?)"; //Comando que será enviado a MYSQL para agregar los datos del nuevo usuario a la base de datos
        try { //Sentencia que evita posibles errores durante la ejecución del programa
            PreparedStatement pst = cn2.prepareStatement(SQL);
            pst.setString(1, (JT_IngresoNombre.getText())); //Inserción de datos a la base de datos
            pst.setString(2, JT_IngresoPassword.getText()); //Inserción de datos a la base de datos
            pst.setString(3, JT_IngresoPlaca.getText()); //Inserción de datos a la base de datos
            pst.execute(); //Se culmina el proceso de inserción de datos a la base de datos
            System.out.println("Registro éxitoso");
            JOptionPane.showMessageDialog(null, "El registro se completó éxitosamente", "Registro completado", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) { //Captura de los parámetros de posibles errores producidos durante la ejecución
            System.out.println("Registro fallido");
            JOptionPane.showMessageDialog(null, "Se ha produccido un error inesperado\nCierre el programa y vuelva a intentar\nregistrar el usuario", "Registro fallido", JOptionPane.ERROR_MESSAGE);
        } //Fin de la sentencia...
    } //Fin método agregar usuario

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Cerrar;
    private javax.swing.JButton Bt_CulminarUsuario;
    private javax.swing.JButton Bt_Minimizar;
    public javax.swing.JButton Bt_Volver;
    private javax.swing.JLabel JL_IconoUsuario;
    private javax.swing.JLabel JL_Moto;
    private javax.swing.JLabel JL_Password;
    private javax.swing.JLabel JL_PasswordUsuario;
    private javax.swing.JLabel JL_PlacaVehiculo;
    private javax.swing.JPanel JP_Inferior;
    private javax.swing.JPanel JP_Superior;
    private javax.swing.JSeparator JS_Separador;
    private javax.swing.JSeparator JS_Separador1;
    private javax.swing.JSeparator JS_Separador2;
    private javax.swing.JSeparator JS_Separador3;
    public javax.swing.JTextField JT_IngresoNombre;
    public javax.swing.JTextField JT_IngresoPassword;
    public javax.swing.JTextField JT_IngresoPlaca;
    private javax.swing.JLabel LB_NombreUsuario;
    private javax.swing.JLabel LB_Titulo;
    // End of variables declaration//GEN-END:variables
} //Fin clase registro usuario
