package com.hutao.page.page106;

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree = degree;
    }

    public void describe(){
        System.out.print("This burrito is ");
        switch (degree){
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalappeno = new Burrito(Spiciness.HOT),
                hotpot = new Burrito(Spiciness.VERY_SPICY);
        plain.describe();
        greenChile.describe();
        jalappeno.describe();
        hotpot.describe();
    }
}
