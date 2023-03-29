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
    private double factorCarga;
    private int numElementos;

    public HashTable(int size) {
        this.size = size;
        this.tabla = (Articulo[]) new Articulo[size];
        for (int i = 0; i < size; i++) {
            tabla[i] = null;
        }
        numElementos = 0;
        factorCarga = 0.0;
    }
    
    public int hash(String titulo) {
        int i = 0, indiceTabla;
        long valorHash;
        valorHash = this.transformaTitulo(titulo);
        indiceTabla = (int) (valorHash % this.getSize());
        while (tabla[indiceTabla]!= null && !tabla[indiceTabla].getTitulo().equals(titulo)){
            i++;
            indiceTabla = indiceTabla + i*i;
            indiceTabla = indiceTabla % this.getSize(); // considera el array como circular
        }
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
        Articulo obj;
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

    public void insertar(Articulo objeto) {
        if(this.numElementos == this.getSize()){
            JOptionPane.showMessageDialog(null, "El articulo no pudo ser agregado\nLa tabla alcanzo el numero limite de elementos.Por favor, comunicate con los encargados para aumentar su limite");
        }else{
            int posicion;
            if (this.enTabla(objeto.getTitulo())) {
                JOptionPane.showMessageDialog(null, "El objeto a insertar ya existe");
            } else {
                posicion = this.hash(objeto.getTitulo());
                this.tabla[posicion] = objeto;
                numElementos++;
                factorCarga = (double)(numElementos)/this.getSize();
                if (factorCarga > 0.5){
                    JOptionPane.showMessageDialog(null, "Factor de carga supera el 50%.!! Conviene aumentar el tamaño de la tabla.");
                }
            }
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