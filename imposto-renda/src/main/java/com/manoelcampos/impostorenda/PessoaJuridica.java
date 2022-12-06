package com.manoelcampos.impostorenda;

/**
 * @author Bruno Pereira de Carvalho
 */
public class PessoaJuridica extends Pessoa{
    //IR 15% if lucro < 20000 and 10% sobre exedente
    //INSS 9%
    //ICMS 5%

    public PessoaJuridica(String nome, String cnpj) {
        this.setNome(nome);
        this.setCpfOrCnpj(cnpj);
    }

    public void calculaImposto(Double valor){
        System.out.println("PJ: "+getNome());
        if(valor > 20000){
            System.out.println("Valor do IR R$ "+(((valor-20000) * 0.10) + 3000)+" .");
        }else{
            System.out.println("Valor do IR R$ "+((valor) * 0.15)+" .");
        }
        System.out.println("Valor do INSS R$ "+((valor) * 0.09)+" .");
        System.out.println("Valor do ICMS R$ "+((valor) * 0.05)+" .");
    }
}
