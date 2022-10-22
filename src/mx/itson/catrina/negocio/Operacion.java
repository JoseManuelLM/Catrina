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
    
    public void obtenerMovimientos (String mes, List<Movimiento> movimientos){
        
        DateFormat formato = new SimpleDateFormat("MM");
        DateFormat formato2 = new SimpleDateFormat("dd/MM/yy");
        DateFormat formato3 = new SimpleDateFormat("dd");
        
        List<Movimiento> movimientosMes = null;
        Cuenta cuenta = new Cuenta();
        Movimiento movimientosOperacion = new Movimiento();
        
        
        
         for(Movimiento m : movimientos){
             
             switch (formato.format(m.getFecha())) {
            
                        case "01" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                       totalEnero += m.getCantidad();

                                       break;

                                   case RETIRO:

                                        totalEnero -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }

                        }

                        case "02" -> {   

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                        totalFebrero += m.getCantidad();

                                       break;

                                   case RETIRO:

                                        totalFebrero -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }

                        }

                        case "03" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                       totalMarzo += m.getCantidad();

                                       break;

                                   case RETIRO:

                                       totalMarzo -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }

                        }

                        case "04" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                       totalAbril += m.getCantidad();

                                       break;

                                   case RETIRO:

                                       totalAbril -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }

                        }

                        case "05" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                       totalMayo += m.getCantidad();

                                       break;

                                   case RETIRO:

                                       totalMayo -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }

                        }

                        case "06" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                       totalJunio += m.getCantidad();

                                       break;

                                   case RETIRO:

                                       totalJunio -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }

                        }

                        case "07" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                       totalJulio += m.getCantidad();

                                       break;

                                   case RETIRO:

                                       totalJulio -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }

                        }

                        case "08" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                       totalAgosto += m.getCantidad();

                                       break;

                                   case RETIRO:

                                       totalAgosto -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }

                        }

                        case "09" -> { 

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                       totalSeptiembre += m.getCantidad();

                                       break;

                                   case RETIRO:

                                       totalSeptiembre -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }

                        }

                        case "10" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                       totalOctubre += m.getCantidad();

                                       break;

                                   case RETIRO:

                                       totalOctubre -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }

                        }

                        case "11" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO:

                                       totalNoviembre += m.getCantidad();

                                       break;

                                   case RETIRO:

                                       totalNoviembre -= m.getCantidad();

                                       break;

                                   default:

                                       break;

                               }
                    
                }

                case "12" -> {

switch(m.getTipo()){
                           
                           case DEPÓSITO:
                               
                               totalDiciembre += m.getCantidad();
                               
                               break;
                          
                           case RETIRO:
                               
                               totalDiciembre -= m.getCantidad();
                               
                               break;
                               
                           default:
                               
                               break;
                           
                       }
                    
                }

                    default -> {
                }

            }
             
         }
         
                  int posicion = 0;
                  
        switch (mes) {
            
            case "Enero" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(m.getFecha()).equals("01")){
                    
                        //Ingrediente ingrediente1 = new Ingrediente();
                        // ingrediente1.setNombre("1 Taza de Lentejas previamente remojadas por 3 horas y escurridas");
                        // ingredientes.add(ingrediente1);
                        //receta.setIngredientes(ingredientes);
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(m.getFecha());
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO:
                                
                                movimientosOperacion.setDeposito(movimientosOperacion.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalEnero + movimientosOperacion.getDeposito());
                                    
                                }
                                
                                break;
                                
                            case RETIRO:
                                
                                movimientosOperacion.setRetiro(movimientosOperacion.getCantidad());
                                movimientosOperacion.setSubtotal(totalEnero - movimientosOperacion.getDeposito());
                                
                                
                                break;
                                
                            default:
                                
                                break;
                                
                        }
                        
                        posicion++;
                    
                    }
                    
                }
                
                //pasos.add(paso3);
                movimientosMes.add(movimientosOperacion);
                //receta.setPasos(pasos);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Febrero" -> {
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("02")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Marzo" -> {
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("03")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Abril" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(movimientosOperacion.getFecha()).equals("04")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Mayo" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(movimientosOperacion.getFecha()).equals("05")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Junio" -> {
                for(Movimiento m : movimientos){
                
                    if(formato.format(movimientosOperacion.getFecha()).equals("06")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Julio" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(movimientosOperacion.getFecha()).equals("07")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Agosto" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(movimientosOperacion.getFecha()).equals("08")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Septiembre" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(movimientosOperacion.getFecha()).equals("09")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Octubre" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(movimientosOperacion.getFecha()).equals("10")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Noviembre" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(movimientosOperacion.getFecha()).equals("11")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            case "Diciembre" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(movimientosOperacion.getFecha()).equals("12")){
                        
                        
                        
                    }
                    
                }
                
                movimientosMes.add(movimientosOperacion);
                cuenta.setMovimientosOp(movimientosMes);
            }
                
            default -> {
            }
                
        }
        
        System.out.println("Hola");
        
    }
    
}
