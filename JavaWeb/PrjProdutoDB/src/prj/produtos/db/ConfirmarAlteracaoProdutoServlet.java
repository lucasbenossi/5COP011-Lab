package prj.produtos.db;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfirmarAlteracaoProdutoServlet
 */
@WebServlet("/confirmarAlteracaoProduto")
public class ConfirmarAlteracaoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmarAlteracaoProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		
		produto.setId(Long.parseLong(request.getParameter("id")));
		produto.setNome(request.getParameter("nome"));
		produto.setPreco(Double.parseDouble(request.getParameter("preco")));
		produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
		
		produtoDAO.alterar(produto);
		
		PrintWriter out = response.getWriter();
		
		out.println("Produto alterado");
	}

}
