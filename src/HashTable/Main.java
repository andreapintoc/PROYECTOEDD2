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
        HashTable<Articulo> tabla = new HashTable(40);
        String titulo = "Hola";
        String[] autores = {"Liz", "Yo"};
        String resumen = "Hola";
        String[] palabrasClave = {"Ciencia", "Musica"};
        Articulo art = new Articulo(titulo, autores, resumen, palabrasClave);
        tabla.insertar(art, art.getTitulo());
        Articulo arti = tabla.buscar(titulo);
        System.out.println(arti.getAutores()[0]);
        System.out.println(arti.getAutores()[1]);
    }
    
}
