import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connector {

    static ResultSet result;
    static Statement statement;

    public static void coneccioner(){
        String connectionUrl = "jdbc:sqlserver://localhost:1433;database=CAMPUS_PARTY;user=usuarioSQL;password=abc";
        //String connectionUrl ="jdbc:sqlserver://PC01\inst01;databaseName=DB01";
        //String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=CAMPUS_PARTY;integratedSecurity=true";

        System.out.print("Connecting to SQL Server ... ");
        try {

                Connection connection = DriverManager.getConnection(connectionUrl);
                statement = connection.createStatement();
                result = statement.executeQuery("select * from Campusero");
                System.out.println("Done.");
            while (result.next()) {
                System.out.println(result.getString(2));
            }

        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }

    }

    public static void main(String args[]){
        coneccioner();
    }



}
