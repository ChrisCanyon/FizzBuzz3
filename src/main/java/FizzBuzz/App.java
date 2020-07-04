package FizzBuzz;
import FizzBuzz.FizzBuzzPrinter;

public class App
{
    public static void main( String[] args )
    {
        if(args.length > 2){
            System.out.println("Error: Please provide command line arguments fizzbuzz start and stop");
            return;
        }

        int start;
        int stop;
        try{
            start = Integer.parseInt(args[0]);
            stop = Integer.parseInt(args[1]);
        }catch(Exception e){
            System.out.println("Error: Start and Stop values must be integers");
            return;
        }

        FizzBuzzPrinter FBP = new FizzBuzzPrinter();
        FBP.FizzBuzz(start, stop);
    }
}
