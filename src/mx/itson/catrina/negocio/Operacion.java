/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.negocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
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
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }    
                
                break;
                
            case "Febrero":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Marzo":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Abril":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Mayo":
                
               for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Junio":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Julio":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Agosto":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Septiembre":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Octubre":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Noviembre":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Diciembre":
                
                 for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            default:
                
                break;
                
        }
        
        return movimientosMes;
        
    }
    
}
