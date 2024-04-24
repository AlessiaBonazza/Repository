import java.util.ArrayList;
import java.util.Scanner;

class ContoBancario {

    String titolare;
    double saldo;

    public void contoBancario (String titolare, double saldo) {
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

    public void contoRisparmio (String titolare, double saldo, double tassoInteresse) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.tassoInteresse = tassoInteresse;
    }

    public double getTassoInteresse() {
        return tassoInteresse;
    }

void aggiungiInteresse() {
    double interesse= getSaldo()*getTassoInteresse()/100;
    double saldo = getSaldo()+interesse;
    super.saldo = saldo;
}

}

class Banca {

    ArrayList<ContoBancario> contoCorrente = new ArrayList<>();

    void aggiungiConto(ContoBancario conto) {
        contoCorrente.add(conto);
    }
    void aggiungiConto2(ContoRisparmio conto) {
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

class Banca2 {
    public static void main(String[] args) {
    
        Banca banca = new Banca();
        ContoBancario contoBancario = new ContoBancario();
        ContoRisparmio contoRisparmio = new ContoRisparmio();


        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int scelta = 0;

        while (scelta != 4) {
            System.out.println("Seleziona l'azione da eseguire: \n1. Deposita\n2. Preleva\n3. Stampa saldi\n4. Esci");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il titolare del conto:");
                    String titolare = scanner2.nextLine();
                    System.out.println("Inserisci l'importo del deposito:");
                    double importo = scanner.nextDouble();
                    if (contoBancario.getTitolare().equals(titolare)) {
                        contoBancario.deposita(importo);
                    } else if (contoRisparmio.getTitolare().equals(titolare)) {
                        contoRisparmio.deposita(importo);
                    }
                    else  {
                        System.out.println("Non risultano conti aperti presso la nostra banca");
                    }
                    break;
                case 2:
                    System.out.println("Inserisci il titolare del conto:");
                    String titolare2 = scanner2.nextLine();
                    System.out.println("Inserisci l'importo del prelievo:");
                    double importo2 = scanner.nextDouble();
                    if (contoBancario.getTitolare().equals(titolare2)) {
                        contoBancario.preleva(importo2);
                    } else if (contoRisparmio.getTitolare().equals(titolare2)) {
                        contoRisparmio.preleva(importo2);
                    } else  {
                        System.out.println("Non risultano conti aperti presso la nostra banca");
                    }
                    break;
                case 3:
                    banca.stampaSaldi();
                    break;
            }
        }

        scanner.close();
        scanner2.close();
    }
}}



