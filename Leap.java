import java.util.*;
public class Leap
{
public static void main(String[] args)
{
int a;
Scanner sc= new Scanner(System.in);
a=sc.nextInt();
if((a%4==0)&&(a%100==0))
{
System.out.println(+a"leap year");
}
else
{
System.out.println(+a"not leap year");
}
}}
