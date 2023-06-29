package Model;

public class UsuarioVo 
{
    // Declare attributes as they are in the database
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String tipoDoc;
    private String numDoc;
    private String password;    
    private boolean estado;
    // Constructors methods
    
    // Empty
    public UsuarioVo(){};
    public UsuarioVo(int id, String nombre, String apellido, String correo, String tipoDoc, String numDoc,
            String password, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.password = password;
        this.estado = estado;

    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getNumDoc() {
        return numDoc;
    }
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }



}
