public package conectar;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class Conectar {
    public static final String URL = "jdbc:mysql://localhost:3306/prueba";
    public static final String USER = "root";
    public static final String CLAVE = "1234";
     
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
} {
    
}
