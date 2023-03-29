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
//ESTA CLASE FUE CREADA PARA PODER HACER UNA HASHTABLE EN LA QUE LOS ELEMENTOS QUE TENDRAN LOS INDICES 
//SERAN OBJETOS DE LA CLASE "ParametroTabla"(QUE SERAN AUTORES O PALABRASCLAVE CON SUS RESPECTIVOS ARTICULOS).
//LA CLASE CUENTA CON 4 PARAMETROS: 
//"SIZE"(ES EL TAMANO QUE SE LE COLOCARA A LA TABLA), 
//"TABLA"(ES UN ARRAY DE OBJETOS DE TIPO ParametroTabla), 
//"FACTORCARGA"(NOS INDICARA QUE TAN LLENA ESTA LA TABLA PARA PODER AVISAR AL USUARIO CUANDO ES CONVENIENTE AUMENTARLA DE TAMANO), 
//"NUMELEMENTOS"(ES LA CANTIDAD DE INDICES DE LA TABLA QUE ESTAN LLENOS).
public class HashTableParametroTabla {
    private int size;
    private ParametroTabla[] tabla;
    private double factorCarga;
    private int numElementos;

    //PARA INICIALIZAR LA TABLA SOLO DEBEMOS PASARLE EL TAMANO
    public HashTableParametroTabla(int size) {
        this.size = size;
        this.tabla = new ParametroTabla[size];
        for (int i = 0; i < size; i++) {//RECORREMOS TODOS LOS INDICES DE LA TABLA Y LOS IGUALAMOS A NULL
            tabla[i] = null;
        }
        numElementos = 0;
        factorCarga = 0.0;
    }
    
    //ESTA FUNCION RETORNA UN INDICE DISPONIBLE EN LA TABLA PARA UNA CADENA NO EXISTENTE O TE RETORNA 
    //EL INDICE EN EL QUE ESTA UNA CADENA YA EXISTENTE. LA FUNCION ESTA PREPARADA PARA COLISIONES. 
    public int hash(String cadena) {
        int i = 0,indiceTabla;
        long valorHash;
        valorHash = this.transformaCadena(cadena);
        indiceTabla = (int) (valorHash % this.getSize());
        //EL BUCLE SEGUIRA Y GENERARA OTRO INDICE MIENTRAS QUE EL INDICE YA GENERADO SEA DIFERENTE DE NULL Y 
        //LA CLAVE DEL OBJETO QUE ESTA EN ESE INDICE NO SEA IGUAL A LA CADENA QUE ESTAMOS MANDANDO.
        while (tabla[indiceTabla]!= null && !tabla[indiceTabla].getName().equals(cadena)){
            i++;
            indiceTabla = indiceTabla + i*i;
            indiceTabla = indiceTabla % this.getSize(); // considera el array como circular
        }
        return indiceTabla;
    }

    //ESTA FUNCION RECIBE UNA CADENA DE TIPO STRING Y CONVIERTE CADA CARACTER A SU VALOR ASCII, Y LO MULTIPLICA
    //POR EL INDICE QUE TIENE EN LA CADENA PARA TENER MENOS PROBABILIDADES DE COLISION.EN EL PROCESO VA SUMANDO 
    //EL VALOR QUE DIO CADA CARACTER Y RETORNA LA SUMA TOTAL.
    long transformaCadena(String cadena) {
        long valorHash;
        valorHash = 0;
        for (int i = 0; i < Math.min(12, cadena.length()); i++) {
            valorHash = valorHash + (int) cadena.charAt(i) * i;
        }
        if (valorHash < 0) {//EN CASO DE QUE DE NEGATIVO SOLO CONVERTIMOS EL VALOR A POSITIVO
            valorHash = -valorHash;
        }
        return valorHash;
    }
    
    //LAS TABLAS DE DISPERSION NOS PERMITEN ACCEDER A LOS ELEMENTOS QUE ESTAN EN LA TABLA MEDIANTE CLAVES(EN ESTE 
    //CASO CADENAS DE TIPO STRING).DADA LA CLAVE(CADENA) ESTA FUNCION RETORNA EL OBJETO QUE ESTA EN EL INDICE QUE 
    //GENERA ESA CLAVE(CADENA).
    public ParametroTabla buscar(String clave) {
        ParametroTabla objeto;
        int posicion;
        posicion = this.hash(clave);
        objeto = getTabla()[posicion];
        return objeto;
    }
    
    //DADA UNA CLAVE(CADENA DE TIPO STRING) ESTE METODO TE RETORNA TRUE SI EXISTE EN LA TABLA O FALSE 
    //SI NO EXISTE EN LA TABLA.
    public boolean enTabla(String clave) {
        int posicion;
        posicion = this.hash(clave);
        if (getTabla()[posicion] != null) {
            return true;
        } else {
            return false;
        }
    }

    //DADO UN OBJETO DE TIPO "ParametroTabla" Y UNO DE TIPO "Articulo" ESTA FUNCION INSERTA EN LA TABLA
    //DE DISPERSION TOMANDO COMO CLAVE EL PARAMETRO 'NAME' DEL OBJETO ParametroTabla. EN CASO DE QUE LA TABLA
    //YA ESTE LLENA NO TE PERMITE INSERTAR. EN CASO DE QUE LA TABLA ESTE LLENA AL %60 SE ENVIA UNA ALERTA 
    //INDICANDO QUE ES CONVENIENTE AUMENTAR SU LIMITE.
    public void insertar(ParametroTabla parametroTabla,Articulo articulo) {
        if(this.numElementos == this.getSize()){
            JOptionPane.showMessageDialog(null, "La palabra clave o el autor no pudo ser agregado en su respectiva tabla\nLa tabla alcanzo el numero limite de elementos.Por favor, comunicate con los encargados para aumentar su limite");
        }else{
            int posicion;
            parametroTabla.getArticulos().insertBegin(articulo);//PRIMERO INSERTAMOS EL ARTICULO EN LA LISTA 
            posicion = this.hash(parametroTabla.getName());//BUSCAMOS UN INDICE EN LA TABLA
            this.getTabla()[posicion] = parametroTabla;//METEMOS EL OBJETO EN EL INDICE GENERADO
            numElementos++;//AUMENTAMOS EL NUMERO DE ELEMENTOS EN LA TABLA
            factorCarga = (double)(numElementos)/this.getSize();//CALCULAMOS EL FACTORCARGA
            if (factorCarga > 0.6){
                JOptionPane.showMessageDialog(null, "Factor de carga supera el 60%.!! Conviene aumentar el tamaño de la tabla.Por favor, comunicate con los encargados para aumentar su limite");
            }
        }
    }
    
    //DADA UNA CLAVE ESTE METODO ELIMINA DE LA TABLA SU CONTENIDO.SIN EMBARGO,NO LO USAMOS EN EL PROYECTO.
    public void eliminar(String clave) {
        int posicion = this.hash(clave);
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