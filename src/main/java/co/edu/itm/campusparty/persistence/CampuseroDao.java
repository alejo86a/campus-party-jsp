package co.edu.itm.campusparty.persistence;

import co.edu.itm.campusparty.config.Connector;
import co.edu.itm.campusparty.model.Campusero;
import co.edu.itm.campusparty.model.Ciudad;

import java.sql.ResultSet;

public class CampuseroDao {
    Connector connector;
    public CampuseroDao() {
        this.connector = new Connector();
    }

    public String consultarCampusero(String id){
        ResultSet resultSet = connector.execute("SELECT Campusero.nombres, Campusero.apellidos, Campusero.documento, Campusero.edad, Ciudades.cantidadUniversidades, Ciudades.nombre, Ciudades.cantidadHabitantes FROM Campusero INNER JOIN Ciudades ON Campusero.id_ciudad_origen = Ciudades.id WHERE Campusero.id = "+id);
        String data = "";
        try {
            while (resultSet.next()){
                data = (new Campusero(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        Integer.parseInt(resultSet.getString(3)),
                        Integer.parseInt(resultSet.getString(4)),
                        (new Ciudad(
                                Integer.parseInt(resultSet.getString(6)),
                                resultSet.getString(5),
                                Integer.parseInt(resultSet.getString(7))
                        ))
                        )).toString();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return data;
    }


}
