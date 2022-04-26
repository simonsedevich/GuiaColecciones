package guiacolecciones.ejercisio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class GuiaColeccionesEjercisio1 {

    public static void main(String[] args) {
        //Se declaran las variables, la lista y el scanner
        Scanner leer = new Scanner(System.in);
        String raza;
        ArrayList<String> razas = new ArrayList();
        int cont = 0;
        String salir = null;
        //Se utiliza un bucle para ir llenando la lista con la raza de perros hasta que el usuario decida salir
        while (cont == 0) {
            System.out.println("Ingrese la raza de su perro");
            raza = leer.next();
            razas.add(raza);
            System.out.println("¿Desea ingresar otra raza? S/N");
            salir = leer.next();
            if ("si".equals(salir)) {
                cont = 0;
            }
            if ("no".equals(salir)) {
                cont++;
            } 

        }
        
        //Se declara un iterator para imprimir y recorrer la lista
        Iterator<String> itera = razas.iterator();

        
        System.out.println("La lista de las razas de perros ingresadas es ");
        while (itera.hasNext()) {
            System.out.println(itera.next() + " ");

        }
        
        //Se pide al usuario que ingrese un perro a eliminar y se utiliza el iterator para eliminarlo
        System.out.println("Ingrese que perro desea eliminar de la lista");
        String eliminar = leer.next();
        while (itera.hasNext()) {
            if (itera.next().equals(eliminar)) {
                itera.remove(); 
            }
        }
        
        //Se imprime la lista final y ordenada alfabeticamente 
        Collections.sort(razas);
        System.out.println("La lista queda con los siguientes perros");
        for (String aux : razas) {
            System.out.println(aux);
        }

    }

}
