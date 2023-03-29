/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import HashTable.Articulo;
import HashTable.HashTable;
import HashTable.ParametroTabla;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Liz
 */
public class Lector {
    
    public String readTxt(String path) {
        String line;
        String txt = "";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.trim().isEmpty()) {
                        txt += line + "\n";
                    }
                }
            }
            return txt;
        } catch (Exception err) {
            return txt;
        }
    }
        
    public String openTxt() {
        String aux = "";
        String txt = "";
        try {
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            File abrir = file.getSelectedFile();
            if (abrir != null) {
                FileReader fr = new FileReader(abrir);
                BufferedReader br = new BufferedReader(fr);
                while ((aux = br.readLine()) != null) {
                    if (!aux.trim().isEmpty()) {
                        txt += aux + "\n";
                    }
                }
                br.close();
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }
        return txt;
    }
    
        public void writeTxt(String txt) {
        // escribe en "todo" el contenido del archivo cargado por el usuario
        String texto = this.readTxt("test\\todo.txt");
        try {
            PrintWriter pw = new PrintWriter("test\\todo.txt");
            pw.write(texto);
            pw.append(txt);
            pw.append("##");
            pw.close();
            JOptionPane.showMessageDialog(null, "Articulo añadido con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
        public void loadFiles(String txt) {

        String[] t = null;
        try {
            if (txt.contains("##")) {
                String[] a = txt.split("##");
                for (int i = 0; i < a.length; i++) {
                    this.cargar(a[i]);
                }
            } else {
                if (this.cargar(txt)) {
                     this.writeTxt(txt);
                }
               
            }
        } catch (Exception e) {

        }
    }
    
    public boolean cargar(String txt) {

        txt = txt.replace("Palabras Claves: ", "Palabras claves: ");
        String[] split1 = txt.split("Autores");
        
        String[] split3 = txt.split("Palabras claves: ");
        String titulo = split1[0].trim();

        String[] split2 = split3[0].split("Resumen");
        String [] split5 = split2[0].split("Autores");
        String[] autores = split5[1].trim().split("\\r?\\n");
        String[] claves = split3[1].trim().replace(".", "").split(", ");
        String resumen = split2[1].trim();
        
        if (Global.getTablaArticulos().buscar(titulo) == null) {
            Articulo art = new Articulo(titulo, autores, resumen, claves);
            Global.getTablaArticulos().insertar(art);
            Global.getListaTitulos().insertOrdered(titulo);
            
            for (int i = 0; i < autores.length; i++) {
                if (Global.getTablaAutores().buscar(autores[i]) == null) {
                    ParametroTabla autor = new ParametroTabla(autores[i]);
                    Global.getTablaAutores().insertar(autor, art);
                }else{
                    ParametroTabla autorB = Global.getTablaAutores().buscar(autores[i]);
                    Global.getTablaAutores().insertar(autorB, art);
                }
                
            }
            
            for (int i = 0; i < claves.length; i++) {
                
                if (Global.getTablaPalabrasClave().buscar(claves[i]) == null) {
                    ParametroTabla palabrasC = new ParametroTabla(claves[i]);
                    Global.getTablaPalabrasClave().insertar(palabrasC, art);
                }else{
                    ParametroTabla palabraClaveB = Global.getTablaAutores().buscar(claves[i]);
                    Global.getTablaAutores().insertar(palabraClaveB, art);
                }
            }           
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Articulo ya existente");
            return false;
        }
    }
}

    
    //

