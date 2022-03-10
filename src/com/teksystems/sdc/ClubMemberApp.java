package com.teksystems.sdc;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClubMemberApp {

    private static SoftwareDeveloperClub sdc;

    static {
        try {
            sdc = new SoftwareDeveloperClub("src/com/teksystems/sdc/members.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    ;

    public static void printMenu(){
        System.out.printf("\nSelect from the following menu:\n1. Show Members\n2. Remove Member\n3. Add Member\n4. Quit");
    }

    public static void menu(int option) {
        Scanner input = new Scanner(System.in);
        switch(option) {
            case 1: //show members
                System.out.println(sdc.displayMembers());
                break;
            case 2: //remove
                sdc.displayMembers();
                System.out.printf("Pick a Member to remove by index number", sdc.size() - 1);
                while (input.hasNext()) {
                    if(input.hasNextInt()) {
                        int index = input.nextInt();
                        if (index >= 0 && index < sdc.size()) {
                            System.out.println();
                            System.out.println(sdc.remove(index));
                            System.out.println("Member has been removed");
                            break;
                        }
                    }
                }
                break;
            case 3: //add
                System.out.println("Enter name: ");
                String name = input.nextLine().trim();
                System.out.println("Enter City: ");
                String city = input.nextLine().trim();
                System.out.println("Enter State: ");
                String state = input.nextLine().trim();
                System.out.println("Enter Favorite Language: ");
                String language = input.nextLine().trim();

                ClubMember member = new ClubMember(name, city, state, language);
                sdc.add(member);
                System.out.println();
                System.out.println("Member has been created");
                break;

            default:
                System.out.println("Pick a number 1-4");
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        printMenu();
        System.out.println();

        while(input.hasNext()){
            if(input.hasNextInt()){
                int option = input.nextInt();
                if (option == 4) break;
                else{
                    menu(option);
                }
            }else{
                System.out.println("Enter a number 1-4");
            }
            printMenu();
            System.out.println();
        }
        input.close();

    }


}
