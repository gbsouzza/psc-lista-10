public class Carro {

    private String cor;
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;
    private boolean ligado;

    public Carro(String cor, String marca, String modelo, int ano) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println(this.modelo + " foi ligado.");
        }
    }

    public void desligar() {
        if (this.ligado && this.velocidadeAtual == 0) {
            this.ligado = false;
            System.out.println(this.modelo + " foi desligado.");
        } else if (this.velocidadeAtual > 0) {
            System.out.println("Não é possível desligar, o carro está em movimento.");
        }
    }

    public void acelerar(int valor) {
        if (this.ligado) {
            this.velocidadeAtual += valor;
            System.out.println("Acelerando... Velocidade: " + this.velocidadeAtual + "km/h");
        } else {
            System.out.println("Não é possível acelerar, o carro está desligado.");
        }
    }

    public void frear(int valor) {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual -= valor;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            }
            System.out.println("Freando... Velocidade: " + this.velocidadeAtual + "km/h");
        }
    }

    public void buzinar() {
        System.out.println(this.modelo + " está buzinando: Bi-bi!");
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public boolean isLigado() {
        return this.ligado;
    }
}