import java.util.Scanner;
class fact{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int x=1;
while(number>0){

 x=number*x;
number--;
}
System.out.println(x);

} 
}


