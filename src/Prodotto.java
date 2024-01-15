public class Prodotto implements Pagabile {
    private float costo;

    public Prodotto(float costo) throws Exception {
        if(costo <= 0) throw new Exception("Costo invalido");
        this.costo = costo;
    }


    @Override
    public double calcolaPrezzo(String modalita) {
        if(modalita.trim().equalsIgnoreCase("carta")) {
            return costo + 0.5;
        }
        else if(modalita.trim().equalsIgnoreCase("contanti")) {
            return costo - (costo * 5/100);
        }

        return costo + 1;
    }

    @Override
    public double effettuaPagamento(String modalita, double saldo) {
        return saldo - calcolaPrezzo(modalita);
    }
}
