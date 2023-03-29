/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import HashTable.Articulo;

import HashTable.HashTable;
import HashTable.HashTableParametroTabla;
import HashTable.ListaSimple;

import HashTable.ParametroTabla;

/**
 *
 * @author Kevin
 */
public class Global {
    private static HashTable tablaArticulos = new HashTable(80);
    private static HashTableParametroTabla tablaAutores = new HashTableParametroTabla(150);
    private static HashTableParametroTabla tablaPalabrasClave = new HashTableParametroTabla(150);
    private static ListaSimple<String> listaTitulos = new ListaSimple();

    /**
     * @return the tablaArticulos
     */
    public static HashTable getTablaArticulos() {
        return tablaArticulos;
    }

    /**
     * @param aTablaArticulos the tablaArticulos to set
     */
    public static void setTablaArticulos(HashTable aTablaArticulos) {
        tablaArticulos = aTablaArticulos;
    }

    /**
     * @return the tablaAutores
     */
    public static HashTableParametroTabla getTablaAutores() {
        return tablaAutores;
    }

    /**
     * @param aTablaAutores the tablaAutores to set
     */
    public static void setTablaAutores(HashTableParametroTabla aTablaAutores) {
        tablaAutores = aTablaAutores;
    }

    /**
     * @return the tablaPalabrasClave
     */
    public static HashTableParametroTabla getTablaPalabrasClave() {
        return tablaPalabrasClave;
    }

    /**
     * @param aTablaPalabrasClave the tablaPalabrasClave to set
     */
    public static void setTablaPalabrasClave(HashTableParametroTabla aTablaPalabrasClave) {
        tablaPalabrasClave = aTablaPalabrasClave;
    }

    /**
     * @return the listaTitulos
     */
    public static ListaSimple<String> getListaTitulos() {
        return listaTitulos;
    }

    /**
     * @param aListaTitulos the listaTitulos to set
     */
    public static void setListaTitulos(ListaSimple<String> aListaTitulos) {
        listaTitulos = aListaTitulos;
    }

    
    

}
