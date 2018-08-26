package prj.produtos.db;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlterarProdutoServlet
 */
@WebServlet("/alterarProduto")
public class AlterarProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = produtoDAO.buscarPorId(Long.parseLong(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>Alterar produto</title></head>");
		out.println("<body>");
		out.println("<form action=\"confirmarAlteracaoProduto\" method=\"POST\" >");
		out.println("<input type=\"hidden\" name=\"id\" value=\""+produto.getId().toString()+"\" >");
		out.println("Nome: <input type=\"text\" name=\"nome\" value=\""+produto.getNome()+"\" ><br>");
		out.println("Preco: <input type=\"text\" name=\"preco\" value=\""+produto.getPreco()+"\" ><br>");
		out.println("Quantidade: <input type=\"text\" name=\"quantidade\" value=\""+produto.getQuantidade()+"\" ><br>");
		out.println("<input type=\"submit\" value=\"Alterar\" >");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
