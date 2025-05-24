package modelos;

public class Cliente {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        setNombre(nombre);
        setEmail(email);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email invalido: debe conotener '@'");
        }
    }
}
