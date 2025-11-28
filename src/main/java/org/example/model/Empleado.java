package org.example.model;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String puesto;
    private String tipoJornada;
    private String email;
    private int telefono;
    private String fechaContratacion;
    private double salarioHora;
    private boolean activo;

    public Empleado (int idEmpleado, String nombre, String puesto, String tipoJornada, String email, int telefono, String fechaContratacion, double salarioHora, boolean activo ) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.tipoJornada = tipoJornada;
        this.email = email;
        this.telefono = telefono;
        this.fechaContratacion = fechaContratacion;
        this.salarioHora = salarioHora;
        this.activo = activo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", tipoJornada='" + tipoJornada + '\'' +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                ", fechaContratacion='" + fechaContratacion + '\'' +
                ", salarioHora=" + salarioHora +
                ", activo=" + activo +
                '}';
    }
}
