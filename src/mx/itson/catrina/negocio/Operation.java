/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.negocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mx.itson.catrina.entidades.Transaction;

/**
 * Esta clase representa operaciones sobre transacciones financieras.
 * Calcula totales mensuales y organiza las transacciones por mes.
 * 
 * @author José Manuel Leyva Munguía
 * @version v1.0
 */
public class Operation {
    
    float totalJanuary;
    float totalFebruary;
    float totalMarch;
    float totalApril;
    float totalMay;
    float totalJune;
    float totalJuly;
    float totalAugust;
    float totalSeptember;
    float totalOctober;
    float totalNovember;
    
    /**
     * Obtiene las transacciones correspondientes a un mes específico.
     * 
     * @param month El mes deseado (en formato "MM").
     * @param transactions Lista de transacciones a filtrar.
     * @return Lista de transacciones para el mes especificado.
     */
    public List<Transaction> getTransactions (String month, List<Transaction> transactions){
        
        DateFormat formatMM = new SimpleDateFormat("MM");
        DateFormat formatoDDMMYY = new SimpleDateFormat("dd/MM/yy");
        
        List<Transaction> monthlyTransactions = new ArrayList<>();
        
        // Ordena las transacciones por fecha
        Collections.sort(transactions);
       
        
        totalJanuary = 0;
        totalFebruary = 0;
        totalMarch = 0;
        totalApril = 0;
        totalMay = 0;
        totalJune = 0;
        totalJuly = 0;
        totalAugust = 0;
        totalSeptember = 0;
        totalOctober = 0;
        totalNovember = 0;
    // Itera a través de la lista de transacciones   
    for(Transaction t : transactions){
        // Obtiene el mes de la fecha de la transacción y lo convierte a formato "MM" (mes en números)
        switch (formatMM.format(t.getDate())) {
                        // Si el mes es "01" (Enero)
                        case "01" -> {
                            // Actualiza totales mensuales según el tipo de transacción, en este caso, para Enero
                            switch(t.getType()){

                                   case DEPÓSITO -> totalJanuary += t.getAmount();

                                   case RETIRO -> totalJanuary -= t.getAmount();

                                   default -> {
                                       // Si no es depósito ni retiro, no hace nada
                                    }

                               }

                        }
                        // Se repite el mismo patrón para los demás meses
                        case "02" -> {   

                            switch(t.getType()){

                                   case DEPÓSITO -> totalFebruary += t.getAmount();

                                   case RETIRO -> totalFebruary -= t.getAmount();

                                   default -> {
                                   }

                               }

                        }

                        case "03" -> {

                            switch(t.getType()){

                                   case DEPÓSITO -> totalMarch += t.getAmount();

                                   case RETIRO -> totalMarch -= t.getAmount();

                                   default -> {
                                   }

                               }

                        }

                        case "04" -> {

                            switch(t.getType()){

                                   case DEPÓSITO -> totalApril += t.getAmount();

                                   case RETIRO -> totalApril -= t.getAmount();

                                   default -> {
                                   }

                               }

                        }

                        case "05" -> {

                            switch(t.getType()){

                                   case DEPÓSITO -> totalMay += t.getAmount();

                                   case RETIRO -> totalMay -= t.getAmount();

                                   default -> {
                                   }

                               }

                        }

                        case "06" -> {

                            switch(t.getType()){

                                   case DEPÓSITO -> totalJune += t.getAmount();

                                   case RETIRO -> totalJune -= t.getAmount();

                                   default -> {
                                   }

                               }

                        }

                        case "07" -> {

                            switch(t.getType()){

                                   case DEPÓSITO -> totalJuly += t.getAmount();

                                   case RETIRO -> totalJuly -= t.getAmount();

                                   default -> {
                                   }

                               }

                        }

                        case "08" -> {

                            switch(t.getType()){

                                   case DEPÓSITO -> totalAugust += t.getAmount();

                                   case RETIRO -> totalAugust -= t.getAmount();

                                   default -> {
                                   }

                               }

                        }

                        case "09" -> { 

                            switch(t.getType()){

                                   case DEPÓSITO -> totalSeptember += t.getAmount();

                                   case RETIRO -> totalSeptember -= t.getAmount();

                                   default -> {
                                   }

                               }

                        }

                        case "10" -> {

                            switch(t.getType()){

                                   case DEPÓSITO -> totalOctober += t.getAmount();

                                   case RETIRO -> totalOctober -= t.getAmount();

                                   default -> {
                                   }

                               }

                        }

                        case "11" -> {

                            switch(t.getType()){

                                   case DEPÓSITO -> totalNovember += t.getAmount();

                                   case RETIRO -> totalNovember -= t.getAmount();

                                   default -> {
                                   }

                               }
                    
                }

                    default -> {
                        // Si no coincide con ningún caso, no hace nada
                    }

            }
             
         }
         // Variable para rastrear posición en la lista de transacciones
            int position = 0;
            float subtotal = 0;
            
        // Filtra las transacciones por mes          
        switch (month) {
            
            // Instrucciones para si la variable 'month' es igual a "Enero"
            case "Enero" -> {
                
                // Itera sobre todas las transacciones en la lista 'transactions'
                for(Transaction t : transactions){
                    
                    // Verifica si el mes de la transacción es igual a "01" (Enero)
                    if(formatMM.format(t.getDate()).equals("01")){
                        // Crea una nueva transacción con la información deseada
                        Transaction movements = new Transaction();
                        
                        // Establece la descripción y la fecha de la nueva transacción
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                // Si es un depósito, establece el monto
                                movements.setDeposit(t.getAmount());
                                // Calcula el subtotal
                                if(position == 0){
                                    
                                    movements.setSubtotal(movements.getDeposit());
                                    subtotal = movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                // Si es un retiro, se establece también el monto
                                movements.setWithdrawal(t.getAmount());
                                // Calcula el subtotal
                                if(position == 0){
                                    
                                    movements.setSubtotal(movements.getWithdrawal());
                                    subtotal = movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                                // Si no es un depósito ni un retiro, no hace nada
                            }
                                
                        }
                        // Se incrementa la posición
                        position++;
                        // Agrega la nueva transacción a la lista
                        monthlyTransactions.add(movements);
                    
                    }
                    
                }
                
            }
            // Se repite el mismo patrón para los demás meses
            case "Febrero" -> {
                
                for(Transaction t : transactions){
                
                    if(formatMM.format(t.getDate()).equals("02")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + movements.getDeposit());
                                    subtotal = totalJanuary  + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary - movements.getWithdrawal());
                                    subtotal = totalJanuary - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
                
           case "Marzo" -> {
              
                for(Transaction t : transactions){
                
                    if(formatMM.format(t.getDate()).equals("03")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + movements.getDeposit());
                                    subtotal = totalJanuary + totalFebruary + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary - movements.getWithdrawal());
                                    subtotal = totalJanuary + totalFebruary - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
                
            case "Abril" -> {
                
                for(Transaction t : transactions){
                    
                    if(formatMM.format(t.getDate()).equals("04")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + movements.getDeposit());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch - movements.getWithdrawal());
                                    subtotal = totalJanuary + totalFebruary + totalMarch - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
                
            case "Mayo" -> {
                
                for(Transaction t : transactions){
                    
                    if(formatMM.format(t.getDate()).equals("05")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + movements.getDeposit());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril - movements.getWithdrawal());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
                
            case "Junio" -> {
                
                for(Transaction t : transactions){
                
                    if(formatMM.format(t.getDate()).equals("06")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + movements.getDeposit());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay - movements.getWithdrawal());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
                
            case "Julio" -> {
                
                for(Transaction t : transactions){
                    
                    if(formatMM.format(t.getDate()).equals("07")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + movements.getDeposit());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            - movements.getWithdrawal());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
                
            case "Agosto" -> {
                
                for(Transaction t : transactions){
                    
                    if(formatMM.format(t.getDate()).equals("08")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + movements.getDeposit());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly - movements.getWithdrawal());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
            
            case "Septiembre" -> {
                
                for(Transaction t : transactions){
                    
                    if(formatMM.format(t.getDate()).equals("09")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + movements.getDeposit());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune + totalJuly 
                                            + totalAugust + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust - movements.getWithdrawal());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
                
            case "Octubre" -> {
                
                for(Transaction t : transactions){
                    
                    if(formatMM.format(t.getDate()).equals("10")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember + movements.getDeposit());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember - movements.getWithdrawal());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
                
            case "Noviembre" -> {
                
                for(Transaction t : transactions){
                    
                    if(formatMM.format(t.getDate()).equals("11")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember + totalOctober + movements.getDeposit());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember + totalOctober + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember + totalOctober - movements.getWithdrawal());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember + totalOctober - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
                
            case "Diciembre" -> {
                
                for(Transaction t : transactions){
                    
                    if(formatMM.format(t.getDate()).equals("12")){
                        
                        Transaction movements = new Transaction();
                        
                        movements.setTransactionDescription(t.getDescription());
                        movements.setTransactionDate(formatoDDMMYY.format(t.getDate()));
                        
                        switch(t.getType()){
                            
                            case DEPÓSITO -> {
                                
                                movements.setDeposit(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember + totalOctober + totalNovember + movements.getDeposit());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember + totalOctober + totalNovember + movements.getDeposit();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal + movements.getDeposit());
                                    subtotal += movements.getDeposit();
                                    
                                }
                                
                            }
                                
                            case RETIRO -> {
                                
                                movements.setWithdrawal(t.getAmount());
                                
                                if(position == 0){
                                    
                                    movements.setSubtotal(totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember + totalOctober + totalNovember - movements.getWithdrawal());
                                    subtotal = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune 
                                            + totalJuly + totalAugust + totalSeptember + totalOctober + totalNovember - movements.getWithdrawal();
                                    
                                }else{
                                    
                                    movements.setSubtotal(subtotal -  movements.getWithdrawal());
                                    subtotal -= movements.getWithdrawal();
                                    
                                }
                                
                            }
                                
                            default -> {
                            }
                                
                        }
                        
                        position++;
                        
                        monthlyTransactions.add(movements);
                        
                    }
                    
                }
                
            }
                
            default -> {
                // Si no coincide con ningún caso, no hace nada
            }
                
        }
        // Retorna la lista de transacciones filtradas por mes
        return monthlyTransactions;
        
    }
    
    /**
     * Obtiene el saldo inicial para un mes específico en base a las transacciones proporcionadas.
     * 
     * @param month El nombre del mes.
     * @param transactions Lista de transacciones.
     * @return El saldo inicial para el mes especificado.
     */

    public float getInitialBalance (String month, List<Transaction> transactions){
        
        float initialBalance = 0;
        
        switch (month) {
            
            case "Enero" -> {
               // Para Enero, el saldo inicial es 0
               initialBalance = 0;
                
            }
                
            case "Febrero" -> {
               // Para Febrero, el saldo inicial es el total de Enero
               initialBalance = 0;
               initialBalance = totalJanuary;
                
            }
                
           case "Marzo" -> {
               // Para Marzo, el saldo inicial es el total de Enero y Febrero
               initialBalance = 0;
               initialBalance = totalJanuary + totalFebruary;
                
            }
           
            // Se repite el mismo patrón para los demás meses
           
            case "Abril" -> {
                
                initialBalance = 0;
                initialBalance = totalJanuary + totalFebruary + totalMarch;
                
            }
                
            case "Mayo" -> {
                
               initialBalance = 0;
               initialBalance = totalJanuary + totalFebruary + totalMarch + totalApril;
                
            }
                
            case "Junio" -> {
                
                initialBalance = 0;
                initialBalance = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay;
                
            }
                
            case "Julio" -> {
                
               initialBalance = 0;
               initialBalance = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune;

                
            }
                
            case "Agosto" -> {
                
                initialBalance = 0;
                initialBalance = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune + totalJuly;
                
            }
            
            case "Septiembre" -> {
                
                initialBalance = 0;
                initialBalance = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune + totalJuly 
                        + totalAugust;
                
            }
                
            case "Octubre" -> {
                
                initialBalance = 0;
                initialBalance = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune + totalJuly 
                        + totalAugust + totalSeptember;
                
            }
                
            case "Noviembre" -> {
                
              initialBalance = 0;
              initialBalance = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune + totalJuly 
                      + totalAugust + totalSeptember + totalOctober;
                
            }
                
            case "Diciembre" -> {
                
               initialBalance = 0;
               initialBalance = totalJanuary + totalFebruary + totalMarch + totalApril + totalMay + totalJune + totalJuly 
                       + totalAugust + totalSeptember + totalOctober + totalNovember;
                
            }
                
            default -> {
                // Si el mes no es reconocido, el saldo inicial se mantiene en 0
            }
                
        }
        // Se retorna el saldo inicial
        return initialBalance;
        
    }
    
}
