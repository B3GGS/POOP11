/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author poo08alu14
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Se instancia el archivo.
        System.out.println("### FILE ###");
        File archivo = new File("archivo.txt");
        System.out.println("Existe: "+archivo.exists());
        
        //Comprueba si el archivo existe, caso contrario procede a crearlo.
        if (!archivo.exists()){
            try {
                boolean seCreo = archivo.createNewFile();
                System.out.println("Se creo un archivo: "+seCreo);
                System.out.println("Existe: "+archivo.exists());
            } catch (IOException ex) {
                System.out.println("ex.getMessage()");
            }
        }
        
        //Write then Read
        
        System.out.println("\n### FILE WRITER ###");
        //Escritura de Datos.- Teclado -> Buffer
        
        //Abrir el buffer para procesar los datos.
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba el texto: ");
            String texto = br.readLine();
            System.out.println("Texto = " + texto);
            
        //Buffer -> Archivo    
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter imprimirArchivo = new PrintWriter(bw);
            imprimirArchivo.println(texto);
            imprimirArchivo.close();
        
        //Lectura del Archivo
            System.out.println("\n### FILE READER ###");
            FileReader fr = new FileReader("archivo.txt");
            br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            
        //Detecta o delimita caracteres que separan cadenas.
            System.out.println("\n### String Tokenizer###");
            String alumno = "Claudio Melo,Flores,Garcia,423041231,21,9.1";
            System.out.println("Cadena = " + alumno);
            StringTokenizer token = new StringTokenizer(alumno,",");
            while(token.hasMoreTokens()){
                System.out.println(token.nextToken());
            }
           
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
         
    } 
    
}
