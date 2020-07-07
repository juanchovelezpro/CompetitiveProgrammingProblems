import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class peasoup {

    public boolean hasSoupAndPancakes(Restaurant restaurant) {

        if (restaurant.getItems().contains("pea soup") && restaurant.getItems().contains("pancakes")) {

            return true;

        } else {

            return false;

        }


    }


    public String whereToEat(LinkedList<Restaurant> restaurants) {

        String eatHere = "Anywhere is fine I guess";
        boolean finded = false;

        for (int i = 0; i < restaurants.size() && !finded; i++) {

                if(hasSoupAndPancakes(restaurants.get(i))){

                    eatHere = restaurants.get(i).getName();
                    finded = true;
                }


        }

        return  eatHere;


    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        peasoup checker = new peasoup();

        int nRest = Integer.parseInt(scan.nextLine());
        LinkedList<Restaurant> myRestaurants = new LinkedList<>();


        for (int i = 0; i < nRest; i++) {

            int items = Integer.parseInt(scan.nextLine());
            myRestaurants.add(new Restaurant(scan.nextLine()));
            for (int j = 0; j < items; j++) {

                myRestaurants.getLast().getItems().add(scan.nextLine());

            }


        }

        System.out.println(checker.whereToEat(myRestaurants));


    }

}

class Restaurant {

    private String name;
    private ArrayList<String> items;

    public Restaurant(String name) {

        this.name = name;
        items = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return name + "Items:" + items;
    }
}
