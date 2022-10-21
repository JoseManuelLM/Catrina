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
    
    int totalEnero = 0;
    int totalFebrero = 0;
    int totalMarzo = 0;
    int totalAbril = 0;
    int totalMayo = 0;
    int totalJunio = 0;
    int totalJulio = 0;
    int totalAgosto = 0;
    int totalSeptiembre = 0;
    int totalOctubre = 0;
    int totalNoviembre = 0;
    int totalDiciembre = 0;
    
    public List<Movimiento> obtenerMovimientos (String mes, List<Movimiento> movimientos){
        
        DateFormat formato = new SimpleDateFormat("MM");
        DateFormat formato2 = new SimpleDateFormat("dd/MM/yy");
        DateFormat formato3 = new SimpleDateFormat("dd");
        
        List<Movimiento> movimientosMes = null;
        
        Movimiento movimientosOperacion = new Movimiento();
        
        
        
         for(Movimiento m : movimientos){
             
             switch (mes) {
            
                case "Enero":

                    

                    break;

                case "Febrero":



                    break;

                case "Marzo":

                    

                    break;

                case "Abril":

                    

                    break;

                case "Mayo":

                   

                    break;

                case "Junio":

                    

                    break;

                case "Julio":

                    

                    break;

                case "Agosto":

                    

                    break;

                case "Septiembre":

                    

                    break;

                case "Octubre":

                    

                    break;

                case "Noviembre":

                    

                    break;

                case "Diciembre":

                     

                    break;

                    default:

                        break;

                    }
             
         }
        
        switch (mes) {
            
            case "Enero":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("01")){
                    
                        //Ingrediente ingrediente1 = new Ingrediente();
                       // ingrediente1.setNombre("1 Taza de Lentejas previamente remojadas por 3 horas y escurridas");
                       // ingredientes.add(ingrediente1);
                       //receta.setIngredientes(ingredientes);
                       
                       Movimiento movimiento1 = new Movimiento();
                       movimiento1.setDescripcionOperacion(movimientosOperacion.getDescripcion());
                       movimiento1.setFechaOperacion(movimientosOperacion.getFecha());
                       
                       switch(movimientosOperacion.getTipo()){
                           
                           case DEPÓSITO:
                               
                               
                               
                               break;
                          
                           case RETIRO:
                               
                               
                               
                               break;
                               
                           default:
                               
                               break;
                           
                       }
                        
                    }
                        
                 }    
                
                break;
                
            case "Febrero":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("02")){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Marzo":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("03")){
                        
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Abril":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("04")){
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Mayo":
                
               for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("05")){

                        
                        
                    }
                        
                 }
                
                break;
                
            case "Junio":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("06")){
                     
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Julio":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("07")){
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Agosto":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("08")){
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Septiembre":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("09")){
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Octubre":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("10")){
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Noviembre":
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("11")){
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            case "Diciembre":
                
                 for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("12")){
                    
                        
                        
                    }
                        
                 }
                
                break;
                
            default:
                
                break;
                
        }
        
        return movimientosMes;
        
    }
    
}
