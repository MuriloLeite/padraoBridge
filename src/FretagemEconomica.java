public class FretagemEconomica extends Fretagem {
    public FretagemEconomica(Transportadora transportadora) {
        super(transportadora);
    }

    @Override
    public double calcularCusto(double distancia) {
        return transportadora.calcularCusto(distancia) * 0.8;
    }
}
