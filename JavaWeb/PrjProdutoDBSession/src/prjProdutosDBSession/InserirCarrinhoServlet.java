package prjProdutosDBSession;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/inserir-carrinho")
public class InserirCarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public InserirCarrinhoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscarPorId(Long.parseLong(request.getParameter("id")));
		
		HttpSession session = request.getSession();
		Object carrinhoObj = session.getAttribute("carrinho");
		
		if(carrinhoObj == null){
			LinkedList<Produto> carrinho = new LinkedList<Produto>();
			carrinho.add(produto);
			session.setAttribute("carrinho", carrinho);
		}
		else{
			LinkedList<Produto> carrinho = (LinkedList<Produto>)carrinhoObj;
			carrinho.add(produto);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
	}

}
