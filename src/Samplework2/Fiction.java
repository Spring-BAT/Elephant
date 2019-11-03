package Samplework2;

public class Fiction implements Book {
    double price;
    int pages;

    public Fiction(int pages,double price){
        this.pages = pages;
        this.price = price;
    }
    //实现接口方法Info()
    public void Info(){
        System.out.println("This is a fiction,which has" +pages+ "pages,"+"costs"+price+"yuan.");
    }

}
