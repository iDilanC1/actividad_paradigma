package ar.edu.unlar.practica;

import ar.edu.unlar.practica.Animal;
import ar.edu.unlar.practica.subClases.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Veterinaria {
    public static void main( String[] args ){
        
        Scanner entrada = new Scanner(System.in);
        
        Float peso,altura;
        String nombre, raza, juguete_favorito, color_pelo, comida_favorita, color_plumas;
        int opcion;
        ArrayList <Animal> animal = new ArrayList<>();

        do{

            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            System.out.println("Ingrese el animal que recibirá la veterinaria: \n- No ingresar(0)\n- Un perro (1) \n- Un gato (2)\n- Un ave (3)");
            opcion = entrada.nextInt();

            if (opcion == 1){
                System.out.print("\033[H\033[2J");
                System.out.flush(); 
                System.out.println("Ingrese la siguiente información: \n");
                System.out.println("El peso: "); peso = entrada.nextFloat();entrada.nextLine();
                System.out.println("El nombre del perro: "); nombre = entrada.nextLine();
                System.out.println("Raza: "); raza = entrada.nextLine();
                System.out.println("Comida favorita del perro: "); comida_favorita = entrada.nextLine();
                System.out.println("Altura: "); altura = entrada.nextFloat();entrada.nextLine();

                Perro perro = new Perro(peso, nombre, raza, comida_favorita, altura);
                animal.add(perro);
            }

            else if(opcion == 2){
                System.out.print("\033[H\033[2J");
                System.out.flush(); 
                System.out.println("Ingrese la siguiente información: \n");
                System.out.println("El peso: "); peso = entrada.nextFloat();entrada.nextLine();
                System.out.println("El nombre del gato: "); nombre = entrada.nextLine();
                System.out.println("Raza: "); raza = entrada.nextLine();
                System.out.println("Color del pelo: "); color_pelo = entrada.nextLine();
                System.out.println("El juguete favorito: "); juguete_favorito = entrada.nextLine();

                Gato gato = new Gato(peso, nombre, raza, color_pelo, juguete_favorito);
                animal.add(gato);

            }

            else if(opcion == 3){
                System.out.print("\033[H\033[2J");
                System.out.flush(); 
                System.out.println("Ingrese la siguiente información: \n");
                System.out.println("El peso: "); peso = entrada.nextFloat();entrada.nextLine();
                System.out.println("El nombre del ave: "); nombre = entrada.nextLine();
                System.out.println("Raza: "); raza = entrada.nextLine();
                System.out.println("Color de las plumas: "); color_plumas = entrada.nextLine();

                Ave ave = new Ave(peso, nombre, raza, color_plumas);
                animal.add(ave);
            }

        }while(opcion != 0);

        System.out.println(animal.toString());

    }

}
