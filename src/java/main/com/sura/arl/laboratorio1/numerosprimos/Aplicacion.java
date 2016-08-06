package com.sura.arl.laboratorio1.numerosprimos;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

    public static void main(String[] args) {
        int desde = 1;
        int hasta = 1000;

        List<Integer> numerosPrimos = new ArrayList<>();

        for (int i = desde; i <= hasta; i++) {
            if (NumeroPrimo.esPrimo(i)) {
                numerosPrimos.add(new Integer(i));
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (numerosPrimos.isEmpty()) {
            System.out.println("No existen n�meros primos en el rango especificado [" + desde + ", " + hasta + "].");
        } else {
            stringBuilder.append("La cantidad de n�meros primos en el rango especificado [").append(desde).append(", ")
                    .append(hasta).append("] son: ").append(numerosPrimos.size()).append(". Dichos n�meros son:\n");
            for (Integer i : numerosPrimos) {
                stringBuilder.append(i.intValue()).append(", ");
            }

            System.out.println(stringBuilder.toString().substring(0, stringBuilder.toString().length() - 2));
        }
    }
}
