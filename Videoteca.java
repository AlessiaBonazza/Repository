import java.util.Scanner;

public class Videoteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        class Film {
            // Attributi: titolo (String) e anno di uscita (int)
            private String titoloFilm;
            private int annoFilm;

            // Costruttore per inizializzare un nuovo film con titolo e anno di uscita
            public Film(String titoloFilm, int annoFilm) {
                this.titoloFilm = titoloFilm;
                this.annoFilm = annoFilm;
            }
            public String getTitoloFilm() {
                return titoloFilm;
            }

            public void setTitoloFilm(String titoloFilm) {
                this.titoloFilm = titoloFilm;
            }

            public int getAnnoFilm() {
                return annoFilm;
            }

            public void setAnnoFilm(int annoFilm) {
                this.annoFilm = annoFilm;
            }
        }

        Film[][] film = new Film[2][2];

        for (int i = 0; i < film.length; i++) {
            for (int j = 0; j < film[i].length; j++) {
                System.out.println("Inserisci il titolo del film:");
                String titoloFilm = scanner.nextLine();
                System.out.println("Inserisci anno di uscita del film:");
                int annoFilm = scanner.nextInt();
                scanner.nextLine(); 
//creo l'oggetto film
                film[i][j] = new Film(titoloFilm, annoFilm);
            }
        }

        // Stampo i film
        for (int i = 0; i < film.length; i++) {
            for (int j = 0; j < film[i].length; j++) {
                System.out.println("Film");
                System.out.println("Titolo: " + film[i][j].getTitoloFilm());
                System.out.println("Anno di uscita: " + film[i][j].getAnnoFilm());
            }
        }

        scanner.close();
    }
}