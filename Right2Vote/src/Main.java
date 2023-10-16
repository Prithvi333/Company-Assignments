public class Main {
    public static void findPossibility(int price, int TShirt, int Jeans, int Jacket){

        if(price<50){
            System.out.println("T-Shirt = | "+TShirt+" "+"Jeans = | "+Jeans+" "+"Jacket = | "+Jacket);
            return;
        }
        if(price>=100)
            findPossibility(price-100,TShirt,Jeans,Jacket+1);
        if(price>=80)
            findPossibility(price-80,TShirt,Jeans+1,Jacket);
        if(price>=50)
            findPossibility(price-50,TShirt+1,Jeans,Jacket);

    }
    public static void main(String[] args) {

        findPossibility(600,0,0,0);
    }
}