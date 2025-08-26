package salas;

public class SalaFundadores extends Sala{
    public SalaFundadores(){
        super("Sala dos fundadores","História dos criadores do Java", 1995);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Bem-vindo à " + getNome());
        System.out.println("Ano de criação: " + getAnoCriacao());
        System.out.println("Aqui você descobre que o Java foi criado por James Gosling e sua equipe na Sun Microsystems.");
        System.out.println("Inicialmente, o projeto se chamava *Oak* antes de virar Java.");
    }

}
