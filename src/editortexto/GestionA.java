
package editortexto;
import java.io.*;


public class GestionA {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public GestionA(){
        
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




