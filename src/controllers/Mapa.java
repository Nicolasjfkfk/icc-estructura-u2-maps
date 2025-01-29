package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
    }

    public void HashMap() {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("HashMap: " + mapa);

        // ContainsKey
        System.out.println("Hay pera: " + mapa.containsKey("Pera"));
        System.out.println("Hay Kiwi: " + mapa.containsKey("Kiwi"));

        // Obtener valor
        System.out.println("Valor de pera: " + mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");
        System.out.println("HashMap después de eliminar: " + mapa);
    }

    public void LinkedHashMap() {
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("LinkedHashMap: " + mapa);

        // ContainsKey
        System.out.println("Hay pera: " + mapa.containsKey("Pera"));
        System.out.println("Hay Kiwi: " + mapa.containsKey("Kiwi"));

        // Obtener valor
        System.out.println("Valor de pera: " + mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");
        System.out.println("LinkedHashMap después de eliminar: " + mapa);
    }

    public void TreeMap() {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("TreeMap: " + mapa);

        // ContainsKey
        System.out.println("Hay pera: " + mapa.containsKey("Pera"));
        System.out.println("Hay Kiwi: " + mapa.containsKey("Kiwi"));

        // Obtener valor
        System.out.println("Valor de pera: " + mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");
        System.out.println("TreeMap después de eliminar: " + mapa);
    }
}
