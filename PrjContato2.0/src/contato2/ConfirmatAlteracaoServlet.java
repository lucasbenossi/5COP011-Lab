package contato2;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/confirmar-alteracao")
public class ConfirmatAlteracaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ConfirmatAlteracaoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Contato contato = new Contato();
		
		contato.setId(Long.parseLong(request.getParameter("id")));
		contato.setNome(request.getParameter("nome"));
		contato.setEndereco(request.getParameter("endereco"));
		contato.setEmail(request.getParameter("email"));
		
		String dataText = request.getParameter("nascimento");
		Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dataText);
			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			contato.setDataNascimento(dataNascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		contatoDAO.alterar(contato);
		
		request.setAttribute("nome", contato.getNome());
		
		RequestDispatcher view = request.getRequestDispatcher("confirmar-alteracao.jsp");
		view.forward(request, response);
	}

}
