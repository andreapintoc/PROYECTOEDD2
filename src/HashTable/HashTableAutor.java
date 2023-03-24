/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;

import javax.swing.JOptionPane;

/**
 *
 * @author Liz
 */
public class HashTableAutor {
    private int size;
    private Autor[] tabla;

    public HashTableAutor(int size) {
        this.size = size;
        this.tabla = new Autor[size];
        for (int i = 0; i < size; i++) {
            tabla[i] = null;
        }
    }
    
    public int hash(String titulo) {
        int indiceTabla;
        long valorHash;
        valorHash = this.transformaTitulo(titulo);
        indiceTabla = (int) (valorHash % this.getSize());
        return indiceTabla;
    }

    long transformaTitulo(String titulo) {

        int valorHash = 0;
        for (int i = 0; i < Math.min(12, titulo.length()); i++) {
            valorHash = valorHash + (int) titulo.charAt(i) * i;
        }
        if (valorHash < 0) {
            valorHash = -valorHash;
        }
        return valorHash;
    }
    
    public Autor buscar(String clave) {
        Autor art;
        int posicion;
        posicion = this.hash(clave);
        art = getTabla()[posicion];
        return art;
    }

    public boolean enTabla(String clave) {
        int posicion;
        posicion = this.hash(clave);
        if (getTabla()[posicion] != null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertar(Autor autor,Articulo articulo) {
        int posicion;
        if (this.enTabla(autor.getName())) {
            autor.getArticulos().insertBegin(articulo);
        } else {
            autor.getArticulos().insertBegin(articulo);
            posicion = this.hash(autor.getName());
            this.getTabla()[posicion] = autor;
        }
    }

    public void eliminar(String titulo) {
        int posicion = this.hash(titulo);
        getTabla()[posicion] = null;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the tabla
     */
    public Autor[] getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(Autor[] tabla) {
        this.tabla = tabla;
    }
    
    
    
    
}