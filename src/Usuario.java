public class Usuario {
    private String codigo;
    private final String nombre;
    private final String apellidos;
    private final String correo;
    private final String fechaNac;

    public Usuario(String nombre, String apellidos, String correo, String fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.fechaNac = fechaNac;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String datos(){
        String salida="";

        salida+=nombre+","+apellidos+","+correo+","+fechaNac;

        return salida;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                '}';
    }

    public String info() {
        String salida="";

        salida+="Nombre completo: "+nombre+" "+apellidos+"\n";
        salida+="Codigo de usuario: "+codigo+"\n";
        salida+="Correo electronico: "+correo+"\n";
        salida+="Fecha de nacimiento "+fechaNac;

        return salida;
    }

}
