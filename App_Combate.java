package package07_OrientacaoObjeto2.challenge;

import java.util.Scanner;

import package07_OrientacaoObjeto2.challenge.entities.Champion;

public class App_Combate {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = scan.nextLine();

		System.out.print("Vida inicial: ");
		int life = scan.nextInt();

		System.out.print("Ataque: ");
		int attack = scan.nextInt();

		System.out.print("Armadura: ");
		int armor = scan.nextInt();

		Champion champion1 = new Champion(name, life, attack, armor);
		

		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		scan.nextLine();
		name = scan.nextLine();

		System.out.print("Vida inicial: ");
		life = scan.nextInt();

		System.out.print("Ataque: ");
		attack = scan.nextInt();

		System.out.print("Armadura: ");
		armor = scan.nextInt();

		Champion champion2 = new Champion(name, life, attack, armor);


		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turn = scan.nextInt();

		for(int i = 1; i <= turn; i++) {
			System.out.println();
			System.out.println("Resultado do turno " + i + ":");

			champion1.takeDamange(champion2.getAttack());
			champion2.takeDamange(champion1.getAttack());
			
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			
			if (champion1.getLife() <= 0 || champion2.getLife() <= 0) {
				i = turn + 1;
			}
		}
	
		System.out.println();
		System.out.println("FIM DO COMBATE");

		scan.close();
	}

}
