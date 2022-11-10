package hu.petrik.peoplerestclientkonzol;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static String url = "https://retoolapi.dev/cgOjdI/people";
    public static void main(String[] args) {
        try {
            newPeopleFromConsole();
            printPeople();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void newPeopleFromConsole() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a nevét");
        String name = sc.nextLine();
        System.out.println("Adja meg a EmailCimét");
        String email = sc.nextLine();
        System.out.println("Adja meg a korát");
        String age = sc.nextLine();
        String json = String.format(" { \"name\" : \"%s\", \"email\" : \"%s\", \"age\" : \"%s\"}",name,email,age);
        Response response = RequestHandler.post(url, json);
        System.out.println(response.getContent());
    }
    private static void printPeople() throws IOException {
        Response response = RequestHandler.get(url);
        System.out.println(response.getContent());
    }

}
