package contato2;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.LinkedList;
import java.util.List;

@WebServlet("/buscar")
public class BuscarContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BuscarContatoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContatoDAO contatoDAO = new ContatoDAO();
		String nomeContato = request.getParameter("nomeContato");
		
		List<Contato> listaContatos = contatoDAO.buscarPorNome(nomeContato);
		
		request.setAttribute("listaContatos", listaContatos);
		
		HttpSession session = request.getSession();
		Object listaBuscasObj = session.getAttribute("listaBuscas");
		
		if(listaBuscasObj == null){
			LinkedList<String> listaBuscas = new LinkedList<String>();
			listaBuscas.add(nomeContato);
			session.setAttribute("listaBuscas", listaBuscas);
		}
		else{
			LinkedList<String> listaBuscas = (LinkedList<String>)listaBuscasObj;
			listaBuscas.add(nomeContato);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("buscar.jsp");
		view.forward(request, response);
	}

}
