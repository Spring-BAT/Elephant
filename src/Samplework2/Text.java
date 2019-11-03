package Samplework2;

public class Text {
    public static void main(String[] args){
        Fiction f = new Fiction(211,12);
        f.Info();
        Magazine m = new Magazine(3,30,"6 months");
        m.Info();
        Journal j = new Journal(274,36,"3 years");
        j.Info();
        Textbook t = new Textbook(187, 10.19,"students");
        t.Info();
    }
}
