public class Transacao {
    private String descricao;
    private double valor;
    private TipoTransacao tipo;

    public enum TipoTransacao{
        RECEITA, DESPESA
    }

    public Transacao(String descricao, double valor, TipoTransacao tipo){
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    };
    public String getDescricao(){
      return descricao;
    };
    public TipoTransacao getTipo(){
        return tipo;
    };
    public void exibirTransacao(){
        System.out.printf("Descrição: %s\n", descricao);
        System.out.printf("Valor: %.2f\n", valor);
        System.out.printf("Tipo: %s\n", tipo);
        System.out.println("-----------------------------");
    }
}
