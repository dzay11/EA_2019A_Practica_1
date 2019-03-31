/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2.Templates;

/**
 *
 * @author xam-lx
 */
public class Producto {
    public String nombre;
    public float precio;
    public String peso;
    public String volumen;

    public Producto(String nombre, float precio, String peso, String volumen) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.volumen = volumen;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }
}
