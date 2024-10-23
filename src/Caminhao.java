public class Caminhao implements Transportadora {
    @Override
    public double calcularCusto(double distancia) {
        return distancia * 0.5;
    }
}
