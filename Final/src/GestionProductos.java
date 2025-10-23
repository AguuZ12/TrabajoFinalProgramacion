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
    public void crearItem(String getItem, int stock, double precio){
        Item itemEncontrado = itemExiste(getItem);
        if (itemEncontrado == null){
            listaItems.add(new Item(getItem,stock,precio));
            System.out.println("Item agregado correctamente");
        }
        else {
            System.out.println("El item ya existe, desea agregar stock?");
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
    public void muestraItem(String getItem){
        Item itemEncontrado = itemExiste(getItem);
        if (itemEncontrado != null){
            System.out.println("<========= INVENTARIO =========>");
            System.out.printf("%-10s %-10s %s %n", "Producto", "Stock", "Precio");
            System.out.printf("%-10s %-10s %s%n", itemEncontrado.getNombre(), itemEncontrado.getStock(), itemEncontrado.getPrecio());
        }
        else {
            System.out.println("El item ingreasdo no existe, desea crearlo?");
        }
    }

    // FUNCION AGREGADO DE STOCK
    // ESTA FUNCION PERMITE EL INGRESO DE STOCK EN CASO DE QUE EL ITEM EXISTA Y LA SUMA A AGREGAR NO SEA INFERIOR MENOR A 1
    public void agregarStock(String getItem, int nuevoStock){
        Item itemEncontrado = itemExiste(getItem);
        if (itemEncontrado != null){
            if (nuevoStock > 0){
                itemEncontrado.setStock(itemEncontrado.getStock() + nuevoStock);
            }
        }
        else {
            System.out.println("Item no encontrado");
        }
    }

    // FUNCION RESTA STOCK
    // ESTA FUNCION PERMITE REDUCIR EL STOCK EN CASO DE QUE EL ITEM EXISTA Y SU STOCK NO SEA INFERIOR A LA CANTIDAD QUE SE DESEA RESTAR
    public void quitarStock(String getItem, int cantidadVenta){
        Item itemEncontrado = itemExiste(getItem);
        if (itemEncontrado != null){
            if (cantidadVenta <= itemEncontrado.getStock()){
                itemEncontrado.setStock(itemEncontrado.getStock() - cantidadVenta);
            }
            else if (cantidadVenta > itemEncontrado.getStock()){
                System.out.println("Stock insuficiente para realizar esta accion");
            }
        }
        else {
            System.out.println("El item no existe");
        }
    }
}








