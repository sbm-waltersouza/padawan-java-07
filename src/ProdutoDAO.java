import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoDAO {
	
	private Connection connection;
	
	public ProdutoDAO(Connection connection) {
		this.connection = connection;
		
	}
	
	public void salvar(Produto produto)  throws SQLException {
		String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES (?, ?)";
		
		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			
			pstm.setString(1, comoda.getNome());
			pstm.setString(2, comoda.getDescricao());
			
			pstm.execute();
			
			
			try (ResultSet rst = pstm.getGeneratedKeys()) {
				while (rst.next()) { 
					comoda.setId(rst.getInt(1));
				}
			}
		} 
	}
	
	
}


