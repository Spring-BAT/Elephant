package Samplework1;

//杂志类
class Magazine extends Book {
    private String publishing_time; //出版时间
    public Magazine(int pages,double price, String publishing_time){
        this.pages = pages;
        this.price = price;
        this.publishing_time = publishing_time;
    }

    @Override
    public void Info() {
        System.out.println("This is a magazine,which has "+ pages+"pages,"+"costs"+price+"yuan,and publish once every"+publishing_time+".");
    }
}
