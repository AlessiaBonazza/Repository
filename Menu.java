

import java.util.ArrayList;

public class Menu {

   
    
         
       
        private String chef;
        private int prezzo;
        private ArrayList<String> ingredienti;

        public void Piatto1(String ingredienti, int prezzo, String chef) {
            this.ingredienti = new ArrayList<String>();
            this.prezzo = prezzo;
            this.chef = chef;
            
            //this.storico = new ArrayList<String>();
    
        }

        public void ingredienti(ArrayList<String> ingredienti){
            this.ingredienti = new ArrayList<String>();
    }
   

        // getIngredienti, getprezzo getchef
        public String getChef() {
            return chef;
        }
    
        public ArrayList<String> getIngredienti() {
            return  ingredienti;
        }

        public int getPrezzo() {
            return prezzo;
        }
        public Menu (String ingredienti, String chef, int prezzo) {
            super();
        }
       
        public ArrayList<String> arrayLingredienti() {
            ArrayList<String> ingredienti = new ArrayList<String>();
    
            ingredienti.add("pasta");
            ingredienti.add("cacio");
            ingredienti.add("pepe");
            ingredienti.add("noceMoscata");
            return ingredienti;
        }
        

        class Ordinazione extends Menu {

            public Ordinazione(String ingredienti, String chef, int prezzo) {
                super(ingredienti, chef, prezzo);
                
            }

            @Override
            public ArrayList<String> arrayLingredienti() {
               
                return super.arrayLingredienti();
            }

            @Override
            public String getChef() {
               
                return super.getChef();
            }

            @Override
            public ArrayList<String> getIngredienti() {
               
                return super.getIngredienti();
            }

            @Override
            public int getPrezzo() {
               
                return super.getPrezzo();
            }
    
    
/* /Andiamo a creare una classe MENU che può creare vari oggetti che sono definiti come piatti
//con tre ARGOMENTI l'uno ( Ingredienti, Prezzo,  Chef )
Andiamo a creare una classe ORDINAZIONE che può diventare qualsiasi tipo di piatto, 
ma con la sola caratteristica del prezzo del piatto per creare un calcolo unitario del totale
 che possa essere richiamato dalla classe ORDINAZIONE */
    }}

    class Cassa {

        public static void main(String[] args) {

            System.out.println("ingredienti piatto 1: " + getIngredienti);

    }
}
