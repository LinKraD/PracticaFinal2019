public class PruebaUsuario{
    public static void main(String[] args) {
        DialogoUsuario dialogoUsuario=new DialogoUsuario();
        dialogoUsuario.mostrar();
        Usuario nuevo=dialogoUsuario.getUsuario();
        dialogoUsuario.creaUsuario();
        System.out.println(nuevo);
    }
}