package model;

import java.util.List;

public class Banco {
    private List<Conta> contas;
    public Banco(List<Conta> contas) {
        this.contas = contas;
    }
    public void ListarContas(){
        for(Conta conta:this.contas){
            System.out.println( "Titular: " + conta.getUser() + "---" +
                                "Conta: "+conta.getConta());
        }
    }
}
