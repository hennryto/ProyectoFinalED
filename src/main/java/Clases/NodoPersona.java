/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HENRYTO
 */
public class NodoPersona {
    private Persona persona;
    private NodoPersona siguiente;
    private NodoPersona anterior;
    public NodoPersona(Persona persona) {
        this.persona = persona;
        this.siguiente = null;
        this.anterior = null;
    }
     public Persona getPersona() {
        return persona;
    }
     public void setPersona(Persona persona) {
        this.persona = persona;
    }
     public NodoPersona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPersona siguiente) {
        this.siguiente = siguiente;
    }

    public NodoPersona getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPersona anterior) {
        this.anterior = anterior;
    }
}
