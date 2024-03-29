package leetcode;

import java.util.ArrayList;

public class runLRUCache {
    public static void main(String[] args) {

        /*

        LRUCache myCache = new LRUCache(4);
        myCache.put("A", "The value is A");
        myCache.put("B", "The value is B");
        myCache.put("C", "The value is C");
        myCache.put("D", "The value is D");


        ArrayList<String> users = new ArrayList<String>();
        users.add("sam");
        users.add("frodo");
        users.add("david");
        users.get(0);
        users.set(0, "merry");

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
        users.remove("frodo");

        System.out.println("");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

        */

        //myCache.displayItems();
        //String value = myCache.get("A");
        //System.out.println("we found the value " + value);
        //System.out.println(" ");
        //myCache.displayItems();

    }
}

/*
class LRUCache {
    public Integer capacity;
    ArrayList<Item> items;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<Item>();
    }

    public String get(String key) {
        //System.out.println("GET: Getting an new item from the LRU Cache");
        for (Item item : items) {
            if(item.itemKey == key) {
                //System.out.println("Getting " + item.itemKey + " " + key);

                adjustItem(item);

                return item.itemValue;
            }
        }
        return "not found";
    }

    private void adjustItem(Item item) {
        for (Item currentItem: items) {

            //System.out.println(itemKey + "  " + item.itemKey + " " + item.lastUsed);
            if(item.itemKey == currentItem.itemKey) {
                System.out.println("adjust main " + item.itemKey);
                currentItem.lastUsed = 1;
            } else {
                System.out.println("adjust all the others");
                if(currentItem.lastUsed < this.capacity) {
                    currentItem.lastUsed = currentItem.lastUsed + 1;
                }

                else if (item.lastUsed > currentItem.lastUsed) {
                    System.out.println("else if ");
                    currentItem.lastUsed = currentItem.lastUsed - 1;
                } else if (item.lastUsed > currentItem.lastUsed) {
                    currentItem.lastUsed = currentItem.lastUsed + 1;
                    System.out.println("last ");
                } else {

                }

            }
            //System.out.println("Need to update " + itemKey);
            //item.lastUsed = item.lastUsed + 1;
        }

        //System.out.println("Updating " + itemKey);
    }

    public void put(String key, String value) {
        Item currentItem = new Item(key, value, 1);
        Integer currentSize = items.size();
        //System.out.println("PUT: Adding a new item to the LRU Cache");

        if(currentSize > this.capacity) {
            //System.out.println("Need to remove ");
        } else {
            //System.out.println("Ok to add");
        }

        for (Item item : items) {
            //System.out.println(item.itemKey + " " + item.itemValue + " " + item.lastUsed);
            item.lastUsed = item.lastUsed + 1;
        }

        //System.out.println("Adding new Items");
        items.add(currentItem);

    }

    public void displayItems() {
        System.out.println("Display Items");
        for (Item item : items) {
            System.out.println(item.itemKey + "- " + item.itemValue + " Last Use: " + item.lastUsed);
        }
    }
}

class Item {
    public String itemKey;
    public String itemValue;
    public Integer lastUsed;

    public Item(String itemKey, String itemValue, Integer lastUsed) {
        this.itemKey = itemKey;
        this.itemValue = itemValue;
        this.lastUsed = lastUsed;
    }
}


*/