/* Parqueadero - 11 B - 2018 / 2019
    Hecho por:
    -Carlos Ausguto Hernández Zamora
    -Janiert Sebastián Salas Castillo
    -Natalia Vasquez Mora
    -Diego Fernando Victoria López
 */
package Ventanas;

//Importación de clases necesarias
import javax.swing.ImageIcon;
import javax.swing.Icon;
import com.sun.awt.AWTUtilities;
import java.awt.HeadlessException;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import javax.swing.JOptionPane;
//Fin importación de clases

public class Login extends javax.swing.JFrame { //Inicio clase Login

    //Inicio definición de variables, íconos y objetos globales
    public boolean Visibilidad = true;
    public boolean PrimerPasada = false;
    public boolean PrimerPasada2 = false;
    Icon IconoOjoAbierto = new ImageIcon(getClass().getResource("/Imagenes/OjoAbierto.png"));
    Icon IconoOjoCerrado = new ImageIcon(getClass().getResource("/Imagenes/OjoCerrado.png"));
    Conector ObjetoClaseConector = new Conector();
    Connection cn = ObjetoClaseConector.Conexion();
    static ParqueaderoU AdministracionParqueo = new ParqueaderoU();
    Administrador IrAdministrador = new Administrador();
    public static String ComprobarNombre, ComprobarPassword;
    //Fin definición de variables, íconos y objetos globales

