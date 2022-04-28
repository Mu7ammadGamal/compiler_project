import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class test3 {     

static File file = new File("C:\\Users\\ashra\\compiler\\compiler_project\\src\\output;\n");   

 static String output = "";


    public static void main(String[] args) {
	output += "Visited Block1\n";
        int number = 34;
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
	output += "Visited Block2\n";

            // condition for i to be a prime number
            if (checkPrime(i)) {
	output += "Visited Block3\n";

                // condition for n-i to be a prime number
                if (checkPrime(number - i)) {
	output += "Visited Block4\n";

                    // n = primeNumber1 + primeNumber2
                    System.out.printf("%d = %d + %d\n", number, i, number - i);
                    flag = true;
                }

            }
        }

        if (!flag)
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
    }

    // Function to check prime number
    static boolean checkPrime(int num) {
	output += "Visited Block5\n";
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; ++i) {
	output += "Visited Block6\n";
            if (num % i == 0) {
	output += "Visited Block7\n";
                isPrime = false;
                break;
            }
        }

        	try{
		FileWriter writer=new FileWriter(file);
		writer.append(output);
		writer.close();
		}catch(IOException e){
		e.printStackTrace();
		}
return isPrime;
    }
}