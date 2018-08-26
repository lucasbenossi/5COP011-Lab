package contato2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet("/adicionar")
public class AdicionarContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AdicionarContatoServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContatoDAO contatoDAO = new ContatoDAO();
		Contato contato = new Contato();
		String nome = request.getParameter("nome");
		
		contato.setNome(nome);
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
		
		contatoDAO.inserir(contato);
		
		request.setAttribute("nome", nome);
		
		RequestDispatcher view = request.getRequestDispatcher("adicionar.jsp");
		view.forward(request, response);
	}

}
