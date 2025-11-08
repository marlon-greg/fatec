package semana12;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO extends Produto{
	
	public List<Produto> lista = new ArrayList<Produto>();
	
	
	/**
	 * Método para ir adicionando as informações da tabela em um arquivo CSV
	 * @return
	 */
	public String toCSV(){
		String s = "Dados incluídos no CSV com sucesso";
		BD bd = new BD();
		bd.getConnection();
		String sql = "select * from produtos";
			
			try {
				PrintWriter pw = new PrintWriter("produtos.csv");
				// Esses dois vão ser sempre igual
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				
				while(bd.rs.next()) {
					pw.print(bd.rs.getInt(1)+";");
					pw.print(bd.rs.getString(2)+";");
					pw.print(bd.rs.getInt(3)+";");
					pw.print(bd.rs.getDouble(4)+"\n");
				}
				pw.close();
			}
			catch(Exception	e){
				s = "Falha ao gerar o arquivo CSV"	;
		}
			finally {
				bd.close();
			}
			return s;
		}
	
	/**
	 * Método utilizado para excluir os dados. 
	 * @return
	 */
	public String excluir() {
		String s = "Produto excluído com sucesso";
		BD bd = new BD();
		bd.getConnection();
		String sql = "delete from produtos where codigo=?";
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, getCodigo());
			
			int linhasAfetadas = bd.st.executeUpdate();
			
			if (linhasAfetadas ==0) {
				s = "Produto não encontrado!";
			}
		}
			
		catch(SQLException e){
			s = "Falha na exclusão do produto!" + e;
			
	}
		finally {
			bd.close();
		}
		return s;
		
	}
	
	

	
	
	
	/**
	 * Altera os dados confirmando alteração e se não encontrar informa qeu não encontrou
	 * @return
	 */
	public String alterar() {
		String s = "Produto alterado com sucesso";
		BD bd = new BD();
		bd.getConnection();
		String sql = "update produtos set nome=?,qtdeEstoque=?,preco=? where codigo=?";
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(4, getCodigo());
			bd.st.setString(1, getNome());
			bd.st.setInt(2, getQtdeEstoque());
			bd.st.setDouble(3, getPreco());
			
			int linhasAfetadas = bd.st.executeUpdate();
			
			if (linhasAfetadas ==0) {
				s = "Produto não encontrado!";
			}
		}
			
		catch(SQLException e){
			s = "Falha na alteração do produto!" + e;
			
	}
		finally {
			bd.close();
		}
		return s;
		
	}
	
	
	
	

	
	/**
	 * Insere no banco de dados o estado atual do produto
	 * Antes de realizar a inclusão o produto deve estar preenchido
	 * @return - Uma mensagem contendo o resultado da operação
	 */
	
	public String inserir() {
		String s = "Produto inserido com sucesso";
		BD bd = new BD();
		bd.getConnection();
		String sql = "insert into produtos values (?,?,?,?)";
		
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, getCodigo());
			bd.st.setString(2, getNome());
			bd.st.setInt(3, getQtdeEstoque());
			bd.st.setDouble(4, getPreco());
			
			bd.st.executeUpdate();
		}
			
		catch(SQLException e){
			s = "Falha na inclusão do produto!" + e;
			
	}
		finally {
			bd.close();
		}
		return s;
		
	}
	
	
	/**
	 * Retorna uma lista com todos os produtos da tabela
	 * @return
	 */
	public List<Produto> getAll(){
		BD bd = new BD();
		bd.getConnection();
		String sql = "select * from produtos";
			
			try {
				// Esses dois vão ser sempre igual
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				
				while(bd.rs.next()) {
					Produto p = new Produto(bd.rs.getInt(1),bd.rs.getString(2),bd.rs.getInt(3),bd.rs.getDouble(4));
					lista.add(p);
				}
				return lista;
			}
				
			catch(SQLException e){
				return null;
			
		}
			finally {
				bd.close();
			}
		}
		
	}


