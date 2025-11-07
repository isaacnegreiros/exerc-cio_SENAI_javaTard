package atv20;


import java.util.Scanner;

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome=nome;
        this.preco=preco;
    }
}
public class atv_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[3];

        for (int conta = 0; conta < produtos.length; conta++) {
            System.out.println("Digite o produto "+(conta+1)+": ");
            String nome = sc.nextLine();
            System.out.println("Digite o preço do produto "+(conta+1)+": ");
            double preco = sc.nextDouble();
            sc.nextLine();

            produtos[conta] = new Produto(nome,preco);

        }
        for (Produto product:produtos) {
            System.out.println(product.nome+"- R$"+String.format("%.2f%n",product.preco));
        }
        System.out.println();
        System.out.println("Produtos com o preço menor que R$50,00");
        for (Produto product:produtos) {
            if (product.preco < 50) {
                System.out.println(product.nome+"- R$"+String.format("%.2f%n",product.preco));
            }
        }
    }
}
