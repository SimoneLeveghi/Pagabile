public class Servizio implements Pagabile {
    private float costo;

    public Servizio(float costo) throws Exception {
        if(costo <= 0) throw new Exception("Costo invalido");
    }
}
