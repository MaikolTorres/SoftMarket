/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.postgresql.util.Base64;

/**
 *
 * @author Mis Documentos
 */
public class ProductoMO extends Producto{
     private static ConexionPG con = new ConexionPG();

    public ProductoMO() {
    }

    public ProductoMO(String idproducto, String nombre, String cantidad, String precio, String categoria, Image fotopro) {
        super(idproducto, nombre, cantidad, precio, categoria, fotopro);
    }
     
    //Metodo para Grabar Producto/Boton Agregar Vista Producto
    public boolean grabarRegistroProducto() {
         String foto64 = null;
        //transformar imagen a base 64 para postgres
        ByteArrayOutputStream byt = new ByteArrayOutputStream();
        try {
            BufferedImage img = imgBuffered(getFotopro());
            ImageIO.write(img, "PNG", byt);
            byte[] bgt = byt.toByteArray();
            foto64 = Base64.encodeBytes(bgt);
        } catch (IOException ex) {
            Logger.getLogger(ProductoMO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql;
        sql = "INSERT INTO producto (idproducto,nombre,cantidad,precio,categoria,fotopro)";
        sql += "VALUES('" + getIdproducto()+ "','" +getNombre()+ "','" + getCantidad()+ "','" + getPrecio()+ "','" + getCategoria()+ "','" + foto64 +"')";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Metodo para cargar lista de producto
    public static List<Producto> listarProducto() {
        try {
            String query = "select * from producto";
            ResultSet rs = con.query(query);
            List<Producto> lista1 = new ArrayList<Producto>();
            byte[] bf;
            while (rs.next()) {
                Producto p1 = new Producto();
                p1.setIdproducto(rs.getString("idproducto"));
                p1.setNombre(rs.getString("nombre"));
                p1.setCantidad(rs.getString("cantidad"));
                p1.setPrecio(rs.getString("precio"));
                p1.setCategoria(rs.getString("categoria"));
                bf = rs.getBytes("fotopro");

                if (bf != null) {
                    bf = Base64.decode(bf, 0, bf.length);
                    try {
                        //OBTENER IMAGEN
                        p1.setFotopro(obtenImagen(bf));
                    } catch (IOException ex) {
                        p1.setFotopro(null);
                        Logger.getLogger(ProductoMO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    p1.setFotopro(null);
                }

                lista1.add(p1);
            }
            rs.close();
            return lista1;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoMO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    //Metodos para cargar foto de productos
     private BufferedImage imgBuffered(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }
        BufferedImage b1 = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D gra = b1.createGraphics();
        gra.drawImage(img, 0, 0, null);
        gra.dispose();
        return b1;
    }
     public static Image obtenImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("png");
        ImageReader reader = (ImageReader) it.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0, param);
    }
     
     
    //Metodo para eliminar el producto
    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM producto where idproducto='" + getIdproducto()+ "'";
        System.out.println(sql);
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
}
