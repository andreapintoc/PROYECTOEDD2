/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;

import java.util.Objects;

/**
 *
 * @author Liz
 */
public class Articulo {
    private String Titulo;
    private String [] Autores;
    private String Resumen;
    private String [] PalabrasClave;

    public Articulo(String Titulo, String[] Autores, String Resumen, String[] PalabrasClave) {
        this.Titulo = Titulo;
        this.Autores = Autores;
        this.Resumen = Resumen;
        this.PalabrasClave = PalabrasClave;
    }
 
    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Autores
     */
    public String[] getAutores() {
        return Autores;
    }

    /**
     * @param Autores the Autores to set
     */
    public void setAutores(String[] Autores) {
        this.Autores = Autores;
    }

    /**
     * @return the Resumen
     */
    public String getResumen() {
        return Resumen;
    }

    /**
     * @param Resumen the Resumen to set
     */
    public void setResumen(String Resumen) {
        this.Resumen = Resumen;
    }

    /**
     * @return the PalabrasClave
     */
    public String[] getPalabrasClave() {
        return PalabrasClave;
    }

    /**
     * @param PalabrasClave the PalabrasClave to set
     */
    public void setPalabrasClave(String[] PalabrasClave) {
        this.PalabrasClave = PalabrasClave;
    }
    

    //ESTE METODO MUESTRA LOS DETALLES DE UN ARTICULO
    //NOTA:DADO 2 INDICES EL METODO SUBSTRING TE DEVUELVE LOS CARACTERES QUE HAY ENTRE EL INTERVALO QUE FORMAN EN EL STRING
    //LO USAMOS PARA QUE EL RESUMEN TENGA SALTOS DE LINEA Y SE VEA MEJOR EN PANTALLA

    public String MostrarResumen(){
        String txt = "                                    "+this.getTitulo()+"                   "+"\n"+"\n"+"\n";
        txt += "Autores"+"\n";
        for (int i = 0; i < this.Autores.length; i++) {//RECORRE EL ARRAY DE AUTORES Y ANADE CADA UNO AL STRING
            txt +=this.Autores[i]+"\n";
        }
        txt += "\nResumen\n"+this.Resumen.substring(0,this.Resumen.length()/4)+"\n"+ this.Resumen.substring(this.Resumen.length() / 4, this.Resumen.length()/2)+"\n"+ this.Resumen.substring(this.Resumen.length() / 2, (int)(this.Resumen.length() / 1.33))+"\n"+ this.Resumen.substring((int)(this.Resumen.length() / 1.33),this.Resumen.length())+"\n"+"\n";
        txt += "Palabras Claves: ";
        for (int i = 0; i < this.PalabrasClave.length; i++) {//RECORRE EL ARRAY DE PALABRASCLAVE Y ANADE CADA UNO AL STRING
            if(this.PalabrasClave[i] == this.PalabrasClave[0]){
                txt += this.PalabrasClave[i];
            }else{
                txt += ","+this.PalabrasClave[i];
            }
        }
        return txt;
    }
    
     /**
     * @return el contador de las palabras claves del articulo
     */
    public int contarPalabrasClave(String palabra) {
        String r = this.Resumen.toLowerCase();
        String[] resumen = r.split(palabra.toLowerCase());
        int contador = resumen.length;
        return contador -1;
    } 
    
}
