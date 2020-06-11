package utilitarios;
import java.sql.*;

public class Conexao {
    public static Connection conector() { //metodo=ação
       
	   //Criando uma variável especial para estabelecer uma conexão com o banco
        java.sql.Connection conexao = null;
        
		//Carregando o driver correspondente ao banco (não esqueça de importar ele em libraries 
        String driver = "com.mysql.jdbc.Driver";//não é uma linha padrão 
        
		//Armazenando informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/ideal";//endereço do banco de dados
        String user = "root";
        String password = "";
        //Estabelecendo a conexão com o banco
        //tratamento de erro
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso");
            return conexao;

        } catch (Exception e) {
            //a linha abaixo serve de apoio para esclarecer o erro (tratamento de erro)
            System.out.println(e);
            //mostra o erro
            return null;
        }

    }
    public static void main(String[] args) {
        conector();
    }
}
//fim da classe conexão