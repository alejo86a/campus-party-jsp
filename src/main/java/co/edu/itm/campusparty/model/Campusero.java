package co.edu.itm.campusparty.model;

public class Campusero {
    private String nombres;
    private String apellidos;
    private int documento;
    private int edad;
    private Ciudad ciudad;

    public Campusero(String nombres, String apellidos, int documento, int edad, Ciudad ciudad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "<h2>Info Campusero</h2>" +
                "<ul>"+
                "<li><h3>Nombre:'" + nombres + '\'' + "</h3></li>" +
                "<li><h3>Apellido:'" + apellidos + '\'' + "</h3></li>" +
                "<li><h3>Documento:" + documento + "</h3></li>" +
                "<li><h3>Edad:" + edad + "</h3></li>" +
                "<li>" + ciudad.toString() + "</li>" +
                "</ul>";
    }
}
