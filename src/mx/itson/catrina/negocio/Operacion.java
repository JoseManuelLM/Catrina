/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.negocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        
        Movimiento movimientosOperacion = new Movimiento();
        
        switch (mes) {
            
            case "Enero":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }    
                
                break;
                
            case "Febrero":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("02")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Marzo":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("03")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Abril":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("04")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Mayo":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("05")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Junio":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("06")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Julio":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("07")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Agosto":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("08")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Septiembre":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("09")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Octubre":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("10")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Noviembre":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("11")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Diciembre":
                
                if(formato.format(movimientosOperacion.getFecha()).equals("12")){
                    
                    for(Movimiento m : movimientos){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            default:
                
                break;
                
        }
        
        return movimientosMes;
        
    }
    
}
