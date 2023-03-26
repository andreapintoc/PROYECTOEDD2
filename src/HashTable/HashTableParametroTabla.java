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
public class HashTableParametroTabla {
    private int size;
    private ParametroTabla[] tabla;
    private double factorCarga;
    private int numElementos;

    public HashTableParametroTabla(int size) {
        this.size = size;
        this.tabla = new ParametroTabla[size];
        for (int i = 0; i < size; i++) {
            tabla[i] = null;
        }
        numElementos = 0;
        factorCarga = 0.0;
    }
    
    public int hash(String cadena) {
        int i = 0,indiceTabla;
        long valorHash;
        valorHash = this.transformaCadena(cadena);
        indiceTabla = (int) (valorHash % this.getSize());
        while (tabla[indiceTabla]!= null && !tabla[indiceTabla].getName().equals(cadena)){
            i++;
            indiceTabla = indiceTabla + i*i;
            indiceTabla = indiceTabla % this.getSize(); // considera el array como circular
        }
        return indiceTabla;
    }

    long transformaCadena(String cadena) {
        long valorHash;
        valorHash = 0;
        for (int i = 0; i < Math.min(12, cadena.length()); i++) {
            valorHash = valorHash + (int) cadena.charAt(i) * i;
        }
        if (valorHash < 0) {
            valorHash = -valorHash;
        }
        return valorHash;
    }
    
    public ParametroTabla buscar(String clave) {
        ParametroTabla art;
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

    public void insertar(ParametroTabla parametroTabla,Articulo articulo) {
        if(this.numElementos == this.getSize()){
            JOptionPane.showMessageDialog(null, "La palabra clave o el autor no pudo ser agregado en su respectiva tabla\nLa tabla alcanzo el numero limite de elementos.Por favor, comunicate con los encargados para aumentar su limite");
        }else{
            int posicion;
            parametroTabla.getArticulos().insertBegin(articulo);
            posicion = this.hash(parametroTabla.getName());
            this.getTabla()[posicion] = parametroTabla;
            numElementos++;
            factorCarga = (double)(numElementos)/this.getSize();
            if (factorCarga > 0.5){
                JOptionPane.showMessageDialog(null, "Factor de carga supera el 50%.!! Conviene aumentar el tamaño de la tabla.");
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
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the tabla
     */
    public ParametroTabla[] getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(ParametroTabla[] tabla) {
        this.tabla = tabla;
    }
    
    
    
    
}