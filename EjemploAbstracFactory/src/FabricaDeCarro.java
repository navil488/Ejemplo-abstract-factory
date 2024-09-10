
public class FabricaDeCarro implements AbstractFactory {
    @Override
    public Carro createCar() {
        return new carroDeportivo();  // o familiar
    }

    
    public motocicleta createmotocicleta() {
        return new motodeportiva(); // 
    }
}




