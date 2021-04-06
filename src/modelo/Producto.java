package modelo;

import java.awt.Image;

public class Producto {
     private String idproducto;
    private String nombre;
    private String cantidad;
    private String precio;
    private String categoria;
    private Image fotopro;

    public Producto() {
    }

    public Producto(String idproducto, String nombre, String cantidad, String precio, String categoria, Image fotopro) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.categoria = categoria;
        this.fotopro = fotopro;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Image getFotopro() {
        return fotopro;
    }

    public void setFotopro(Image fotopro) {
        this.fotopro = fotopro;
    }

}
