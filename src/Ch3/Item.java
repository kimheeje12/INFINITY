package Ch3;

import Ch3.Hero;

public class Item {

    public String ItemName;
    public String itemInfo;
    public int Count;
    public int Gold=0;
    public int redpotionCount = 0;
    public int milkCount = 0;
    public int price;
    public int count;
    public int Hp;

    public Item(int count, String itemName, String iteminfo, int price){
        this.ItemName = itemName;
        this.itemInfo = itemInfo;
        this.price = price;
        this.count = count;
    }
}