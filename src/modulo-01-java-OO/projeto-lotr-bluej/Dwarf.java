public class Dwarf {
    private int vida = 110;
    private String nome;
    private Status status = Status.VIVO;

    public Dwarf(String nome) {
        this.vida = 110;
        this.nome = nome;
    }

    public void perderVida() {
        // this.vida = this.vida - 10;
        // vida -= 10;
        int vidaAposFlechada = this.vida - 10;
        if (vidaAposFlechada == 0) {
            status = Status.MORTO;
        }

        if (vida > 0) {
            vida = vidaAposFlechada;
        }
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return this.vida;
    }

    public Status getStatus() {
        return this.status;
    }

    /*private void tirarVida() {
    this.vida -= 10;
    }*/

    // Declarar um objeto:
    // Dwarf gimli = null;

    // Criação (instanciação):
    // new Dwarf();
    // Dwarf d1 = new Dwarf();

}






