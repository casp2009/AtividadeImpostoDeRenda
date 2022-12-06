package com.manoelcampos.impostorenda;

public class Main {
    public static void main(String[] args) {

        new PessoaFisica("Fulano","CPF123").calculaImposto(5600.00);
        System.out.println();
        new PessoaJuridica("Beltrano impors","CNPJ123").calculaImposto(19000.00);
        System.out.println();
        new PessoaJuridica("Sicrano Secos & Molhados","CNPJ987").calculaImposto(100000.00);
    }
}
