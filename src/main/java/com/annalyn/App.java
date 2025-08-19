package com.annalyn;

public class App {

    public static void main(String[] args) {
        // --- Probando el metodo canFastAttack ---
        System.out.println("¿Puede Annalyn hacer un ataque rapido si el caballero esta despierto?");
        System.out.println("Resultado: " + AnnalynsInfiltration.canFastAttack(true)); // Esto deberia imprimir: Resultado: false
        
        System.out.println("-------------------------");

        System.out.println("¿Puede Annalyn hacer un ataque rapido si el caballero esta dormido?");
        System.out.println("Resultado: " + AnnalynsInfiltration.canFastAttack(false)); // Esto deberia imprimir: Resultado: true
    }
}
