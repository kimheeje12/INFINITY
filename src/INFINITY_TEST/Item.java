package INFINITY_TEST;

public class Item {
        public String ItemName;
        public String itemInfo;
        public int price;
        public int count;
        public int Hp;

    public Item(int count, String itemName, String iteminfo, int price){
            this.ItemName = itemName;
            this.itemInfo = itemInfo;
            this.price = price;
            this.count = count;
        }

    public int getprice(){
        return price;
    }
    public void setprice(int price){
        this.price = price;
    }

    public int getCount(){return count;}
    public String getName(){
        return this.ItemName;
    }
    public String getItemInfo(){
        return this.itemInfo;
    }

    public void setCount(int count){this.count += count;}
    public void setCount2(int count){this.count -= count;}
}