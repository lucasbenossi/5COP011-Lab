package prjProdutosDBSessionJSTL;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/remover-carrinho")
public class RemoverCarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RemoverCarrinhoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long id = Long.parseLong(request.getParameter("id"));
		HttpSession session = request.getSession();
		LinkedList<Produto> carrinho = (LinkedList<Produto>)session.getAttribute("carrinho");
		
		for( Produto produto : carrinho ){
			if( id.equals(produto.getId()) ){
				carrinho.remove(produto);
				break;
			}
		}
		
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
	}

}
