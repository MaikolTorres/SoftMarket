/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Mis Documentos
 */
public class ClienteMO extends Cliente{
     private static ConexionPG con = new ConexionPG();

    public ClienteMO() {
    }

    public ClienteMO(String id_cliente) {
        super(id_cliente);
    }

    public ClienteMO(String id_cliente, String cedula, String nombre, String apellido, String direccion, String celular, String correo) {
        super(id_cliente, cedula, nombre, apellido, direccion, celular, correo);
    }
     
     
   //METODOS DE REGISTRAR CLIENTE
    public boolean grabarRegistroClientes(){
        String sql;
        sql="INSERT INTO cliente (idcliente,cedula,nombre,apellido,direccion,celular,correo)";
        sql+="VALUES('" + getId_cliente() + "','" + getCedula() + "','" + getNombre()+ "','" + getApellido()+ "','" + getDireccion()+ "','" + getCelular() + "','" + getCorreo()+ "')";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean editarRegistroCliente(){
         String sql;
        sql = "UPDATE cliente set cedula='" + getCedula() + "',nombre='" + getNombre() + "',apellido='" + getApellido()+ "',direccion='" + getDireccion()+ "',celular='" + getCelular()+ "',correo='" + getCorreo()+ "'";
        sql += " WHERE idcliente='" + getId_cliente() + "'";

        if (con.noqueryActualizar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean eliminarRegistroClientes(){
        String sql;
        sql="DELETE FROM cliente where idcliente='"+getId_cliente()+"'";
        System.out.println(sql);
        if(con.noQuery(sql)==null){
            return true;
        }else{
            return false;
        }
    }
}
