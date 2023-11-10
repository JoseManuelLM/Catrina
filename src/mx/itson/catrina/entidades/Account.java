/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.util.List;


/**
 * Representa una cuenta bancaria y su información básica.
 * 
 * @author José Manuel Leyva Munguía
 * @version v1.0
 */
public class Account {
    
    private String account;
    private String clabe;
    private String currency;
    private Customer customer;
    private List<Transaction> transactions;
    private List<Transaction> ops;
    
    /**
     * Transforma un archivo JSON a un objeto Account
     * @param json es el archivo json transformado a binario
     * @return El archivo ya transformado a objeto Account
     */
    public Account deserialize(String json){
        
        Account deserializedFile = new Account();
        
        try{
            
            deserializedFile = new Gson().fromJson(json, Account.class);
            
        }catch(Exception ex){
            
            System.err.print("¡Oops! Ha sucedido un error: " + ex.getMessage());
            
        }
        
        return deserializedFile;
        
    }
    /**
     * Obtiene el número de cuenta.
     * @return el número de cuenta.
     */
    public String getAccount() {
        return account;
    }
    /**
     * Establece el número de cuenta.
     * @param account el número de cuenta a establecer.
     */
    public void setAccount(String account) {
        this.account = account;
    }
    /**
     * Obtiene el número de CLABE.
     * @return el número de CLABE.
     */
    public String getClabe() {
        return clabe;
    }
    /**
     * Establece el número de CLABE.
     * @param clabe el número de CLABE a establecer.
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }
    /**
     * Obtiene el tipo de moneda.
     * @return el tipo de moneda.
     */
    public String getCurrency() {
        return currency;
    }
    /**
     * Establece el tipo de moneda.
     * @param currency el tipo de moneda a establecer.
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    /**
     * Obtiene la información del cliente asociado a la cuenta.
     * @return la información del cliente.
     */
    public Customer getCustomer() {
        return customer;
    }
    /**
     * Establece la información del cliente asociado a la cuenta.
     * @param customer la información del cliente a establecer.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    /**
     * Obtiene la lista de transacciones.
     * @return la lista de transacciones.
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }
    /**
     * Establece la lista de transacciones.
     * @param transactions la lista de transacciones a establecer.
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    /**
     * Obtiene la lista de operaciones.
     * @return la lista de operaciones.
     */
    public List<Transaction> getOps() {
        return ops;
    }
    /**
     * Establece la lista de operaciones.
     * @param ops la lista de operaciones a establecer.
     */
    public void setOps(List<Transaction> ops) {
        this.ops = ops;
    }
    
}
