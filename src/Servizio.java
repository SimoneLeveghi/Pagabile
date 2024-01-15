public class Servizio implements Pagabile {
    private float costo;

    public Servizio(float costo) throws Exception {
        if(costo <= 0) throw new Exception("Costo invalido");
    }

    @Override
    public double calcolaPrezzo(String modalita) {
        double prezzo = 0;
        if(modalita.trim().equalsIgnoreCase("carta")) {
            prezzo = costo + 0.5;
        }
        else if(modalita.trim().equalsIgnoreCase("contanti")) {
            prezzo = costo - (costo * 5/100);
        }
        else {
            prezzo = costo + 1;
        }

        return prezzo + (prezzo * 10/100);
    }

    @Override
    public double effettuaPagamento(String modalita, double saldo) {
        return 0;
    }
}
