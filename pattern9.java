/*
12345
1234
123
12
1

1
12
123
1234
12345
*/

class pattern9
{
    public static void main(String... args)
    {
        int n=5;
        for(int i = -n ; i <= n ; i++)
        {
            for(int j = 1 ; j <= Math.abs(i) ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}