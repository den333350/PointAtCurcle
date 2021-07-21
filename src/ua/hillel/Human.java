package ua.hillel;

public class Human {
    private String surname;
    private String name;
    private String patronymic;

    Human(String surname,String name,String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    Human(String surname,String name){
        this.surname = surname;
        this.name = name;
    }

    public String fullNameOut(){
        String str;
        if(patronymic == null){
            str = String.format("%s %s",surname,name);
        }else {
            str = String.format("%s %s. %s.",surname,name.charAt(0),patronymic.charAt(0));
        }
        return str;
    }
}
