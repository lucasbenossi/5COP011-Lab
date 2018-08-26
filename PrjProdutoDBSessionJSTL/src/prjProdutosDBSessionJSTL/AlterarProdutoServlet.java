package prjProdutosDBSessionJSTL;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alterar")
public class AlterarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AlterarProdutoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		Produto produto = produtoDAO.buscarPorId(id);
		
		request.setAttribute("id", id);
		request.setAttribute("nome", produto.getNome());
		request.setAttribute("preco", produto.getPreco());
		request.setAttribute("quantidade", produto.getQuantidade());
		
		RequestDispatcher view = request.getRequestDispatcher("alterar.jsp");
		view.forward(request, response);
	}

}
