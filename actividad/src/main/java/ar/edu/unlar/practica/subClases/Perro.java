package ar.edu.unlar.practica.subClases;

import ar.edu.unlar.practica.Animal;

public class Perro extends Animal {

    private String comida_favorita;
    private Float altura;
    
    public Perro(Float peso, String nombre, String raza, String comida_favorita, Float altura) {
        super(peso, nombre, raza);
        this.comida_favorita = comida_favorita;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Perro [comida_favorita=" + comida_favorita + ", altura=" + altura + ", peso=" + peso + ", nombre=" + nombre + ", raza=" + raza + "]\n";
    }

}
