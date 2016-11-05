package persoana;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.ArrayList;


public class MiniAgenda {
//    public static void main(String argumente []) {
//        Scanner sc=new Scanner(System.in);
//        Persoana persoana1= new Persoana();
//        System.out.println("Mini Agenda");
//        System.out.println("Nume: ");
//        String text=sc.nextLine();
//        persoana1.AgendaNume(text);
//        System.out.println("Telefon: ");
//        text=sc.nextLine();
//        persoana1.AgendaTelefon(text);
//        System.out.println("Varsta: ");
//        int varsta=sc.nextInt();
//        persoana1.AgendaVarsta(varsta);
//        System.out.println(persoana1.toString());
//    }
public static void main(String[] args) {


    int choice;
    ArrayList<Persoana> contacts = new ArrayList<Persoana>();

    Scanner in = new Scanner(System.in);


    int check;
    String contact;
    String search;




    int select=0;

    int b=0;

    do {

        System.out.println("1. Add Contact\n2. Edit Contact\n3. Delete Contact\n4. Display All Contacts\n5. Quit");
        System.out.print("Please use the numbers 1-5 to choose an option: ");

        do{//input validation
            check=0;
            if(in.hasNextInt()){
                select = in.nextInt();
                if(1<=select && 5>=select){
                    check=1;
                }else{
                    System.out.println("Invalid Input!\nPlease use the numbers 1-5 to choose an option: ");
                    System.out.println("1. Add Contact\n2. Edit Contact\n3. Delete Contact\n4. Display All Contacts\n5. Quit");
                }//end of if
            }else{
                System.out.println("Invalid Input!\nPlease use the numbers 1-5 to choose an option: ");
                System.out.println("1. Add Contact\n2. Edit Contact\n3. Delete Contact\n4. Display All Contacts\n5. Quit");
                in.next();
            }//end of if
        }while(check==0);


        switch(select){
            case 1: System.out.println("Add Contact");
                Persoana a = new Persoana();
                System.out.print("\nNume: ");
                a.AgendaNume(in.next());
                System.out.print("\nTelefon: ");
                a.AgendaTelefon(in.nextLong());
                System.out.print("\nVarsta: ");
                a.AgendaVarsta(in.nextInt());

                contacts.add(a);




                break;
            //DOAR SA EDITEZ NU AM REUSIT SA FAC!!!
            case 2: System.out.println("Edit Contact");
                System.out.println("Please enter the name of the contact you wish to edit: ");
                search = in.next();

                for(int i=0; i<contacts.size(); i++){
                    contact = (contacts.get(i).DaNume());


                    if(contact.equals(search)){

                        System.out.println("Please edit the name");
                        Persoana c = new Persoana();
                        System.out.print("\nNume: ");
                        c.AgendaNume(in.next());
                        System.out.print("\nTelefon: ");
                        c.AgendaTelefon(in.nextLong());
                        System.out.print("\nVarsta: ");
                        c.AgendaVarsta(in.nextInt());
                        contacts.add(c);
                        contacts.remove(i);


                    }
                    
                }
        break;


            case 3: System.out.println("Delete Contact");
                System.out.println("Please enter the name which you want to remove: ");
                search = in.next();



                for(int i=0; i<contacts.size(); i++) {
                    contact = (contacts.get(i)).toString();

                    if(contact.contains(search)){

                       contacts.remove(i);



                    }


                }
                    break;
            case 4: System.out.println("Display All Contact");
                for (int i=0; i<contacts.size(); i++){
                    System.out.println(contacts.get(i));
                }
                break;
            case 5:
                System.exit(5);
                break;
        }//end of switch


    }while (!(check==5));
}}
