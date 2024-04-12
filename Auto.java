import java.util.Scanner;

public class Auto {


    
    
public static void main(String[] args) {

   
    Scanner macchina = new Scanner(System.in); 
    
    System.out.println("che specifiche dell'auto conosci? \n1-modello+colore+anno; \n2-modello e anno di costruzione; \n3-nessuna");
    int scelta = macchina.nextInt();
    System.out.println("inserisci modello auto da inserire o x se non si conoscono le specifiche\n");
    String modello = macchina.nextLine();

    System.out.println("inserisci colore auto da inserire o x se non si conoscono le specifiche\n");
    String colore = macchina.nextLine();
    System.out.println("inserisci anno auto da inserire o x se non si conoscono le specifiche\n");
    int anno = macchina.nextInt();


    //inserire condizione nelle quali si chiede quali parametri si vogliono inserire. Generico=macchina2 


    Auto macchina1 = new Auto(modello, colore, anno);
    Auto macchina2 = new Auto();
    Auto macchina3 = new Auto(modello,anno);

        // Stampare le informazioni dell'auto

        if (scelta==1) { 
        
        System.out.println("Auto inserita:");
        System.out.println("Modello: " + macchina1.getModello());
        System.out.println("Colore: " + macchina1.getColore());
        System.out.println("Anno di produzione: " + macchina1.getAnno());
    }
        else if (scelta==2) { 
        
        System.out.println("Auto inserita:");
        System.out.println("Modello: " + macchina3.getModello());
        System.out.println("Colore: " + macchina3.getColore());
        System.out.println("Anno di produzione: " + macchina3.getAnno());
    }
        else if (scelta==3) { 
        
        System.out.println("Auto inserita:");
        System.out.println("Modello: " + macchina2.getModello());
        System.out.println("Colore: " + macchina2.getColore());
        System.out.println("Anno di produzione: " + macchina2.getAnno());
    }

        else { 
            System.out.println ("Valore di scelta non valido");   
        }


       



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
    public void setModello(String modello) {
        this.modello= modello;
    }

    public void setAnno(int anno) {
        this.anno= anno;
    }

    public void setColore(String colore) {
        this.colore= colore;
  
    }


  
    }

