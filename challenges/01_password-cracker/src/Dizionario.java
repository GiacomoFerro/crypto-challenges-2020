import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dizionario {
 
    protected ArrayList<String> parole;
 
    /**
     * Il costruttore di default del Dizionario. Carica le parole.
       @param Path = percorso dei file di parole con cui creare il dizionario.
     */
    public Dizionario(String Path) {
        run(Path);
 
    }

    public ArrayList<String> getDizParole(){
        return this.parole;
    }

 
    public void run(String Path) {
        try {
             Path filePath = Paths.get(Path);
             this.parole = Files.readAllLines(filePath);
        } 
        catch (IOException ex) {
             System.err.println("Un eccezione è stata lanciata: problemi di IO");
        }            
    }   
 
    /**
     * Metodo util per filtrare una lista con un certo Predicate made by lory
     * @param list La lista da filtrare
     * @param pred Il predicato con il quale la lista è filtrata
     * @return la lista filtrata
    */
    protected <T> List<T> filterWithPred(List<T> list, Predicate<T> pred){
		      return list.stream().filter(pred).collect(Collectors.<T>toList());
	   }   
 
    /**
     * Ricerca una parola all'interno del Dizionario
     * @param pWord La parola da ricercare
     * @return true se la parola è presente, false in caso contrario.
     */

    public boolean searchWord(String pWord) {
        return this.parole.contains(pWord);
    }
 
    /**
     * Ritorna tutte le parole che contengono pWord.
     * @param pWord La parola da ricercare.
     * @return Una List cointenente tutte le parole.
     */
    public List<String> searchContainsWords(String pWord) {
		      return this.<String>filterWithPred(this.parole, p -> p.contains(pWord));
	   }
 
    /**
     * Ritorna tutte le parole che iniziano per pWord.
     * @param pWord La parola da ricercare.
     * @return Una List cointenente tutte le parole.
     */
    public List<String> searchStartWithWords(String pWord) {
		      return this.<String>filterWithPred(this.parole, p -> p.startsWith(pWord));
	   }
 
    /**
     * Ritorna tutte le parole che finiscono per pWord.
     * @param pWord La parola da ricercare.
     * @return Una List cointenente tutte le parole.
     */
    public List<String> searchEndWithWords(String pWord) {
		      return this.<String>filterWithPred(this.parole, p -> p.endsWith(pWord));
	   }
 
    /*
    @return una parola a caso
    */
    public String randomWord(){
        return this.parole.get(new Random().nextInt(this.parole.size()));
    }


 
    public static void main(String args[]) throws IOException {
        /*
        Dizionario d = new Dizionario();
        System.out.print("Inserire parola da ricercare: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String parola = br.readLine();

        if (d.searchWord(parola)) {
            System.out.println("La parola " + parola + " esiste");
            ArrayList<String> parole = new ArrayList<String>();
            parole = d.searchContainsWords(parola);
            System.out.println("Elenco parole che contengono " + parola + "(" + parole.size() + "):");
            
            for (int i = 0; i < parole.size(); i++) {
                System.out.println(parole.get(i));
            }
  
            parole = d.searchStartWhitWords(parola);
            System.out.println("Elenco parole che iniziano per " + parola + "(" + parole.size() + "):");

            for (int i = 0; i < parole.size(); i++) {
                System.out.println(parole.get(i));
            }

            parole = d.searchEndWhitWords(parola);
            System.out.println("Elenco parole che finiscono per " + parola + "(" + parole.size() + "):");

            for (int i = 0; i < parole.size(); i++) {
                System.out.println(parole.get(i));
            }

        } else {
            System.out.println("La parola " + parola + " non esiste");
        }
        System.out.println("Una parola a caso: "+d.randomWord());
        */

    }
    
}
