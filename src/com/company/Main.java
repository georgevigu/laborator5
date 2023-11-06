package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti nr angajati:");
        int nrAngajati = myObj.nextInt();
        myObj.nextLine();
        int i;

        ArrayList<Employee> angajati = new ArrayList<Employee>();

        for(i=0; i<nrAngajati; i++) {
            System.out.println("nume angajat " + i);
            String n = myObj.nextLine();
            System.out.println("email angajat " + i);
            String e = myObj.nextLine();
            System.out.println("hourRate angajat " + i);
            double h = myObj.nextDouble();
            System.out.println("capcaity angajat " + i);
            double c = myObj.nextDouble();
            System.out.println("freeDays angajat " + i);
            int f = myObj.nextInt();
            myObj.nextLine();
            Employee angajat = new Employee(n, e, h, c, f);
            angajati.add(angajat);
        }

        for(i=0; i<nrAngajati; i++) {
            Employee angajat = angajati.get(i);
            double incomeM = angajat.calculateMonthlyIncome();
            System.out.println("Monthly income "+i+" = "+incomeM);
        }
    }
}
