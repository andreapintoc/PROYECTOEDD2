/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;

/**
 *
 * @author Kevin
 */
public class Autor {
    private String name;
    private ListaSimple articulos;

    public Autor(String name) {
        this.name = name;
        this.articulos = new ListaSimple();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the articulos
     */
    public ListaSimple getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(ListaSimple articulos) {
        this.articulos = articulos;
    }
    
    
}
