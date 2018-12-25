/*
      A
     B B
    C   C
   D     D
  E       E
 F         F
G           G
 F         F
  E       E
   D     D
    C   C
     B B
      A
*/

class Diamond_Character
{
    public static void main(String... args)
    {
        char ch = 'G';
        int lines = ch - 65;
        for(int i = -lines ; i <= lines ; i++)
        {
            int temp = lines + Math.abs(i) + 1;
            System.out.printf("%"+ temp +"s","");
            if(Math.abs(i)!=6)
            System.out.print((char)(lines-Math.abs(i)+65));
            for(int j = 1 ; j < 2*(lines - Math.abs(i)) + 1 ; j++)
            {
                System.out.print(" ");
            }
            System.out.println((char)(lines-Math.abs(i)+65));
            
        }
    }
}