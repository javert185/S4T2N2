package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n02.S04T02N02CarapuigMasnouSergi.controllers;

import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t02.n02.S04T02N02CarapuigMasnouSergi.model_domain.Fruita;

import java.util.List;

public interface ControladorGestioFruita {
    Fruita afegirFruita(Fruita fruita);

    Fruita actualitzarFruita(Long id, Fruita fruita);

    void eliminarFruita(Long id);

    Fruita obtenirFruitaPerId(Long id);

    List<Fruita> obtenirTotesLesFruites();
}