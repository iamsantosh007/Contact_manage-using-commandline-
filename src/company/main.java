package company;
import java.util.Scanner;
public class main {
    static mobile m=new mobile();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        while(!start()){
            start();
        }
    }
    public static boolean start(){
        boolean start=true;
        boolean quit=false;
        while(!quit){
            System.out.println("1-add \n"+
                    "2-show \n"+
                    "3-update \n"+
                    "4-remove \n"+
                    "5-exit");
            System.out.println("enter your choice:-");
            try {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        addthis();
                        break;
                    case 2:
                        m.show();
                        break;
                    case 3:
                        updatethis();
                        break;
                    case 4:
                        removethis();
                        break;
                    case 5:
                        quit = true;
                        break;
                    default:
                        System.out.println("enter in the range of 1-5");
                }
            }catch(Exception e){
                System.out.println("please enter integer format only");
                sc.nextLine();
                quit=true;
                start=false;

            }

        }
        return start;
    }

    public static void addthis(){
        System.out.println("enter the name:");
        sc.nextLine();
        String g=sc.nextLine();
        System.out.println("enter phone number:-");
        try {
            int b = sc.nextInt();
            contact c = new contact(g, b);
            m.add(c);
        }catch(Exception e){
            System.out.println("please enter the phone number in Integer format");
            sc.nextLine();
        }
    }

    public static void updatethis(){
        System.out.println("enter the name for updation");
        sc.nextLine();
        String v=sc.nextLine();
        m.update(v);
    }

    public static void removethis(){
        System.out.println("enter the name for deletion");
        sc.nextLine();
        String s=sc.nextLine();
        m.remove(s);
    }

}
