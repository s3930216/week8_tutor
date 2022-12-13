import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        String name, address;
        int age;
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("src/users.txt", true));
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your address:");
        address = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        pw.println(name + "," + address + "," + age);
        pw.flush();
        pw.close();

        //Exercise 2
        Scanner fileScanner = new Scanner(new File("src/users.txt"));
        String line;
        double sum = 0;
        int count = 0;
        while (fileScanner.hasNext()) {
            count++;
            line = fileScanner.nextLine();

            StringTokenizer reader = new StringTokenizer(line, ",");
            if (reader.countTokens() != 3) {
                throw new IOException("Invalid input format!");
            } else {
                name = reader.nextToken();
                address = reader.nextToken();
                age = Integer.parseInt(reader.nextToken());
                sum += age;
            }
            System.out.println(name + " " + age + " " + address);
        }
    }
}