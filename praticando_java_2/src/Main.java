package src;
import java.util.*;

import src.classes.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        System.out.println("Cadastrar produto? (1 -1 SIM ou 2 - NÃO)");
        a = sc.nextLine();

        FinalOutPut finalOutPut = new FinalOutPut();

        while (a.equalsIgnoreCase("1")) {
            finalOutPut.createProduct(sc);
            finalOutPut.displayOutPut();

            System.out.println("\nDeseja continuar?");
            a = sc.nextLine();

        }

        
        

    }
}
