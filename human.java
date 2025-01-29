
public class human {
    public static void main(String[] args) {
        carr car = new carr("Ford", "Whte", 1222);
        car.set("Ferrari", null, 0);;
        car.mensage();
        
    }

    
}
class carr {
    private String make;
    private String color;
    private int year;
    carr(String make, String color, int year){
        this.set(make, color, year);
    }
    String getmake() {
        return make;
        
    }
    String getColor(){
        return color;
    }
    int getyear(){
        return year;
    }
    public void mensage(){
        System.out.println(getmake());
        System.out.println(getyear());
        System.out.println(getColor());
    }
    public void set(String make, String color, int year){
        if (make != null){
            this.make = make;
            
        }
        if (color != null){
            this.color = color;
        }
        if (year != 0){
            this.year = year;

        }

    }


    
}
