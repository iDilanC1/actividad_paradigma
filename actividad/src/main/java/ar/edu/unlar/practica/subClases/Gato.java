package ar.edu.unlar.practica.subClases;

import ar.edu.unlar.practica.Animal;

public class Gato extends Animal{

    protected String color_pelo;
    protected String juguete_favorito;

    public Gato(Float peso, String nombre, String raza, String color_pelo, String juguete_favorito) {
        super(peso, nombre, raza);
        this.color_pelo = color_pelo;
        this.juguete_favorito = juguete_favorito;
    }

    @Override
    public String toString() {
        return "Gato [color del pelo=" + color_pelo + ", juguete favorito=" + juguete_favorito + ", peso=" + peso + ", nombre=" + nombre + ", raza=" + raza + "]\n";
    }

}
