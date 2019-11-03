package Samplework1;

//期刊类
class Journal extends Book {
    private String publishing_time; //出版时间
    public Journal(int pages, double price, String publishing_time){
        this.pages = pages;
        this.price = price;
        this.publishing_time = publishing_time;
    }

    @Override
    public void Info() {
        System.out.println("This is a magazine,which has "+pages+"pages,"+"costs"+price+"yuan,and publish once every"+publishing_time+".");
    }
}