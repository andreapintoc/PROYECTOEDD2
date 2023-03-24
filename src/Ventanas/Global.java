/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import HashTable.Articulo;
import HashTable.Autor;
import HashTable.HashTable;
import HashTable.HashTableParametroTabla;
import HashTable.ListaSimple;
import HashTable.PalabraClave;
import HashTable.ParametroTabla;

/**
 *
 * @author Kevin
 */
public class Global {
    private static HashTable<Articulo> tablaArticulos;
    private static HashTableParametroTabla tablaAutores;
    private static HashTableParametroTabla tablaPalabrasClave;

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

}
