package model;

import model.services.IOperacoesBancarias;

import java.util.List;

public abstract class Conta implements IOperacoesBancarias {
    protected static final int AGENCIA_PADRAO = 00001;
    private static int SEQUENCAL = 00000;
    protected String conta;
    protected int agencia;
    protected double saldo;
    protected Usuario user;
    public Conta(Usuario user){
        this.agencia = Conta.AGENCIA_PADRAO;
        SEQUENCAL++;
        if (getClass().getName() == "model.ContaCorrente"){
            this.conta = String.format("%04d",SEQUENCAL) + "c";
        }else{
            this.conta = SEQUENCAL+ "p";
        }
        this.user = user;
    }

    public String getConta(){
        return conta;
    }
    public int getAgencia(){
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getUser() {
        return user.getNome();
    }
    @Override
    public void Sacar( double valor) {
        this.saldo -= valor;
    }

    @Override
    public void Depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void Transferir(Conta contaDest, double valor) {
        this.Sacar(valor);
        contaDest.Depositar(valor);
    }
    protected void GetAtrib(Conta conta){
        System.out.println("Titular: " + conta.getUser() + "\n"
                + "Agencia: " + String.format("%03d",conta.getAgencia()) + "\n"
                + "Conta: " + conta.getConta() + "\n"
                + "Saldo: " + conta.getSaldo() + "\n"
        );
    }
}
