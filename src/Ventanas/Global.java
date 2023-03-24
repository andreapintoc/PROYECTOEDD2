/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import HashTable.HashTable;
import HashTable.HashTableAutor;
import HashTable.ListaSimple;

/**
 *
 * @author Kevin
 */
public class Global {
    private static HashTable tablaArticulos;
    private static HashTableAutor tablaAutores;

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
    public static HashTableAutor getTablaAutores() {
        return tablaAutores;
    }

    /**
     * @param aTablaAutores the tablaAutores to set
     */
    public static void setTablaAutores(HashTableAutor aTablaAutores) {
        tablaAutores = aTablaAutores;
    }
    
    
    
}
