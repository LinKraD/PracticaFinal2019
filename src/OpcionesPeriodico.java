import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OpcionesPeriodico{
    static List<String> lista=new ArrayList<>();

    public static String muestraTodos() {
        return lista.stream().map(Objects::toString).collect(Collectors.joining("\n"));
    }

    public static void leeDeFichero(File nombreFichero) {
        try {
            lista= Files.readAllLines(nombreFichero.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardaEnFichero(File nombreFichero) {
        try (PrintWriter out = new PrintWriter(nombreFichero)) {
            out.print(lista.stream().map(Objects::toString).collect(Collectors.joining("\n")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}