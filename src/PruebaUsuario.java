public class PruebaUsuario{
    public static void main(String[] args) {
        PanelUsuario panelUsuario=new PanelUsuario();
        panelUsuario.mostrar();
        String nuevo=panelUsuario.getUsuario();
        System.out.println(nuevo);
    }
}