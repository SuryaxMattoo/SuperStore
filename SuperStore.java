import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SuperStore {
    public static void main(String[] args) {
        // Initialize store inventory
        List<Item> inventory = new ArrayList<>();
        inventory.add(new Item("Beats", "Music", 10_000));
        inventory.add(new Item("Uzi collab", "Music", 15_000));
        inventory.add(new Item("Made album", "Music", 12_000));
        inventory.add(new Item("Pierre Bourne Producing", "Music", 20_000));
        inventory.add(new Item("Opium Record Label", "Music", 17_000));
        inventory.add(new Item("Sprite Cranberry", "Food", 500));
        inventory.add(new Item("Orange soda", "Food", 100));
        inventory.add(new Item("Ramune", "Food", 150));
        inventory.add(new Item("Vampire Costume", "Merchandise", 3_000));
        inventory.add(new Item("Lamborghini Huracan", "Cars", 206_295));
        inventory.add(new Item("BMW", "Cars", 71_710));
    }

    class Item {
        private String name;
        private String category;
        private int price;

    public Item(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}
}