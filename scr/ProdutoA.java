package scr;
public class ProdutoA implements Produto{
    double preco = 10;
    double precoFinal;

    @Override
    public double setPreco(double preco) {
        double precoFinal = preco * 1.1;
        return precoFinal;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Produto A: " + precoFinal);
    }
    
}



