import java.io.*;
import java.util.ArrayList;

public class passwordGenerator{

    protected Dizionario diz;
    protected String pass="";

    //@costruttore
    public passwordGenerator(String path) {
        //TODO

	} 

    protected Dizionario getDiz(){
        //TODO
    }

    protected void setPass(String s){
        //TODO
    }

    /*funzione che calcola una nuova password
    @param: indice del dizionario
    */ 
    protected void computePassword(int indice){
        pass=this.diz.getDizParole().get( indice );       
    }

    /*
    funzione che controlla se la password è un prefisso
    @param: lista di prefissi
    @return true se si trova la password
    */
    protected boolean prefixCheck(ArrayList<String> prefixList, String realPassword){
        //TODO
    }    

    /*
    funzione che controlla se la password è un suffisso
    @param: lista di suffissi
    @return true se si trova la password
    */
    protected boolean suffixCheck(ArrayList<String> suffixList, String realPassword){
        //TODO
    }    



    /*
    funzione che calcola i prefissi di una parola
    @param: indice della parola di cui calcolare i prefissi
    @return: lista dei prefissi
    */
    protected ArrayList<String> computePrefix(int indice){
        //TODO
    }

    /*
    funziona duale a quella sui prefissi.
    @param: indice della parola sui cui calcolare i suffissi
    @return: lista dei suffissi della parola
    */
    protected ArrayList<String> computeSuffix(int indice){
        //TODO
    }


    /*
      @param password = password vera.
      @return boolean: vero se i le password sono uguali
    */
    protected boolean equals(String password){
        //TODO
    }

    protected String getPassword(){
        //TODO
    }


}
