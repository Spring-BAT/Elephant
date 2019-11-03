package Samplework2;

public class Textbook {
    double price;
    int pages;
    String applicable_object;//适用对象
    //构造方法
    public Textbook(int pages,double price,String applicable_object){
        this.pages = pages;
        this.price = price;
        this.applicable_object = applicable_object;

    }
    //实现接口方法Info()
    public void Info(){
        System.out.println("This is a Textbook,which has "+ pages+"pages,"+"costs"+price+"yuan,and applicable for "+applicable_object+".");
    }

}
