package ar.edu.unlar.practica;

public abstract class Animal {
    
    protected String nombre;
    protected String raza;
    protected Float peso;
    
    public Animal(Float peso, String nombre, String raza) {
        this.peso = peso;
        this.nombre = nombre;
        this.raza = raza;
    }

}
