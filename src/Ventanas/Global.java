/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import HashTable.Articulo;
import HashTable.Autor;
import HashTable.HashTable;
import HashTable.HashTableAutor;
import HashTable.ListaSimple;
import HashTable.PalabraClave;

/**
 *
 * @author Kevin
 */
public class Global {
    private static HashTable<Articulo> tablaArticulos;
    private static HashTable<Autor> tablaAutores;
    private static HashTable<PalabraClave> tablaPalabrasClave;

    /**
     * @return the tablaArticulos
     */
    public static HashTable<Articulo> getTablaArticulos() {
        return tablaArticulos;
    }

    /**
     * @param aTablaArticulos the tablaArticulos to set
     */
    public static void setTablaArticulos(HashTable<Articulo> aTablaArticulos) {
        tablaArticulos = aTablaArticulos;
    }

    /**
     * @return the tablaAutores
     */
    public static HashTable<Autor> getTablaAutores() {
        return tablaAutores;
    }

    /**
     * @param aTablaAutores the tablaAutores to set
     */
    public static void setTablaAutores(HashTable<Autor> aTablaAutores) {
        tablaAutores = aTablaAutores;
    }

    /**
     * @return the tablaPalabrasClave
     */
    public static HashTable<PalabraClave> getTablaPalabrasClave() {
        return tablaPalabrasClave;
    }

    /**
     * @param aTablaPalabrasClave the tablaPalabrasClave to set
     */
    public static void setTablaPalabrasClave(HashTable<PalabraClave> aTablaPalabrasClave) {
        tablaPalabrasClave = aTablaPalabrasClave;
    }

}
