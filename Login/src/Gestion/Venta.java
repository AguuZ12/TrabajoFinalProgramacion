/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
/**
 *
 * @author Aspire 3
 */
public class Venta {
    private int idVenta;
    private double totalVenta;
    private String fechaActual;
    
    
    public Venta(int idVenta, double totalVenta, String fechaActual){
        this.idVenta = idVenta;
        this.totalVenta = totalVenta;
        this.fechaActual = fechaActual;
    }
    
    public int getIdVenta(){
        return idVenta;
    }
    
    public double gettotalVenta(){
        return totalVenta;
    }
    
    public String fechaActual(){
        return fechaActual;
    }
}
