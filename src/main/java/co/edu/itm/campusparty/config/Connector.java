package co.edu.itm.campusparty.config;

import java.sql.*;

public class Connector {

    private ResultSet resultSet;
    private Statement statement;
    private Connection connection;

    public Connector() {
    }

    public ResultSet execute(String sentence){
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=CAMPUS_PARTY;user=usuarioSQL;password=abc";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sentence);

        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        return resultSet;
    }

    public void closeBD(){
        try{
            connection.close();
            System.out.println("Connection close...");
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }

    }

    public static void main(String args[]) throws SQLException {
        Connector c = new Connector();
        ResultSet resultSet = c.execute("SELECT Campusero.nombres, Campusero.apellidos, Campusero.documento, Campusero.edad, Ciudades.cantidadUniversidades, Ciudades.nombre, Ciudades.cantidadHabitantes FROM Campusero INNER JOIN Ciudades ON Campusero.id_ciudad_origen = Ciudades.id WHERE Campusero.id = 1");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
    }
}
