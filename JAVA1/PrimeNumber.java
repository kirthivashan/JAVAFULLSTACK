import java.util.Scanner;
public class PrimeNumber{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int count=0;
if(n%2==0){
count++;
}else if(n%2!=0 && n%1==0){
for(int i=2;i<n;i++){
if(n%i==0){
count++;
break;
}}
}else{
System.out.println("Enter a correct number");
}
if(count==0){
System.out.println("Prime number");
}else{
System.out.println("Not a prime number");
}}}