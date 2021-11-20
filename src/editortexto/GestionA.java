/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editortexto;
import java.io.*;

/**
 *
 * @author FAMILIA_TOBAR
 */
public class GestionA {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public GestionA(){
        
    }
public String AbrirTexto(File Archivo){
    String contenido = "";
    try {
        entrada = new FileInputStream(Archivo);
        int ascci;
        while((ascci = entrada.read()) !=1) {
        char caracter = (char)ascci;
        contenido += caracter; 
        }
    } catch (Exception e) {   
    }
    return contenido;
}

public String GuardarTexto(File archivo, String contenido){
String respuesta = null;
try{
    salida = new FileOutputStream (archivo);
byte[] bytesTxt = contenido.getBytes();
salida.write(bytesTxt);
respuesta = "Se guardo con exito el archivo";
}catch (Exception e){
    
}
return respuesta;
}
}




