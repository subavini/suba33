import java.util.*;
import java.io.*;
public class Vo
{
public static void main(String[] args)
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.nextLine().charAt(0);
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
{
System.out.println("the character is vowel");
}
else
{
System.out.println("the character is consonant");
}
}
}
