import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionProductos {
    List<Item> listaItems = new ArrayList<>(Arrays.asList(
            new Item("Pelota",15,1500),
            new Item("Pala",13,6000),
            new Item("Gato",16,100000)
    ));

   // FUNCION EXISTE
   // ESTA FUNCION RECORRE LA LISTA COMPLETA COMPARANDO CADA ITEM CON EL NOMBRE DEL ITEM INGRESADO POR EL USUARIO, EN CASO DE EXISTIR UN ITEM CON ESE NOMBRE DEVUELVE LA ENTIDAD, EN CASO DE NO EXISTIR DEVUELVE NULL
    public Item itemExiste(String getItem){
        for (Item item : listaItems){
            if (item.getNombre().equalsIgnoreCase(getItem)){
                return item;
            }
        }
        return null;
    }

    // FUNCION CREACION ITEM
    // ESTA FUNCION EN CASO DE NO EXISTIR UN ITEM PERMITE LA CREACION DEL MISMO
    public boolean crearItem(String appItem, int stock, double precio){
        if (appItem == null || appItem.isBlank()){
            System.out.println("El nombre del item no puede estar vacio");
            return false;
        }
        if (stock <= 0){
            System.out.println("El nombre del item no puede estar vacio");
            return false;
        }
        if (precio <= 0){
            System.out.println("El nombre del item no puede estar vacio");
            return false;
        }
        if (itemExiste(appItem) == null){
            listaItems.add(new Item(appItem,stock,precio));
            System.out.println("Item agregado correctamente");
            return true;
        }
        else {
            System.out.println("El item ya existe, desea agregar stock?");
            return false;
        }
    }

    //FUNCION MUESTRA COMPLETA
    // MUESTRA LA LISTA DE TODOS LOS ITEMS DISPONIBLES CON SU NOMBRE, STOCK Y PRECIO
    public void muestraCompleta(){
        System.out.println("<========= INVENTARIO =========>");
        System.out.printf("%-10s %-10s %s %n", "Producto", "Stock", "Precio");
        for (Item item : listaItems){
            System.out.printf("%-10s %-10s %s%n", item.getNombre(), item.getStock(), item.getPrecio());
        }
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
            System.out.printf("%-10s %-10s %s%n", itemExiste(appItem).getNombre(), itemExiste(appItem).getStock(), itemExiste(appItem).getPrecio());
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








