package org.example;

public class Libro extends Recurso implements RecursosFisicos{

    private String autor;
    private String ISBN;

    public  Libro (int id, String titulo, int anoPublicacion, boolean disponibilidad, String autor, String ISBN){
        super(id, titulo, anoPublicacion, disponibilidad);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    @Override
    public void prestarRecurso(){
        System.out.println("Libro prestado: " + titulo + autor + anoPublicacion);
    }
    @Override
    public void devolverRecurso(){
        System.out.println("Libro devuelto: " + titulo + autor + anoPublicacion);
    }
    @Override
    protected void reportarUso(){
        System.out.println("Libro es el recurso fisico principal de la biblioteca.");
    }

}
