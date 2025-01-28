public class ade {
    private double preco;   
    private int quantidadenoestoque;
    public ade( double preco, int quantidadenoestoque){
        this.preco = preco;
        this.quantidadenoestoque = quantidadenoestoque;
    }
    public void vender(int quantidade){
        if (quantidade > quantidadenoestoque){
            System.out.println("Estoque insuficiente");
        }else{
            quantidadenoestoque -= quantidade;
            System.out.println("Estoque atual : " + quantidadenoestoque);
        }
    }
    public void adicionarEstoque(int quantidade){
        quantidadenoestoque += quantidade;
        System.out.println("Estoque atual: " + quantidadenoestoque);
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidadenoestoque;
    }
}
