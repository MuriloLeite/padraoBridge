public class FretagemExpressa extends Fretagem {
    public FretagemExpressa(Transportadora transportadora) {
        super(transportadora);
    }

    @Override
    public double calcularCusto(double distancia) {
        return transportadora.calcularCusto(distancia) * 1.2;
    }
}


