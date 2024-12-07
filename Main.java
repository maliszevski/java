import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double lowest;
        int number;



        //1
        System.out.println("Wprowadź długość boku a:");
        a = scanner.nextDouble();
        System.out.println("Wprowadź długość boku b:");
        b = scanner.nextDouble();
        c = a * b;
        System.out.println("Pole prostokąta wynosi: " + c);



        //2
        double pi = Math.PI;
        String result = String.format("%.3f", pi);
        System.out.println(result);



        //3
        double piRoot = Math.sqrt(pi);
        System.out.println(String.format("%.4f", piRoot));



        //4
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        lowest = Math.min(a, Math.min(b,c));
        System.out.println(lowest);



        //5
        number = scanner.nextInt();
        if (number < 0 || number > 9) {
            System.out.println("error");
        } else {
            String numtoString;
            switch (number){
                case 0: numtoString = "zero"; break;
                case 1: numtoString = "jeden"; break;
                case 2: numtoString = "dwa"; break;
                case 3: numtoString = "trzy"; break;
                case 4: numtoString = "cztery"; break;
                case 5: numtoString = "piec"; break;
                case 6: numtoString = "szesc"; break;
                case 7: numtoString = "siedem"; break;
                case 8: numtoString = "osiem"; break;
                case 9: numtoString = "dziewiec"; break;
                default:
                    numtoString = "";
            }
            System.out.println(numtoString);
        }




    }
}