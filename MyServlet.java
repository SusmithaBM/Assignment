import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();


    String indexString = request.getParameter("index");

    int index = Integer.parseInt(indexString);
    String[] name = {"Harvey", "Donna", "Mike", "Louis","Racheal"};

    // Retrieve the value at the specified index in the array
    String value =name[index];

    // Write the value back to the HTML page
   
    out.println("<html>");
    out.println("<body>");
    out.println("<h2>Welcome " + value + "</h2>");
    out.println("</body>");
    out.println("</html>");
  }
}