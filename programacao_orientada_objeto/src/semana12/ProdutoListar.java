package semana12;

import java.util.List;

//import java.sql.SQLException;

public class ProdutoListar {

	public static void main(String[] args) {
		// Teste
		ProdutoDAO dao = new ProdutoDAO();
		System.out.println(dao.toCSV());
		//dao.setCodigo(5);
		//dao.setNome("Ipê 2");
		//dao.setQtdeEstoque(15);
		//dao.setPreco(15.45);
		//System.out.println(dao.inserir());
		//System.out.println(dao.alterar());
		
		System.out.println(dao.excluir());
		
		List<Produto> lista = dao.getAll();
		
		for(Produto p:lista) {
			System.out.println(p);
		}
		
		
		/*	BD bd = new BD();
			if (bd.getConnection()== true) {
				//deu certo
				String sql = "select * from produtos";
				
				try {
					// Esses dois vão ser sempre igual
					bd.st = bd.con.prepareStatement(sql);
					bd.rs = bd.st.executeQuery();
					
					while(bd.rs.next()) {
						Produto p = new Produto(bd.rs.getInt(1),bd.rs.getString(2),bd.rs.getInt(3),bd.rs.getDouble(4));
						System.out.println(p);
					}
				}
					
				catch(SQLException e){
					System.out.println("Deu erro: " + e);
				
			}
				finally {
					bd.close();
				}
			}
				else {
				System.out.println("Não foi possível conectar a base de dados, tente novamente outra hora!");
			}*/
		}
	}


