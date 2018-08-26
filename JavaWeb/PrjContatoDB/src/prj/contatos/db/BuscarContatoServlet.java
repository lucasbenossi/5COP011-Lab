package prj.contatos.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuscarContatoServlet
 */
@WebServlet("/buscarContato")
public class BuscarContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarContatoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeContato = request.getParameter("nomeContato");
		
		ContatoDAO contatoDAO = 
				new ContatoDAO();
		
		List<Contato> listaContatos = 
				contatoDAO.buscarPorNome(nomeContato);
		
		PrintWriter out =
				response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("table, th, td { border: 1px solid black; }");
		out.println("</style>");
		out.println("<title> Contatos buscados </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>");
		out.println("Nome");
		out.println("</th>");
		out.println("<th>");
		out.println("Endereço");
		out.println("</th>");
		out.println("<th>");
		out.println("E-mail");
		out.println("</th>");
		out.println("<th>");
		out.println("Data de nascimento");
		out.println("</th>");
		out.println("</tr>");
		
		for (int i = 0; i < listaContatos.size(); i++){
			out.println("<tr>");
			out.println("<td>");
			out.println(listaContatos.get(i).getNome());
			out.println("</td>");
			out.println("<td>");
			out.println(listaContatos.get(i).getEndereco());
			out.println("</td>");
			out.println("<td>");
			out.println(listaContatos.get(i).getEmail());
			out.println("</td>");
			out.println("<td>");
			SimpleDateFormat formatter = 
					new SimpleDateFormat("dd/MM/yyyy");
			out.println(formatter.format(listaContatos.get(i).getDataNascimento().getTime()));
			out.println("</td>");
			out.println("<td>");
			out.println("<a href=\"/contatos/alterar?id="+
					listaContatos.get(i).getId()+
					"\">Alterar</a>");
			out.println("<td>");
			out.println("<a href=\"/contatos/excluir?id="+
					listaContatos.get(i).getId()+
					"\">Excluir</a>");
			out.println("</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
				
	}

}
