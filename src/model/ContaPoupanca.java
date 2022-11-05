package model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Usuario user) {
        super(user);
    }

    @Override
    public void EmitirExtrato(Conta conta){
        System.out.println("====  CONTA POUPANÇA  ====");
        super.GetAtrib(conta);
    }
}
