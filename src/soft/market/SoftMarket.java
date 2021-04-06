/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.market;

import controlador.LoginCO;
import modelo.LoginMO;
import vista.Login;

/**
 *
 * @author Mis Documentos
 */
public class SoftMarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LoginMO modelo = new LoginMO();
        Login vista = new Login();
        LoginCO lco = new LoginCO(modelo, vista);
        lco.iniciarControl();

    }

}
