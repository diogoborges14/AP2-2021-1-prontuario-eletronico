package entities;

public class User {
	private String name;
    private String email;
    private String cpf;
    private Double height;
    private Integer age;
    private String adress;
    private Integer number;

    public User(){

    }
    public User(String name, String email, String cpf, double height, int age, String adress, int number){
        this.name = name;
        this.email = email;
        this.cpf = cpf;
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
