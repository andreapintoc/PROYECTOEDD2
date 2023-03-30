 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author Liz
 */
//ESTA CLASE FUE CREADA PARA PODER HACER UNA HASHTABLE EN LA QUE LOS ELEMENTOS QUE TENDRAN LOS INDICES 
//SERAN OBJETOS DE LA CLASE "Articulo"
//LA CLASE CUENTA CON 4 PARAMETROS: 
//"SIZE"(ES EL TAMANO QUE SE LE COLOCARA A LA TABLA), 
//"TABLA"(ES UN ARRAY DE OBJETOS DE TIPO ParametroTabla), 
//"FACTORCARGA"(NOS INDICARA QUE TAN LLENA ESTA LA TABLA PARA PODER AVISAR AL USUARIO CUANDO ES CONVENIENTE AUMENTARLA DE TAMANO), 
//"NUMELEMENTOS"(ES LA CANTIDAD DE INDICES DE LA TABLA QUE ESTAN LLENOS).
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
    
    //ESTA FUNCION RETORNA UN INDICE DISPONIBLE EN LA TABLA PARA UNA CLAVE(TITULO) NO EXISTENTE O TE RETORNA 
    //EL INDICE EN EL QUE ESTA UNA CLAVE(TITULO) YA EXISTENTE. LA FUNCION ESTA PREPARADA PARA COLISIONES. 
    public int hash(String titulo) {
        int i = 0, indiceTabla;
        long valorHash;
        valorHash = this.transformaTitulo(titulo);
        indiceTabla = (int) (valorHash % this.getSize());
        //EL BUCLE SEGUIRA Y GENERARA OTRO INDICE MIENTRAS QUE EL INDICE YA GENERADO SEA DIFERENTE DE NULL Y 
        //LA CLAVE DEL OBJETO QUE ESTA EN ESE INDICE NO SEA IGUAL A LA CADENA QUE ESTAMOS MANDANDO.
        while (tabla[indiceTabla]!= null && !tabla[indiceTabla].getTitulo().equals(titulo)){
            i++;
            indiceTabla = indiceTabla + i*i;
            indiceTabla = indiceTabla % this.getSize(); // considera el array como circular
        }
        return indiceTabla;
    }
    
    //ESTA FUNCION RECIBE UNA CADENA DE TIPO STRING Y CONVIERTE CADA CARACTER A SU VALOR ASCII, Y LO MULTIPLICA
    //POR EL INDICE QUE TIENE EN LA CADENA PARA TENER MENOS PROBABILIDADES DE COLISION.EN EL PROCESO VA SUMANDO 
    //EL VALOR QUE DIO CADA CARACTER Y RETORNA LA SUMA TOTAL.
    long transformaTitulo(String titulo) {

        int valorHash = 0;
        for (int i = 0; i < Math.min(12, titulo.length()); i++) {
            valorHash = valorHash + (int) titulo.charAt(i) * i;
        }
        if (valorHash < 0) {//EN CASO DE QUE DE NEGATIVO SOLO CONVERTIMOS EL VALOR A POSITIVO
            valorHash = -valorHash;
        }
        return valorHash;
    }
    
    //LAS TABLAS DE DISPERSION NOS PERMITEN ACCEDER A LOS ELEMENTOS QUE ESTAN EN LA TABLA MEDIANTE CLAVES(EN ESTE 
    //CASO CADENAS DE TIPO STRING).DADA LA CLAVE(CADENA) ESTA FUNCION RETORNA EL OBJETO QUE ESTA EN EL INDICE QUE 
    //GENERA ESA CLAVE(CADENA).
    public Articulo buscar(String clave) {
        Articulo obj;
        int posicion;
        posicion = this.hash(clave);
        obj = getTabla()[posicion];
        return obj;
    }

    //DADA UNA CLAVE(CADENA DE TIPO STRING) ESTE METODO TE RETORNA TRUE SI EXISTE EN LA TABLA O FALSE 
    //SI NO EXISTE EN LA TABLA.
    public boolean enTabla(String clave) {
        int posicion;
        posicion = this.hash(clave);
        return this.tabla[posicion] != null;
    }

    //DADO UN OBJETO DE TIPO "Articulo". ESTA FUNCION INSERTA EN LA TABLA
    //DE DISPERSION TOMANDO COMO CLAVE EL PARAMETRO 'TITULO' DEL OBJETO ARTICULO. EN CASO DE QUE LA TABLA
    //YA ESTE LLENA O EL OBJETO YA EXISTA NO TE PERMITE INSERTAR. EN CASO DE QUE LA TABLA ESTE LLENA AL %60 
    //SE ENVIA UNA ALERTA INDICANDO QUE ES CONVENIENTE AUMENTAR SU LIMITE.
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
                if (factorCarga > 0.6){
                    JOptionPane.showMessageDialog(null, "Factor de carga supera el 60%.!! Conviene aumentar el tamaño de la tabla.Por favor, comunicate con los encargados para aumentar su limite");
                }
            }
        }
    }
    
    //DADA UNA CLAVE ESTE METODO ELIMINA DE LA TABLA SU CONTENIDO.SIN EMBARGO,NO LO USAMOS EN EL PROYECTO.
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