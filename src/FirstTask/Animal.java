package FirstTask;

import java.util.Scanner;

public class Animal {
    private String name;
    private int age;
    private String weight;
    private String color;
    private String old;
    private String type;

    public void say(){
        System.out.println("Я говорю");
    }
    public void go(){
        System.out.println("Я иду");
    }
    public void drink(){
        System.out.println("Я пью");
    }
    public void eat(){
        System.out.println("Я ем");
    }
    public void setName(){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Введите имя: ");
        this.name = s1.nextLine();
    }
    public void setAge(){
        Scanner s2 = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        this.age = s2.nextInt();
    }
    public void setWeith(){
        Scanner s3 = new Scanner(System.in);
        System.out.print("Введите вес: ");
        this.weight = s3.nextLine();
    }
    public void setColor(){
        Scanner s4 = new Scanner(System.in);
        System.out.print("Введите цвет: ");
        this.color = s4.nextLine();
    }
    public void setAnimalType(){
        Scanner c2 = new Scanner(System.in);
        System.out.print("Введите животное cat, dog или duck: ");
        this.type = c2.nextLine();
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getWeight(){
        return weight;
    }
    public String getColor(){
        return color;
    }
    public String getOldName(){
        int ageLastNumber = age % 10;
        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);

        if (ageLastNumber == 1)
            old = "год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <=9)
            old = "лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            old = "года";
        if (exclusion)
            old = "лет";
        return old;
    }
    public String getAnimalType(){
        return type.toUpperCase().trim();
    }
}
