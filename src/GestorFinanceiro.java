import java.util.ArrayList;
import java.util.List;

public class GestorFinanceiro {
    private List<Transacao> transacoes;

    public GestorFinanceiro() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(String descricao, double valor, Transacao.TipoTransacao tipo){
        Transacao transacao = new Transacao(descricao, valor, tipo);
        transacoes.add(transacao);

    }

    public void listarTransacoes() {
        System.out.println("\n=== Relatório de Transações ===");
        System.out.printf("%s | %s | %s\n", "Descrição", "Tipo", "Valor");
        System.out.println("-----------------------------");

        for (Transacao t : transacoes){
            t.exibirTransacao();
        }
    }

    public double calcularSaldo(){
        double saldo = 0;
        for (Transacao t : transacoes){
            if (t.getTipo() == Transacao.TipoTransacao.RECEITA){
                saldo += t.getValor();
            }else{
                saldo -= t.getValor();
            }
        }
        return saldo;
    }
}

