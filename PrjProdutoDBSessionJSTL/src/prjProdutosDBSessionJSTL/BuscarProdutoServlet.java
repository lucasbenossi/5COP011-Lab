package prjProdutosDBSessionJSTL;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/buscar")
public class BuscarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BuscarProdutoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		String nome = request.getParameter("nome");
		
		List<Produto> produtos = produtoDAO.buscarPorNome(nome);
		
		request.setAttribute("produtos", produtos);
		
		RequestDispatcher view = request.getRequestDispatcher("buscar.jsp");
		view.forward(request,response);

	}

}
