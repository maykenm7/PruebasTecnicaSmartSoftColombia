package com.smarsoft;

import com.smarsoft.paymentcalculator.PaymentCalculator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class PaymentCalculatorApplication {

    public static void main(String[] args) {
        List<Integer> debts = new ArrayList<>();
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        try {
            Scanner reader = new Scanner(System.in);
            int numero = 0;
            System.out.println("Introduce números. El cero para salir");

            //Read debts
            do {
                numero = reader.nextInt();
                if(numero>0) {
                    debts.add(numero);
                }else if(numero<0){
                    System.out.println("La deudas tienen que ser números positivos");
                }
            } while (numero!=0);

            //Close Scanner
            reader.close();
        }catch(Exception e) {
            System.out.println("¡Ha ocurrido un error!" + e.getMessage());
        }

        List<Integer> daysToPayDebts = paymentCalculator.calculateDaysToPayDebts(debts);

        System.out.println("Entrada(Deudas): " + debts);
        System.out.println("Salida(días por deudas): " + daysToPayDebts);

    }

}
