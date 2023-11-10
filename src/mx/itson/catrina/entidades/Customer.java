/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import com.google.gson.annotations.SerializedName;

/**
 * Representa un cliente y su información básica.
 * 
 * @author José Manuel Leyva Munguía
 * @version v1.0
 */
public class Customer {
    
    private String id;
    private String name;
    private String address;
    private String city;
    private String rfc;
    @SerializedName("zip_code")
    private String zipCode;
    
    /**
     * Obtiene el identificador único del cliente.
     * @return El identificador único del cliente.
     */
    public String getId() {
        return id;
    }
    /**
     * Establece el identificador único del cliente.
     * @param id El identificador único del cliente.
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Obtiene el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getName() {
        return name;
    }
    /**
     * Establece el nombre del cliente.
     * @param name El nombre del cliente.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Obtiene la dirección del cliente.
     * @return La dirección del cliente.
     */
    public String getAddress() {
        return address;
    }
    /**
     * Establece la dirección del cliente.
     * @param address La dirección del cliente.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Obtiene la ciudad del cliente.
     * @return La ciudad del cliente.
     */
    public String getCity() {
        return city;
    }
    /**
     * Establece la ciudad del cliente.
     * @param city La ciudad del cliente.
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * Obtiene el Registro Federal de Contribuyentes (RFC) del cliente.
     * @return El RFC del cliente.
     */
    public String getRfc() {
        return rfc;
    }
    /**
     * Establece el Registro Federal de Contribuyentes (RFC) del cliente.
     * @param rfc El RFC del cliente.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    /**
     * Obtiene el código postal del cliente.
     * @return El código postal del cliente.
     */
    public String getZipCode() {
        return zipCode;
    }
    /**
     * Establece el código postal del cliente.
     * @param zipCode El código postal del cliente.
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
}
