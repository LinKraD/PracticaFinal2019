public class PruebaLector {
    public static void main(String[] args) {
        Lector lector=new Lector();
        lector.bloquea();
        String leido=lector.getLectura();
        System.out.println(leido);
    }
}
