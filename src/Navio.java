public class Navio implements Transportadora {
    @Override
    public double calcularCusto(double distancia) {
        return distancia * 0.3;
    }
}
