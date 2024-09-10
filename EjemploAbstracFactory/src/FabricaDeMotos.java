
public class FabricaDeMotos  implements AbstractFactory {
    @Override
    public Carro createCar() {
        return new carroFamiliar(); 
    }

    @Override
    public motocicleta createMotocicleta() {
        return new motoFamiliar (); 
    }
}