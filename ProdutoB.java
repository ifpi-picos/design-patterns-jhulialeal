public class ProdutoB implements Produto{
    double preco = 25;
    double precoFinal;

    @Override
    public double setPreco(double preco) {
        double taxa = 3.2;
        double taxaICMS = 1.1;
        double precoFinal = (preco * taxa) * taxaICMS;
        return precoFinal;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Produto B: " + precoFinal);
    }
    
}


