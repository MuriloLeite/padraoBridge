public class Aviao implements Transportadora {
    @Override
    public double calcularCusto(double distancia) {
        return distancia * 1.0;
    }
}
