public class Usuario {
    private final String nombre;
    private final String apellidos;
    private final String correo;
    private final String fechaNac;
    private String fechaHora;

    public Usuario(String nombre, String apellidos, String correo, String fechaNac, String feYHo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.fechaHora=feYHo;
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

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String datos(){
        String salida="";

        salida+=nombre+","+apellidos+","+correo+","+fechaNac +","+fechaHora;

        return salida;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", fechaHora='" + fechaHora + '\'' +
                '}';
    }

    public String info() {
        String salida="";

        salida+="Nombre completo: "+nombre+" "+apellidos+"\n";
        salida+="Correo electronico: "+correo+"\n";
        salida+="Fecha de nacimiento "+fechaNac+"\n";
        salida+="Fecha y hora de creación "+fechaHora;

        return salida;
    }

}
