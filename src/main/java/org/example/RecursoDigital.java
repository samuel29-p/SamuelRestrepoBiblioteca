package org.example;

public class RecursoDigital extends Recurso{

    private String url;

    public RecursoDigital(int id, String titulo, int anoPublicacion, boolean disponibilidad, String url){
        super(id, titulo, anoPublicacion, disponibilidad);
        this.url = url;
    }

    public void consultarEnSala(){
        System.out.println("Recurso digital: " + titulo + " con id: " + id + " Publicado en: "
         + anoPublicacion + " Estado actual: "  + disponibilidad + " url: " + url);
    }

    @Override
    protected void reportarUso(){
        System.out.println("Recurso digitla funciona distinto a Recursos fisicos.");
    }

}
