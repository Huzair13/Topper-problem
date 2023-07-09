import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int evenSum=0;
        int oddSum=0;
        while(number>0){
            if((number%10)%2==0){
                evenSum+=number%10;
                number/=10;
            }else{
                oddSum+=number%10;
                number/=10;
            }
        }
        System.out.print(evenSum==oddSum);
    }
}