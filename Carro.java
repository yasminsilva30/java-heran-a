package com.mycompany.java_heranca;
/**
 * @author Yasmin
 */
public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public void abrirPortaMalas() {
        System.out.println("O porta-malas do " + getModelo() + " está aberto!");
    }

    @Override
    public void exibirInformacao() {
        super.exibirInformacao();
        System.out.println("Quantidade de portas: " + portas);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}