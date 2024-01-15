public class Main {
    public static void main(String[] args) {
        Prodotto p;
        Servizio s;

        try {
            p = new Prodotto(60);
            s = new Servizio(15);

            System.out.println("Prezzo p = " + p.calcolaPrezzo("carta"));
            System.out.println("Servizio s = " + s.calcolaPrezzo("soldi monopoli"));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}