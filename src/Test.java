import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {

        //D:\University\4th Year\Term 2\Compilers\Sec\compiler_project\src\test3.java

        Scanner s = new Scanner(System.in);
        String fname = s.nextLine().replaceAll("\\\\","\\\\\\\\");

        Process p =  Runtime.getRuntime().exec("java Gen_IR1.java");
        p.waitFor();
        p =  Runtime.getRuntime().exec("javac IR.java");
        p.waitFor();
        p =  Runtime.getRuntime().exec("javac Gen_IR2.java");


//        Gen_IR1 t1 = new Gen_IR1(fname);
//        try {
//            t1.main(new String[]{""});
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        p.waitFor();
//
//        IR ir = new IR();
//        IR.main(new String[]{""});
//
//        Gen_IR2 t2 = new Gen_IR2(fname);
//        try {
//            t2.main(new String[]{""});
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
