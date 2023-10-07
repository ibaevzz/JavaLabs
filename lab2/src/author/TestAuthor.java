package author;

public class TestAuthor {
    public static void testAuthor(Author author){
        author.setEmail("ibaev.z.a@edu.mirea");
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
        System.out.println(author);
    }
}
