public class Prueba {
    public static void main(String[] args){
       GestionProductos gestion = new GestionProductos();
        gestion.muestraItem("Pala");
       gestion.quitarStock("Pala",13);
       gestion.muestraItem("Pala");
    }
}
