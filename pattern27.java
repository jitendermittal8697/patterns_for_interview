/*
1 2 3 4 5 
      4
    3
  2
1 2 3 4 5
*/

class Z
{
    public static void main(String... args)
    {
        int n = 9;
        for(int i = 1 ; i <= n ; i++)
        {
            if(i==1 || i==n)
            {
                for(int j = 1 ; j <=n ; j++)
                {
                    System.out.print(j + " ");
                }
            }
            else
            {
                for(int k = 1 ; k < (n-i+1) ; k++)
                {
                    System.out.print("  ");
                }
                System.out.print(n-i+1 + " ");
            }
            System.out.println();
        }        
    }
}