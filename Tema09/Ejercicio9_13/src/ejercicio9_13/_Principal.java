package ejercicio9_13;

import java.util.Arrays;

public class _Principal {
	public static void main(String[] args) {
		
		Futbolista[] Futbolistas = new Futbolista[] {
				new Futbolista("12345678S", "Jorge", 22, 4),
				new Futbolista("87654321F", "José", 19, 6),
				new Futbolista("18273465T", "Andrés", 34, 9),
				new Futbolista("81724356H", "Luisa",24, 7)
		};
		
		Arrays.sort(Futbolistas);

	}
}
