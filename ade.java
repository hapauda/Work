public class ade {
        public static void main(String[] args) {

        Hero hero2 = new Hero("sup",21,"espace");
        System.out.println(hero2.toString());
        
        


        }  
}
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String toString(){
        return this.name + "\n" + this.age + "\n";
    }
    

}
class Hero extends Person {

    String Power;
    Hero(String name, int age, String Power){
        super(name, age);
        this.Power = Power;

    }
    public String toString(){
        return super.toString()+ this.Power;  
        
        }
    
}
