import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OpcionesPeriodico{
    static List<String> lista=new ArrayList<>();

    public static String muestraTodos(File nombreFichero) {
        String salida="";
        int contador=0;
        try {
            List<String> lineas=Files.readAllLines(Paths.get(nombreFichero.toString()));
            for (String s:
                 lineas) {
                String[] datos=s.split(",");
                for (String dato:
                     datos) {
                    salida+=dato;
                    if (contador!=3){
                        salida+=",";
                        contador++;
                    }
                    else {
                        salida+="\n";
                        contador=0;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return salida;
    }


    public static void guardaEnFichero(File nombreFichero,Periodicos p) {

        File nombre=new File(String.valueOf(nombreFichero));


        try(PrintWriter pw=new PrintWriter(new FileWriter(nombre,true))){
            pw.println(p.info());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}