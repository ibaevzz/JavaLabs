import author.Author;
import author.TestAuthor;
import ball.Ball;
import ball.TestBall;

public class Main{
    public static void main(String[] args) {
        Author author = new Author("Zubai", "ibaevzubic2004@gmail.com", 'm');
        TestAuthor.testAuthor(author);
        System.out.println();
        Ball ball = new Ball();
        TestBall.testBall(ball);
    }
}