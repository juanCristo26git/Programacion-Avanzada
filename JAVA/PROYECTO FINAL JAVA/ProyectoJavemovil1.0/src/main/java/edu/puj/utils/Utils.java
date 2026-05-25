package edu.puj.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static long CONSECUTIVO = 0;

    public static LocalDate convertirStringFecha(String fechaStr) {
        try {
            return LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (Exception e) {
            return null;
        }
    }

    public static String convertirFechaString(LocalDate fecha) {
        return fecha != null ? fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) : "";
    }
}
