import java.util.Scanner;


public class Robot {
    public static void main(String[] args) {

   
        Scanner robot = new Scanner(System.in); 
        System.out.println("inserisci nome Robot da inserire");
        String nome = robot.nextLine();
        System.out.println("inserisci funzione Robot da inserire");
        String funzione = robot.nextLine();
        System.out.println("inserisci anno di creazione del Robot da inserire");
        int anno = robot.nextInt();
        System.out.println("inserisci il livelllo di energia del Robot da inserire");
        int livelloEnergia = robot.nextInt();
    
    
        Robot robot1 = new Robot(nome, funzione, anno, livelloEnergia);
        Robot robot2 = new Robot();
        Robot robot3 = new Robot(nome,anno);
    
            // Stampare le informazioni dell'Robot
            System.out.println("Robot inserita:");
            System.out.println("nome: " + robot1.getnome());
            System.out.println("funzione: " + robot1.getfunzione());
            System.out.println("Anno di produzione: " + robot1.getAnno());
            System.out.println("livello di energia: " + robot1.getLivelloEnergia() + "%");
    
           
    
    
    
    }
    
        private String nome;
        private int anno;
        private String funzione;
        private int livelloEnergia;
    
        //costruttore senza parametri
        public Robot(){
            this.nome="Robot Generico";
            this.funzione="funzione assistenza";
            this.anno=2024;
            this.livelloEnergia=100;
        }
        // costruttore solo con nome e anno di costruzione
        public Robot(String nome, int anno){
            this.nome=nome;
            this.funzione="Assistenza";
            this.anno=anno;
            this.livelloEnergia=100;
        }
        // costruttore con nome, funzione e anno di costruzione
        public Robot(String nome, String funzione, int anno, int livelloEnergia){
            this.nome=nome;
            this.funzione=funzione;
            this.anno=anno;
            this.livelloEnergia=livelloEnergia;
        }
    
        public String getnome() {
            return nome;
        }
    
        public int getAnno() {
            return anno;
        }
    
        public String getfunzione() {
            return funzione;
      
        }
        public int getLivelloEnergia() {
            return livelloEnergia;
        }
    
        public void setnome(String nome) {
            this.nome= nome;
        }
    
        public void setAnno(int anno) {
            this.anno= anno;
        }
    
        public void setfunzione(String funzione) {
            this.funzione= funzione;
      
        }
        public void setLivelloEnergia(int livelloEnergia) {
            this.anno= anno;
        }
    
    
      
        }
    
    
    

