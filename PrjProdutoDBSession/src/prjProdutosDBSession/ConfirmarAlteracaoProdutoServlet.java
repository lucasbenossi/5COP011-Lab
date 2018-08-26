package prjProdutosDBSession;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/confirmar-alteracao")
public class ConfirmarAlteracaoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ConfirmarAlteracaoProdutoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		
		produto.setId(Long.parseLong(request.getParameter("id")));
		produto.setNome(request.getParameter("nome"));
		produto.setPreco(Double.parseDouble(request.getParameter("preco")));
		produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
		
		produtoDAO.alterar(produto);
		
		RequestDispatcher view = request.getRequestDispatcher("buscar?nome=");
		view.forward(request, response);
	}

}
