import java.io.*;
import java.util.stream.Collectors;

public class FicheroUsuarios {


    public static void anyadirUsuarioFichero(String s,Usuario u) {
        File usu=new File("usu");
        File nuevo=new File(s);
        try(PrintWriter pw=new PrintWriter(usu)){
            pw.println(s+","+u.datos());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try(PrintWriter pw2=new PrintWriter(s)) {
        } catch (FileNotFoundException e) {
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