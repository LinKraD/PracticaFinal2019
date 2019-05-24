import java.io.*;

public class FicheroUsuarios {

    public static void anyadirUsuarioFichero(String s,Usuario u) {
        try(RandomAccessFile raf=new RandomAccessFile("usu","rw")){
            raf.writeUTF(s);
            raf.writeUTF(u.datos());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean buscarUsuario(String s){
        try {
            final BufferedReader reader = new BufferedReader(new FileReader("usu"));
            String line = "";
            while((line = reader.readLine())!= null){
                if(line.indexOf(s)!= -1){
                    return true;
                }
            }reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}