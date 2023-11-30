package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    @Id
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;
    private String nombreMascota;

    public Persona() {
    }

  
    public Persona(String rut, String nombre, String apellido, String direccion, String correo, String telefono, String nombreMascota) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.nombreMascota = nombreMascota;
    }

 
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

   
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    
    @Override
    public String toString() {
        return "Persona{" +
               "rut='" + rut + '\'' +
               ", nombre='" + nombre + '\'' +
               ", apellido='" + apellido + '\'' +
               ", direccion='" + direccion + '\'' +
               ", correo='" + correo + '\'' +
               ", telefono='" + telefono + '\'' +
               ", nombreMascota='" + nombreMascota + '\'' +
               '}';
    }
}