    public Login() { //Inicio constructor clase Login
        initComponents();
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27); //Código que dá a la ventana bordes redondos
        AWTUtilities.setWindowShape(this, FormaVentana); //Código que dá a la ventana bordes redondos
        this.setLocationRelativeTo(null); //Se centra a la pantalla la ventana
        this.setResizable(false); //Se desactiva la posibilidad de cambiar el tamaño de la ventana
        JT_NombreUsuario.setText("Nombre usuario...");
        JP_PasswordUsuario.setText("Contraseña...");
        JP_PasswordUsuario.setVisible(true);
        JT_PasswordVisible.setVisible(false);

    } //Fin constructor clase Login

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Izquierdo = new javax.swing.JPanel();
        JL_Computador = new javax.swing.JLabel();
        JL_ParqueoCalipso = new javax.swing.JLabel();
        JP_Derecho = new javax.swing.JPanel();
        Bt_Registrarse = new javax.swing.JButton();
        Bt_Cerrar = new javax.swing.JToggleButton();
        Bt_Minizimizar = new javax.swing.JToggleButton();
        JL_IniciarSesion = new javax.swing.JLabel();
        JL_Usuario = new javax.swing.JLabel();
        JT_NombreUsuario = new javax.swing.JTextField();
        JL_PasswordUsuario = new javax.swing.JLabel();
        JP_PasswordUsuario = new javax.swing.JPasswordField();
        JS_Superior = new javax.swing.JSeparator();
        JS_Intermedio = new javax.swing.JSeparator();
        JB_CambiarVisibilidad = new javax.swing.JButton();
        JT_PasswordVisible = new javax.swing.JTextField();
        JL_ImagenUsuario = new javax.swing.JLabel();
        JL_ImagenCerradura = new javax.swing.JLabel();
        Bt_Ingresar = new javax.swing.JButton();
        Bt_Administrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName("Login"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_Izquierdo.setBackground(new java.awt.Color(73, 181, 172));
        JP_Izquierdo.setForeground(new java.awt.Color(73, 181, 172));
        JP_Izquierdo.setPreferredSize(new java.awt.Dimension(400, 400));
        JP_Izquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_Computador.setBackground(new java.awt.Color(73, 181, 172));
        JL_Computador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Computador.png"))); // NOI18N
        JP_Izquierdo.add(JL_Computador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        JL_ParqueoCalipso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_ParqueoCalipso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoParqueoCalipso.png"))); // NOI18N
        JP_Izquierdo.add(JL_ParqueoCalipso, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 326, 376));

        getContentPane().add(JP_Izquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        JP_Derecho.setBackground(new java.awt.Color(33, 45, 62));
        JP_Derecho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bt_Registrarse.setBackground(new java.awt.Color(33, 45, 62));
        Bt_Registrarse.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Bt_Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Registrarse.setText("Registrarse");
        Bt_Registrarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt_Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_RegistrarseMouseClicked(evt);
            }
        });
        JP_Derecho.add(Bt_Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 346, 170, 40));

        Bt_Cerrar.setBackground(new java.awt.Color(33, 45, 62));
        Bt_Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        Bt_Cerrar.setBorder(null);
        Bt_Cerrar.setBorderPainted(false);
        Bt_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bt_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CerrarActionPerformed(evt);
            }
        });
        JP_Derecho.add(Bt_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 23));

        Bt_Minizimizar.setBackground(new java.awt.Color(33, 45, 62));
        Bt_Minizimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contraer.png"))); // NOI18N
        Bt_Minizimizar.setBorder(null);
        Bt_Minizimizar.setBorderPainted(false);
        Bt_Minizimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Minizimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bt_Minizimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_MinizimizarActionPerformed(evt);
            }
        });
        JP_Derecho.add(Bt_Minizimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 23));

        JL_IniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        JL_IniciarSesion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        JL_IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        JL_IniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_IniciarSesion.setText("Iniciar Sesión");
        JP_Derecho.add(JL_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 41, 356, -1));

        JL_Usuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JL_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        JL_Usuario.setText("USUARIO");
        JP_Derecho.add(JL_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 91, 356, 32));

        JT_NombreUsuario.setBackground(new java.awt.Color(33, 45, 62));
        JT_NombreUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JT_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JT_NombreUsuario.setText("Nombre del usuario...");
        JT_NombreUsuario.setBorder(null);
        JT_NombreUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        JT_NombreUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        JT_NombreUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JT_NombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_NombreUsuarioMouseClicked(evt);
            }
        });
        JT_NombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_NombreUsuarioKeyTyped(evt);
            }
        });
        JP_Derecho.add(JT_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 135, 300, 32));

        JL_PasswordUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JL_PasswordUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JL_PasswordUsuario.setText("CONTRASEÑA");
        JP_Derecho.add(JL_PasswordUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 193, 356, 32));

        JP_PasswordUsuario.setBackground(new java.awt.Color(33, 45, 62));
        JP_PasswordUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JP_PasswordUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JP_PasswordUsuario.setText("Contraseña");
        JP_PasswordUsuario.setBorder(null);
        JP_PasswordUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        JP_PasswordUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JP_PasswordUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JP_PasswordUsuarioMouseClicked(evt);
            }
        });
        JP_Derecho.add(JP_PasswordUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 235, 260, 35));
        JP_Derecho.add(JS_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 185, 356, -1));
        JP_Derecho.add(JS_Intermedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 288, 356, -1));

        JB_CambiarVisibilidad.setBackground(new java.awt.Color(33, 45, 62));
        JB_CambiarVisibilidad.setForeground(new java.awt.Color(255, 255, 255));
        JB_CambiarVisibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OjoAbierto.png"))); // NOI18N
        JB_CambiarVisibilidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_CambiarVisibilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_CambiarVisibilidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_CambiarVisibilidadMouseClicked(evt);
            }
        });
        JP_Derecho.add(JB_CambiarVisibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 235, 36, 40));

        JT_PasswordVisible.setBackground(new java.awt.Color(33, 45, 62));
        JT_PasswordVisible.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JT_PasswordVisible.setForeground(new java.awt.Color(255, 255, 255));
        JT_PasswordVisible.setBorder(null);
        JT_PasswordVisible.setCaretColor(new java.awt.Color(255, 255, 255));
        JT_PasswordVisible.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JP_Derecho.add(JT_PasswordVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 239, 250, 30));

        JL_ImagenUsuario.setBackground(new java.awt.Color(33, 45, 62));
        JL_ImagenUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_ImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        JP_Derecho.add(JL_ImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 135, 52, 32));

        JL_ImagenCerradura.setBackground(new java.awt.Color(33, 45, 62));
        JL_ImagenCerradura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_ImagenCerradura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerradura.png"))); // NOI18N
        JP_Derecho.add(JL_ImagenCerradura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 239, 52, -1));

        Bt_Ingresar.setBackground(new java.awt.Color(33, 45, 62));
        Bt_Ingresar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Bt_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Ingresar.setText("Ingresar");
        Bt_Ingresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_IngresarMouseClicked(evt);
            }
        });
        JP_Derecho.add(Bt_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 302, 356, 38));

        Bt_Administrador.setBackground(new java.awt.Color(33, 45, 62));
        Bt_Administrador.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Bt_Administrador.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Administrador.setText("Administrador");
        Bt_Administrador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt_Administrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_AdministradorMouseClicked(evt);
            }
        });
        JP_Derecho.add(Bt_Administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 346, 168, 40));

        getContentPane().add(JP_Derecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 450, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CerrarActionPerformed
        //Inicio método para cerrar la ventana
        System.exit(0);
        Bt_Cerrar.setSelected(false);
        //Fin método para cerrar la ventana
    }//GEN-LAST:event_Bt_CerrarActionPerformed

    private void Bt_MinizimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_MinizimizarActionPerformed
        //Inicio método para minimizar la ventana
        this.setState(Login.ICONIFIED);
        Bt_Minizimizar.setSelected(false);
        //Fin método para minimizar la ventana
    }//GEN-LAST:event_Bt_MinizimizarActionPerformed

    private void JB_CambiarVisibilidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_CambiarVisibilidadMouseClicked
        //Inicio método para habilitar la vista de la contraseña ingresada
        if (Visibilidad) { //Si se quiere ver la contraseña ingresada
            JT_PasswordVisible.setVisible(true);
            JP_PasswordUsuario.setVisible(false);
            JT_PasswordVisible.setText(JP_PasswordUsuario.getText());
            JB_CambiarVisibilidad.setIcon(IconoOjoCerrado);
            Visibilidad = false;
        } else { //Si no se quiere ver la ocntraseña ingresada
            JT_PasswordVisible.setVisible(false);
            JP_PasswordUsuario.setVisible(true);
            JP_PasswordUsuario.setText(JT_PasswordVisible.getText());
            JB_CambiarVisibilidad.setIcon(IconoOjoAbierto);
            Visibilidad = true;
        }
        //Fin método para habilitar la vista de la contraseña ingresada
    }//GEN-LAST:event_JB_CambiarVisibilidadMouseClicked

    private void JT_NombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_NombreUsuarioMouseClicked
        //Inicio click sobre campo para ingresar el nombre del usuario a ingresar
        while (PrimerPasada == false) {
            JT_NombreUsuario.setText(null);
            PrimerPasada = true;
        }
        //Fin click sobre campo para ingresar el nombre del usuario a ingresar
    }//GEN-LAST:event_JT_NombreUsuarioMouseClicked

    private void JP_PasswordUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_PasswordUsuarioMouseClicked
        //Inicio click sobre campo para contraseña del usuario a ingresar
        while (PrimerPasada2 == false) {
            JP_PasswordUsuario.setText(null);
            PrimerPasada2 = true;
        }
        //Fin click sobre campo para contraseña del usuario a ingresar
    }//GEN-LAST:event_JP_PasswordUsuarioMouseClicked

    private void Bt_RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_RegistrarseMouseClicked
        //Inicio click sobre botón registrarse
        RegistroUsuario IngresoAlRegistro = new RegistroUsuario(); //Objeto con la clase RegistroUsuario
        IngresoAlRegistro.setVisible(true); //Se muestra la ventana RegistroUsuario
        this.setVisible(false); //Se oculta la ventana actual, Login
        //Fin click sobre botón registrarse
    }//GEN-LAST:event_Bt_RegistrarseMouseClicked

    private void Bt_IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_IngresarMouseClicked
        //Inicio click sobre el botón de ingresar
        if ((("Nombre del usuario...".equals(JT_NombreUsuario.getText())) || ("".equals(JT_NombreUsuario.getText()))) || (("Contraseña...".equals(JP_PasswordUsuario.getText())) || ("".equals(JP_PasswordUsuario.getText())))) {
            //En caso de no haber modificado ninguno de los valores que ya componen la ventana
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos para poder\nverificar los mismos", "Campos incompletos", JOptionPane.ERROR_MESSAGE);
            //Fin en caso de no haber modificado ninguno de los valores que ya componen la ventana
        } else { //En caso de haber modificado alguno de los valores que componen la ventana
            int resultado;
            System.out.println("Comprobando datos");
            try { //Inicio capturador de errores
                ComprobarNombre = JT_NombreUsuario.getText();
                ComprobarPassword = String.valueOf(JP_PasswordUsuario.getPassword());
                String SQL = "Select * from informacionusuario where nombre = '" + ComprobarNombre + "' and password = '" + ComprobarPassword + "'";
                Statement ST = cn.createStatement();
                ResultSet RS = ST.executeQuery(SQL); //Inicio de la consulta a la base de datos
                if (RS.next()) { //Comprobación de los datos ingresados por el usuario
                    resultado = 1;
                    if (resultado == 1) { //En caso de ser éxitoso el ingreso del usuario
                        System.out.println("Ingreso confirmado y éxitoso");
                        JOptionPane.showMessageDialog(null, "Bienvenido\nIngresando al sistema", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                        AdministracionParqueo.setVisible(true); //Se abre la ventana ParqueaderoU
                        this.setVisible(false); //Se cierra la ventana actual
                    } //Fin en caso de ser éxitoso el ingreso del usuario
                    //Fin comprobación de los datos del usuario
                } else { //En caso de haberse equivocado en el Login
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos\nComprueba que el usuario esté registrado", "Ha ocurrido un error", JOptionPane.ERROR_MESSAGE);
                } //Fin en caso de haberse equivocado en el Login
            } catch (HeadlessException | SQLException e) { //Captura del mensaje de error
                JOptionPane.showMessageDialog(null, "Se ha produccido un error inesperado\nCierre el programa y vuelva a intentar ingresar", "Ingreso fallido", JOptionPane.ERROR_MESSAGE);
            } //Fin capturador de errores
        }
        //Fin click sobre botón ingresar
    }//GEN-LAST:event_Bt_IngresarMouseClicked

    private void Bt_AdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_AdministradorMouseClicked
        //Inicio click sobre botón Administrador
        this.setVisible(false); //Se oculta la ventana actual
        IrAdministrador.setVisible(true); //Se enseña la ventana administrador
        //Fin click sobre botón Administrador
    }//GEN-LAST:event_Bt_AdministradorMouseClicked

    private void JT_NombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_NombreUsuarioKeyTyped
        //Inicio ingreso de letra en el campo Nombre de esta clase
        char LetraIngresa = evt.getKeyChar(); //Variable a la que se le asigna la letra ingresada
        if ((LetraIngresa < 'a' || LetraIngresa > 'z') && (LetraIngresa < 'A' || LetraIngresa > 'Z') && (LetraIngresa != KeyEvent.VK_SPACE)) { //Condicional que comprueba que sólo se ingresen letras
            evt.consume();
        } //Fin condicional que comprueba que sólo se ingresen letras
        //Fin ingreso de letra en el campo Nombre de esta clase
    }//GEN-LAST:event_JT_NombreUsuarioKeyTyped

    public static void main(String args[]) { //Inicio lanzador Login
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    } //Fin lanzador Login

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Administrador;
    private javax.swing.JToggleButton Bt_Cerrar;
    private javax.swing.JButton Bt_Ingresar;
    private javax.swing.JToggleButton Bt_Minizimizar;
    private javax.swing.JButton Bt_Registrarse;
    private javax.swing.JButton JB_CambiarVisibilidad;
    private javax.swing.JLabel JL_Computador;
    private javax.swing.JLabel JL_ImagenCerradura;
    private javax.swing.JLabel JL_ImagenUsuario;
    private javax.swing.JLabel JL_IniciarSesion;
    private javax.swing.JLabel JL_ParqueoCalipso;
    private javax.swing.JLabel JL_PasswordUsuario;
    private javax.swing.JLabel JL_Usuario;
    private javax.swing.JPanel JP_Derecho;
    private javax.swing.JPanel JP_Izquierdo;
    public javax.swing.JPasswordField JP_PasswordUsuario;
    private javax.swing.JSeparator JS_Intermedio;
    private javax.swing.JSeparator JS_Superior;
    public javax.swing.JTextField JT_NombreUsuario;
    public javax.swing.JTextField JT_PasswordVisible;
    // End of variables declaration//GEN-END:variables
} //Fin clase Login
