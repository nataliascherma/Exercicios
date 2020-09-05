package Exercicio2;

public interface PagamentoOnline {
    public double taxaDePagamento(double valor);
    public double juros(double valor, int meses);
}

