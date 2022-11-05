package model.services;

import model.Conta;
import model.Usuario;

public interface IOperacoesBancarias {
     void Sacar(double valor);
     void Depositar(double valor);
     void Transferir(Conta contaDest, double valor);
     void EmitirExtrato(Conta conta);

}
