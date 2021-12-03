

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NumberLoseServlet", urlPatterns = "/incorrect")
public class NumberLoseServlet extends HttpServlet {
    String message = "You Lose!";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getParameter("message");
        request.setAttribute("message", message);

        request.getRequestDispatcher("/guessnumberoutcome.jsp").forward(request, response);
    }

    //The doPost is not necessary here
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        response.sendRedirect("guessoutcome");
//    }
}