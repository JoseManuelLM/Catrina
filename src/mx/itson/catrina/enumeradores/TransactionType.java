/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.catrina.enumeradores;

import com.google.gson.annotations.SerializedName;

/**
 * Define los tipos de transacciones posibles, que pueden ser DEPÓSITO o RETIRO.
 * Cada tipo de transacción tiene un valor asociado que se utiliza para la serialización/deserialización con Gson.
 * 
 * @author José Manuel Leyva Munguía
 * @version v1.0
 */
public enum TransactionType {
    
    @SerializedName("1")
    DEPÓSITO,
    
    @SerializedName("2")
    RETIRO
    
}
