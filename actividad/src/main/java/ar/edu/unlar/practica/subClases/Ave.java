package ar.edu.unlar.practica.subClases;

import ar.edu.unlar.practica.Animal;

public class Ave extends Animal {

    protected String color_plumas;

    public Ave(Float peso, String nombre, String raza, String color_plumas) {
        super(peso, nombre, raza);
        this.color_plumas = color_plumas;
    }

    @Override
    public String toString() {
        return "Ave [color de plumas=" + color_plumas + ", peso=" + peso + ", nombre=" + nombre + ", raza=" + raza + "]\n";
    }

}
