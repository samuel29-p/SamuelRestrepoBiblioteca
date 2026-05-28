package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class GestorRecursos {
    private HashSet<Recurso> recursos; //para evitar duplicados aunque no garantice orden
    private String tipo;

    public GestorRecursos(String tipo){
        this.tipo = tipo;
        this.recursos = new HashSet<>();
    }

    public void agregarRecurso(Recurso recurso) throws RecursoNoPrestable, RecursoInexistente{
        if(recurso == null){throw new RecursoInexistente("Error, recurso inexistente(null). ");}
        if(recurso.disponibilidad == false){throw new RecursoNoPrestable("Error, recurso no disponible para su prestamo.");}
        //la excepcion recurso no prestable maneja el caso de que ya esta prestado o de que simplemente su año no lo permite prestar.
        recursos.add(recurso);
    }
    public void removerRecurso(Recurso recurso) throws RecursoInexistente{
        if(recurso == null){throw new RecursoInexistente("Error, intento de remover recurso null");}
        if(!recursos.contains(recurso)){throw new IllegalArgumentException("Intento de remover un recurso que no esta.");}
        recursos.remove(recurso);
    }

    public HashSet<Recurso> getRecursos() {
        return recursos;
    }


}



