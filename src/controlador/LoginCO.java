/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import modelo.Cliente;
import modelo.ClienteMO;
import modelo.Empleado;
import modelo.LoginMO;
import modelo.Producto;
import modelo.ProductoMO;
import vista.Login;

/**
 *
 * @author Mis Documentos
 */
public class LoginCO {

    private LoginMO modelo;
    private Login vista;
    private java.awt.Image capturaPro;

    public LoginCO(LoginMO modelo, Login vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }

    public void iniciarControl() {
        //Control de botones de Login
        vista.getBtnRegistrarseLO().addActionListener(l -> mostrarDialogo());
        vista.getBtnIngresarLO().addActionListener(l -> Acceso());
        vista.getBtnLimpiarLO().addActionListener(l -> limpiarLogin());

        //Metodo de Botones de Registrp Empleado
        vista.getBtnAgregarRE().addActionListener(l -> grabarEmpleado());
        vista.getBtnLimpiarRE().addActionListener(l -> limpiarRegistroEmpleado());
        vista.getBtnRegresarRE().addActionListener(l-> botonRegresarRegistroEmpleados());

        //METODO DE BOTONES PANELES
        //Metodo de Boton Salir Paneles
        vista.getBtnSalirPA().addActionListener(l -> SalirBotonPaneles());
        //Metodo de Botones Registrar Clientes
        vista.getBtnRegistrarClientePA().addActionListener(l -> mostrarDialogoRegistrarClientes());
        vista.getBtnRegresraRC().addActionListener(l -> botonregresarclientes());
        vista.getBtnAgregarRC().addActionListener(l -> grabarCliente());
        vista.getBtnActualizarRC().addActionListener(l -> ListarClientes());
        vista.getBtnEditarRC().addActionListener(l -> editarRegistroClientes());
        vista.getBtnEliminarRC().addActionListener(l-> eliminarRegistroCliente());
        vista.getBtnLimpiarRC().addActionListener(l-> limpiarRegistroClientes());
        
        //Metodos de Botones de Empleados Registrados
        vista.getBtnReporteEmpleadosPA().addActionListener(l-> ingresarEmpleadosRegistrados());
        vista.getBtnRegresarER().addActionListener(l-> botonRegresarEmpleadosRegistrados());
        vista.getBtnLimpiarER().addActionListener(l->limpiarEmpleadosRegistrados());
        vista.getTxtBuscarER().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                BuscarEmpleado();
            }
        });
        vista.getBtnVisualizarER().addActionListener(l-> ListarEmpleados());
        
        //Metodos de Botones Productos
        vista.getBtnAdministrarProductosPA().addActionListener(l-> ingresarPanelProductos());
        vista.getBtnRegresarPRO().addActionListener(l->botonRegresarProductos());
        vista.getBtnLimpiarPRO().addActionListener(l-> limpiarProductos());
        vista.getBtnAgregarPRO().addActionListener(l-> grabarProducto());
        vista.getBtnExaminarPRO().addActionListener(l-> cargarImagenProducto());
        vista.getBtnActualizarPRO().addActionListener(l-> cargaListaProducto());
        vista.getBtnEliminarPRO().addActionListener(l-> eliminarProducto());
    }

    //Metodos de Registro Empleados 
    private void grabarEmpleado() {
        String idempleado = vista.getTxtEmpleadoIdRE().getText();
        String usuario = vista.getTxtUsuarioRE().getText();
        String cedula = vista.getTxtCedulaRE().getText();
        String nombre = vista.getTxtNombreRE().getText();
        String apellido = vista.getTxtApellidoRE().getText();
        String direccion = vista.getTxtDireccionRE().getText();
        String correo = vista.getTxtCorreoRE().getText();
        String celular = (vista.getTxtCelularRE().getText());
        String clave = vista.getPassContraseñaRE().getText();
        //LoginMO e = new LoginMO(idempleado, contraseña, usuario, cedula, nombre, apellido, direccion, celular, correo);
        LoginMO e = new LoginMO(idempleado, clave, usuario, cedula, nombre, apellido, direccion, celular, correo);
        if (e.grabarRegistroEmpleado()) {
            JOptionPane.showMessageDialog(vista, "Registro grabado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vista, "ERROR");

        }
    }

    public void limpiarRegistroEmpleado() {
        vista.getTxtEmpleadoIdRE().setText("");
        vista.getTxtCedulaRE().setText("");
        vista.getTxtNombreRE().setText("");
        vista.getTxtApellidoRE().setText("");
        vista.getTxtUsuarioRE().setText("");
        vista.getTxtDireccionRE().setText("");
        vista.getTxtCorreoRE().setText("");
        vista.getTxtCelularRE().setText("");
        vista.getPassContraseñaRE().setText("");
    }
    public void botonRegresarRegistroEmpleados(){
        vista.setVisible(true);
        vista.getDgRegistroEmpleado().setVisible(false);
    }

    //Metodos de Login
    private void Acceso() {
        String usuario = vista.getTxtUsuarioIdLO().getText();
        String clave = vista.getPassContraseñaLO().getText();

        LoginMO e = new LoginMO(clave, usuario);
        if (e.comprobarLogin()) {
            JOptionPane.showMessageDialog(vista, "ACCESO");
            vista.getDgPaneles().setVisible(true);
            vista.getDgPaneles().setSize(1050, 700);
            vista.setVisible(false);//Se cierra el Login

        } else {
            JOptionPane.showMessageDialog(vista, "ERROR AL INGRESAR DATOS");

        }
    }

    public void limpiarLogin() {
        vista.getTxtUsuarioIdLO().setText("");
        vista.getPassContraseñaLO().setText("");
    }

    private void mostrarDialogo() {//Se muestra el registro de empleado
        vista.getDgRegistroEmpleado().setSize(1200, 500);
        vista.getDgRegistroEmpleado().setTitle("Nuevo Empleado");
        vista.getDgRegistroEmpleado().setLocationRelativeTo(vista);
        vista.getDgRegistroEmpleado().setVisible(true);
    }

    //METODOS DE PANELES
    //Metodo de Boton Regresar Paneles
    public void SalirBotonPaneles() {

        vista.setVisible(true);//Se abre el Login Principal
        vista.getDgPaneles().setVisible(false);
    }

    
    //METODO DE REGISTRAR CLIENTE
    //Metodo de Boton Registrar Clientes
    public void mostrarDialogoRegistrarClientes() {

        vista.getDgRegistrarClientes().setVisible(true);
        vista.getDgRegistrarClientes().setSize(1050, 700);
    }

    //Metodo para Boton Regresar Clientes
    public void botonregresarclientes() {
        vista.getDgPaneles().setVisible(true);
        vista.getDgRegistrarClientes().setVisible(false);
    }

    //Metodo de Grabar Cliente 
    public void grabarCliente() {
        String idcliente = vista.getTxtClienteIDRC().getText();
        String cedula = vista.getTxtCedulaRC().getText();
        String nombre = vista.getTxtNombreRC().getText();
        String apellido = vista.getTxtApellidoRC().getText();
        String direccion = vista.getTxtDireccionRC().getText();
        String correo = vista.getTxtCorreoRC().getText();
        String celular = (vista.getTxtCelularRC().getText());
        ClienteMO cmo = new ClienteMO(idcliente, cedula, nombre, apellido, direccion, celular, correo);
        if (cmo.grabarRegistroClientes()) {
            JOptionPane.showMessageDialog(vista, "Registro grabado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vista, "ERROR");

        }
    }
//Metodo de Listar Clientes
    public void ListarClientes() {
//        vista.getTblPersonas().setRowHeight(100);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();

        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTablaRegistroClientes().getModel();
        tblModel.setNumRows(0);
        List<Cliente> lista = LoginMO.ListarClientes();
        int ncols = tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(p1 -> {
            tblModel.addRow(new Object[ncols]);
            vista.getTablaRegistroClientes().setValueAt(p1.getId_cliente(), i.value, 0);
            vista.getTablaRegistroClientes().setValueAt(p1.getCedula(), i.value, 1);
            vista.getTablaRegistroClientes().setValueAt(p1.getNombre(), i.value, 2);
            vista.getTablaRegistroClientes().setValueAt(p1.getApellido(), i.value, 3);
            vista.getTablaRegistroClientes().setValueAt(p1.getDireccion(), i.value, 4);
            vista.getTablaRegistroClientes().setValueAt(p1.getCorreo(), i.value, 5);
            vista.getTablaRegistroClientes().setValueAt(p1.getCelular(), i.value, 6);
            i.value++;

        });
    }

    public void editarRegistroClientes() {
        
//        
//        int indice = vista.getTablaRegistroClientes().getSelectedRow();
//        if (indice != -1) {
//            String idcliente = vista.getTablaRegistroClientes().getValueAt(indice, 0).toString();
//            String cedula = vista.getTablaRegistroClientes().getValueAt(indice, 1).toString();
//            String nombre = vista.getTablaRegistroClientes().getValueAt(indice, 2).toString();
//            String apellido = vista.getTablaRegistroClientes().getValueAt(indice, 3).toString();
//            String direccion = "";
//            if (vista.getTablaRegistroClientes().getValueAt(indice, 4) == null) {
//                direccion = "";
//            } else {
//                direccion = vista.getTablaRegistroClientes().getValueAt(indice, 4).toString();
//            }
//
//            String correo = "";
//            if (vista.getTablaRegistroClientes().getValueAt(indice, 5).toString().isEmpty()) {
//                correo = "";
//            } else {
//                correo = vista.getTablaRegistroClientes().getValueAt(indice, 5).toString();
//            }
//
//            String celular = "";
//            if (vista.getTablaRegistroClientes().getValueAt(indice, 6).toString().isEmpty()) {
//                celular = "";
//            } else {
//                celular = vista.getTablaRegistroClientes().getValueAt(indice, 6).toString();
//            }
//
//            ClienteMO p1 = new ClienteMO();
//            p1.setId_cliente(idcliente);
//            vista.getTxtCedulaRC().setText(cedula);
//            vista.getTxtNombreRC().setText(nombre);
//            vista.getTxtApellidoRC().setText(apellido);
//            vista.getTxtDireccionRC().setText(direccion);
//            vista.getTxtCorreoRC().setText(correo);
//            vista.getTxtCelularRC().setText(celular);
//            vista.getTxtClienteIDRC().setText(idcliente);
//            vista.getTxtClienteIDRC().setEditable(false);
//
//        } else {
//            JOptionPane.showMessageDialog(vista, "Seleccione una fila ");
//        }
        int indice = vista.getTablaRegistroClientes().getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila ");
        } else {
            String idcliente = vista.getTablaRegistroClientes().getValueAt(indice, 0).toString();
            String cedula = vista.getTxtCedulaRC().getText();
            String nombre = vista.getTxtNombreRC().getText();
            String apellido = vista.getTxtApellidoRC().getText();
            String direccion = vista.getTxtDireccionRC().getText();
            String correo = vista.getTxtCorreoRC().getText();
            String celular = vista.getTxtCelularRC().getText();

            ClienteMO cliente = new ClienteMO(idcliente, cedula, nombre, apellido, direccion, correo, celular);
            if (cliente.editarRegistroCliente() == true) {
                ListarClientes();
                JOptionPane.showMessageDialog(vista, "Registro actualizado ");
            } else {
                JOptionPane.showMessageDialog(vista, "ERROR");

            }
        }
    }
    
    
    //Metodo de Eliminar Clientes
    public void eliminarRegistroCliente(){
        int indice = vista.getTablaRegistroClientes().getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila ");
        } else {
            int eli;
            eli = JOptionPane.showConfirmDialog(vista, "Esta seguro de Eliminar", "Persona", JOptionPane.OK_CANCEL_OPTION);//se guarda con el valor de la seleccion del option pane
            if (eli == 0) {
                String idcliente = vista.getTablaRegistroClientes().getValueAt(indice, 0).toString();
                ClienteMO cliente = new ClienteMO();
                cliente.setId_cliente(idcliente);
                if (cliente.eliminarRegistroClientes()== true) {//elimina a la persona de la base de datos
                    ListarClientes();
                    JOptionPane.showMessageDialog(vista, "Registro eliminado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(vista, "ERROR AL ELIMINAR");
                }
            }
        }
    }
    //Metodo de Limpiar Registro Clientes
    public void limpiarRegistroClientes(){
        vista.getTxtClienteIDRC().setText("");
        vista.getTxtCedulaRC().setText("");
        vista.getTxtNombreRC().setText("");
        vista.getTxtApellidoRC().setText("");
        vista.getTxtDireccionRC().setText("");
        vista.getTxtCorreoRC().setText("");
        vista.getTxtCelularRC().setText("");
    }
    
    //METODO DE PRODUCTOS
    
    //Metodo Ingresar a Categorias
    public void BotonIngresarCategorias(){
//        vista.getDgCategorias().setVisible(true);
//        vista.getDgCategorias().setSize(900,580);
//        vista.getDgPaneles().setVisible(false);
    }
    
    //Metodo de Regresar de Categoria
    public void botonRegresarCategorias(){
//        vista.getDgPaneles().setVisible(true);
//        vista.getDgCategorias().setVisible(false);
    }
    
    //Metodo Ingresar Categoria
    public void ingresarCategoria(){
        
    }
    
    //METODO DE REPORTES EMPLEADOS 
    public void ingresarEmpleadosRegistrados(){
        vista.getDgEmpleadosRegistrados().setVisible(true);
        vista.getDgEmpleadosRegistrados().setSize(1200,425);
        vista.getDgPaneles().setVisible(false);
    }
    public void botonRegresarEmpleadosRegistrados(){
        vista.getDgPaneles().setVisible(true);
        vista.getDgEmpleadosRegistrados().setVisible(false);
    }
    
    public void limpiarEmpleadosRegistrados(){
        vista.getTxtBuscarER().setText("");
    }
    
     private void BuscarEmpleado() {
        String texto = vista.getTxtBuscarER().getText().toLowerCase();
        LoginMO persona = new LoginMO();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        persona.setId_empleado(texto);
        persona.setCedula(texto);
        persona.setNombre(texto);
        persona.setApellido(texto);
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTablaEmpleadosRegistrados().getModel();//modelo de la tabla
        tblModel.setNumRows(0);//borro todas las filas
        Holder<Integer> i = new Holder<>(0);
        List<Empleado> lista = persona.buscar();
        lista.stream().forEach(p1 -> {
            //   String[] persona={p1.getIdPersona(),p1.getNombres(),p1.getApellidos(),String.valueOf(p1.getEdad())};

            tblModel.addRow(new Object[7]);
            

             vista.getTablaEmpleadosRegistrados().setValueAt(p1.getId_empleado(), i.value, 0);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getCedula(), i.value, 1);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getNombre(), i.value, 2);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getApellido(), i.value, 3);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getDireccion(), i.value, 4);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getCorreo(), i.value, 5);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getCelular(), i.value, 6);
            
            i.value++;
            ;
        });
    }
     
     //Metodo Listar Empleados Registrados en la Tabla 
     public void ListarEmpleados() {
//        vista.getTblPersonas().setRowHeight(100);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();

        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTablaEmpleadosRegistrados().getModel();
        tblModel.setNumRows(0);
        List<Empleado> lista = LoginMO.ListarEmpleado();
        int ncols = tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(p1 -> {
            tblModel.addRow(new Object[ncols]);
             vista.getTablaEmpleadosRegistrados().setValueAt(p1.getId_empleado(), i.value, 0);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getCedula(), i.value, 1);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getNombre(), i.value, 2);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getApellido(), i.value, 3);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getDireccion(), i.value, 4);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getCorreo(), i.value, 5);
            vista.getTablaEmpleadosRegistrados().setValueAt(p1.getCelular(), i.value, 6);
            i.value++;

        });
    }
     
     
     //METODOS DE PANEL PRODUCTOS
     
     //Metodo Boton Regresar Productos
     public void ingresarPanelProductos(){
        vista.getDgProductos().setVisible(true);
        vista.getDgProductos().setSize(1200,700);
        vista.getDgPaneles().setVisible(false);
    }
    public void botonRegresarProductos(){
        vista.getDgPaneles().setVisible(true);
        vista.getDgProductos().setVisible(false);
    }
    public void limpiarProductos(){
        vista.getTxtProductoIDPRO().setText("");
        vista.getTxtNombrePRO().setText("");
        vista.getTxtCantidadPRO().setText("");
        vista.getTxtPrecioPRO().setText("");
        vista.getComboBoxPRO().setSelectedIndex(0);
        vista.getLbl_fotoPRO().setIcon(null);
    }

    //Metodo para grabar un producto
    public void grabarProducto(){
        String idproducto = vista.getTxtProductoIDPRO().getText();
        String nombre = vista.getTxtNombrePRO().getText();
        String cantidad = vista.getTxtCantidadPRO().getText();
        String precio = vista.getTxtPrecioPRO().getText();
        String categoria = vista.getComboBoxPRO().getSelectedItem().toString();
        ProductoMO pro = new ProductoMO(idproducto, nombre, cantidad, precio, categoria, capturaPro);
        if (pro.grabarRegistroProducto()) {
            JOptionPane.showMessageDialog(vista, "Registro grabado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vista, "ERROR");

        }
    }
    
    //Metodo para cargar Imagen el el Label
    private void cargarImagenProducto() {

        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("*.png", "png");
        jfc.setFileFilter(extensionFilter);
        int estado = jfc.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                capturaPro = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(vista.getLbl_fotoPRO().getWidth(), vista.getLbl_fotoPRO().getHeight(), java.awt.Image.SCALE_DEFAULT);
                vista.getLbl_fotoPRO().setIcon(new ImageIcon(capturaPro));
                vista.getLbl_fotoPRO().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(LoginCO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Metodo para cargar la lista de porductos en la tabla
     private void cargaListaProducto() {
        vista.getTablaProductos().setDefaultRenderer(Object.class, new ImagenTabla());
        vista.getTablaProductos().setRowHeight(100);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTablaProductos().getModel();
        tblModel.setNumRows(0);
        int ncol = tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        List<Producto> lista = ProductoMO.listarProducto();
        lista.stream().forEach(p1 -> {
            //   String[] persona={p1.getIdPersona(),p1.getNombres(),p1.getApellidos(),String.valueOf(p1.getEdad())};

            tblModel.addRow(new Object[ncol]);
            vista.getTablaProductos().setValueAt(p1.getIdproducto(), i.value, 0);
            vista.getTablaProductos().setValueAt(p1.getNombre(), i.value, 1);
            vista.getTablaProductos().setValueAt(p1.getCantidad(), i.value, 2);
            vista.getTablaProductos().setValueAt(p1.getPrecio(), i.value, 3);
            vista.getTablaProductos().setValueAt(p1.getCategoria(), i.value, 4);


            java.awt.Image img = p1.getFotopro();

            if (img != null) {
                java.awt.Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(newimg);
                renderer.setIcon(icon);
                vista.getTablaProductos().setValueAt(new JLabel(icon), i.value, 5);
            } else {
                vista.getTablaProductos().setValueAt(null, i.value, 5);
            }
            i.value++;

        });
    }
     
     //Metodo para eliminar un producto
     private void eliminarProducto() {
        int indice = vista.getTablaProductos().getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila ");
        } else {
            int eli;
            eli = JOptionPane.showConfirmDialog(vista, "Eliminar", "Producto", JOptionPane.OK_CANCEL_OPTION);//se guarda con el valor de la seleccion del option pane
            if (eli == 0) {
                String idproducto = vista.getTablaProductos().getValueAt(indice, 0).toString();
                ProductoMO producto = new ProductoMO();
                producto.setIdproducto(idproducto);
                if (producto.eliminar() == true) {//elimina a la persona de la base de datos
                    cargaListaProducto();
                    JOptionPane.showMessageDialog(vista, "Producto  eliminado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(vista, "ERROR AL ELIMINAR");
                }
            }
        }
    }
}
