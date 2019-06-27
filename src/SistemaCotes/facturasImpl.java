/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaCotes;

import cotesmodulos.cotesinterfacePOA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.conexion.ConexionMySQL;

/**
 *
 * @author carlos
 */
public class facturasImpl extends cotesinterfacePOA{

    @Override
    public String facturaspendientes(int numero) {
         PreparedStatement pst = null;
        ResultSet rst = null;
        String sql = "Select *from facturas where id_cliente="+numero;
        String aux="";
        try {
            Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/cotes","admin", "admin"); 
            pst = conexion.prepareStatement(sql);
            rst = pst.executeQuery();
                while(rst.next()){
                String id_f = rst.getString("id_factura");
                String id_c = rst.getString("id_cliente");
                String monto = rst.getString("monto");
                String estado = rst.getString("estado");
                aux+=id_f+"-"+monto+",";
            }
        } catch (SQLException ex) {
            Logger.getLogger(facturasImpl.class.getName()).log(Level.SEVERE, null, ex);
        }


        //return "2256-36,3216-26,4547-44";
        return aux;
    }

    @Override
    public void pagar(int idfactura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
