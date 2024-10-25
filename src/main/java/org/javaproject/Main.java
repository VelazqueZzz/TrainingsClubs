package org.javaproject;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String mem;
        MembershipManagement mm=new MembershipManagement();
  FileHandler fh = new FileHandler();
        LinkedList<Member>members = fh.readFile();
        int choise = mm.getChoice();
        while(choise != -1){
            switch(choise){
                case 1:
                    mem=mm.addMembers(members);
                    fh.appendFile(mem);
                    break;
                    case 2:
                        mm.removeMember(members);
                        fh.overwriteFile(members);
                        break;
                        case 3:
                            mm.printMemberInfo(members);
                            break;
                default:
                    System.out.println("\nYou have selected an invalid option.\n\n");
                    break;
            }
            choise = mm.getChoice();
        }
        System.out.println("\nGood bye!1");

    }
}