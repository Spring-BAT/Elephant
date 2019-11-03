package Samplework1;

//课本类
class Textbook extends Book {
    private String applicable_object; //适用对象
    public Textbook(int pages, double price, String applicable_object){
        this.pages = pages;
        this.price = price;
        this.applicable_object = applicable_object;
    }
    public void Info(){
        System.out.println("This is a magazine,which has "+ pages+"pages,"+"costs"+price+"yuan,and applicable for "+applicable_object+".");
    }
}