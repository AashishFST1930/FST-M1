package Activities;

public class Activity5 {
    public static void main(String[] args) {
        // Create object of MyBook
        MyBook newNovel = new MyBook();

        // Set title
        String title = "The Java Journey";
        newNovel.setTitle(title);

        // Print result
        System.out.println("The title is: " + newNovel.getTitle());
    }
}