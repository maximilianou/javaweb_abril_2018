/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import entidades.Checke;
import entidades.Proveedor;
import java.util.*;

/**
 * <pre>
 * Metodologias Agiles: TDD
 *   Aqui hago un ejemplo con TDD de la forma
 *   menos comprometida con otras librerias.
 *
 * </pre>
 *
 * @author educacion
 */
public class TestListas {

    /**
     * Metodo de Testing de Listas. Entry Point java.util.Collection
     * java.util.Collections List Set Queue Stack ArrayList TreeSet
     *
     *
     */
    public static void main(String[] args) {
        System.out.println("[..] TestListas");

//        ArrayList listita = null;
//        List listita = new ArrayList();
//        List listita = new LinkedList();
//        List listita = new List();
        Proveedor juli = new Proveedor();
        Proveedor bry = new Proveedor();
        Proveedor caro = new Proveedor();
        juli.setCuit("20-40404004-7");
        juli.setDomicilio("Hispano Domiciliado Extraditado");
        bry.setCuit("20-35001202-5");
        bry.setDomicilio("Floresta Jonte 2000");
        caro.setCuit("27-39993229-5");
        caro.setDomicilio("Moreno 222 333 444");

//        ArrayList listita = new ArrayList();
//        ArrayList<Proveedor> listita = new ArrayList();
        ArrayList<Proveedor> listita = new ArrayList();
        listita.add(juli);
        System.out.println("" + listita);
        listita.add(bry);
        System.out.println("" + listita);
        listita.add(caro);
        System.out.println("" + listita);
        listita.add(juli);
        System.out.println("" + listita);

//        Checke pagoAbril = new Checke();
//        listita.add( pagoAbril );
        System.out.println("" + listita);
        System.out.println("Cuantos hay? : " + listita.size());
        
        TreeSet<Proveedor> conjunto = new TreeSet();
        conjunto.addAll(listita);
        System.out.println("" + conjunto);
        System.out.println("Cuantos hay Distintos? : " + conjunto.size());

        
        
        System.out.println("[OK] TestListas");
    }

}






