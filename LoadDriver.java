import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!
// add as jar to the project

public class LoadDriver {
    public static void main(String[] args) {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            
            // Dal sito di MySQL
            //N.B. L’uso del newInstance() ha lo scopo di //verificare la correttezza del driver (ossia la //capacita di istanziare oggetti
            // l’oggetto creato è rimosso alla termine del metodo
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }
        
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=monty&password=greatsqldb");
            
            // Do something with the Connection
            try{
                Statement s = conn.createStatement();
                ResultSet res = s.executeQuery("SELECT TIMESTAMP() as TIME");
                while(res.next()){
                    System.out.println(res.getString("TIME"));
                }
                conn.close();
            }catch(SQLException e){
                System.err.println("Bad Query ");
            }           
            
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        



    }
}