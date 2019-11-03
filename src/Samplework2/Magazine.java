package Samplework2;

public class Magazine {

    double price;
    int pages;
    String publishing_time;
    //构造方法
    public Magazine(int pages,double price,String publishing_time){
        this.pages = pages;
        this.price = price;
        this.publishing_time = publishing_time;

    }
    //实现接口方法Info()
    public void Info(){
        System.out.println("This is a magazine,which has "+ pages+"pages,"+"costs"+price+"yuan,and publish once every"+publishing_time+".");
    }
}
