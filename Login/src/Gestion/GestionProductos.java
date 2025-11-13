/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

/**
 *
 * @author Agust
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionProductos {
    List<Item> listaItems = new ArrayList<>(Arrays.asList(
            new Item("Arroz Blanco", "ALI001", 200, 800.0,  1500.0),
            new Item("Fideos Tallarín", "ALI002", 150, 600.0 , 1200.0),
            new Item("Aceite de Girasol", "ALI003", 80, 2500.0 , 4500.0),
            new Item("Harina 0000", "ALI004", 120, 700.0 , 1300.0),
            new Item("Azúcar Común", "ALI005", 180, 900.0 , 1700.0),
            new Item("Sal Fina", "ALI006", 90, 400.0 , 800.0),
            new Item("Leche Entera", "LAC001", 300, 300.0 , 600.0),
            new Item("Queso Cremón", "LAC002", 60, 3500.0 , 6500.0),
            new Item("Manteca", "LAC003", 75, 1200.0 , 2200.0),
            new Item("Yogur Natural", "LAC004", 200, 250.0 , 500.0)
    ));

   // FUNCION EXISTE
   // ESTA FUNCION RECORRE LA LISTA COMPLETA COMPARANDO CADA ITEM CON EL NOMBRE DEL ITEM INGRESADO POR EL USUARIO, EN CASO DE EXISTIR UN ITEM CON ESE NOMBRE DEVUELVE LA ENTIDAD, EN CASO DE NO EXISTIR DEVUELVE NULL
    public Item itemExiste(String getItem){
        for (Item item : listaItems){
            if (item.getCodigo().equalsIgnoreCase(getItem)){
                return item;
            }
        }
        return null;
    }

    // FUNCION CREACION ITEM
    // ESTA FUNCION EN CASO DE NO EXISTIR UN ITEM PERMITE LA CREACION DEL MISMO
    public boolean crearItem(String appItem, String codigo, int stock, double precioCompra, double precioVenta){
        if (appItem == null || appItem.isBlank()){
            System.out.println("El nombre del item no puede estar vacio");
            return false;
        }
        if (stock <= 0){
            System.out.println("El nombre del item no puede estar vacio");
            return false;
        }
        if (precioVenta <= 0){
            System.out.println("El precio de venta no puede ser 0 o menor");
            return false;
        }
        if (precioCompra <= 0){
            System.out.println("El preco de compra no puede ser 0 o menor");
            return false;
        }
        if (itemExiste(appItem) == null){
            listaItems.add(new Item(appItem,codigo,stock,precioCompra,precioVenta));
            System.out.println("Item agregado correctamente");
            System.out.print(itemExiste(appItem).getNombre()+ itemExiste(appItem).getCodigo() + itemExiste(appItem).getStock() + itemExiste(appItem).getPrecioCompra()+ itemExiste(appItem).getPrecioVenta());
            return true;
        }
        else {
            System.out.println("El item ya existe, desea agregar stock?");
            return false;
        }
    }

    //FUNCION MUESTRA COMPLETA
    // MUESTRA LA LISTA DE TODOS LOS ITEMS DISPONIBLES CON SU NOMBRE, STOCK Y PRECIO
    public List<Item> muestraCompleta() {
        return new ArrayList<>(listaItems); 
    }
   

    // MUESTRA ITEM
    //PERMITE LA BUSQUEDA DE 1 ITEM ESPECIFICO Y MUESTRA SU DESCRIPCION, STOCK Y PRECIO
    public void muestraItem(String appItem){
        if(appItem == null || appItem.isBlank()){
            System.out.println("El item no puede estar vacio");
        }

        if (itemExiste(appItem) != null){
            System.out.println("<========= INVENTARIO =========>");
            System.out.printf("%-10s %-10s %s %n", "Producto", "Stock", "Precio");
            System.out.printf("%-10s %-10s %s%n", itemExiste(appItem).getNombre(),itemExiste(appItem).getCodigo(), itemExiste(appItem).getStock(), itemExiste(appItem).getPrecioCompra(),itemExiste(appItem).getPrecioVenta());
        }
        else {
            System.out.println("El item ingreasdo no existe, desea crearlo?");
        }
    }

    // FUNCION AGREGADO DE STOCK
    // ESTA FUNCION PERMITE EL INGRESO DE STOCK EN CASO DE QUE EL ITEM EXISTA Y LA SUMA A AGREGAR NO SEA INFERIOR MENOR A 1
    public boolean agregarStock(String appItem, int nuevoStock){
        if (appItem == null || appItem.isBlank()){
            System.out.println("El item no puede estar vacio");
            return false;
        }
        if (nuevoStock <= 0){
            System.out.println("El stock a agregar debe ser mayor que 0");
            return false;
        }

        if (itemExiste(appItem) != null){
            itemExiste(appItem).setStock(itemExiste(appItem).getStock() + nuevoStock);
            return true;
        }
        else {
            System.out.println("Item no encontrado");
            return false;
        }
    }

    // FUNCION RESTA STOCK
    // ESTA FUNCION PERMITE REDUCIR EL STOCK EN CASO DE QUE EL ITEM EXISTA Y SU STOCK NO SEA INFERIOR A LA CANTIDAD QUE SE DESEA RESTAR
    public boolean quitarStock(String appItem, int cantidadVenta){
        if (appItem == null || appItem.isBlank()){
            System.out.println("El nombre del item no puede estar vacio");
            return false;
        }
        if (cantidadVenta > itemExiste(appItem).getStock()){
            System.out.println("Stock insuficiente para realizar esta accion");
            return false;
        }
        if (itemExiste(appItem) != null){
            itemExiste(appItem).setStock(itemExiste(appItem).getStock() - cantidadVenta);
            System.out.println("Operacion realizada con exito");
            return true;
        }
        else {
            System.out.println("El item no existe");
            return false;
        }
    }
}