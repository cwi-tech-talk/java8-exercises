package defaultt.methods;

import java.util.ArrayList;
import java.util.List;

public class ForEachConsumer {

	public static void main(String[] args) {
		List<String> livros = new ArrayList<>();
		livros.add("Hobbit");
		livros.add("Fortaleza Digital");
		livros.add("Harry Potter e a Pedra Filosofal");

		ConsumidorDeStrings consumer = new ConsumidorDeStrings();
		livros.forEach(consumer);
	}

}
