
import java.util.Scanner;

public class Solution
{
   public static void main(String[] args) 
   {
      
	  Scanner scan = new Scanner(System.in);
      System.out.println("Zadejte prosim libovolna pismena : ");
      String st = scan.nextLine();
      char ch[] = st.toCharArray();//converts String to character array = prevede retezec na pole znaku
      int n = ch.length;
      for (int i = 0; i < n; i++) 
      {
         int count = 1;
         for (int j = i+1; j < n; j++) 
         {
            if (ch[i]!=' '&&ch[i]==ch[j]) 
            {
               count++;//increment count = pocet prirustku
               for (int j2 = j; j2 < n-1; j2++)
               {
                  //Shift all the subsequent chars in the array to the left = Posunte vsechny nasledujici znaky v poli doleva
                  ch[j2]=ch[j2+1];
               }
               n--;
               j--;
            }
         }
         
         if (count > 1)
         {
        	 //System.out.println("Znaky, ktere se opakuji : ");
             System.out.println("Znak: "+ch[i]+" ;pocet opakovani: "+count);
         }
         else
         {
        	 //System.out.println("Zadny znak se neopakuje. ");
         }
      }    
   }
}

/*
public class Solution {
	private static Scanner sc;
	
	public static void main(String[] args) {
		String asciistr;
		int i = 0;
		
		sc= new Scanner(System.in);

		System.out.print("Zadejte libovolna pismena : ");
		asciistr = sc.nextLine();
		
		for(i = 0; i < asciistr.length(); i++)
		{
			System.out.println("The ASCII Value of " + asciistr.charAt(i) +
					" Character = " + asciistr.codePointAt(i));
		}
		
		while(i < asciistr.length())
		{
			System.out.println("Znaky, ktere se opakuji " + asciistr.charAt(i) +
					" Character = " + asciistr.codePointAt(i));
			i++;			
		}
	}
}
*/

