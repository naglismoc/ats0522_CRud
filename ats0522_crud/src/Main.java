import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sveiki atvyke i knygyna!");
        ArrayList<Book> library = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            info();
            int option = 0;
            while(option == 0) {
                try {
                    option = sc.nextInt();
                } catch (Exception e) {
                    sc.nextLine();
                    System.out.println("ivesk skaiciu nuo 0 iki 3");
                }
            }
            sc.nextLine();
            switch (option ){
                case 1:
                    library.add(createBook(sc));
                    break;
                case 2:
                    System.out.println(library);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("kazka ne taip ivedei");
            }
        }
    }

    public static void  info(){
        System.out.println("pasiriknite ka darysite:");
        System.out.println("1. ivesti knyga.");
        System.out.println("2. perziureti knygas");
        System.out.println("3. iseiti is programos");
    }
    public static Book createBook(Scanner sc){
        Book b = new Book();
        System.out.println("iveskite knygos pavadinima");
        b.setTitle(sc.nextLine());
        System.out.println("iveskite knygos puslapiu kieki");
        b.setPages(sc.nextInt());
        System.out.println("iveskite knygos isleidimo metus");
        b.setReleaseYear(sc.nextInt());
        sc.nextLine();
        return b;
    }

}
