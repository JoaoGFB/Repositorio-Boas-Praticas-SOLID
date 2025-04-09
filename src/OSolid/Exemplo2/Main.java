package OSolid.Exemplo2;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        sistema.realizarPagamento(150.0, new PagamentoCartao());
        sistema.realizarPagamento(220.0, new PagamentoPix());
        sistema.realizarPagamento(330.0, new PagamentoBoleto());
    }
}