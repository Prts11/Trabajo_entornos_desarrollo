package model;

public class Usuario {

    private String dni;
    private int edad;
    private int telefono;
    private String nombreUsuario;
    private String contrasena;
    private String correo;

    public Usuario(String dni, int edad,String correo, int telefono, String nombreUsuario, String contrasena) {
        this.dni = dni;
        this.edad = edad;
        this.telefono = telefono;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombreUsuario);
        System.out.println("DNI: "+dni);
        System.out.println("Telefono: "+telefono);
        System.out.println("Correo: "+telefono);
        System.out.println("Edad: "+telefono);

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

