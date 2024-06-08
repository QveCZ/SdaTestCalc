package org.example;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scan = new Scanner(System.in);
    static String[][] usersArray = new String[4][4];


    public static void main(String[] args) {

        usersArray[0] = new String[]{"Franta", "1234", "609 520 321", "Urban"};
        usersArray[1] = new String[]{"Olga", "o568", "623 520 999", "Březinová"};
        usersArray[2] = new String[]{"Zdena", "sda1", "758 520 321", "Gramlavá"};
        usersArray[3] = new String[]{"Klara", "5697", "609 650 987", "Krejčová"};
        String loggedUser = loginName();
        System.out.println(loggedUser);
//        System.out.printf("Firma %s hleda nekoho za %s na spolupraci %s",firmapole[0],firmapole[1],firmapole[2]);
        if (!Objects.equals(loggedUser, " ")) {
            System.out.println("zadejte počet firem: ");
            int numOfFirm = scan.nextInt();
            scan.nextLine();
            String[][] infoInsert = new String[numOfFirm][3];
            for (int i = 0; i < numOfFirm; i++) {
                System.out.println("zadej firmu: ");
                infoInsert[i][0] = scan.nextLine();
                System.out.println("zadej plat: ");
                infoInsert[i][1] = scan.nextLine();
                System.out.println("zadej typ spoluprace: ");
                infoInsert[i][2] = scan.nextLine();
                if (i < numOfFirm - 1) {
                    System.out.println("======dalsi firma======");
                } else {
                    System.out.println("hotovo");
                }
            }
            for (int i = 0; i < numOfFirm; i++) {
                insertList(infoInsert[i][0], infoInsert[i][1], infoInsert[i][2], loggedUser);

            }
            System.out.printf("Pro více info tel: %s jmeno: %s %S \n", usersArray[2], loggedUser, usersArray[3]);
        } else {
            System.err.println("Nepřihlášený uživatel!! Nelze zadávat inzeráty.");
        }
    }

    static String loginName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Uživatel: ");
        String user = scan.nextLine();
        System.out.println("Heslo: ");
        String pass = scan.nextLine();
        for (int i = 0; i < usersArray.length; i++) {
            if (Objects.equals(usersArray[i][0], user)) {
                if (Objects.equals(usersArray[i][1], pass)) {

                    return usersArray[i][0];
                } else {
                    System.err.println("špatné heslo");
                    return " ";
                }

            } else {
                //     System.out.println(i);
            }
        }
        System.err.println("Uživatel nenalezen");

        return " ";
    }

    static void insertList(String arg1, String arg2, String arg3, String arg4) {
        String tel = "0";
        String surname = "";
        for (int i = 0; i < usersArray.length; i++) {
            if (Objects.equals(usersArray[i][0], arg4)) {
                tel = usersArray[i][2];
                surname = usersArray[i][3];
            } else {
                //System.out.println("nic");
            }
        }
        System.out.printf("Firma %s hledá programatora na %s za %s,- Kč. \n", arg1, arg3, arg2);


    }
}