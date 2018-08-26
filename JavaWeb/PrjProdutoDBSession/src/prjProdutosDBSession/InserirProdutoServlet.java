package prjProdutosDBSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inserir")
public class InserirProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public InserirProdutoServlet() {
        super();
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produto produto = new Produto();
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		produto.setNome(request.getParameter("nome"));
		produto.setPreco(Double.parseDouble(request.getParameter("preco")));
		produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
		
		produtoDAO.inserir(produto);
		
		RequestDispatcher view = request.getRequestDispatcher("buscar?nome=");
		view.forward(request, response);
	}

}
