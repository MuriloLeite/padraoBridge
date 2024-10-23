import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FretagemTest {

    @Test
    public void testFretagemExpressaCaminhao() {
        Transportadora caminhao = new Caminhao();
        Fretagem fretagemExpressa = new FretagemExpressa(caminhao);

        double distancia = 1000;
        double custoEsperado = distancia * 0.5 * 1.2;

        assertEquals(custoEsperado, fretagemExpressa.calcularCusto(distancia), 0.01);
    }

    @Test
    public void testFretagemEconomicaCaminhao() {
        Transportadora caminhao = new Caminhao();
        Fretagem fretagemEconomica = new FretagemEconomica(caminhao);

        double distancia = 1000;
        double custoEsperado = distancia * 0.5 * 0.8;

        assertEquals(custoEsperado, fretagemEconomica.calcularCusto(distancia), 0.01);
    }

    @Test
    public void testFretagemExpressaNavio() {
        Transportadora navio = new Navio();
        Fretagem fretagemExpressa = new FretagemExpressa(navio);

        double distancia = 1000;
        double custoEsperado = distancia * 0.3 * 1.2;

        assertEquals(custoEsperado, fretagemExpressa.calcularCusto(distancia), 0.01);
    }

    @Test
    public void testFretagemEconomicaNavio() {
        Transportadora navio = new Navio();
        Fretagem fretagemEconomica = new FretagemEconomica(navio);

        double distancia = 1000;
        double custoEsperado = distancia * 0.3 * 0.8;

        assertEquals(custoEsperado, fretagemEconomica.calcularCusto(distancia), 0.01);
    }

    @Test
    public void testFretagemExpressaAviao() {
        Transportadora aviao = new Aviao();
        Fretagem fretagemExpressa = new FretagemExpressa(aviao);

        double distancia = 1000;
        double custoEsperado = distancia * 1.0 * 1.2;

        assertEquals(custoEsperado, fretagemExpressa.calcularCusto(distancia), 0.01);
    }

    @Test
    public void testFretagemEconomicaAviao() {
        Transportadora aviao = new Aviao();
        Fretagem fretagemEconomica = new FretagemEconomica(aviao);

        double distancia = 1000;
        double custoEsperado = distancia * 1.0 * 0.8;

        assertEquals(custoEsperado, fretagemEconomica.calcularCusto(distancia), 0.01);
    }
}
