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
        
        //List<Movimiento> movimientosMes = null;
        Cuenta cuenta = new Cuenta();
        //List<Ingrediente> ingredientes = new ArrayList<>();
        List<Movimiento> movimientosMes = new ArrayList<>();
        
        
        
         for(Movimiento m : movimientos){
             
             switch (formato.format(m.getFecha())) {
            
                        case "01" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalEnero += m.getCantidad();

                                   case RETIRO -> totalEnero -= m.getCantidad();

                                   default -> {
                     }

                               }

                        }

                        case "02" -> {   

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalFebrero += m.getCantidad();

                                   case RETIRO -> totalFebrero -= m.getCantidad();

                                   default -> {
                     }

                               }

                        }

                        case "03" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalMarzo += m.getCantidad();

                                   case RETIRO -> totalMarzo -= m.getCantidad();

                                   default -> {
                     }

                               }

                        }

                        case "04" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalAbril += m.getCantidad();

                                   case RETIRO -> totalAbril -= m.getCantidad();

                                   default -> {
                     }

                               }

                        }

                        case "05" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalMayo += m.getCantidad();

                                   case RETIRO -> totalMayo -= m.getCantidad();

                                   default -> {
                     }

                               }

                        }

                        case "06" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalJunio += m.getCantidad();

                                   case RETIRO -> totalJunio -= m.getCantidad();

                                   default -> {
                     }

                               }

                        }

                        case "07" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalJulio += m.getCantidad();

                                   case RETIRO -> totalJulio -= m.getCantidad();

                                   default -> {
                     }

                               }

                        }

                        case "08" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalAgosto += m.getCantidad();

                                   case RETIRO -> totalAgosto -= m.getCantidad();

                                   default -> {
                     }

                               }

                        }

                        case "09" -> { 

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalSeptiembre += m.getCantidad();

                                   case RETIRO -> totalSeptiembre -= m.getCantidad();

                                   default -> {
                     }

                               }

                        }

                        case "10" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalOctubre += m.getCantidad();

                                   case RETIRO -> totalOctubre -= m.getCantidad();

                                   default -> {
                     }

                               }

                        }

                        case "11" -> {

                            switch(m.getTipo()){

                                   case DEPÓSITO -> totalNoviembre += m.getCantidad();

                                   case RETIRO -> totalNoviembre -= m.getCantidad();

                                   default -> {
                     }

                               }
                    
                }

                case "12" -> {

switch(m.getTipo()){
                           
                           case DEPÓSITO -> totalDiciembre += m.getCantidad();
                          
                           case RETIRO -> totalDiciembre -= m.getCantidad();
                               
                           default -> {
                     }
                           
                       }
                    
                }

                    default -> {
                }

            }
             
         }
         
                  int posicion = 0;
                  float totalParcial = 0;
                  
        switch (mes) {
            
            case "Enero" -> {
                
                for(Movimiento m : movimientos){
                    
                    if(formato.format(m.getFecha()).equals("01")){
                    
                        //Ingrediente ingrediente1 = new Ingrediente();
                        // ingrediente1.setNombre("1 Taza de Lentejas previamente remojadas por 3 horas y escurridas");
                        // ingredientes.add(ingrediente1);
                        //receta.setIngredientes(ingredientes);
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                    
                    }
                    
                }
                
                //pasos.add(paso3);
                //receta.setPasos(pasos);
                //movimientosMes.add(movimientosOperacion);
                //cuenta.setMovimientosOp(movimientosMes);
                
            }
                
            case "Febrero" -> {
                
               // Movimiento movimientosOperacion = new Movimiento();
                
                for(Movimiento m : movimientos){
                
                    if(formato.format(m.getFecha()).equals("02")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
                
           case "Marzo" -> {
                for(Movimiento m : movimientos){
                
                    if(formato.format(m.getFecha()).equals("03")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
                
            case "Abril" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(m.getFecha()).equals("04")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
                
            case "Mayo" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(m.getFecha()).equals("05")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
                
            case "Junio" -> {
                for(Movimiento m : movimientos){
                
                    if(formato.format(m.getFecha()).equals("06")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
                
            case "Julio" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(m.getFecha()).equals("07")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
                
            case "Agosto" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(m.getFecha()).equals("08")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
            
            case "Septiembre" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(m.getFecha()).equals("09")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
                
            case "Octubre" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(m.getFecha()).equals("10")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
                
            case "Noviembre" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(m.getFecha()).equals("11")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
                
            case "Diciembre" -> {
                for(Movimiento m : movimientos){
                    
                    if(formato.format(m.getFecha()).equals("12")){
                        
                        Movimiento movimientosOperacion = new Movimiento();
                        
                        movimientosOperacion.setDescripcionOperacion(m.getDescripcion());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getFecha()));
                        
                        switch(m.getTipo()){
                            
                            case DEPÓSITO -> {
                                
                                movimientosOperacion.setDeposito(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movimientosOperacion.setRetiro(m.getCantidad());
                                
                                if(posicion == 0){
                                    
                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();
                                    
                                }else{
                                    
                                    movimientosOperacion.setSubtotal(totalParcial -  movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        posicion++;
                        
                        movimientosMes.add(movimientosOperacion);
                        cuenta.setMovimientosOp(movimientosMes);
                        
                    }
                    
                }
                
            }
                
            default -> {
            }
                
        }
        
        System.out.println("Hola");
        
    }
    
}
