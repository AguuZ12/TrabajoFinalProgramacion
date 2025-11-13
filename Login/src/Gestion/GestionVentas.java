/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Aspire 3
 */
public class GestionVentas {
     List<Venta> listaVentas = new ArrayList<>(Arrays.asList(
            new Venta(1, 12500.75, "13/11/2025"),   
            new Venta(2, 8450.50, "13/11/2025"),  
            new Venta(3, 15620.25, "13/11/2025"),   
            new Venta(4, 9200.00, "12/11/2025"),   
            new Venta(5, 7340.80, "11/11/2025"),  
            new Venta(6, 11200.40, "10/11/2025"),   
            new Venta(7, 6850.30, "08/11/2025"),   
            new Venta(8, 14900.90, "06/11/2025"),   
            new Venta(9, 5200.60, "03/11/2025"),    
            new Venta(10, 18300.20, "29/10/2025")  
    ));
     
      public Venta ventaExiste(int getVenta){
          for (Venta venta : listaVentas){
              if (venta.getIdVenta() == getVenta){
                  return venta;
              }
          }
          return null;
      }
      
      public List<Venta> muestraCompletaVentas() {
        return new ArrayList<>(listaVentas); 
    }
      
     public boolean insertarVenta(int getVenta, double totalVenta, String fechaActual){
         if (ventaExiste(getVenta) == null){
             listaVentas.add(new Venta(getVenta, totalVenta,fechaActual));
             System.out.println("Venta nro " + getVenta +" Total: " + totalVenta + " Fecha " + fechaActual);
             return true;
         }
         return false;
     }
     
    public int getLargoLista(){
        return listaVentas.size() + 1;
    }
}
