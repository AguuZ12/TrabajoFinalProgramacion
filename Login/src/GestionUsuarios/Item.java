/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionUsuarios;

/**
 *
 * @author Agust
 */
public class Item{
    private String nombre;
    private int stock;
    private double precio;

    public Item(String nombre, int stock, double precio){
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getStock(){
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setStock(int nuevoStock){
        this.stock =  nuevoStock;
    }

    public void setPrecio(double nuevoPrecio){
        this.precio = nuevoPrecio;
    }

}