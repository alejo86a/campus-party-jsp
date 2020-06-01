package co.edu.itm.campusparty.model;

public class Hotel {
    private String nombre;
    private int porcentajeDescuento;
    private String direccion;

    public Hotel(String nombre, int porcentajeDescuento, String direccion) {
        this.nombre = nombre;
        this.porcentajeDescuento = porcentajeDescuento;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "<h2>Hotel</h2>" +
                "<li><h3>Nombre:'" + nombre + '\'' + "</h3></li>" +
                "<li><h3>P orcentaje de descuento:" + porcentajeDescuento + "</h3></li>" +
                "<li><h3>Direccion:'" + direccion + '\'' + "</h3></li>" +
                "</ul>";
    }
}
