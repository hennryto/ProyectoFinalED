/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;



public class Inventario {
    private NodoProducto primerNodo;
    
    public Inventario() {
        this.primerNodo = null;
    }
    public void agregarProducto(Producto producto) {
        NodoProducto nuevoNodo = new NodoProducto(producto);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            NodoProducto actual = primerNodo;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }
     public void actualizarProducto(String nombreProducto, int nuevaCantidad) {
        NodoProducto actual = primerNodo;
        while (actual != null) {
            if (actual.getProducto().getNombre().equals(nombreProducto)) {
                actual.getProducto().setCantidad(nuevaCantidad);
                break;
            }
            actual = actual.getSiguiente();
        }
    }
     public void eliminarProducto(String nombreProducto) {
        if (primerNodo == null) {
            return;
        }
        if (primerNodo.getProducto().getNombre().equals(nombreProducto)) {
            primerNodo = primerNodo.getSiguiente();
            return;
        }
        NodoProducto anterior = primerNodo;
        NodoProducto actual = primerNodo.getSiguiente();
        while (actual != null) {
            if (actual.getProducto().getNombre().equals(nombreProducto)) {
                anterior.setSiguiente(actual.getSiguiente());
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
    }
     public Producto buscarProductoPorNombre(String nombreProducto) {
        NodoProducto actual = primerNodo;
        while (actual != null) {
            if (actual.getProducto().getNombre().equals(nombreProducto)) {
                return actual.getProducto();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

}
