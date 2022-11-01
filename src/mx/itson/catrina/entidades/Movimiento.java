/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import mx.itson.catrina.enumeradores.TipoMovimiento;

/**
 * Aqui se inicializan todas las variables del Array tipo Movimiento
 * @author shiri
 */
public class Movimiento implements Comparable<Movimiento> {
    
    private Date fecha;
    private String descripcion;
    private float cantidad;
    private TipoMovimiento tipo;
    private String fechaOperacion;
    private String descripcionOperacion;
    private float deposito;
    private float retiro;
    private float subtotal;

    public String getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(String fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getDescripcionOperacion() {
        return descripcionOperacion;
    }

    public void setDescripcionOperacion(String descripcionOperacion) {
        this.descripcionOperacion = descripcionOperacion;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public float getRetiro() {
        return retiro;
    }

    public void setRetiro(float retiro) {
        this.retiro = retiro;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public TipoMovimiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimiento tipo) {
        this.tipo = tipo;
    }

    @Override
    /**
     * Sirve para hacer las comparaciones necesarias para acomodar el ArrayList
     */
    public int compareTo(Movimiento o) {
        
        DateFormat formato3 = new SimpleDateFormat("dd/MM/yyyy");
         
        String a = formato3.format(this.getFecha());
        String b = formato3.format(o.getFecha());
        return a.compareTo(b);
        
    }
    
}
