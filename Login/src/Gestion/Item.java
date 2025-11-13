/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

/**
 *
 * @author Agust
 */
public class Item{
    private String nombre;
    private String codigo;
    private int stock;
    private double precioCompra;
    private double precioVenta;

    public Item(String nombre, String codigo, int stock, double precioCompra, double precioVenta){
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getCodigo(){
        return codigo;
    }

    public int getStock(){
        return stock;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
    
     public double getPrecioCompra() {
        return precioCompra;
    }

    public void setStock(int nuevoStock){
        this.stock =  nuevoStock;
    }

    public void setPrecioVenta(double nuevoPrecioVenta){
        this.precioVenta = nuevoPrecioVenta;
    }
    
    public void setPrecioCompra(double nuevoPrecioCompra){
        this.precioCompra = nuevoPrecioCompra;
    }

}