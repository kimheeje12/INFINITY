package INFINITY_END;

public class Inventory {
    public Item[] items;
    public String ItemName;
    public String itemInfo;
    public int Count = 0;
    public int redpotionCount=0;
    public int milkCount=0;
    public int goldCount=0;

    Item redpotion = new Item(10,"빨간물약","HP+100", 50);
    Item milk = new Item(5, "순록우유", "HP+300",150);

    public Inventory() {
        items = new Item[2];
        items[0] = redpotion;
        items[1] = milk;
    }

    public int getRedpotionCount(){
        return redpotionCount;
    }
    public int getMilkCount(){
        return milkCount;
    }
    public int getGoldCount() {return goldCount;}

    public int getCount(){return Count;}
    public String getName(){
        return ItemName;
    }
    public String getItemInfo(){
        return itemInfo;
    }

    public void setCount(int count){this.Count += count;}
    public void setCount2(int count){this.Count -= count;}

    public void itemshow(){
        System.out.println(items[0].ItemName +" "+ items[0].count);
        System.out.println(items[1].ItemName +" "+ items[1].count);
    }

    //Hero 빨간물약 감소 갯수카운팅
    public void setRedpotionCount(int potionCount) {
        if (items[0].count <= 0) {
            items[0].count = 0;
            System.out.println("\n");
            System.out.println("※ 빨간 포션이 부족합니다. 구매해주세요!");
        }else{
            items[0].count -= potionCount;
        }
    }

    //Hero 빨간물약 증가 갯수카운팅
    public void setRedpotionCount2(int potionCount) {
            items[0].count += potionCount;
    }

    //Hero 순록우유 감소 갯수카운팅
    public void setMilkCount(int potionCount){
        if(items[1].count <= 0){
            items[1].count = 0;
            System.out.println("\n");
            System.out.println("※ 순록 우유가 부족합니다. 구매해주세요!");
        }else {
            items[1].count -= potionCount;
        }
    }

    //Hero 순록우유 증가 갯수카운팅
    public void setMilkCount2(int potionCount){
            items[1].count += potionCount;
    }
}
