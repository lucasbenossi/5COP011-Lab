package prj.produtos.db;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class InserirProdutoServlet
 */
@WebServlet("/inserirProduto")
public class InserirProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produto produto = new Produto();
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		produto.setNome(request.getParameter("nomeProduto"));
		produto.setPreco(Double.parseDouble(request.getParameter("precoProduto")));
		produto.setQuantidade(Integer.parseInt(request.getParameter("quantidadeProduto")));
		
		produtoDAO.inserir(produto);
		
		PrintWriter out = response.getWriter();
		
		out.println("Produto inserido (na teoria)");
	}

}
