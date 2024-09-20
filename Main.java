package com.mycompany.java_heranca;
/**
 * @author Yasmin
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as informações do carro!");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Ano: ");
        int anoCarro = scanner.nextInt();
        System.out.print("Quantidade de portas: ");
        int portas = scanner.nextInt();

        System.out.println();

        System.out.println("Insira as informações da moto!");
        System.out.print("Marca: ");
        scanner.nextLine();
        String marcaMoto = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Ano: ");
        int anoMoto = scanner.nextInt();

        System.out.print("Tem carenagem? (s/n)");
        scanner.nextLine();
        String carenagemInput = scanner.nextLine();
        boolean temCarenagem = carenagemInput.equalsIgnoreCase("s");

        System.out.println();

        System.out.println("Informações do carro!");
        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, portas);
        carro.exibirInformacao();
        carro.acelerar();
        carro.abrirPortaMalas();

        System.out.println();

        System.out.println("Informações da moto!");
        Moto moto = new Moto(marcaMoto, modeloMoto, anoMoto, temCarenagem);
        moto.exibirInformacao();
        moto.acelerar();
        moto.empinar();

        scanner.close();
    }
}