
public class Main {
    public static void main(String[] args) {
        AbstractFactory FabricaDeCarro = new FabricaDeCarro();
        Carro carro = FabricaDeCarro.createCarro();
        carro.manejo();  
        AbstractFactory FabricaDeMotos = new FabricaDeMotos();
        motocicleta motocicleta = FabricaDeMotos.createMoto();
        motocicleta.manejo();  
	}

}
