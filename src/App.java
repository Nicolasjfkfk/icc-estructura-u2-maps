import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empCtrl = new EmpleadoContoller();
        boolean result = empCtrl.addEmpleado(new Empleado(1, "Pablo", "senior"));
        System.out.println("ingreso: "+ result);
         result = empCtrl.addEmpleado(new Empleado(2, "Pedro", "senior"));
        System.out.println("ingreso: "+ result);
        result = empCtrl.addEmpleado(new Empleado(3, "Juan", "senior"));
        System.out.println("ingreso: "+ result);

        // Buscar el empleado por id
        Empleado empleado = empCtrl.getEmpleadoById(1);
        System.out.println("Empleado encomtrado: " + empleado);

        //Mostar todos los empleado
        System.out.println("Lista de empleados");
        empCtrl.displayEmpleados();

        // Mostrar solo las llaves (IDs)
        System.out.println("Llaves (IDs) de empleados:");
        empCtrl.displayLlaves();

        // Mostrar empleados sin usar entrySet
       System.out.println("Empleados sin usar entrySet:");
       empCtrl.displayEmpleado();

    }

    private static void runMapExample() {
        Mapa mapa = new Mapa();

        System.out.println("\n HashMap Example");
        mapa.HashMap();

        System.out.println("\n LinkedHashMap Example");
        mapa.LinkedHashMap();

        System.out.println("\n TreeMap Example");
        mapa.TreeMap();
    }

    private static void runEjerccios() {

    }
}
