package co.edu.itm.campusparty.model;

public class EquipoGamer {
    private String nombre;
    private String fechaIngreso;
    private String fechaEgreso;
    private int titulos;
    private Ciudad ciudad;

    public EquipoGamer(String nombre, String fechaIngreso, String fechaEgreso, int titulos, Ciudad ciudad) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.titulos = titulos;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "<h2>Equipo gamer</h2>" +
                "<li><h3>Nombre:'" + nombre + '\'' + "</h3></li>" +
                "<li><h3>Titulos:'" + titulos + '\'' + "</h3></li>" +
                "<li><h3>Fecha ingreso:'" + fechaIngreso + '\'' + "</h3></li>" +
                "<li><h3>Fecha egreso:'" + fechaEgreso + '\'' + "</h3></li>" +
                "<li>" + ciudad.toString() + "</li>" +
                "</ul>";
    }
}
