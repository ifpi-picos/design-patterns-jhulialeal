public class ConcreteCreatorB implements Creator {
    @Override
    public Produto factoryMethod() {
        return new ProdutoB();
    }
}



