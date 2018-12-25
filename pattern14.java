/*
1****
12***
123**
1234*
12345
*/

class pattern14
{
    public static void main(String... args)
    {
        int n=5;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(j);
            }
            for(int j = i ; j < 5 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}