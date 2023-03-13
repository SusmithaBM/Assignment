import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.HashMap;

public class RankServlet extends HttpServlet{
	
   private static final long serialVersionUID = 1L;

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
      String regNo = request.getParameter("regNo");

      HashMap<String, Integer> rankData = new HashMap<String, Integer>();
      rankData.put("001", 1);
      rankData.put("002", 2);
      rankData.put("003", 3);
      rankData.put("004", 4);
      rankData.put("005", 5);

      if(rankData.containsKey(regNo)){
         int rank = rankData.get(regNo);
         out.println("<html><body>");
         out.println("<h2>Rank Found:</h2>");
         out.println("<p>Register No: " + regNo + "</p>");
         out.println("<p>Rank: " + rank + "</p>");
         out.println("</body></html>");
      }
      else{
         out.println("<html><body>");
         out.println("<h2>No Rank Found for the given Register No</h2>");
         out.println("</body></html>");
      }
   }
}