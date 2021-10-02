package entities;

public class Client {
    private String name;
    private String email;
    private String cpf;
    private String sex;
    private Double height;
    private Integer age;
    private String adress;
    private Integer number;

    public Client(){

    }
    public Client(String name, String email, String cpf, String sex, double height, int age, String adress, int number){
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.sex = sex;
        this.height = height;
        this.age = age;
        this.adress = adress;
        this.number = number;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getAdress(){
        return adress;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public String toString(){
        return "The client " + name + " is " + age + " years old and your CPF is " + cpf;
    }
}
