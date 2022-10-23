/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.util.List;


/**
 * Aqui se inicializan todas las variables necesarias para el funcionamiento del programa
 * @author shiri
 */
public class Cuenta {
    
    private String producto;
    private String cuenta;
    private String clabe;
    private String moneda;
    private Cliente cliente;
    private List<Movimiento> movimientos;
    private List<Movimiento> movimientosOp;
    
    /**
     * Sirve para transformar un archivo json a objetos de java
     * @param json es el archivo json transformado a binario
     * @return el archivo ya transformado a objetos de java
     */
    public Cuenta deserializar(String json){
        
        Cuenta deserializado = new Cuenta();
        
        try{
            
            deserializado = new Gson().fromJson(json, Cuenta.class);
            
        }catch(Exception ex){
            
            System.err.print("Ocurrió un error: " + ex.getMessage());
            
        }
        
        return deserializado;
        
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public List<Movimiento> getMovimientosOp() {
        return movimientosOp;
    }

    public void setMovimientosOp(List<Movimiento> movimientosOp) {
        this.movimientosOp = movimientosOp;
    }
    
}
