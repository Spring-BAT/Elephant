package Samplework1;

//小说类
class Fiction extends Book {
    public Fiction(int pages, double price) {
    this.pages = pages;
    this.price = price;
}
    public void Info() {
        System.out.println("This is a fiction,which has" +pages+ "pages,"+"costs"+price+"yuan.");
    }
}