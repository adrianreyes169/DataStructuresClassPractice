public class Book {
    private String title;
    private int pages;
    
    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    public String getTitle(){return this.title;}
    public int getPages(){return this.pages;}

    public void setTitle(String newTitle){this.title = newTitle;}
    public void setPages(int newPages){this.pages = newPages;}

    public boolean isLong(){return this.pages >= 300;}
}
