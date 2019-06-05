public class Periodicos {
    private final String nombre;
    private Tipo publicacion;
    private Contenido contenido;

    public Periodicos(String nombre, Tipo publicacion, Contenido contenido) {
        this.nombre = nombre;
        this.publicacion = publicacion;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Tipo publicacion) {
        this.publicacion = publicacion;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Periodicos{" +
                "nombre='" + nombre + '\'' +
                ", publicacion='" + publicacion + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }

    public String info(){
        String salida="";

        salida+=nombre+","+publicacion+","+contenido;

        return salida;
    }
}
class Diario extends Periodicos{
    private final Ambitos ambito;

    public Diario(String nombre, Tipo publicacion, Contenido contenido, Ambitos ambito) {
        super(nombre, publicacion, contenido);
        this.ambito = ambito;
    }


    public Ambitos getAmbito() {
        return ambito;
    }

    @Override
    public String info() {
        String salida=super.info();

        salida+=","+ambito;

        return salida;
    }

    @Override
    public String toString() {
        return "Diario{" +super.toString()+
                "ambito=" + ambito +
                '}';
    }
}
class Semanal extends Periodicos{
    private final double precio;

    public Semanal(String nombre, Tipo publicacion, Contenido contenido, double precio) {
        super(nombre, publicacion, contenido);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Semanal{" +super.toString()+
                "precio=" + precio +
                '}';
    }

    public String info() {
        String salida=super.info();

        salida+=","+precio;

        return salida;
    }
}