public class Main {
    public static void main(String[] args){
        GestorFinanceiro gestor = new GestorFinanceiro();
        gestor.adicionarTransacao("Salário", 5000, Transacao.TipoTransacao.RECEITA);
        gestor.adicionarTransacao("Freelance", 1200, Transacao.TipoTransacao.RECEITA);
        gestor.adicionarTransacao("Alguel", 1500, Transacao.TipoTransacao.DESPESA);
        gestor.adicionarTransacao("Supermercado", 600, Transacao.TipoTransacao.DESPESA);
        gestor.adicionarTransacao("Internet", 100, Transacao.TipoTransacao.DESPESA);

        gestor.listarTransacoes();

        System.out.printf("\nSaldo final: R$%.2f\n", gestor.calcularSaldo());
    }
}
