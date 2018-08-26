package contato2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/excluir")
public class ExcluirContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ExcluirContatoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		contatoDAO.excluir(id);
		
		request.setAttribute("id", id);
		
		RequestDispatcher view = request.getRequestDispatcher("excluir.jsp");
		view.forward(request, response);
	}

}
