public class Util{

    public static String controlla4cifra(String pinPrec) {

            String newPin="";


            if(pinPrec.charAt(3)=='9') {
                newPin=controlla3cifra(pinPrec);
            }
            else{
                Integer cifra=Integer.valueOf(pinPrec.charAt(3))-48;
			    newPin=pinPrec.substring(0, 3);
			    cifra++;
			    newPin=newPin.concat(cifra.toString());
            }
            return newPin;
        }//fine funz4

	    public static String controlla3cifra(String pinPrec) {

		    String newPin="";

            if(pinPrec.charAt(2)=='9') {
                newPin=controlla2cifra(pinPrec);
            }
            else {
		        Integer cifra=Integer.valueOf(pinPrec.charAt(2))-48;
			    newPin=pinPrec.substring(0, 2);
		        cifra++;
			    newPin=newPin.concat(cifra.toString());
		       	newPin=newPin.concat("0");
		    }

            return newPin;

        }//fine funz3
	
        public static String controlla2cifra(String pinPrec){

		    String newPin="";

            if(pinPrec.charAt(1)=='9') {
                newPin=controlla1cifra(pinPrec);
					
	        }
	        else {
		        Integer cifra=Integer.valueOf(pinPrec.charAt(1))-48;
			    newPin=pinPrec.substring(0, 1);
			    cifra++;
			    newPin=newPin.concat(cifra.toString());
			    newPin=newPin.concat("0");
			    newPin=newPin.concat("0");
		    }

            return newPin;
        }//fine 2 cifra



        public static String controlla1cifra(String pinPrec){

		    String newPin="";

            if(pinPrec.charAt(0)=='9') {
		        return "";//fine dei casi!!!
		    }
		    else {
		        Integer cifra=Integer.valueOf(pinPrec.charAt(0))-48;
		        newPin=pinPrec.substring(0, 0);
			    cifra++;
			    newPin=newPin.concat(cifra.toString());
			    newPin=newPin.concat("0");
			    newPin=newPin.concat("0");
			    newPin=newPin.concat("0");
		    }
            return newPin;
        }//fine 1 cifra
}
