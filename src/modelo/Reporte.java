package modelo;

import java.sql.Date;

public class Reporte extends Persona {
    private String id_factura;
    private Date fecha_factura;

    public Reporte() {
    }

    public Reporte(String id_factura, Date fecha_factura) {
        this.id_factura = id_factura;
        this.fecha_factura = fecha_factura;
    }

    public Reporte(String id_factura, Date fecha_factura, String cedula, String nombre, String apellido, String direccion, String celular, String correo) {
        super(cedula, nombre, apellido, direccion, celular, correo);
        this.id_factura = id_factura;
        this.fecha_factura = fecha_factura;
    }

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }
    
    
}
