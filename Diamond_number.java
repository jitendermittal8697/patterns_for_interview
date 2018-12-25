/*
   1
  212
 32123
4321234
 32123
  212
   1
*/

class Diamond_number
{
    public static void main(String... args)
    {
        int n = 4;
        for(int i = -n ; i < n ; i++)
        {
            for(int j = -n ; j < n ; j++)
            {
                //if(Math.abs(j) < n-Math.abs(i+1))
                if(Math.abs(j) < n - Math.abs(i))
                    System.out.print(Math.abs(j)+1);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}