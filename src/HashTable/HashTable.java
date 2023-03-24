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
public class HashTable<T> {
    private int size;
    private T[] tabla;

    public HashTable(int size) {
        this.size = size;
        this.tabla = (T[]) new Object[size];
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
    
    public T buscar(String clave) {
        T obj;
        int posicion;
        posicion = this.hash(clave);
        obj = getTabla()[posicion];
        return obj;
    }

    public boolean enTabla(String clave) {
        int posicion;
        posicion = this.hash(clave);
        return this.tabla[posicion] != null;
    }

    public void insertar(T objeto, String name) {
        int posicion;
        if (this.enTabla(name)) {
            JOptionPane.showMessageDialog(null, "El objeto a insertar ya existe");
        } else {
            posicion = this.hash(name);
            this.tabla[posicion] = objeto;
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
     * @param siz77e the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the tabla
     */
    public T[] getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(T[] tabla) {
        this.tabla = tabla;
    }
    
    
    
    
}