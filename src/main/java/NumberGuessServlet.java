import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "NumberGuessServlet", urlPatterns = "/guessnumber")
public class NumberGuessServlet extends HttpServlet {
    Random random = new Random();
    int randomNumber = random.nextInt(3) + 1;
    int min = 1;
    int max = 3;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("randomNumber is: " + randomNumber);
        request.getRequestDispatcher("/guessnumber.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int number = Integer.parseInt(request.getParameter("number"));
        System.out.println("User number is: " + number);



    }

}