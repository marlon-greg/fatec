package semana12;

import java.sql.SQLException;

public class ProdutoConsultar {
	public static void main (String[] args) {
		//lerTodos();
		lerComFiltroDeNome("de");
	}

	private static void lerComFiltroDeNome(String par) {
		// TODO Auto-generated method stub
		BD bd = new BD();
		if (bd.getConnection()== true) {
			// Fazendo um select na tabela produtos onde o parâmetro é... (interrogação vai ser o parâmetro), pode ter vários. 
			String sql = "select * from produtos where nome ilike ?";
			
			try {
				// Esses dois vão ser sempre igual
				bd.st = bd.con.prepareStatement(sql);
				// Estamos definindo que o parâmetro 1 (pois só tem um interrogação no String sql), vai pegar do par (definimos como parâmetro do método), o valor + o coringa)
				bd.st.setString(1, "%"+par+"%");
				bd.rs = bd.st.executeQuery();
				while(bd.rs.next()) {
				System.out.println(bd.rs.getInt("codigo"));
				System.out.println(bd.rs.getString("nome"));
				System.out.println(bd.rs.getInt("qtdeEstoque"));
				System.out.println(bd.rs.getDouble("preco"));
				System.out.println("--------------------");
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
		}
	}
/*
	
	private static void lerTodos() {
		// TODO Auto-generated method stub
		BD bd = new BD();
		if (bd.getConnection()== true) {
			//deu certo
			String sql = "select * from produtos";
			
			try {
				// Esses dois vão ser sempre igual
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				while(bd.rs.next()) {
				System.out.println(bd.rs.getInt("codigo"));
				System.out.println(bd.rs.getString("nome"));
				System.out.println(bd.rs.getInt("qtdeEstoque"));
				System.out.println(bd.rs.getDouble("preco"));
				System.out.println("--------------------");
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
		}
	}*/
	
}

