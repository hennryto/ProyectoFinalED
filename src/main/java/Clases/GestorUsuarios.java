/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author HENRYTO
 */
public class GestorUsuarios  {
    private NodoUsuario primerNodo;

    public GestorUsuarios() {
        this.primerNodo = null;
    }
    public void agregarUsuario(Usuarios usuario) {
        NodoUsuario nuevoNodo = new NodoUsuario(usuario);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            NodoUsuario actual = primerNodo;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente.");
    }
    
    public Usuarios buscarUsuario(String nombreUsuario) {
        NodoUsuario actual = primerNodo;
        while (actual != null) {
            if (actual.getUsuario().getUsuario().equalsIgnoreCase(nombreUsuario)) {
                return actual.getUsuario();
            }
            actual = actual.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        return null; // Usuario no encontrado
    }
    
     // Método para actualizar los datos de un usuario
    public void actualizarUsuario(String nombreUsuario, Usuarios nuevoUsuario) {
        NodoUsuario actual = primerNodo;
        while (actual != null) {
            if (actual.getUsuario().getUsuario().equalsIgnoreCase(nombreUsuario)) {
                actual.setUsuario(nuevoUsuario);
                JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente.");
                return; // Usuario actualizado
            }
            actual = actual.getSiguiente();
        }
        // Si llega aquí, el usuario no se encontró
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        // Si llega aquí, el usuario no se encontró
    }
    
    // Método para eliminar un usuario
    public void eliminarUsuario(String nombreUsuario) {
        if (primerNodo == null) {
            JOptionPane.showMessageDialog(null, "La lista de usuarios está vacía.");
            return; // La lista está vacía
        }
        if (primerNodo.getUsuario().getUsuario().equalsIgnoreCase(nombreUsuario)) {
            primerNodo = primerNodo.getSiguiente();
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
            return; // Usuario eliminado
        }
        NodoUsuario anterior = primerNodo;
        NodoUsuario actual = primerNodo.getSiguiente();
        while (actual != null) {
            if (actual.getUsuario().getUsuario().equalsIgnoreCase(nombreUsuario)) {
                anterior.setSiguiente(actual.getSiguiente());
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
                return; // Usuario eliminado
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
        // Si llega aquí, el usuario no se encontró
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
    }
    
    // Método para mostrar todos los usuarios en la lista
    public void mostrarUsuarios() {
        NodoUsuario actual = primerNodo;
        while (actual != null) {
            actual = actual.getSiguiente();
        }
    }
    
    
}
