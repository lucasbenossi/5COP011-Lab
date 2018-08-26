package contato2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



//DAO para acessar tabela Contato
public class ContatoDAO {
	
	private Connection connection;
	
	public ContatoDAO(){
		
		this.connection = new ConnectionFactory().getConnection();
		
	}
	
	public void inserir(Contato contato){
		
		String sql = 
				"INSERT INTO contato (NOME, EMAIL, ENDERECO, DATA_NASCIMENTO) VALUES (?,?,?,?)";
		
		//utilize sempre prepared statement pois ele � mais r�pido que statement -> consulta parametrizada
		try {
			PreparedStatement prstate = connection.prepareStatement(sql);
			
			prstate.setString(1, contato.getNome());
			prstate.setString(2, contato.getEmail());
			prstate.setString(3, contato.getEndereco());
			prstate.setDate(4, new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
			
			prstate.execute();
			
			prstate.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		}
				
		
	}
	
	public void excluir(Long id){
		
		String sql = 
				"DELETE FROM CONTATO WHERE ID=?";
		
		//utilize sempre prepared statement pois ele � mais r�pido que statement -> consulta parametrizada
		try {
			PreparedStatement prstate = connection.prepareStatement(sql);
			
			prstate.setLong(1, id);
			
			prstate.execute();
			
			prstate.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		}
				
		
	}
	
	public void alterar(Contato contato){
		
		String sql = 
				"UPDATE CONTATO SET NOME=?, EMAIL=?, ENDERECO=?, DATA_NASCIMENTO=? WHERE ID=?";
		
		//utilize sempre prepared statement pois ele � mais r�pido que statement -> consulta parametrizada
		try {
			PreparedStatement prstate = connection.prepareStatement(sql);
			
			prstate.setString(1, contato.getNome());
			prstate.setString(2, contato.getEmail());
			prstate.setString(3, contato.getEndereco());
			prstate.setDate(4, new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
			prstate.setLong(5, contato.getId());
			
			prstate.execute();
			
			prstate.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		}
				
		
	}
	
	public List<Contato> buscarPorNome(String nome){
		
		String sql = 
				"SELECT * FROM CONTATO WHERE NOME LIKE UPPER(?)";
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		//utilize sempre prepared statement pois ele � mais r�pido que statement -> consulta parametrizada
		try {
			PreparedStatement prstate = connection.prepareStatement(sql);
			
			prstate.setString(1, new String("%"+nome+"%").toUpperCase());
					
			ResultSet resultado = 
					prstate.executeQuery();
			
			while (resultado.next()){
				Contato contato = new Contato();
				contato.setId(resultado.getLong("ID"));
				contato.setNome(resultado.getString("NOME"));
				contato.setEndereco(resultado.getString("ENDERECO"));
				contato.setEmail(resultado.getString("EMAIL"));
				Calendar data = Calendar.getInstance();
				data.setTime(resultado.getDate("DATA_NASCIMENTO"));
				contato.setDataNascimento(data);
				
				contatos.add(contato);
			}
			resultado.close();
			prstate.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		}
		
		return contatos;
		
	}
	
	public Contato buscarPorId(Long id){
		
		String sql = 
				"SELECT * FROM CONTATO WHERE ID = ?";
		
		//utilize sempre prepared statement pois ele � mais r�pido que statement -> consulta parametrizada
		
		Contato contato = new Contato();
		
		try {
			PreparedStatement prstate = connection.prepareStatement(sql);
			
			prstate.setLong(1, id);
					
			ResultSet resultado = 
					prstate.executeQuery();
			
			resultado.next();
			
			
			contato.setId(resultado.getLong("ID"));
			contato.setNome(resultado.getString("NOME"));
			contato.setEndereco(resultado.getString("ENDERECO"));
			contato.setEmail(resultado.getString("EMAIL"));
			Calendar data = Calendar.getInstance();
			data.setTime(resultado.getDate("DATA_NASCIMENTO"));
			contato.setDataNascimento(data);
			
			resultado.close();
			prstate.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		}
		
		return contato;
		
	}

}
