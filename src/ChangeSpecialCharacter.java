
public class ChangeSpecialCharacter {
	  public static void main (String[] args)
	    {
	        String str = "Pow_r @verwhelm!ng";

	        System.out.print(printDifferentSpeicalCharacter(str));
	    }

	    private static String printDifferentSpeicalCharacter(String str)
	    {
	    	 str = str.replace('@', '_').replace('!', '_');
	         return str;
	    }
}
