package company;

import java.util.ArrayList;
import java.util.Scanner;

public class mobile {
    static ArrayList<contact> mycon;
    static Scanner sc=new Scanner(System.in);
    public mobile(){
        this.mycon=new ArrayList<contact>();
    }

    private int find(contact con){
        for(int i=0;i<mycon.size();i++){
            String x=mycon.get(i).getName();
            if(x.equals(con.getName())){
                System.out.println("match found of name"+x);
                return i;
            }

        }
        return -1;
    }

    private int findd(String name){
        for(int i=0;i<mycon.size();i++){
            String x=mycon.get(i).getName();
            if(x.equals(name)){
                return i;
            }
        }
        return -1;
    }


    public boolean add(contact con){
        if(find(con)<0){
            contact c=new contact(con.getName(),con.getPhone());
            mycon.add(c);
            System.out.println("successfully added name of "+con.getName()+" with phone number of "+con.getPhone());
            return true;
        }
        return false;

    }

    public void show(){
        if(mycon.size()<=0){
            System.out.println("nothing to show");

        }else{
            for(int i=0;i<mycon.size();i++){
                System.out.println(mycon.get(i).getName()+" "+mycon.get(i).getPhone());
            }
        }
    }

    public boolean update(String name){
        int x=findd(name);
        if(x>=0){
            System.out.println("enter the updated name");
            String s=sc.nextLine();
            System.out.println("enter the updated phone number");
            int p=sc.nextInt();
            contact c=new contact(s,p);
            mycon.set(x,c);
            return true;
        }
        return false;


    }

    public void remove(String name){
        int x=findd(name);
        if(x>=0){
            mycon.remove(x);
            System.out.println("successfully deleted "+name);
        }else{
            System.out.println("nothing to delete");
        }
    }
}
