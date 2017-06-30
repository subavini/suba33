import java.util.*;
import java.io.*;
public class Alp
{
public static void main(Sring[] args)
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.nextLine().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println("the character is alphabet");
}
else
{
System.out.println("the character is not an alphabet");
}
}
}
