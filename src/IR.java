import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

class IR{

static File file = new File("H:\\emmy\\engineering\\4th year\\2nd term\\compiler\\project\\New folder\\compiler_project\\src\\out.txt");
static String output = "";
static Set<Integer> visited = new HashSet<Integer>();

  public static void main(String[] args) {
	output += "Visited Block1\n";
    visited.add(1);

    // find GCD between n1 and n2
    int n1 = 81, n2 = 153;
    
    // initially set to gcd
    int gcd = 1;

    for (int i = 1; i <= n1 && i <= n2; ++i) {
	output += "Visited Block2\n";
    visited.add(2);

      // check if i perfectly divides both n1 and n2
      if (n1 % i == 0 && n2 % i == 0) {
	output += "Visited Block3\n";
    visited.add(3);
        gcd = i;
        break;
      }
      else{
	output += "Visited Block4\n";
    visited.add(4);
        System.out.println("blah blah");
      }
    }

    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
    	try{
		FileWriter writer=new FileWriter(file);
		writer.append(visited.toString());
		writer.close();
		}catch(IOException e){
		e.printStackTrace();
		}
return;
  }
}