public class pinGenerator{	


    ///istanza della classe
    protected String pinPrec="";

    //@costruttore
    public pinGenerator(String PinPartenza) {
        
        pinPrec=PinPartenza;

	}//fine funzione generator


    protected void computePin(String statusPin){

        String newPin="";
    
        newPin=Util.controlla4cifra(statusPin);
		
        this.pinPrec=newPin;
        
    }

    /*
    * confronto pin.
      @param pin = pin vero.
      @return boolean: vero se i pin sono uguali
    */

    protected boolean equals(String pin){
        
        return pinPrec.equals(pin);

    }

    protected String getPinPrec(){
        return pinPrec;
    }


}
