import java.util.Scanner;

public class Auto {


    
    
public static void main(String[] args) {

   
    Scanner macchina = new Scanner(System.in); 
    System.out.println("inserisci modello auto da inserire");
    String modello = macchina.nextLine();
    System.out.println("inserisci colore auto da inserire");
    String colore = macchina.nextLine();
    System.out.println("inserisci anno auto da inserire");
    int anno = macchina.nextInt();


    Auto macchina1 = new Auto(modello, colore, anno);

        // Stampare le informazioni dell'auto
        System.out.println("Auto inserita:");
        System.out.println("Modello: " + macchina1.getModello());
        System.out.println("Colore: " + macchina1.getColore());
        System.out.println("Anno di produzione: " + macchina1.getAnno());

       



}

    private String modello;
    private int anno;
    private String colore;

    //costruttore senza parametri
    public Auto(){
        this.modello="modello non specificato";
        this.colore="colore non specificato";
        this.anno=2024;
    }
    // costruttore solo con modello e anno di costruzione
    public Auto(String modello, int anno){
        this.modello=modello;
        this.colore="Bianco";
        this.anno=anno;
    }
    // costruttore con modello, colore e anno di costruzione
    public Auto(String modello, String colore, int anno){
        this.modello=modello;
        this.colore=colore;
        this.anno=anno;
    }

    public String getModello() {
        return modello;
    }

    public int getAnno() {
        return anno;
    }

    public String getColore() {
        return colore;
  
    }


  
    }

