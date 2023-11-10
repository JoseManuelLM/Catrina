/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import mx.itson.catrina.enumeradores.TransactionType;

/**
 * Representa una transacción bancaria.
 * 
 * @author José Manuel Leyva Munguía
 * @version v1.0
 */
public class Transaction implements Comparable<Transaction> {
    
    private Date date;
    private String description;
    private float amount;
    private TransactionType type;
    private String transactionDate;
    private String transactionDescription;
    private float deposit;
    private float withdrawal;
    private float subtotal;
    
    /**
     * Obtiene la fecha de la transacción en formato de cadena.
     * @return La fecha de la transacción en formato de cadena.
     */
    public String getTransactionDate() {
        return transactionDate;
    }
    /**
     * Establece la fecha de la transacción en formato de cadena.
     * @param transactionDate La fecha de la transacción en formato de cadena.
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    /**
     * Obtiene la descripción de la transacción en formato de cadena.
     * @return La descripción de la transacción en formato de cadena.
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }
    /**
     * Establece la descripción de la transacción en formato de cadena.
     * @param transactionDescription La descripción de la transacción en formato de cadena.
     */
    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }
    /**
     * Obtiene el monto depositado.
     * @return El monto depositado.
     */
    public float getDeposit() {
        return deposit;
    }
    /**
     * Establece el monto depositado.
     * @param deposit El monto depositado.
     */
    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }
    /**
     * Obtiene el monto retirado.
     * @return El monto retirado.
     */
    public float getWithdrawal() {
        return withdrawal;
    }
    /**
     * Establece el monto retirado.
     * @param withdrawal El monto retirado.
     */
    public void setWithdrawal(float withdrawal) {
        this.withdrawal = withdrawal;
    }
    /**
     * Obtiene el subtotal de la transacción.
     * @return El subtotal de la transacción.
     */
    public float getSubtotal() {
        return subtotal;
    }
    /**
     * Establece el subtotal de la transacción.
     * @param subtotal El subtotal de la transacción.
     */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    /**
     * Obtiene la fecha de la transacción.
     * @return La fecha de la transacción.
     */
    public Date getDate() {
        return date;
    }
    /**
     * Establece la fecha de la transacción.
     * @param date La fecha de la transacción.
     */
    public void setDate(Date date) {
        this.date = date;
    }
    /**
     * Obtiene la descripción de la transacción.
     * @return La descripción de la transacción.
     */
    public String getDescription() {
        return description;
    }
    /**
     * Establece la descripción de la transacción.
     * @param description La descripción de la transacción.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Obtiene el monto de la transacción.
     * @return El monto de la transacción.
     */
    public float getAmount() {
        return amount;
    }
    /**
     * Establece el monto de la transacción.
     * @param amount El monto de la transacción.
     */
    public void setAmount(float amount) {
        this.amount= amount;
    }
    /**
     * Obtiene el tipo de transacción (depósito o retiro).
     * @return El tipo de transacción.
     */
    public TransactionType getType() {
        return type;
    }
    /**
     * Establece el tipo de transacción (depósito o retiro).
     * @param type El tipo de transacción.
     */
    public void setType(TransactionType type) {
        this.type = type;
    }

    @Override
    /**
     * Compara esta transacción con otra basada en la fecha.
     * 
     * @param tt La otra transacción a comparar.
     * @return Un valor entero que indica el resultado de la comparación.
     */
    public int compareTo(Transaction tt) {
        
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
         
        String a = format.format(this.getDate());
        String b = format.format(tt.getDate());
        return a.compareTo(b);
        
    }
    
}
