/*
1
12
123
1234
12345
1234
123
12
1
*/

class pattern8
{
    public static void main(String... args)
    {
        int n=4;
        for(int i = -n ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n + 1 - Math.abs(i) ; j++)
            {
                System.out.print(j); 
            }
            System.out.println();
        }
    }
}