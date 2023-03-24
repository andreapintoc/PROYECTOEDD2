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
public class HashTable {
    private int size;
    private Articulo[] tabla;

    public HashTable(int size) {
        this.size = size;
        this.tabla = new Articulo[size];
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
    
    public Articulo buscar(String clave) {
        Articulo art;
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

    public void insertar(Articulo articulo) {
        int posicion;
        if (this.enTabla(articulo.getTitulo())) {
            JOptionPane.showMessageDialog(null, "El Articulo a insertar ya existe");
        } else {
            posicion = this.hash(articulo.getTitulo());
            this.getTabla()[posicion] = articulo;
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
    public Articulo[] getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(Articulo[] tabla) {
        this.tabla = tabla;
    }
    
    
    
    
}