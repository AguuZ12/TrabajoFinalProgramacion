/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import ProgramaVentas.InterfazInicial;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Aspire 3
 */
public class Fecha{
    private final LocalDate fechaActual;
    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Fecha() {
        this.fechaActual = LocalDate.now();
    }

    // Devuelve la fecha actual formateada (ej: "12/11/2025")
    public String getFechaActual() {
        return fechaActual.format(formato);
    }

    // Método auxiliar por si querés comparar fechas
    public boolean esHoy(LocalDate fecha) {
        return fecha.equals(LocalDate.now());
    }

    // Podés usar este método como base para tus cálculos de ganancias diarias
    public String obtenerEtiquetaDia() {
        return "Ganancias del día " + getFechaActual();
    }
    
 }

