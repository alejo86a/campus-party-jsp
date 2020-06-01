package co.edu.itm.campusparty.persistence;

import co.edu.itm.campusparty.config.Connector;
import co.edu.itm.campusparty.model.Ciudad;
import co.edu.itm.campusparty.model.EquipoGamer;

import java.sql.ResultSet;

public class EquipoDao {
    Connector connector;

    public EquipoDao() {}

    public String consultarEquipoPorCampusero(String id){
        ResultSet resultSet = connector.execute("SELECT Equipo_gamer_campusero.fecha_ingreso, Equipo_gamer_campusero.fecha_egreso, Equipo_gamer_campusero.titulos, Equipos_gamer.nombre AS nombreEquipoGamer, Ciudades.nombre AS nombreCiudad FROM Equipo_gamer_campusero INNER JOIN Equipos_gamer ON Equipo_gamer_campusero.id_equipo_gamer = Equipos_gamer.id INNER JOIN Ciudades ON Equipos_gamer.id_ciudad = Ciudades.id WHERE (Equipo_gamer_campusero.id = "+id + ")");
        String data = "";
        try {
            while (resultSet.next()){
                data = (new EquipoGamer(
                        resultSet.getString(4),
                        resultSet.getString(1),
                        resultSet.getString(2),
                        Integer.parseInt(resultSet.getString(3)),

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

    public String consultarEquiposPorCampusero (String id){
        ResultSet resultSet = connector.execute("SELECT Equipo_gamer_campusero.fecha_ingreso, Equipo_gamer_campusero.fecha_egreso, Equipo_gamer_campusero.titulos, Equipos_gamer.nombre AS nombreEquipoGamer, Ciudades.nombre AS nombreCiudad FROM Equipo_gamer_campusero INNER JOIN Equipos_gamer ON Equipo_gamer_campusero.id_equipo_gamer = Equipos_gamer.id INNER JOIN Ciudades ON Equipos_gamer.id_ciudad = Ciudades.id WHERE (Equipo_gamer_campusero.id = "+id + ")");
        String data = "";
        try {
            while (resultSet.next()){
                data = (new EquipoGamer(
                        resultSet.getString(4),
                        resultSet.getString(1),
                        resultSet.getString(2),
                        Integer.parseInt(resultSet.getString(3)),

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
