package ex.calculadora;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		double valor1 = Double.parseDouble(request.getParameter("valor1"));
		double valor2 = Double.parseDouble(request.getParameter("valor2"));
		String operacao = request.getParameter("operacao");
		double resultado = 0;
		
		if( operacao.compareTo("somar") == 0 ){
			resultado = valor1 + valor2;
		}
		else if( operacao.compareTo("subtrair") == 0 ){
			resultado = valor1 - valor2;
		}
		else if( operacao.compareTo("multiplicar") == 0 ){
			resultado = valor1 * valor2;
		}
		else if( operacao.compareTo("dividir") == 0 ){
			resultado = valor1 / valor2;
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("Resultado: "+resultado);
		out.println("</body>");
		out.println("</html>");
	}

}
