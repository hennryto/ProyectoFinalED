/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HENRYTO
 */
public class Usuarios {
    private int id;
    private String usuario;
    private String contrasenna;
    private String nombre;
    private String apellido;
    private String direccion;
    private int numeroTelefono;
    private String email;
    private String tipodeUsuario;
    int activo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipodeUsuario() {
        return tipodeUsuario;
    }

    public void setTipodeUsuario(String tipodeUsuario) {
        this.tipodeUsuario = tipodeUsuario;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public Usuarios() {
    }

    public Usuarios( String usuario, String contrasenna, String nombre, String apellido, String direccion, int numeroTelefono, String email, String tipodeUsuario, int activo) {
        this.usuario = usuario;
        this.contrasenna = contrasenna;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
        this.tipodeUsuario = tipodeUsuario;
        this.activo = activo;
    }

    
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", contrasenna='" + contrasenna + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", email='" + email + '\'' +
                ", tipodeUsuario='" + tipodeUsuario + '\'' +
                ", activo=" + activo +
                '}';
    }
    public boolean compararContrasenna(String contrasenna) {
    return this.contrasenna.equals(contrasenna);
    
    
}

}
