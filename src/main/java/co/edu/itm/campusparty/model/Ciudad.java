package co.edu.itm.campusparty.model;

public class Ciudad {
    private int cantidadUniversidades;
    private String nombre;
    private int cantidadHabitantes;

    public Ciudad(int cantidadUniversidades, String nombre, int cantidadHabitantes) {
        this.cantidadUniversidades = cantidadUniversidades;
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public int getCantidadUniversidades() {
        return cantidadUniversidades;
    }

    public void setCantidadUniversidades(int cantidadUniversidades) {
        this.cantidadUniversidades = cantidadUniversidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public void setCantidadHabitantes(int cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }

    @Override
    public String toString() {
        return "<h2>Datos de la ciudad</h2>" +
                "<ul>"+
                "<li><h3>Cantidad de universidades:" + cantidadUniversidades + "</h3></li>" +
                "<li><h3>Nombre:'" + nombre + '\'' + "</h3></li>" +
                "<li><h3>Cantidad de Habitantes=" + cantidadHabitantes + "</h3></li>" +
                "</ul>";
    }
}
