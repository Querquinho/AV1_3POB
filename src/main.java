import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        gerenciadorProdutos gerenciador = new gerenciadorProdutos();

        gerenciador.processa(scanner);
     
        scanner.close();
	}

}
