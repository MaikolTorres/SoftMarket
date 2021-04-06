/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Mis Documentos
 */
public class LoginMO extends Empleado{
    
     private static ConexionPG con = new ConexionPG();

    public LoginMO() {
    }

    public LoginMO(String usuario, String clave) {
        super(usuario, clave);
    }

    public LoginMO(String idempleado, String clave, String usuario, String cedula, String nombre, String apellido, String direccion, String correo, String celular) {
        super(idempleado, clave, usuario, cedula, nombre, apellido, direccion, correo, celular);
    }

    //Metodo para Grabar Empleado/Boton Agregar Vista RegistrarEmpleado
    public boolean grabarRegistroEmpleado() {
        String sql;
        sql = "INSERT INTO empleado (idempleado,clave,usuario,cedula,nombre,apellido,direccion,celular,correo)";
        sql += "VALUES('" + getId_empleado() + "','" + getClave() + "','" + getUsuario() + "','" + getCedula()+ "','" + getNombre()+ "','" + getApellido()+ "','" + getDireccion()+ "','" + getCelular() + "','" + getCorreo()+ "')";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para comprobar el Login 
    public boolean comprobarLogin() {
        String sql;
        //sql = "select from empleado where usuario='" + getUsuario() + "' and contraseña='" + getClave() + "'";
        sql = "select usuario,clave from empleado where usuario='" + getUsuario() + "' and clave='" + getClave() + "'";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
   
    //Metodo para Cargar Clientes en la Tabla RegistroClientes
    public static List<Cliente> ListarClientes() {
        try {
            String query = "select * from cliente";
            ResultSet rs = con.query(query);
            List<Cliente> lista = new ArrayList<Cliente>();
            byte[] bf;
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId_cliente(rs.getString("idcliente"));
                c.setCedula(rs.getString("cedula"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setCorreo(rs.getString("correo"));
                c.setCelular(rs.getString("celular"));
                
                lista.add(c);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    //Metodo para buscar de Empleados Registrados
    public List<Empleado> buscar(){
        try {
            String query;
            query="SELECT * FROM empleado WHERE "
                    + "idempleado LIKE '%"+getId_empleado()+"%' OR "
                    + "cedula LIKE '%"+getCedula()+"%' OR "
                    + "LOWER(nombre) LIKE '%"+getNombre()+"%' OR "
                    + "LOWER(apellido) LIKE '%"+getApellido()+"%'";
            
            ResultSet rs = con.query(query);
            List<Empleado> lista = new ArrayList<Empleado>();
            while (rs.next()) {
                Empleado p = new Empleado();
                p.setId_empleado(rs.getString("idempleado"));
                p.setCedula(rs.getString("cedula"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setDireccion(rs.getString("direccion"));
                p.setCorreo(rs.getString("correo"));
                p.setCelular(rs.getString("celular"));
                lista.add(p);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(LoginMO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //Metodo para Cargar Empleados Registrados en la Tabla con el Boton Visualizar
    public static List<Empleado> ListarEmpleado() {
        try {
            String query = "select * from empleado";
            ResultSet rs = con.query(query);
            List<Empleado> lista = new ArrayList<Empleado>();
            byte[] bf;
            while (rs.next()) {
                Empleado p = new Empleado();
                p.setId_empleado(rs.getString("idempleado"));
                p.setCedula(rs.getString("cedula"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setDireccion(rs.getString("direccion"));
                p.setCorreo(rs.getString("correo"));
                p.setCelular(rs.getString("celular"));
                lista.add(p);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    
    
}
