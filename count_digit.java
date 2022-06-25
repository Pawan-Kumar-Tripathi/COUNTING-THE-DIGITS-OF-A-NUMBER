import java.io.*;
import java.util.*;
class count_digit
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0, rem ;
        for(;number!=0;)
        {
            rem = number%10;
            count = count +1;
            number = number/10;
        }
        System.out.println(count);
    }
}
        