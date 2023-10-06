/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author franc
 */


public class Operaciones {
    
    
    public int obtenPrecioArt(Articulo art){
        int precio;
        precio = art.getPrecio();
        
        return precio;
    }
    
    
    public Articulo obtenArticulo(LineaVenta lv){
        Articulo art;
        art = lv.getArt();
    
        return art;
    }
    
    
    public int calculaTotal(ArrayList<LineaVenta> lista){
        int total = 0;
        LineaVenta aux;
        Articulo art;
        
        for (int i = 0 ; i < lista.size(); ++i){
            aux = lista.get(i);
            art = obtenArticulo(aux);
            total += obtenPrecioArt(art);
        }
        
        return total;
    }
    
    
    
    
}
