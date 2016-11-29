import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// esto sirve para buscar archivos en la cmoputadora...
public class Main {

    public static void main(String[] args) {
	// El uso de Buffer file reader
        String nombreArchivo = "temp.txt";
        String linea = null;

        try{
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            while((linea = br.readLine()) != null){
                 System.out.println(linea);
            }
            br.close();
        }catch (FileNotFoundException ex){
            System.out.println("No se encontro archivo");
        }catch (IOException ex){
            System.out.println("Error leyendo archivo");
        }

    }
}
