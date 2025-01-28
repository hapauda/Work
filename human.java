public class human {
    public static void main(String[] args) {
        ade loja = new ade(23.12, 5);
        System.out.printf("Preço dos produtos:  %.2f \n", loja.getPreco());
        System.out.printf("Estoque é : %d\n", loja.getQuantidade()); 
        loja.vender(3);
        loja.adicionarEstoque(23);
        loja.vender(40);
        System.out.println("\nVamos ver se deu certo.");      


    }
 
}
