package com.manoelcampos.impostorenda;

/**
 * @author Manoel Campos da Silva Filho & Bruno Pereira de Carvalho
 */
public class PessoaFisica extends Pessoa {
    //11% IR
    //11% INSS


    public PessoaFisica(String nome, String cpf) {
        this.setNome(nome);
        this.setCpfOrCnpj(cpf);
    }

    public void calculaImposto(Double valor){
        System.out.println("PF: "+getNome());
        System.out.println("Vai pagar: R$ "+(valor*0.11)+" de INSS.");
        System.out.println("Vai pagar: R$ "+(valor-(valor*0.11))*0.11+" de IR.");
    }
}
