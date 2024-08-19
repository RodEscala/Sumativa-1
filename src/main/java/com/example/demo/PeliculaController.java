package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PeliculaController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public  PeliculaController(){
        // Inicializar lista
        peliculas.add(new Pelicula(1, "Civil War", 2024, "Aaron Sorkin", "Drama, Histórico", "Un relato intenso sobre los eventos que llevaron a la guerra civil en Estados Unidos, explorando las tensiones sociales y políticas de la época."));
        peliculas.add(new Pelicula(2, "Dune Parte Dos", 2024, "Denis Villeneuve", "Ciencia ficción, Aventura", "Continuación de la épica adaptación de la novela de Frank Herbert, donde Paul Atreides se une a las fuerzas de la resistencia para luchar contra el imperio opresor y cumplir su destino."));
        peliculas.add(new Pelicula(3,"Deadpool y Wolverine",2024,"Shawn Levy","Acción, Comedia","  Deadpool se une a Wolverine en una aventura llena de acción y humor, enfrentándose a nuevos villanos mientras exploran su complicada relación."));
        peliculas.add(new Pelicula(4,"Furiosa", 2024, "George Mille", "Acción, Aventura", "Una precuela de Mad Max: Fury Road que sigue la historia de Furiosa, una guerrera que lucha por sobrevivir en un mundo post-apocalíptico."));
        peliculas.add(new Pelicula(4, "Gladiator II", 2024, "Ridley Scott", "Drama, Acción", "Secuela del aclamado Gladiador, que sigue la historia de Lucius, el hijo de Lucilla, mientras navega por la política y la traición en Roma."));
    }

    @GetMapping("/peliculas")
    public List<Pelicula> getPelicula() {

        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id){
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getId() == id){
                return pelicula;
            }
        }
        // En caso de que el resultado no se encuentre
        return null;
    }
    
}
