package FirstTask;

public enum AnimalType {
    CAT("Cat"), DOG("Dog"), DUCK("Duck");
    private String type;
    AnimalType(String type){
        this.type = type;
    }
    public String getAnimalType(){
        return type;
    }
}