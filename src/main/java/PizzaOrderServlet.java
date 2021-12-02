import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String crust = request.getParameter("crust_pref");
        System.out.println("crust type: " + crust);
        String sauce = request.getParameter("sauce_type_pref");
        System.out.println("sauce: " + sauce);
        String sauceAmount = request.getParameter("sauce_amount_pref");
        System.out.println("sauce amount: " + sauceAmount);

        String[] meat_top = request.getParameterValues("meat_top");  //the string meattopping matches the name in the input in the jsp file
        for (int i = 0; i < meat_top.length; i++) {
            System.out.println("Meat Toppings: " + meat_top[i]);
        }

        String[] veg_top = request.getParameterValues("veg_top");
        for (int i = 0; i < veg_top.length; i++) {
            System.out.println("Veg Toppings: " + veg_top[i]);
        }


        String size = request.getParameter("size");
        System.out.println("size: " + size);
        String address = request.getParameter("address");
        System.out.println("delivery address: " + address);


        System.out.println("crust: " + crust + " sauce type: " + sauce + " " + " sauce amount: " + sauceAmount + " Meat Toppings: " + meat_top + " "
                + "Veggie Toppings: " + veg_top + " " + "size: " + size + " " + "Address: " + address);
        response.sendRedirect("/pizza-order");

    }
}