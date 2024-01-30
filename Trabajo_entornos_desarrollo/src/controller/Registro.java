package controller;

import model.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Registro {
    private ArrayList<Usuario> listaPersonas;


    public Registro() {
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
            System.out.println("Añadido correctamente");
        } else {
            System.out.println("No se puede " +
                    "agregar porque esta en la lista");
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

}
