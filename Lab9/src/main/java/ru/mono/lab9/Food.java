package ru.mono.lab9;

public enum Food {
    STEAK("Steak",10),
    CAKE("Cake",25),
    PUMPKIN_PIE("Pumpkin pie",15),
    BAKED_POTATO("Baked potato",5),
    BORSCH("Borsch",15);


    private final String name;
    private final int price;
    public int count=0;

    private Food(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
