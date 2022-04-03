/* Parqueadero - 11 B - 2018 / 2019
 Hecho por:
 -Carlos Ausguto Hernández Zamora
 -Janiert Sebastián Salas Castillo
 -Natalia Vasquez Mora
 -Diego Fernando Victoria López
 */
package Ventanas;

//Importación de clases
import java.sql.*;
//Fin importación de clases

public class Conector { //Inicio clase Conector

    Connection Conectar = null;

    public Connection Conexion() { //Inicio método para conectar el programa a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/parqueocalipso", "root", "");
            System.out.println("Conexión establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error " + e);
        }
        return Conectar;
    } //Fin método para conectar el programa a la base de datos
} //Fin clase Conector
