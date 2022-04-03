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
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import panamahitek.Arduino.PanamaHitek_Arduino;
//Fin importación de clases necesarias

public class ParqueaderoU extends javax.swing.JFrame { //Inicio clase ParqueaderoU

    //Definición de variables e íconos globales
    Icon IconoSubirBarra = new ImageIcon("src/Imagenes/BarraUP.png");
    Icon IconoBajarBarra = new ImageIcon("src/Imagenes/BarraDown.png");
    static Login Transferencia = new Login();
    PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
    //Fin definición de variables e íconos globales

    public ParqueaderoU() { //Inicio constructor clase ParqueaderoU
        initComponents(); //Inicializador de componentes de la ventana
        try { //Inicio capturador de errores
            arduino.arduinoTX("COM44", 9600);
            System.out.println("Tarjeta Arduino conectado");
        } catch (Exception ex) { //Captura del mensaje de error
            Logger.getLogger(ParqueaderoU.class.getName()).log(Level.SEVERE, null, ex);
        } //Fin capturador de errores
        this.setLocationRelativeTo(null); //Centrar la ventana a la pantalla
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27); //Código para darle bordes redondos a la ventana
        AWTUtilities.setWindowShape(this, FormaVentana); //Código para darle bordes redondos a la ventana
        BT_SubirBarraIngreso.setEnabled(true);
        BT_BajarBarraIngreso.setEnabled(false);
    } //Fin constructor clase ParqueaderoU

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_General = new javax.swing.JPanel();
        JS_Titulo_Administracion = new javax.swing.JSeparator();
        JP_MenuLateral = new javax.swing.JPanel();
        jLContraseña = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        JL_LogoParqueadero = new javax.swing.JLabel();
        JL_MostrarNombre = new javax.swing.JLabel();
        JL_MostrarPassword = new javax.swing.JLabel();
        JP_AdministracionParqueadero = new javax.swing.JPanel();
        JS_B1_C1 = new javax.swing.JSeparator();
        JS_A1_B1 = new javax.swing.JSeparator();
        JP_A1 = new javax.swing.JPanel();
        JL_PuestoA1 = new javax.swing.JLabel();
        BT_ControlPuesto1 = new javax.swing.JToggleButton();
        JL_IconoP1 = new javax.swing.JLabel();
        JP_B1 = new javax.swing.JPanel();
        JL_PuestoB1 = new javax.swing.JLabel();
        BT_ControlPuesto2 = new javax.swing.JToggleButton();
        IconoP2 = new javax.swing.JLabel();
        JP_C1 = new javax.swing.JPanel();
        JL_PuestoC1 = new javax.swing.JLabel();
        BT_ControlPuesto3 = new javax.swing.JToggleButton();
        IconoP3 = new javax.swing.JLabel();
        JS_Menu_Administracion = new javax.swing.JSeparator();
        JP_EntradaParqueadero = new javax.swing.JPanel();
        JS_Entrada_Administracion = new javax.swing.JSeparator();
        JL_ControlAcceso = new javax.swing.JLabel();
        JS_Control_IconoBarra = new javax.swing.JSeparator();
        JL_ImagenBarraIngreso = new javax.swing.JLabel();
        BT_SubirBarraIngreso = new javax.swing.JButton();
        BT_BajarBarraIngreso = new javax.swing.JButton();
        JP_Superior = new javax.swing.JPanel();
        BtMenu = new javax.swing.JButton();
        BtRegresar = new javax.swing.JButton();
        BtMinimizar = new javax.swing.JButton();
        BtCerrar = new javax.swing.JButton();
        JL_NombreVentana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_General.setBackground(new java.awt.Color(33, 45, 62));
        JP_General.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JS_Titulo_Administracion.setBackground(new java.awt.Color(33, 45, 62));
        JS_Titulo_Administracion.setForeground(new java.awt.Color(73, 181, 172));
        JP_General.add(JS_Titulo_Administracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 870, 10));

        JP_MenuLateral.setBackground(new java.awt.Color(73, 181, 172));
        JP_MenuLateral.setForeground(new java.awt.Color(73, 181, 172));
        JP_MenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLContraseña.setBackground(new java.awt.Color(73, 181, 172));
        jLContraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLContraseña.setText("Contraseña:");
        JP_MenuLateral.add(jLContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 110, -1));

        jLUsuario.setBackground(new java.awt.Color(73, 181, 172));
        jLUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLUsuario.setText("Usuario:");
        JP_MenuLateral.add(jLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 110, -1));

        JL_LogoParqueadero.setBackground(new java.awt.Color(73, 181, 172));
        JL_LogoParqueadero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_LogoParqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoParqueoCalipsoCorto.png"))); // NOI18N
        JP_MenuLateral.add(JL_LogoParqueadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        JL_MostrarNombre.setBackground(new java.awt.Color(33, 45, 62));
        JL_MostrarNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_MostrarNombre.setForeground(new java.awt.Color(255, 255, 255));
        JL_MostrarNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_MostrarNombre.setAutoscrolls(true);
        JL_MostrarNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JP_MenuLateral.add(JL_MostrarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 110, 50));

        JL_MostrarPassword.setBackground(new java.awt.Color(33, 45, 62));
        JL_MostrarPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_MostrarPassword.setForeground(new java.awt.Color(255, 255, 255));
        JL_MostrarPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_MostrarPassword.setAutoscrolls(true);
        JL_MostrarPassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JP_MenuLateral.add(JL_MostrarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 110, 60));

        JP_General.add(JP_MenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(-115, 0, 110, 400));

        JP_AdministracionParqueadero.setBackground(new java.awt.Color(33, 45, 62));

        JS_B1_C1.setBackground(new java.awt.Color(33, 45, 62));
        JS_B1_C1.setForeground(new java.awt.Color(73, 181, 172));
        JS_B1_C1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JS_A1_B1.setBackground(new java.awt.Color(33, 45, 62));
        JS_A1_B1.setForeground(new java.awt.Color(73, 181, 172));
        JS_A1_B1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JP_A1.setBackground(new java.awt.Color(33, 45, 62));
        JP_A1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JL_PuestoA1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        JL_PuestoA1.setForeground(new java.awt.Color(255, 102, 0));
        JL_PuestoA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_PuestoA1.setText("Puesto A1");

        BT_ControlPuesto1.setBackground(new java.awt.Color(33, 45, 62));
        BT_ControlPuesto1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BT_ControlPuesto1.setForeground(new java.awt.Color(255, 255, 255));
        BT_ControlPuesto1.setText("Encender / Apagar luz");
        BT_ControlPuesto1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_ControlPuesto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_ControlPuesto1MouseClicked(evt);
            }
        });

        JL_IconoP1.setBackground(new java.awt.Color(33, 45, 62));
        JL_IconoP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_IconoP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vehiculo.png"))); // NOI18N

        javax.swing.GroupLayout JP_A1Layout = new javax.swing.GroupLayout(JP_A1);
        JP_A1.setLayout(JP_A1Layout);
        JP_A1Layout.setHorizontalGroup(
            JP_A1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_A1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_A1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL_IconoP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_ControlPuesto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JL_PuestoA1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        JP_A1Layout.setVerticalGroup(
            JP_A1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_A1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_PuestoA1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT_ControlPuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JL_IconoP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JP_B1.setBackground(new java.awt.Color(33, 45, 62));
        JP_B1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JL_PuestoB1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        JL_PuestoB1.setForeground(new java.awt.Color(255, 102, 0));
        JL_PuestoB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_PuestoB1.setText("Puesto B1");

        BT_ControlPuesto2.setBackground(new java.awt.Color(33, 45, 62));
        BT_ControlPuesto2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BT_ControlPuesto2.setForeground(new java.awt.Color(255, 255, 255));
        BT_ControlPuesto2.setText("Encender / Apagar luz");
        BT_ControlPuesto2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_ControlPuesto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_ControlPuesto2MouseClicked(evt);
            }
        });

        IconoP2.setBackground(new java.awt.Color(33, 45, 62));
        IconoP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vehiculo.png"))); // NOI18N

        javax.swing.GroupLayout JP_B1Layout = new javax.swing.GroupLayout(JP_B1);
        JP_B1.setLayout(JP_B1Layout);
        JP_B1Layout.setHorizontalGroup(
            JP_B1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_B1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_B1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_ControlPuesto2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JL_PuestoB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IconoP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JP_B1Layout.setVerticalGroup(
            JP_B1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_B1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_PuestoB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT_ControlPuesto2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IconoP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JP_C1.setBackground(new java.awt.Color(33, 45, 62));
        JP_C1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JL_PuestoC1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        JL_PuestoC1.setForeground(new java.awt.Color(255, 102, 0));
        JL_PuestoC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_PuestoC1.setText("Puesto C1");

        BT_ControlPuesto3.setBackground(new java.awt.Color(33, 45, 62));
        BT_ControlPuesto3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BT_ControlPuesto3.setForeground(new java.awt.Color(255, 255, 255));
        BT_ControlPuesto3.setText("Encender / Apagar luz");
        BT_ControlPuesto3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_ControlPuesto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_ControlPuesto3MouseClicked(evt);
            }
        });

        IconoP3.setBackground(new java.awt.Color(33, 45, 62));
        IconoP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vehiculo.png"))); // NOI18N

        javax.swing.GroupLayout JP_C1Layout = new javax.swing.GroupLayout(JP_C1);
        JP_C1.setLayout(JP_C1Layout);
        JP_C1Layout.setHorizontalGroup(
            JP_C1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_C1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_C1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_ControlPuesto3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JL_PuestoC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(IconoP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JP_C1Layout.setVerticalGroup(
            JP_C1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_C1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_PuestoC1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT_ControlPuesto3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconoP3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JS_Menu_Administracion.setBackground(new java.awt.Color(33, 45, 62));
        JS_Menu_Administracion.setForeground(new java.awt.Color(73, 181, 172));
        JS_Menu_Administracion.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout JP_AdministracionParqueaderoLayout = new javax.swing.GroupLayout(JP_AdministracionParqueadero);
        JP_AdministracionParqueadero.setLayout(JP_AdministracionParqueaderoLayout);
        JP_AdministracionParqueaderoLayout.setHorizontalGroup(
            JP_AdministracionParqueaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_AdministracionParqueaderoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(JS_Menu_Administracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(JS_A1_B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(JP_B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JS_B1_C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JP_AdministracionParqueaderoLayout.setVerticalGroup(
            JP_AdministracionParqueaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_AdministracionParqueaderoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_AdministracionParqueaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_AdministracionParqueaderoLayout.createSequentialGroup()
                        .addComponent(JS_Menu_Administracion, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(JS_A1_B1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JS_B1_C1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JP_B1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JP_A1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JP_C1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JP_General.add(JP_AdministracionParqueadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 660, 350));

        JP_EntradaParqueadero.setBackground(new java.awt.Color(33, 45, 62));

        JS_Entrada_Administracion.setBackground(new java.awt.Color(33, 45, 62));
        JS_Entrada_Administracion.setForeground(new java.awt.Color(73, 181, 172));
        JS_Entrada_Administracion.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JL_ControlAcceso.setBackground(new java.awt.Color(73, 181, 172));
        JL_ControlAcceso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JL_ControlAcceso.setForeground(new java.awt.Color(255, 255, 255));
        JL_ControlAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_ControlAcceso.setText("Control de acceso");

        JS_Control_IconoBarra.setBackground(new java.awt.Color(33, 45, 62));
        JS_Control_IconoBarra.setForeground(new java.awt.Color(73, 181, 172));

        JL_ImagenBarraIngreso.setBackground(new java.awt.Color(33, 45, 62));
        JL_ImagenBarraIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BarraDown.png"))); // NOI18N

        BT_SubirBarraIngreso.setBackground(new java.awt.Color(33, 45, 62));
        BT_SubirBarraIngreso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BT_SubirBarraIngreso.setForeground(new java.awt.Color(255, 255, 255));
        BT_SubirBarraIngreso.setText("Subir barra");
        BT_SubirBarraIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_SubirBarraIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_SubirBarraIngresoMouseClicked(evt);
            }
        });

        BT_BajarBarraIngreso.setBackground(new java.awt.Color(33, 45, 62));
        BT_BajarBarraIngreso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BT_BajarBarraIngreso.setForeground(new java.awt.Color(255, 255, 255));
        BT_BajarBarraIngreso.setText("Bajar barra");
        BT_BajarBarraIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_BajarBarraIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_BajarBarraIngresoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JP_EntradaParqueaderoLayout = new javax.swing.GroupLayout(JP_EntradaParqueadero);
        JP_EntradaParqueadero.setLayout(JP_EntradaParqueaderoLayout);
        JP_EntradaParqueaderoLayout.setHorizontalGroup(
            JP_EntradaParqueaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_EntradaParqueaderoLayout.createSequentialGroup()
                .addComponent(JS_Entrada_Administracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_EntradaParqueaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_ControlAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JS_Control_IconoBarra)
                    .addComponent(JL_ImagenBarraIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(BT_SubirBarraIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_BajarBarraIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JP_EntradaParqueaderoLayout.setVerticalGroup(
            JP_EntradaParqueaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_EntradaParqueaderoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_EntradaParqueaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_EntradaParqueaderoLayout.createSequentialGroup()
                        .addComponent(JL_ControlAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JS_Control_IconoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_ImagenBarraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BT_SubirBarraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BT_BajarBarraIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JP_EntradaParqueaderoLayout.createSequentialGroup()
                        .addComponent(JS_Entrada_Administracion, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        JP_General.add(JP_EntradaParqueadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 230, 350));

        JP_Superior.setBackground(new java.awt.Color(33, 45, 62));

        BtMenu.setBackground(new java.awt.Color(33, 45, 62));
        BtMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu.png"))); // NOI18N
        BtMenu.setBorder(null);
        BtMenu.setBorderPainted(false);
        BtMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtMenuMouseClicked(evt);
            }
        });

        BtRegresar.setBackground(new java.awt.Color(33, 45, 62));
        BtRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        BtRegresar.setBorder(null);
        BtRegresar.setBorderPainted(false);
        BtRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtRegresarMouseClicked(evt);
            }
        });

        BtMinimizar.setBackground(new java.awt.Color(33, 45, 62));
        BtMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        BtMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contraer.png"))); // NOI18N
        BtMinimizar.setBorder(null);
        BtMinimizar.setBorderPainted(false);
        BtMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtMinimizarMouseClicked(evt);
            }
        });

        BtCerrar.setBackground(new java.awt.Color(33, 45, 62));
        BtCerrar.setForeground(new java.awt.Color(255, 255, 255));
        BtCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        BtCerrar.setBorder(null);
        BtCerrar.setBorderPainted(false);
        BtCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtCerrarMouseClicked(evt);
            }
        });

        JL_NombreVentana.setBackground(new java.awt.Color(33, 45, 62));
        JL_NombreVentana.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JL_NombreVentana.setForeground(new java.awt.Color(255, 255, 255));
        JL_NombreVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_NombreVentana.setText("Administración ParqueoCalipso");

        javax.swing.GroupLayout JP_SuperiorLayout = new javax.swing.GroupLayout(JP_Superior);
        JP_Superior.setLayout(JP_SuperiorLayout);
        JP_SuperiorLayout.setHorizontalGroup(
            JP_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(JL_NombreVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(BtRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtCerrar)
                .addContainerGap())
        );
        JP_SuperiorLayout.setVerticalGroup(
            JP_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JP_SuperiorLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(JL_NombreVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JP_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(JP_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtRegresar)
                            .addComponent(BtMinimizar)
                            .addComponent(BtCerrar))
                        .addComponent(BtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JP_General.add(JP_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        getContentPane().add(JP_General, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtCerrarMouseClicked
        //Inicio click sobre botón Cerrar
        System.exit(0); //Código que cierra la ventana
        //Fin click sobre botón Cerrar
    }//GEN-LAST:event_BtCerrarMouseClicked

    private void BtMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtMinimizarMouseClicked
        //Inicio click sobre botón Minimizar
        this.setState(ParqueaderoU.ICONIFIED); //Código que minimiza la ventana ParqueaderoU
        //Fin click sobre botón minimizar
    }//GEN-LAST:event_BtMinimizarMouseClicked

    private void BtRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtRegresarMouseClicked
        //Inicio click sobre botón Regresar
        Login login = new Login(); //Objeto con la clase Login
        JOptionPane.showMessageDialog(null, "Sesión terminada éxitosamente", "Regresar", JOptionPane.INFORMATION_MESSAGE); //Mensaje de información
        this.setVisible(false); //Se cierra la ventana actual
        login.setVisible(true); //Se abre la ventana Login
        //Fin click sobre botón Regresar
    }//GEN-LAST:event_BtRegresarMouseClicked

    private void BtMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtMenuMouseClicked
        //Inicio click sobre botón Menú
        int posicion = BtMenu.getX(); //Se asigna a una variable la posición del botón Menú
        String ConseguirNombre, ConseguirContraseña;
        ConseguirNombre = Login.ComprobarNombre;
        ConseguirContraseña = Login.ComprobarPassword;
        JL_MostrarNombre.setText(ConseguirNombre);
        JL_MostrarPassword.setText(ConseguirContraseña);
        if (posicion > 10) { //Condicional que determina si el menú está desplegado o no
            //En caso de estar el menú abierto...
            Animacion.Animacion.mover_izquierda(120, 10, 10, 5, BtMenu); //Código que desliza el botón menú a la izquierda
            Animacion.Animacion.mover_izquierda(0, -115, 10, 5, JP_MenuLateral); //Código que oculta el menú desplegable, corriéndolo a la izquierda
        } else { //En caso de estar el menú cerrado
            Animacion.Animacion.mover_derecha(10, 120, 10, 5, BtMenu); //Código que desliza el botón menú a la derecha
            Animacion.Animacion.mover_derecha(-115, 0, 10, 5, JP_MenuLateral); //Código que enseña el menú desplegable, corriéndolo a la derecha
        } //Fin condicional
        //Fin click sobre botón Menú
    }//GEN-LAST:event_BtMenuMouseClicked

    private void BT_SubirBarraIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SubirBarraIngresoMouseClicked
        //Inicio click sobre botón Subir Barra de Ingreso
        JL_ImagenBarraIngreso.setIcon(IconoSubirBarra); //Se cambia el ícono de la barra de acceso
        BT_SubirBarraIngreso.setEnabled(false); //Se deshabilita el botón Subir Barra
        BT_BajarBarraIngreso.setEnabled(true); //Se habilita el botón Bajar Barra
        try { //Inicio capturador de errores
            arduino.sendData("1"); //Mensaje que sube la barra
        } catch (Exception ex) { //Captura del mensaje de error
            Logger.getLogger(ParqueaderoU.class.getName()).log(Level.SEVERE, null, ex);
        } //Fin capturador de errores
        //Fin click sobre botón Subir Barra de Ingreso
    }//GEN-LAST:event_BT_SubirBarraIngresoMouseClicked

    private void BT_BajarBarraIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_BajarBarraIngresoMouseClicked
        //Inicio click sobre botón Bajar Barra de ingreso
        JL_ImagenBarraIngreso.setIcon(IconoBajarBarra); //Se cambia el ícono de la barra de acceso
        BT_SubirBarraIngreso.setEnabled(true); //Se deshabilita el botón Subir Barra
        BT_BajarBarraIngreso.setEnabled(false); //Se habilita el botón Bajar Barra
        try { //Inicio capturador de errores
            arduino.sendData("2"); //Mensaje que baja la barra
        } catch (Exception ex) { //Captura del mensaje de error
            Logger.getLogger(ParqueaderoU.class.getName()).log(Level.SEVERE, null, ex);
        } //Fin capturador de errores
        //Fin click sobre botón Bajar Barra de ingreso
    }//GEN-LAST:event_BT_BajarBarraIngresoMouseClicked

    private void BT_ControlPuesto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ControlPuesto1MouseClicked
        //Click sobre botón Enceder / Apagar Luz en la posición 1
        try { //Inicio capturador de errores
            arduino.sendData("a");
        } catch (Exception ex) { //Captura del mensaje de error
            Logger.getLogger(ParqueaderoU.class.getName()).log(Level.SEVERE, null, ex);
        } //Fin capturador de errores
        if (BT_ControlPuesto1.isSelected() == false) { //Si el botón ya está en su segundo estado (Encendido)
            try { //Inicio capturador de errores
                arduino.sendData("b");
            } catch (Exception ex) { //Captura del mensaje de error
                Logger.getLogger(ParqueaderoU.class.getName()).log(Level.SEVERE, null, ex);
            } //Fin capturador de errores
        } //Fin condicional del botón en su segundo estado
        //Fin click sobre botón Enceder / Apagar Luz en la posición 1
    }//GEN-LAST:event_BT_ControlPuesto1MouseClicked

    private void BT_ControlPuesto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ControlPuesto2MouseClicked
        //Click sobre botón Enceder / Apagar Luz en la posición 2
        try { //Inicio capturador de errores
            arduino.sendData("c");
        } catch (Exception ex) { //Captura del mensaje de error
            Logger.getLogger(ParqueaderoU.class.getName()).log(Level.SEVERE, null, ex);
        } //Fin capturador de errores
        if (BT_ControlPuesto2.isSelected() == false) { //Si el botón ya se encuentra en su segundo estado (Encendido)
            try { //Inicio capturador de errores
                arduino.sendData("d");
                System.out.println("Falso12");
            } catch (Exception ex) { //Captura del mensaje de error
                Logger.getLogger(ParqueaderoU.class.getName()).log(Level.SEVERE, null, ex);
            } //Fin capturador de errores
        } //Fin condicional del botón en su segundo estado
        //Fin click sobre botón Enceder / Apagar Luz en la posición 2
    }//GEN-LAST:event_BT_ControlPuesto2MouseClicked

    private void BT_ControlPuesto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ControlPuesto3MouseClicked
        //Click sobre botón Enceder / Apagar Luz en la posición 3
        try { //Inicio capturador de errores
            arduino.sendData("e");
        } catch (Exception ex) { //Captura del mensaje de error
            Logger.getLogger(ParqueaderoU.class.getName()).log(Level.SEVERE, null, ex);
        } //Fin capturador de errores
        if (BT_ControlPuesto3.isSelected() == false) { //Si el botón está en su segundo estado (Encendido)
            try { //Inicio capturador de errores
                arduino.sendData("f");
            } catch (Exception ex) { //Captura del mensaje de error
                Logger.getLogger(ParqueaderoU.class.getName()).log(Level.SEVERE, null, ex);
            } //Fin capturador de errores
        } //Fin condicional si el botón se encuentra en su segundo estado
        //Fin click sobre botón Enceder / Apagar Luz en la posición 3
    }//GEN-LAST:event_BT_ControlPuesto3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_BajarBarraIngreso;
    private javax.swing.JToggleButton BT_ControlPuesto1;
    private javax.swing.JToggleButton BT_ControlPuesto2;
    private javax.swing.JToggleButton BT_ControlPuesto3;
    private javax.swing.JButton BT_SubirBarraIngreso;
    private javax.swing.JButton BtCerrar;
    private javax.swing.JButton BtMenu;
    private javax.swing.JButton BtMinimizar;
    private javax.swing.JButton BtRegresar;
    private javax.swing.JLabel IconoP2;
    private javax.swing.JLabel IconoP3;
    private javax.swing.JLabel JL_ControlAcceso;
    private javax.swing.JLabel JL_IconoP1;
    private javax.swing.JLabel JL_ImagenBarraIngreso;
    private javax.swing.JLabel JL_LogoParqueadero;
    private javax.swing.JLabel JL_MostrarNombre;
    private javax.swing.JLabel JL_MostrarPassword;
    private javax.swing.JLabel JL_NombreVentana;
    private javax.swing.JLabel JL_PuestoA1;
    private javax.swing.JLabel JL_PuestoB1;
    private javax.swing.JLabel JL_PuestoC1;
    private javax.swing.JPanel JP_A1;
    private javax.swing.JPanel JP_AdministracionParqueadero;
    private javax.swing.JPanel JP_B1;
    private javax.swing.JPanel JP_C1;
    private javax.swing.JPanel JP_EntradaParqueadero;
    private javax.swing.JPanel JP_General;
    private javax.swing.JPanel JP_MenuLateral;
    private javax.swing.JPanel JP_Superior;
    private javax.swing.JSeparator JS_A1_B1;
    private javax.swing.JSeparator JS_B1_C1;
    private javax.swing.JSeparator JS_Control_IconoBarra;
    private javax.swing.JSeparator JS_Entrada_Administracion;
    private javax.swing.JSeparator JS_Menu_Administracion;
    private javax.swing.JSeparator JS_Titulo_Administracion;
    private javax.swing.JLabel jLContraseña;
    private javax.swing.JLabel jLUsuario;
    // End of variables declaration//GEN-END:variables
} //Fin clase ParqueaderoU
