/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Kevin
 */
//ESTA CLASE TIENE UN PARAMETRO LLAMADO "NAME" QUE VA A FUNCIONAR COMO LA CLAVE
//QUE SE TRANSFORMARA EN LA CLASE "HashTableParametroTabla" Y NOS INDICARA UN 
//INDICE PARA LA TABLA.ESTA CLASE TAMBIEN TIENE UNA LISTASIMPLE QUE TENDRA 
//OBJETOS DE TIPO ARTICULO.LA CLASE FUE CREADA PARA HACER UNA HASHTABLE DE AUTORES 
//Y UNA DE PALABRASCLAVE. PARA ASI PODER BUSCAR AUTORES Y PALABRAS CLAVE CON UNA 
//COMPLEJIDAD LO MAS CERCANA A O(1).
public class ParametroTabla {
    private String name;
    private ListaSimple articulos;
    
    //PARA INICIALIZAR ESTA CLASE DEBEMOS PASARLE LA CLAVE(EN CASO DE QUE SEA UN AUTOR SERA EL NOMBRE 
    //Y EN CASO DE QUE SEA UNA PALABRACLAVE SERA LA PALABRA). LOS ARTICULOS SE IRAN ANADIENDO LUEGO.
    public ParametroTabla(String name) {
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
