package INFINITY_TEST;

public class Inventory {
    public int invSize;
    public Item[] items;
    public int invCnt = 0;
    public String ItemName;
    public int Count = 0;
    public int redpotionCount=0;
    public int milkCount=0;

    Item redpotion = new Item(10,"빨간물약","HP+100", 50);
    Item milk = new Item(5, "순록우유", "HP+300",150);
    Item gold = new Item(500,"메소","골드", 500);

    public Inventory(int invSize) {
        this.invSize = invSize;
        items = new Item[this.invSize];
        items[0] = redpotion;
        items[1] = milk;
        items[2] = gold;
    }

    public void itemshow11(){
        System.out.println(items[0].ItemName + items[0].count);
        System.out.println(items[1].ItemName + items[1].count);
        System.out.println(items[2].ItemName + items[2].count);
    }


    public int getCount(){
        return redpotion.getCount();
    }

    public int getCount2(){
        return milk.getCount();
    }

    public int getCount3(){
        return gold.getCount();
    }

    public int getRedpotionCount(){
        return redpotionCount;
    }

    public int getMilkCount(){
        return milkCount;
    }

    //Hero 빨간물약 소모 갯수카운팅
    public void setRedpotionCount(int potionCount) {
            redpotionCount -= potionCount;
        }

        //Hero 순록우유 소모 갯수카운팅
    public void setMilkCount(int potionCount){
        milkCount -= potionCount;
        }

    public void Itemshow(){
        System.out.println(redpotion.ItemName + " " + redpotionCount);
        System.out.println(milk.ItemName + " " + milkCount);
    }

    public void Itemshowinfo(){
        redpotion.setCount2(1);
        System.out.println(redpotion.ItemName + " " + redpotion.getCount());
        System.out.println(milk.ItemName + " " + milk.getCount());
        System.out.println(gold.ItemName + " " + gold.getCount());
    }

    public void Itemshowinfo2(){
        milk.setCount2(1);
        System.out.println(redpotion.ItemName + " " + redpotion.getCount());
        System.out.println(milk.ItemName + " " + milk.getCount());
        System.out.println(gold.ItemName + " " + gold.getCount());
    }

    public void Itemshowinfo3(){
        redpotion.setCount(1);
        gold.setCount2(50);
        System.out.println(redpotion.ItemName + " " + redpotion.getCount());
        System.out.println(milk.ItemName + " " + milk.getCount());
        System.out.println(gold.ItemName + " " + gold.getCount());
    }

    public void Itemshowinfo4(){
        milk.setCount(1);
        gold.setCount2(150);
        System.out.println(redpotion.ItemName + " " + redpotion.getCount());
        System.out.println(milk.ItemName + " " + milk.getCount());
        System.out.println(gold.ItemName + " " + gold.getCount());
    }

    public boolean existItem(Item item) {
        for (int i = 0; i < this.invSize; i++) {
            if (item.getName().equals(items[i].getName())) {
                return true;
            }
        }
        return false;
    }
}

