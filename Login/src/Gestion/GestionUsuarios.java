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
public class GestionUsuarios {
    List<Usuario> listaUsuarios = new ArrayList<>(Arrays.asList(
            new Usuario("Agustin", "Agustin"),
            new Usuario("Gaston", "Gaston"),
            new Usuario("Emiliano", "Emiliano"),
            new Usuario("JuanPablo", "Juan-Pablo"),
            new Usuario("admin", "admin")
    ));
//Funcion comprobacion de existencia de usuaio
    public Usuario usuarioExiste(String appEmail){
        for (Usuario usuario : listaUsuarios){
            if (usuario.getEmail().equalsIgnoreCase(appEmail)){
                return usuario;
            }
        }
        return null;
    }

//    public void muestraUsuario(String getEmail){
//        if (usuarioExiste(getEmail) != null){
//            System.out.println(usuarioExiste(getEmail).getEmail());
//        }
//        else {
//            System.out.println("El usuario no existe");
//        }
//    }

    public boolean registroUsuario(String appEmail, String appPassword, String appPassword2){
        if(appEmail == null || appEmail.isBlank()){
            System.out.println("El correo no puede estar vacio");
            return false;
        }
        if(appPassword == null || appPassword.isBlank()){
            System.out.println("La contraseña no puede estar vacia");
            return false;
        }
        if(appPassword2 == null || appPassword2.isBlank()){
            System.out.println("La contraseña no puede estar vacia");
            return false;
        }
        if (usuarioExiste(appEmail) == null && appPassword.equals(appPassword2)){
            listaUsuarios.add(new Usuario(appEmail,appPassword));
            System.out.println("Usuario registrado exitosamente");
            return true;
        }
        else {
            System.out.println("El usuario ingresado ya existe");
            return false;
        }
    }

  public boolean inicioSesion(String appEmail, String appPassword){
    if (appEmail == null || appEmail.isBlank()){
        System.out.println("El correo no puede estar vacio");
        return false;
    }
    if (appPassword == null || appPassword.isBlank()){
        System.out.println("La contraseña no puede estar vacia");
        return false;
    }
    
    //Verifica la existencia del usuario
    Usuario usuario = usuarioExiste(appEmail);
    
    if (usuario == null) {
        System.out.println("El usuario no existe");
        return false;
    }
    
    // Luego verificar la contraseña
    if (usuario.getPassword().equals(appPassword)) {
        System.out.println("Sesion Iniciada");
        return true;
    } else {
        System.out.println("Contraseña incorrecta");
        return false;
    }
}}
