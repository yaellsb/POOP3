/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;

/**
 *
 * @author yaelb
 */
public class POOP3 {

    /**
     * Método principal que inicializa la ejecución del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("############# arreglo #############");
        int arreglo1 []; // Forma heredada de C
        int[] arreglo2; //Forma recomendada
        int []arreglo3; //Varacion de forma
        
        int[] arreglo4 = {1,2,3,4,5};
        
        System.out.println("############# for #############");
        for (int i = 0 ; i < arreglo4.length; i++) {
            arreglo4[i] = i*10;
        }
        
        System.out.println("############# for-each #############");
        for (int temp : arreglo4) {
            System.out.println(temp);
        }
        
        System.out.println("############# cadenas #############");
        char[] cadena = {'h','o','l','a'};
        for (int i = 0; i < cadena.length; i++) {
            System.out.print(cadena[i]);
        }
        System.out.println("");
        
        String cadena2 = new String("Hola mundo"); //Forma normalizada
        System.out.println(cadena2);
        
        String cadena3 = "Hola mundo";
        System.out.println("cadena3");
        
        String nombre = "Luis";
        String apellido = "Sanchez";
        System.out.println(nombre.length());
        System.out.println(nombre +" "+ apellido);
        
        System.out.println("############# Wrappers #############");
        int a = 25;
        System.out.println(a);
        Integer b = new Integer(10); //Forma normlizada que esta deprecada
        System.out.println("$" + b.floatValue());
        Integer c = 8; //Forma recomendada
        System.out.println(c);
        
        System.out.println("############# Colecciones #############");
        /*
        * Las colecciones son un conjunto de objetos del mismo tipo
        * Son redimensionables
        */
        System.out.println("############# ArrayList #############");
        /*
        * Caracteristicas de una lista
        * Mantiene un orden de insersion
        * Se pueden repetir los elementos
        */
        
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(c);
        miArrayList.add(b);
        miArrayList.add(45);
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        System.out.println("***");
        miArrayList.add(0, -45);
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        System.out.println("***");
        System.out.println(miArrayList.indexOf(-45));
        System.out.println("***");
        miArrayList.add(1,8);
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
        
        System.out.println("############# Hashtable #############");
        /*
        Set
        * No mantiene orden de insersion
        * No permite duplicados
        */
        
        /*
        Map
        * Conjunto de keys y values
        * Combinacion de un set + lista
        */
        
        /* Diccionarios*/
        
        Hashtable<String,Integer> agenda = new Hashtable<String,Integer>();
        agenda.put("Pepe", 556677);
        agenda.put("Ramiro", 446688);
        agenda.put("Marisela", 553311);
        System.out.println(agenda.size());
        for (Integer value : agenda.values()) {
            System.out.println(value);
        }
        for (String llave : agenda.keySet()) {
            System.out.println(llave);
        }
        
        System.out.println("############# Enumeracion #############");
        String llave;
        Integer valor;
        Enumeration<String> enumeracion = agenda.keys();
        while(enumeracion.hasMoreElements()) {
            llave = enumeracion.nextElement();
            valor = agenda.get(llave);
            System.out.println("LLave = "+llave+" valor = "+valor);
        }
        
        System.out.println("############# Math #############");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        
        // REalizar un diccionario con 5 palabras usando hashtable e imprimir todos los elementos
        // Realizar una agenda con 5 registros guardando nombre de la persona y su cumleaños utilizando hashtable y calendar
        System.out.println("############# Ejercicio 1 #############");
        Hashtable<String,Integer> dicci = new Hashtable<String,Integer>();
        dicci.put("Pepe", 556677);
        dicci.put("Ramiro", 446688);
        dicci.put("Marisela", 553311);
        dicci.put("Joaquin", 558714);
        dicci.put("Juan", 569540);
        System.out.println("VALORES");
        for (Integer i : dicci.values()) {
            System.out.println(i);
        }
        System.out.println("LLAVES");
        for (String j : dicci.keySet()) {
            System.out.println(j);
            
        }
        
        System.out.println("############# Ejercicio 2 #############");
        Hashtable<String, Calendar> agenda1 = new Hashtable<>();
        agenda1.put("Pepe", new GregorianCalendar(1995, Calendar.MARCH, 15));
        agenda1.put("Ramiro", new GregorianCalendar(1998, Calendar.JULY, 22));
        agenda1.put("Marisela", new GregorianCalendar(1992, Calendar.NOVEMBER, 8));
        agenda1.put("Joaquin", new GregorianCalendar(2000, Calendar.FEBRUARY, 3));
        agenda1.put("Juan", new GregorianCalendar(1991, Calendar.SEPTEMBER, 30));
        System.out.println("Agenda de Cumpleaños:");
        for (String n : agenda1.keySet()) {
            Calendar fecha = agenda1.get(n);
            System.out.printf("%s: %d/%d/%d\n", n, 
                fecha.get(Calendar.DAY_OF_MONTH), 
                fecha.get(Calendar.MONTH) + 1, 
                fecha.get(Calendar.YEAR));
        }

        
    }
    
}
