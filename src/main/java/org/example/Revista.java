package org.example;

public class Revista extends Recurso implements RecursosFisicos{
    private int numeroEdicion;
    private String editorial;

    public Revista(int id, String titulo, int anoPublicacion, boolean disponibilidad, int numeroEdicion, String editorial){
        super(id, titulo, anoPublicacion, disponibilidad);
        this.numeroEdicion = numeroEdicion;
        this.editorial = editorial;
    }

    @Override
    public void prestarRecurso(){
        System.out.println("Revista en prestamo.");
    }

    @Override
    public void devolverRecurso(){
        System.out.println("Revista devuelta.");
    }
    @Override
    protected void reportarUso(){
        System.out.println("Revista es un tipo de recurso fisico, se parece a libro.");
    }

}
