package prj.produtos.db;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Servlet implementation class BuscarProdutoServlet
 */
@WebServlet("/buscarProduto")
public class BuscarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		String nomeProduto = request.getParameter("nomeProduto");
		
		List<Produto> produtos = produtoDAO.buscarPorNome(nomeProduto);
		
		PrintWriter out =
				response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("table, th, td { border: 1px solid black; }");
		out.println("</style>");
		out.println("<title>Produtos buscados</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>Id</th>");
		out.println("<th>Nome</th>");
		out.println("<th>Preço</th>");
		out.println("<th>Quantidade</th>");
		out.println("<th>&nbsp;</th>");
		out.println("<th>&nbsp;</th>");
		out.println("</tr>");
		
		for (Produto produto : produtos){
			out.println("<tr>");
			out.println("<td>");
			out.println(produto.getId());
			out.println("</td>");
			out.println("<td>");
			out.println(produto.getNome());
			out.println("</td>");
			out.println("<td>");
			out.println(produto.getPreco());
			out.println("</td>");
			out.println("<td>");
			out.println(produto.getQuantidade());
			out.println("</td>");
			out.println("<td>");
			out.println("<a href=\"/PrjProdutoDB/alterarProduto?id="+produto.getId()+"\">Alterar</a>");
			out.println("<td>");
			out.println("<a href=\"/PrjProdutoDB/excluirProduto?id="+produto.getId()+"\">Excluir</a>");
			out.println("</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

}
