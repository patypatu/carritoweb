package modelo;

public class Empleado {
    int id;
    String rut;
    String nombres;
    String telefono;
    String estado;
    String user;
    String password;

    public Empleado() {
    }

    public Empleado(int id, String rut, String nom, String tel, String estado, String user, String pass) {
        this.id = id;
        this.rut = rut;
        this.nombres = nom;
        this.telefono = tel;
        this.estado = estado;
        this.user = user;
        this.password = pass;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nom) {
        this.nombres = nom;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String tel) {
        this.telefono = tel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
}
