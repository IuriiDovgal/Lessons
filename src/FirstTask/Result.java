package FirstTask;

import java.util.*;

public class Result {
    public static void main(String[] args) {
        ActionCases data = new ActionCases();
        Choice action = new Choice();

        while (true) {
            int n = 1;
            action.setAction();
            try {
                Action act = Action.valueOf(action.getAction());

                   switch (act) {
                       case ADD:
                           data.addCase();
                           break;
                       case LIST:
                           System.out.println("Пока хз как...");
                           break;
                       case EXIT:
                           n = 0;
                           break;
                             }
                 } catch (IllegalArgumentException e1) {
               System.out.println("Введено неверное значение!");
                                  }
            if (n == 0) break;
        }
    }
}









