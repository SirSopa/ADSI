/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author franc
 */
public class LineaVenta {
    
    Articulo art;
    int cantidad;

    public LineaVenta(){
    
    }
    
    public Articulo getArt() {
        return art;
    }

    public void setArt(Articulo art) {
        this.art = art;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LineaVenta(Articulo art, int cantidad) {
        this.art = art;
        this.cantidad = cantidad;
    }
    
    
    
    
}
