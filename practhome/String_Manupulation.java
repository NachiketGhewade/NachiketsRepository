package practhome;

public class String_Manupulation {
	
	public static void main (String[]args) {
		
		String str = "   How are you Kunal ??   ";
		
		String cg[] =str.split(" ");
		System.out.println(str.trim());
		for(int i=cg.length-1; i>=0;i--) {
			
			System.out.print(cg[i]+" ");
		}
		
		String str1 = "How are You Kunal ??";
		
		
		System.out.println(str.charAt(9));
		System.out.println(str.length());
		
		System.out.println(str.indexOf('n'));
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf('o', 2));
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.substring(6));
		System.out.println(str.trim());
		System.out.println(str.replace(" ", "*"));
		
		String str2 = "Hello WORLD HOW ARE YOU";
		String val[]=str2.split(" ");
		for (int i=val.length-1; i>=0;i--) {
			System.out.print(val[i] +" ");
			//System.out.print(" ");
		}
		
		
		String abc = "i am doing great";
		String bro[] = abc.split(" ");
	    for (int i=bro.length-1;i>=0; i--) {
	    	System.out.print(bro[i]+" ");
	    }
		
		System.out.println(abc.charAt(0));
		
		
		
		
		
		
		
		
		
	}

}
