import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private int hitCount;

    public void init() {
        // Reset hit counter.
        hitCount = 0;
    }


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        hitCount++;

        res.setContentType("text/html");
        String searchQuery = req.getParameter("q");
        String userName = req.getParameter("name");
        PrintWriter out = res.getWriter();

        if(userName != null) {
            out.println("<h2>Hello, " + userName + "</h2>");
        }

        out.println("<h1>Hello, World!</h1>");
        out.println("<h3>Hit count:" + hitCount + "</h3>");

        if(searchQuery != null) {
            out.println("<p>Here are your results for " + searchQuery + "</p>");
        }

    }
}
