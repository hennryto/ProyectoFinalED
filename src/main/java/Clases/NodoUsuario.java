/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HENRYTO
 */
public class NodoUsuario  {
    private Usuario usuario;
    private NodoUsuario siguiente;

    public NodoUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }
    
}
