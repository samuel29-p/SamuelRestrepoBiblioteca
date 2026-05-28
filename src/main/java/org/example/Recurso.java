package org.example;

import java.util.Objects;

public abstract class Recurso {
    protected int id;
    protected String titulo;
    protected int anoPublicacion;
    protected boolean disponibilidad;

    public Recurso(int id, String titulo, int anoPublicacion, boolean disponibilidad){
        this.id = id;
        this.titulo = titulo;
        if(anoPublicacion < 1923) {throw new RecursoNoPrestable("Recurso no disponible para su prestamo");}
        this.anoPublicacion = anoPublicacion;
        this.disponibilidad = disponibilidad;
    }

    protected abstract void reportarUso();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Recurso recurso = (Recurso) o;
        return id == recurso.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", disponibilidad=" + disponibilidad +
                '}';
    }

    public int getId() {
        return id;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

}
