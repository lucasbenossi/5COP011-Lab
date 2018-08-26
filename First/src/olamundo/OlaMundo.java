package olamundo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class OlaMundo
 */
@WebServlet("/oi")
public class OlaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OlaMundo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Primeira servlet");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Ola Mundo!");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
