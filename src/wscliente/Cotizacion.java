/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wscliente;

/**
 *
 * @author jose
 */
public class Cotizacion {

    public static String getCotizacion(java.lang.String fecha) {
        com.banco.ws.WSBanco_Service service = new com.banco.ws.WSBanco_Service();
        com.banco.ws.WSBanco port = service.getWSBancoPort();
        return port.getCotizacion(fecha);
    }
    
}
