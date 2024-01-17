package scr;
public class ConcreteCreatorA implements Creator {
    @Override
    public Produto factoryMethod() {
        return new ProdutoA();
    }
}


