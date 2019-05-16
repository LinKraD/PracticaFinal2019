import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicheroUsuarios {
    public void guardaUsuarios(File UsuariosRegistrados) {

    File fichero = new File(String.valueOf(UsuariosRegistrados));
    try(RandomAccessFile raf = new RandomAccessFile(fichero, "rw")){

    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
        System.out.println("ERROR 404");
    }
    catch (IOException e) {
        e.printStackTrace();
        }
    }

}
