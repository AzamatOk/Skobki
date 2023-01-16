import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        Valid skobki = new Valid();
        System.out.print(skobki.isValid(str));

    }
}