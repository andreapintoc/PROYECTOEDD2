/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author Andrea
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashTable tabla = new HashTable(2);
        String titulo = "marcos";
        String[] autores = {"Liz", "Yo"};
        String resumen = "Hola";
        String[] palabrasClave = {"Ciencia", "Musica"};
        Articulo art = new Articulo(titulo, autores, resumen, palabrasClave);
        tabla.insertar(art);
        String titulo1 = "socram";
        String[] autores1 = {"kevin", "tu"};
        String resumen1 = "Hosjsjsjsjsjla";
        String[] palabrasClave1 = {"jdjd", "Mdddddd"};
        Articulo art1 = new Articulo(titulo1, autores1, resumen1, palabrasClave1);
        tabla.insertar(art1);
        Articulo arti = tabla.buscar("marcos");
        System.out.println(arti.getAutores()[0]);
        System.out.println(arti.getAutores()[1]);
        Articulo arti1 = tabla.buscar("socram");
        System.out.println(arti1.getAutores()[0]);
        System.out.println(arti1.getAutores()[1]);
    }
    
}
