import java.io.*;

public class FicheroUsuarios {

    public static void anyadirUsuarioFichero(String s,Usuario u) {
        try(RandomAccessFile raf=new RandomAccessFile(s,"rw")){
            raf.writeUTF(s);
            raf.writeUTF(u.datos());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}