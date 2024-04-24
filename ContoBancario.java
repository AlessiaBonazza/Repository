import java.util.ArrayList;

public class ContoBancario {

    String titolare;
    double saldo;

    public void Conto(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public double getSaldo() {
        return saldo;
    }

    void deposita(double importo) {
        saldo += importo;
    }

    void preleva(double importo) {
        if (saldo + 1000 >= importo) {
            saldo -= importo;
        } else
            System.out.println("Fido insufficiente, prelievo bloccato");
    }

}

class ContoRisparmio extends ContoBancario {
    double tassoInteresse;
    String titolare;
    double saldo;

    public void Conto2(String titolare, double saldo, double tassoInteresse) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.tassoInteresse = tassoInteresse;
    }

    public double getTassoInteresse() {
        return tassoInteresse;
    }

void aggiungiInteresse() {
    double interesse= getSaldo()*getTassoInteresse()/100;
    double saldo += interesse;
}

}

class Banca {

    ArrayList<ContoBancario> contoCorrente = new ArrayList<>();

    void aggiungiConto(ContoBancario conto) {
        contoCorrente.add(conto);
    }

    double getSaldoTotale() {
        double totale = 0;
        for (ContoBancario conto : contoCorrente) {
            totale += conto.getSaldo();
        }
        return totale;
    }

    void stampaSaldi() {
        for (ContoBancario conto : contoCorrente) {
            System.out.println("Titolare: " + conto.getTitolare() + ", Saldo: " + conto.getSaldo());
        }
    }

}

class Banca2 {
    public static void main(String[] args) {

    }
}
