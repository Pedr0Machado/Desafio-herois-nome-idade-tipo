public class Heroi { // A CLASSE AGORA CHAMA 'Heroi'
    // Propriedades da classe
    private String nome;
    private int idade;
    private String tipo;

    // Construtor CORRIGIDO (sem 'void' e com o nome da classe 'Heroi')
    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo.toLowerCase(); 
    }

    // Método principal que implementa a lógica de ataque
    public void atacar() {
        String ataque;

        // Estrutura de decisão para determinar o tipo de ataque
        switch (this.tipo) { // O toLowerCase() já foi aplicado no construtor
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
            case "monge":
                ataque = "usou artes marciais";
                break;
            case "ninja":
                ataque = "usou shuriken";
                break;
            default:
                // Caso o tipo não esteja listado
                ataque = "realizou um ataque indefinido";
                break;
        }

        // Exibindo a mensagem final
        System.out.println("O " + this.tipo + " atacou " + ataque);
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Criando objetos (instâncias da classe Heroi)
        // Agora, 'new Heroi' e 'Heroi[]' referenciam esta mesma classe
        Heroi guerreiro = new Heroi("Aragorn", 35, "Guerreiro");
        Heroi mago = new Heroi("Gandalf", 1000, "Mago");
        Heroi monge = new Heroi("Aang", 12, "Monge");
        Heroi ninja = new Heroi("Hanzo", 28, "Ninja");
        Heroi outro = new Heroi("Outro Herói", 40, "Bárbaro"); 

        Heroi[] herois = {guerreiro, mago, monge, ninja, outro};

        // Laço de repetição para que cada herói ataque
        for (Heroi heroi : herois) {
            heroi.atacar(); 
        }
        
        // Exemplo de uso de estrutura de decisão
        if (mago.idade > 500) {
            System.out.println(mago.nome + " é um mago ancião.");
        } else {
            System.out.println(mago.nome + " é um mago jovem.");
        }
    }
}