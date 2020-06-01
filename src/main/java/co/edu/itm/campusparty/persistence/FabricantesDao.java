package co.edu.itm.campusparty.persistence;

import co.edu.itm.campusparty.config.Connector;
import co.edu.itm.campusparty.model.Fabricante;

import java.sql.ResultSet;

public class FabricantesDao {
    Connector connector;

    public String consultarFabricantes(String id){
        ResultSet resultSet = connector.execute("SELECT        dbo.Fabricantes.nombre FROM dbo.Equipos INNER JOIN dbo.Fabricantes ON dbo.Equipos.id = dbo.Fabricantes.id INNER JOIN dbo.Fichas_campusero ON dbo.Equipos.id = dbo.Fichas_campusero.id_equipo INNER JOIN dbo.Software ON dbo.Equipos.id = dbo.Software.id_equipo AND dbo.Fabricantes.id = dbo.Software.id_fabricante ");
        String data = "";
        try {
            while (resultSet.next()){
                data = (new Fabricante(
                        resultSet.getString(1)
                )).toString();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return data;
    }
}
