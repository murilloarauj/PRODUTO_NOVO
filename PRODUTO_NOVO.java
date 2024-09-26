import java.time.LocalDate;
public class PRODUTO_NOVO {
    // Atributos da classe 'PRODUTO_NOVO'
    private String nomeprod;  // Nome do produto
    private double preçodCusto; // Preço de custo do produto
    private double preçodVenda; // Preço de venda do produto
    private LocalDate dataFabric; // Data de fabricação do produto
    private LocalDate dataValidade; // Data de validade do produto

    public PRODUTO_NOVO(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {// Construtor que recebe todos os atributos
        this.nomeprod = nome; // Atribui o nome
        this.preçodCusto = precoCusto; // Atribui o preço de custo
        this.preçodVenda = precoVenda; // Atribui o preço de venda
        this.dataFabric = dataFabricacao; // Atribui a data de fabricação
        this.dataValidade = dataValidade; // Atribui a data de validade
    }

    public PRODUTO_NOVO(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {// Construtor que define data de validade como um mês após a fabricação
        this(nome, precoCusto, precoVenda, dataFabricacao, dataFabricacao.plusMonths(1)); // Chama o construtor principal
    }

    public PRODUTO_NOVO(String nome, double precoCusto) { // Construtor que define preço de venda e datas automaticamente
        this.nomeprod = nome;                           // Atribui o nome
        this.preçodCusto = precoCusto;               // Atribui o preço de custo
        this.preçodVenda = precoCusto * 1.10;        // Define o preço de venda como 10% a mais que o custo
        this.dataFabric = LocalDate.now();             // Data de fabricação é a data atual
        this.dataValidade = LocalDate.now().plusMonths(1); // Data de validade é um mês após a fabricação
    }

    // Getters para acessar os atributos
    public String getNome() { // Acesso seguro ao nome do produto
        return nomeprod;
    }

    public double getPrecoCusto() {// Acesso seguro ao preço de custo
        return preçodCusto;
    }

    public double getPrecoVenda() {// Acesso seguro ao preço de venda
        return preçodVenda;
    }

    public LocalDate getDataFabricacao() {// Acesso seguro à data de fabricação
        return dataFabric;
    }

    public LocalDate getDataValidade() {// Acesso seguro à data de validade
        return dataValidade;
    }

    public String descrição() {// Método para exibir informações do produto 
        return "Produto: " + nomeprod + 
               "\nPreço de Custo: R$ " + preçodCusto + 
               "\nPreço de Venda: R$ " + preçodVenda + 
               "\nData de Fabricação: " + dataFabric + 
               "\nData de Validade: " + dataValidade;
    }

    public static void main(String[] args) {// Método principal para executar o programa
        PRODUTO_NOVO p1 = new PRODUTO_NOVO("Produto 1", 200, 250, LocalDate.of(2023, 6, 21), LocalDate.of(2024, 9, 25)); // Usando o primeiro construtor
        System.out.println(p1.descrição()); // Exibe as informações do primeiro produto

        System.out.println(" ");
        
        PRODUTO_NOVO p2 = new PRODUTO_NOVO("Produto 2", 300, 350, LocalDate.of(2021, 5, 15)); // Usando o segundo construtor
        System.out.println(p2.descrição()); // Exibe as informações do segundo produto

        System.out.println(" ");
        
        PRODUTO_NOVO p3 = new PRODUTO_NOVO("Produto 3", 150); // Usando o terceiro construtor
        System.out.println(p3.descrição()); // Exibe as informações do terceiro produto
    }
}
