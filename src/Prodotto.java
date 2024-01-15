public class Prodotto implements Pagabile {
    private float costo;

    public Prodotto(float costo) throws Exception {
        if(costo <= 0) throw new Exception("Costo invalido");
    }
}
