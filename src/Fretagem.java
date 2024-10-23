public abstract class Fretagem {
    protected Transportadora transportadora;

    protected Fretagem(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public abstract double calcularCusto(double distancia);
}
