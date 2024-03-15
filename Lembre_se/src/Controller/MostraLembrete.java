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
			int escolha = JOptionPane.showOptionDialog(null, "Escolha uma op��o:", "Lembretes", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
				
			if(escolha == 1) {
				JOptionPane.showMessageDialog(null, "Chato, encerrando ent�o...");
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
		lembretes.add("Lembre 1: N�o desenhe no seu c�digo, eu irei lhe processar");
		lembretes.add("Lembre 2: Lady Gaga rainha do pop");
		lembretes.add("Lembre 3: Ah sim, queria dizer que sei l� meio que python � melhor do que Java");
		lembretes.add("Lembre 4: Java � melhor do que Python se voc� gosta de escrever reda��es");
		lembretes.add("Lembre 5: Programar em java � para os fracos, eu acordo falando SYSCALL!");
		lembretes.add("Lembre 6: Nunca fale de emojis de barrinhas sem saber se a pessoa que est� ao seu lado utiliza :) :( '_'  (desculpa � o maximo que sei fazer em barrinhas");
		lembretes.add("Lembre 7: DESLOGUE DO SEU GIT LINDO");
		lembretes.add("Lembre 8: deixou o git aberto e se eu apagasse tudo...............");
		lembretes.add("Lembre 9: me sigam no insta @zilionn obg");
		lembretes.add("Lembre 10: amei vcs, na vdd minha inten��o era fazer o menino desmaiar de rir mas n�o deu poxaa :( ");
		return lembretes;
		
	}

}
