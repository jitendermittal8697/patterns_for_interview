/*
        3 2 1 2 3 
        2 2 1 2 2  
        1 1 1 1 1 
        2 2 1 2 2 
        3 2 1 2 3 
*/

class pattern29
{
    public static void main(String... args)
    {
        int n=2;
        for(int i = -n ; i <= n ; i++)
        {
            for(int j = -n ; j<=n ; j++)
            {
                int temp = Math.abs(i)>Math.abs(j) ? Math.abs(j) : Math.abs(i);
                System.out.print(temp + 1);
            }
            System.out.println();
        }
    }
}