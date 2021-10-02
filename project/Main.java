package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Client> clients = new ArrayList<>();

        System.out.print("Enter the name: ");
        String name = input.nextLine();
        System.out.print("Enter the email: ");
        String email = input.nextLine();
        System.out.print("Enter the CPF: ");
        String cpf = input.nextLine();
        System.out.print("Enter the sex: ");
        String sex = input.nextLine();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        System.out.print("Enter the age: ");
        int age = input.nextInt();
        System.out.print("Enter the adress: ");
        input.nextLine();
        String adress = input.nextLine();
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        Client client = new Client(name, email, cpf, sex, height, age, adress, number);
        clients.add(client);    

        for(Client c : clients){
            System.out.println(c.toString());
        }
        //esse for foi feito apenas para testar se as variáveis estavam sendo atribuídas adequadamente
        input.close();
    }
}
