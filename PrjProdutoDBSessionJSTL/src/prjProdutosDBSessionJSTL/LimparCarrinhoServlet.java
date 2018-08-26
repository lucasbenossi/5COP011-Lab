package prjProdutosDBSessionJSTL;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/limpar-carrinho")
public class LimparCarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LimparCarrinhoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LinkedList<Produto> carrinho = (LinkedList<Produto>)request.getSession().getAttribute("carrinho");
		
		if(carrinho != null){
			carrinho.clear();
		}
		
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
	}

}
