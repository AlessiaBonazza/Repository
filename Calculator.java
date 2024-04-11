public class Calculator {import java.util.scanner;

    public class Calculator {
    
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    
        public int subtract(int num1, int num2) {
            return num1 - num2;
        }
    
        public int multiply(int num1, int num2) {
            return num1 * num2;
        }
    
        public int divide(int dividend, int divisor) {
            return dividend / divisor;
        }
    
        // Calculator calculator = new Calculator();}
    
        public class Classe
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();
            int num1 = 0, num2 = 0, result = 0;
            boolean esci = false;
    
            while (!esci)  { 
            System.out.print("Seleziona l'operazione da eseguire:");
            System.out.print("1-addizione ");
            System.out.print("2-sottrazione ");
            System.out.print("3-moltiplicazione");
            System.out.print("4-divisione  ");
            System.out.print("5- esci  ");
            System.out.print("Scelta:  ");
            Int scelta = scanner.nextInt();
            try {
            if (scelta == 1) {
                System.out.print("Inserisci il primo numero: ");
                num1 = scanner.nextInt();
                System.out.print("Inserisci il secondo numero: ");
                num2 = scanner.nextInt();
                result = calculator.add(num1, num2);
                System.out.println("Risultato: " + result);
            }
            else if  (scelta == 2) {
                System.out.print("Inserisci il primo numero: ");
                num1 = scanner.nextInt();
                System.out.print("Inserisci il secondo numero: ");
                num2 = scanner.nextInt();
                result = calculator.subtract(num1, num2);
                System.out.println("Risultato: " + result);
            }
            else if  (scelta == 3) {
                System.out.print("Inserisci il primo numero: ");
                num1 = scanner.nextInt();
                System.out.print("Inserisci il secondo numero: ");
                num2 = scanner.nextInt();
                result = calculator.multiply(num1, num2);
                System.out.println("Risultato: " + result);
            }
            else if  (scelta == 4) {
                System.out.print("Inserisci il primo numero: ");
                num1 = scanner.nextInt();
                System.out.print("Inserisci il secondo numero: ");
                num2 = scanner.nextInt();
                
    
        {
                
                System.out.println("Risultato: " + result); }}
                catch(AritmeticException e)
        {
                 System.out.println("Si è verificato un errore, impossibile dividere per zero");
        }finally
        {
            System.out.println("Fine del programma");
        }
                result = calculator.divide(num1, num2);
                
            }
            else if  (scelta == 5) {
                esci = true;
            }
            else {
            System.out.println("scelta non valida");}
    
    
        
            
    }
    }
    
}
