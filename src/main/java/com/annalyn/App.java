package com.annalyn;

public class App {

    public static void main(String[] args) {
        // --- Probando el metodo canFastAttack ---
        System.out.println("¿Puede Annalyn hacer un ataque rapido si el caballero esta despierto?");
        System.out.println("Resultado: " + AnnalynsInfiltration.canFastAttack(true)); // Esto deberia imprimir:
                                                                                      // Resultado: false
        System.out.println("-------------------------");

        System.out.println("¿Puede Annalyn hacer un ataque rapido si el caballero esta dormido?");
        System.out.println("Resultado: " + AnnalynsInfiltration.canFastAttack(false)); // Esto deberia imprimir:

        System.out.println("\n--- Probando canSpy ---");
        System.out.println("Si están todos despiertos: " + AnnalynsInfiltration.canSpy(true, true, true)); // true
        System.out.println(
                "Si el caballero y el arquero están dormidos: " + AnnalynsInfiltration.canSpy(false, false, true)); // true
        System.out.println("Si están todos dormidos: " + AnnalynsInfiltration.canSpy(false, false, false)); // false

        System.out.println("\n--- Probando canSignalPrisoner ---");
        System.out.println("Si el arquero está dormido y el prisionero despierto: "
                + AnnalynsInfiltration.canSignalPrisoner(false, true)); // true
        System.out.println("Si el aquero está despierto: " + AnnalynsInfiltration.canSignalPrisoner(true, true)); // false

        System.out.println("\n--- Probando canFreePrisoner ---");
        // Con perro
        System.out.println("si está el perro y el arquero dormido: "
                + AnnalynsInfiltration.canFreePrisoner(true, false, true, true)); // true
        System.out.println("Si está el peroo y el arquero despierto: "
                + AnnalynsInfiltration.canFreePrisoner(true, true, true, true)); // false
        // Sin perro
        System.out.println("Sin perro, todos dormidos excepto el prisionero: "
                + AnnalynsInfiltration.canFreePrisoner(false, false, true, false)); // true
        System.out.println(
                "Si no está el perro y están todos despiertos: "
                        + AnnalynsInfiltration.canFreePrisoner(true, true, true, false)); // falses//
        // Resultado:
        // true
    }
}
