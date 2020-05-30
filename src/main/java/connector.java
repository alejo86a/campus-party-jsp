import java.sql.Connection;
import java.sql.DriverManager;

public class connector {

    public static void coneccioner(){
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=CAMPUS_PARTY;user=sa;password=your_password";
        //String url ="jdbc:sqlserver://PC01\inst01;databaseName=DB01";
        //String url ="jdbc:sqlserver://DESKTOP-GS71AU6//SQLEXPRESS;databaseName=CAMPUS_PARTY;integratedSecurity=true";

        System.out.print("Connecting to SQL Server ... ");
        try {
                Connection connection = DriverManager.getConnection(connectionUrl);
                System.out.println("Done.");

        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }

    }

    public static void main(String args[]){
        coneccioner();
    }



}
