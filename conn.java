
package tourandtravel;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    conn(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           c=DriverManager.getConnection("jdbc:mysql:///connect","root","annu");
           s=c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
