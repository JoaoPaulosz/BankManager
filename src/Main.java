import model.Banco;
import model.Conta;
import model.ContaCorrente;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("====  ESCOLHA A OPERAÇÃO  ====");

        Usuario user = new Usuario();
        user.setNome("Cleber");
        Conta cc = new ContaCorrente(user);
        cc.Depositar(100.00);
        cc.EmitirExtrato(cc);
        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        Banco banco = new Banco(contas);
        banco.ListarContas();
    }
}