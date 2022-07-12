/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class Puppy {
    int PuppyAge;
    
    public Puppy(String name){
     System.out.println("Passed Name is: "+name);
    }
    public void setAge(int age){
      PuppyAge = age;
    }
    public int getAge(){
     System.out.println("Puppy`s age is: "+ PuppyAge);
     return PuppyAge;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Puppy myPuppy = new Puppy( "oxy" );
        myPuppy.setAge(5);
        myPuppy.getAge();
        
        /*Var
        
        */
        System.out.println("Variable Value : " +myPuppy.PuppyAge);

    }
    
}
