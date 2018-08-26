package contato2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
@WebServlet("/alterar")
public class AlterarContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public AlterarContatoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ContatoDAO contatoDAO = new ContatoDAO();
			
			Contato contato = contatoDAO.buscarPorId(Long.parseLong(request.getParameter("id")));
	
			request.setAttribute("id", contato.getId());
			request.setAttribute("nome", contato.getNome());
			request.setAttribute("endereco", contato.getEndereco());
			request.setAttribute("email", contato.getEmail());
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			request.setAttribute("nascimento", formatter.format( contato.getDataNascimento().getTime()));
			
			RequestDispatcher view = request.getRequestDispatcher("alterar.jsp");
			view.forward(request, response);
	}

}
