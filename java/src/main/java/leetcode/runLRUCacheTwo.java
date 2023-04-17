package leetcode;

import java.util.ArrayList;

public class runLRUCacheTwo {
    public static void main(String[] args) {
        LRUCacheString myCache = new LRUCacheString(3);
        myCache.put("A", "The value is A");
        myCache.put("B", "The value is B");
        myCache.put("C", "The value is C");
        //myCache.get("B");
        String justGot = myCache.get("B");
        System.out.println("GET " + justGot);
        myCache.put("D", "The value is D");
        myCache.displayItems();

    }

}

class LRUCacheString {
    public Integer capacity;
    ArrayList<Item> items;

    public LRUCacheString(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<Item>();
    }

    public String get(String key) {
        for (int i = 0; i < items.size(); i++) {
            String currentKey = items.get(i).itemKey;
            //System.out.println(currentKey + " | " + key);

            if(currentKey.equalsIgnoreCase(key)) {
                System.out.println("MATCH FOUND " + currentKey + " " + key);
                Item replaceItem = items.get(i);
                items.remove(i);
                items.add(replaceItem);
                return items.get(i).itemValue;
            }


        }
        return "-1";
    }

    public void put(String key, String value) {
        Integer currentSize = items.size();
        Item newItem = new Item(key, value);

        if(currentSize >= this.capacity) {
            items.remove(0);
            items.add(newItem);
        } else {
            items.add(newItem);
        }

    }

    public void displayItems() {
        System.out.println("Display Items");
        for (Item item : items) {
            System.out.println(item.itemKey + ": " + item.itemValue);
        }
    }
}

class Item {
    public String itemKey;
    public String itemValue;
    //public Integer lastUsed;

    public Item(String itemKey, String itemValue) {
        this.itemKey = itemKey;
        this.itemValue = itemValue;
        //this.lastUsed = lastUsed;
    }
}



/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
