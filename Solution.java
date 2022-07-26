
import java.util.Scanner;

public class Solution
{
   public static void main(String[] args) 
   {      
	  Scanner scan = new Scanner(System.in);
      System.out.println("Zadejte prosim libovolna pismena : ");
      String st = scan.nextLine();
      char ch[] = st.toCharArray();	//prevede retezec na pole znaku
      int n = ch.length;
      for (int i = 0; i < n; i++) 
      {
         int count = 1;
         for (int j = i+1; j < n; j++) 
         {
            if (ch[i]!=' '&&ch[i]==ch[j]) 
            {
               count++;
               for (int j2 = j; j2 < n-1; j2++)
               {                  
                  ch[j2]=ch[j2+1];
               }
               n--;
               j--;
            }
         }
         
         if (count > 1)
         {
             System.out.println("Znak: "+ch[i]+" ;pocet opakovani: "+count);
         }        
      }    
   }
}
