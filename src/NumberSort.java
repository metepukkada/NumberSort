import java.util.Scanner;

public class NumberSort {
    public static void main(String[] args) {
        int a,b,c;
        Scanner data = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        a = data.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        b = data.nextInt();

        System.out.print("3. Sayıyı Giriniz: ");
        c = data.nextInt();

        if ( a < c && a < b ){
            if ( b < c ) {
                System.out.println( " a < b < c " );
            }else if ( c < b ){
                System.out.println( " a < c < b " );
            }
        } else if ( b < c && b < a) {
            if ( c < a ){
                System.out.println( " b < c < a " );
            } else if ( a < c ) {
                System.out.println( " b < a < c " );
            }

        }else if ( c < a && c < b ){
            if ( a < b ){
                System.out.println( " c < a < b " );
            }else if ( b < a ){
                System.out.println( " c < b < a " );
            }
        } if ( a == b ){
            if ( b == c ){
                System.out.println( " a = b = c " );
            }else if( c < a ){
                System.out.println( " c < a = b ");
            }else{
                System.out.println( " a = b < c " );
            }
        } else if ( b == c  ) {
            if ( a < b ){
                System.out.println(" a < b = c ");
            }else{
                System.out.println(" b = c < a ");
            }
        } else if ( a == c ) {
            if ( b < c ){
                System.out.println( " b < a = c " );
            }else{
                System.out.println( " a = c < b " );
            }

        }
    }
}
