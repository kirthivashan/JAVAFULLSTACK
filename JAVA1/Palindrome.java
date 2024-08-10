import java.util.Scanner;
public class Palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
String str="";
int original=num;
while(num>0){
int remainder=num%10;
str+=remainder;
num/=10;
}
int rev=Integer.parseInt(str);
if(original==rev){
System.out.println("palindrome");
}else{
System.out.println("Not palindrome");
}
}
}