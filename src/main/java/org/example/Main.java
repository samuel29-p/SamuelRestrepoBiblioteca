package org.example;

public class Main {
    public static void main(String[] args) {

        Libro SenorDeLosAnillos = new Libro(1, "El señor de los anillos", 2010, true, "Pepe", "I231HSKAS");
        Libro LaNaranjaMecanica = new Libro(21, "La Naranja Mecanica", 1975, true, "Stanley Kubrick", "J12H38123");
        Revista NewYorkTimes = new Revista(120, "New York Times", 2024, false, 201, "NYT");
        Revista Moda = new Revista(712, "Nueva Moda", 2020, false, 41, "Moda y Belleza");
        RecursoDigital CienciaTec = new RecursoDigital(891, "Ciencia y Tecnologia", 2015, true, "HTTPS://JALSDASJF");
        RecursoDigital Cinefilos = new RecursoDigital(128, "Cinefilos y mas", 2022, true, "HTTPS://J129310JS");

        SenorDeLosAnillos.prestarRecurso();
        SenorDeLosAnillos.devolverRecurso();
        LaNaranjaMecanica.prestarRecurso();
        LaNaranjaMecanica.devolverRecurso();
        NewYorkTimes.prestarRecurso();
        NewYorkTimes.devolverRecurso();
        Moda.prestarRecurso();
        Moda.devolverRecurso();
        CienciaTec.consultarEnSala();
        Cinefilos.consultarEnSala();
        SenorDeLosAnillos.reportarUso();
        NewYorkTimes.reportarUso();
        CienciaTec.reportarUso();





        }
}

