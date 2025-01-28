import java.util.ArrayList;

public class de {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        ArrayList<String> food =  new ArrayList<String>();
        food.add("apple");
        food.add("Meat");
        ArrayList<String> derlist =  new ArrayList<String>();
        derlist.add("apple");
        derlist.add("Meat");
        derlist.set(0, "sushi");
        derlist.remove(2);
        derlist.clear();

        ArrayList<String> foors = new ArrayList<String>();
        ArrayList<String> fer = new ArrayList<String>();
        fer.add("foods");
        fer.add("fooods");
        fer.size();
        fer.remove(1);
        fer.clear();
        foors.clear();
        fer.set(0,"New food");
        groceryList.add(derlist);
        groceryList.add(food);
        System.out.println(groceryList.get(0).get(0));





        for(int i=0; i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
