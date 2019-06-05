import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OpcionesPeriodico{
    static List<String> lista=new ArrayList<>();

    public static String muestraTodos() {
        String salida="";
        int contador=0;

        for (String s: lista) {
            salida+=s;
            if (contador%2==0){
                salida+=",";
            }
            else {
                salida+="\n";
            }
            contador++;
        }

        return salida;
    }

    public void leeDeFichero(File nombreFichero) {


    }

    public static void guardaEnFichero(File nombreFichero,Periodicos p) {

        try(PrintWriter pw=new PrintWriter(new FileWriter(nombreFichero,true))){
            pw.println(p.info());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(PrintWriter pw2=new PrintWriter(p.info())) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}