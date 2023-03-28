/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
                    if (!line.isEmpty()) {
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
                    txt += aux + "\n";
                }
                br.close();
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }
        return txt;
    }
    
    //
}
