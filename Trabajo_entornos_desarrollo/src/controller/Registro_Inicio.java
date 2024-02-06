package controller;

import model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro_Inicio {
    private ArrayList<Usuario> listaPersonas;
    private boolean loggin= false;


    public Registro_Inicio() {
        listaPersonas = new ArrayList<>();
    }

    public void listarUsuarios() {
        if (listaPersonas.isEmpty()) {
            System.out.println("La lista no tiene datos");
        } else {
            for (Usuario persona : listaPersonas) {
                persona.mostrarDatos();
            }
        }
    }

    private Usuario estaUsuario(String dni) {

        for (Usuario persona : listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(dni)) {
                // retorno si la persona esta
                return persona;
            }
        }

        // retorno si la persona no esta
        return null;
    }

    public void agregarUsuario(Usuario persona) {
        if (estaUsuario(persona.getDni()) == null) {
            listaPersonas.add(persona);
        } else {
            System.out.println("No se puede " +
                    "agregar porque esta en la lista");
        }
    }
    public void iniciarSesion(String nombreUsuario,String contrasena){
        if (listaPersonas.isEmpty()){
            System.out.println("Inicio de sesion incorrecto");

        }else {
            for (Usuario usuario:listaPersonas) {
                if (usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario) && usuario.getContrasena().equalsIgnoreCase(contrasena)){
                    System.out.println("Inicio de sesion correcto");
                    loggin=true;

                }else {
                    System.out.println("Nombre de usuario o contraseña incorrectos");
                }
            }
        }
    }
    public void buscarUsuario(String dni){
        if (estaUsuario(dni)!=null){
            estaUsuario(dni).mostrarDatos();
        } else {
            System.out.println("la persona no se encuentra");
        }
    }

    public void borrarUsuario(String dni){
        if (estaUsuario(dni)!=null){
            listaPersonas.remove(estaUsuario(dni));
        } else {
            System.out.println("no se puede borrar porque no existe");
        }
    }

    public void editarUsuario(String dni){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime teledono nuevo");
        int telefono = scanner.nextInt();
        System.out.println("Dime nombre nuevo");
        String  nombre = scanner.next();
        if (estaUsuario(dni)!=null){
            estaUsuario(dni).setNombreUsuario(nombre);
            estaUsuario(dni).setTelefono(telefono);

        }
    }

    public ArrayList<Usuario> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Usuario> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public boolean isLoggin() {
        return loggin;
    }

    public void setLoggin(boolean loggin) {
        this.loggin = loggin;
    }
}






