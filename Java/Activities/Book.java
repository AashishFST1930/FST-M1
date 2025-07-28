package Activities;

abstract class Book {
    String title;

    // Abstract method
    public abstract void setTitle(String s);

    // Concrete method
    public String getTitle() {
        return title;
    }
}