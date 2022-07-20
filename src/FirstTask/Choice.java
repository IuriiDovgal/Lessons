package FirstTask;

import java.util.Scanner;

public class Choice {
    private String action;

    public void setAction() {
        Scanner c1 = new Scanner(System.in);
        System.out.print("Введите действие add, list или exit: ");
        this.action = c1.nextLine();
    }

    public String getAction() {
        return action.toUpperCase().trim();
    }
}