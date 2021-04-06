package modelo;

import java.sql.Date;

public class Cliente extends Persona {
    private String id_cliente;

    public Cliente() {
    }

    public Cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente(String id_cliente, String cedula, String nombre, String apellido, String direccion, String celular, String correo) {
        super(cedula, nombre, apellido, direccion, celular, correo);
        this.id_cliente = id_cliente;
    }
    
    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }
    
}
