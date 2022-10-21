/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.negocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import mx.itson.catrina.entidades.Cuenta;
import mx.itson.catrina.entidades.Movimiento;

/**
 *
 * @author shiri
 */
public class Operacion {
    
    public List<Movimiento> obtenerMovimientos (String mes, List<Movimiento> movimientos){
        
        DateFormat formato = new SimpleDateFormat("MM");
        
        List<Movimiento> movimientosMes = null;
        
        Movimiento movimiento = new Movimiento();
        
        if(mes.equals("Enero")){
           
           if(formato.format(movimiento.getFecha()).equals("01")){
               
               for(Movimiento m : Cuenta.)
               
           }
           
       }else if(mes.equals("Febrero")){
           
           
           
       }else if(mes.equals("Marzo")){
           
           
           
       }else if(mes.equals("Abril")){
           
           
           
       }else if(mes.equals("Mayo")){
           
           
           
       }else if(mes.equals("Junio")){
           
           
           
       }else if(mes.equals("Julio")){
           
           
           
       }else if(mes.equals("Agosto")){
           
           
           
       }else if(mes.equals("Septiembre")){
           
           
           
       }else if(mes.equals("Octubre")){
           
           
           
       }else if(mes.equals("Noviembre")){
           
           
           
       }else if(mes.equals("Diciembre")){
           
           
           
       }
        
        return movimientosMes;
        
    }
    
}
