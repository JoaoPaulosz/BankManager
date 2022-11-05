package model;

public class ContaCorrente extends Conta{
    public ContaCorrente(Usuario user) {
        super(user);
    }
    @Override
    public void EmitirExtrato(Conta conta){
        System.out.println("====  CONTA CORRENTE  ====");
        super.GetAtrib(conta);
    }
}
