package controllers;

import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!frequencyMap.containsKey(c)) {
                return false;
            }
            frequencyMap.put(c, frequencyMap.get(c) - 1);
            if (frequencyMap.get(c) == 0) {
                frequencyMap.remove(c);
            }
        }
        return frequencyMap.isEmpty();
    }
    

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complemento = objetivo - nums[i];
        if (map.containsKey(complemento)) {
            return new int[] { map.get(complemento), i };
        }
        map.put(nums[i], i);
    }
    return null;
}
}
