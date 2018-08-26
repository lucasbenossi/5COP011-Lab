package prjProdutosDBSession;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/excluir")
public class ExcluirProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ExcluirProdutoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		produtoDAO.excluir(id);
		
		RequestDispatcher view = request.getRequestDispatcher("buscar?nome=");
		view.forward(request, response);
	}

}
