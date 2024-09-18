package main;

public class produto {
	
	    String nome;
	    String marca;
	    double precoCusto;
	    double precoVenda;

	    // classe construtora
	    public produto(String nome, String marca, double precoCusto, double precoVenda) {
	        this.nome = nome;
	        this.marca = marca;
	        this.precoCusto = precoCusto;
	        this.precoVenda = precoVenda;
	    }

	    // metodo para soma de lucros
	    public double calcularLucro() {
	        return precoVenda - precoCusto;
	    }
	

	// classe principal
	    public static void main(String[] args) {
	    	
	        // cria os objetos da classe do produto
	        produto produto1 = new produto("Regata", "Shein", 20.99, 54.49);
	        produto produto2 = new produto("Bermuda", "Stranger", 49.99, 109.99);
	        produto produto3 = new produto("Flip Flops", "Havainas", 10.00, 49.99);

	        // mostra informaçoes do produto
	        exibirInformacoes(produto1);
	        exibirInformacoes(produto2);
	        exibirInformacoes(produto3);
	    }

	    // metodo para exibir as informaçoes do produto
	    public static void exibirInformacoes(produto produto) {
	        System.out.println("Nome: " + produto.nome);
	        System.out.println("Marca: " + produto.marca);
	        System.out.println("Preço de Custo: R$ " + produto.precoCusto);
	        System.out.println("Preço de Venda: R$ " + produto.precoVenda);
	        System.out.println("Lucro: R$ " + produto.calcularLucro());
	        System.out.println("-------------------------");
	}
	    }


