package modelo;

import java.awt.Image;
import java.sql.Date;

public class Empleado extends Persona{
    private String id_empleado;
    private String usuario;
    private String clave; 

    public Empleado() {
    }

    public Empleado(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public Empleado(String id_empleado, String usuario, String clave) {
        this.id_empleado = id_empleado;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Empleado(String id_empleado,String clave, String usuario,  String cedula, String nombre, String apellido, String direccion, String celular, String correo) {
        super(cedula, nombre, apellido, direccion, celular, correo);
        this.id_empleado = id_empleado;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
