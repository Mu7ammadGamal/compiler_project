import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class temp {
    public static void main(String[] args) {

        Set<Integer> s = new HashSet<Integer>();
        s.add(5);
        s.add(1);
        s.add(5);
        System.out.println(s.contains(2));
    }
}

