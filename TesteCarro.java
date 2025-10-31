public class TesteCarro {

    public static void main(String[] args) {
        
        System.out.println("--- Criando e Usando a Classe Carro ---");
        
        
        Carro meuFusca = new Carro("Azul", "Volkswagen", "Fusca", 1975);
        
       
        meuFusca.ligar();
        meuFusca.acelerar(30);
        System.out.println("Velocidade atual: " + meuFusca.getVelocidadeAtual() + "km/h");
        meuFusca.buzinar();
        meuFusca.frear(10);
        System.out.println("Velocidade após frear: " + meuFusca.getVelocidadeAtual() + "km/h");
        
        
        meuFusca.desligar(); 
        
       
        meuFusca.frear(20);  
        System.out.println("Velocidade final: " + meuFusca.getVelocidadeAtual() + "km/h");
        meuFusca.desligar(); 
    }
}