package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class MostraLembrete {

	public MostraLembrete() {
		super();
	}
	
	public void Aleatorio() {
		Random r = new Random();
		List<String> list = new ArrayList<>();
		
		while(true) {
			String[] options = {"Mostrar lembrete", "Sair"};
			int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Lembretes", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
				
			if(escolha == 1) {
				JOptionPane.showMessageDialog(null, "Chato, encerrando então...");
				break;
			} else if (escolha == 0) {
				list = RandomLembrete();
				int tamanho = list.size();
				int indice = r.nextInt(tamanho);
				
				JOptionPane.showMessageDialog(null, list.get(indice));
			}
			
		}
	}
	
	public List<String> RandomLembrete() {
		List<String> lembretes = new ArrayList<>();
		lembretes.add("Lembre 1: Não desenhe no seu código, eu irei lhe processar");
		lembretes.add("Lembre 2: Lady Gaga rainha do pop");
		lembretes.add("Lembre 3: Ah sim, queria dizer que sei lá meio que python é melhor do que Java");
		lembretes.add("Lembre 4: Java é melhor do que Python se você gosta de escrever redações");
		lembretes.add("Lembre 5: Programar em java é para os fracos, eu acordo falando SYSCALL!");
		lembretes.add("Lembre 6: Nunca fale de emojis de barrinhas sem saber se a pessoa que está ao seu lado utiliza :) :( '_'  (desculpa é o maximo que sei fazer em barrinhas");
		lembretes.add("Lembre 7: DESLOGUE DO SEU GIT LINDO");
		lembretes.add("Lembre 8: deixou o git aberto e se eu apagasse tudo...............");
		lembretes.add("Lembre 9: me sigam no insta @zilionn obg");
		lembretes.add("Lembre 10: amei vcs, na vdd minha intenção era fazer o menino desmaiar de rir mas não deu poxaa :( ");
		return lembretes;
		
	}

}
