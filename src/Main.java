import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String name, address;
        int age;
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("src/users",true));
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your address:");
        address = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        pw.println(name+","+address+","+ age);
        pw.flush();
        pw.close();
    }
}