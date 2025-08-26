import salas.Sala;

public class Visitante{
    String nome;
    int idade;

    public Visitante() {
        this.nome = nome;
        this.idade = idade;
    }

    public void explorarSala(Sala sala){
        System.out.println(nome + " está explorando a sala");
        sala.exibirConteudo();
        System.out.println("...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
