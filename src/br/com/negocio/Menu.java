package br.com.negocio;

public class Menu {
	public void imprimirMenu() {
		System.out.println("\n🐾🐾🐾🐾 MENU 🐾🐾🐾🐾");
		System.out.println("🐾1🐾 REALIZAR CADASTRO");
		System.out.println("🐾2🐾 AGENDAMENTO");
		System.out.println("🐾3🐾 LISTAGEM DE CLIENTE E FUNCIONARIOS");
		System.out.println("🐾4🐾 RANKING DE PETS");
		System.out.println("🐾5🐾 HISTÓRICO\n");
		System.out.println("🐾0🐾 SAIR");
		System.out.print("\nESCOLHA UMA OPÇÃO: ");
	}
	
	public void agendar() {
		System.out.println("\n🐾🐾🐾🐾 AGENDAMENTO 🐾🐾🐾🐾");
		System.out.println("🐾1🐾 AGENDAR O CUIDADO DO SEU PET");
		System.out.println("🐾2🐾 EDITAR AGENDAMENTO");
		System.out.println("🐾3🐾 CANCELAR AGENDAMENTO");
		System.out.println("🐾0🐾 VOLTAR");
		System.out.print("\nESCOLHA UMA OPÇÃO: ");
	}
	
	public void menuRanking() {
		System.out.println("\n🐾🐾🐾🐾 VISUALIZAR RANKING 🐾🐾🐾🐾");
		System.out.println("🐾1🐾 RANKING DAS RAÇAS MAIS COMUNS");
		System.out.println("🐾2🐾 RANKING DOS GÊNEROS FAVORITOS POR RAÇA");
		System.out.println("🐾0🐾 VOLTAR");
		System.out.print("\nESCOLHA UMA OPÇÃO: ");
	}
	
public void menuRankingRacasComuns() {
		System.out.println("\n🐾🐾🐾🐾 RANKING DE RAÇAS 🐾🐾🐾🐾");
		System.out.println("🐾1🐾 RAÇAS MAIS COMUNS DOS CÃES");
		System.out.println("🐾2🐾 RAÇAS MAIS COMUNS DOS GATOS");
		System.out.println("🐾3🐾 RAÇAS MAIS COMUNS DE OUTRAS ESPECIES");
		System.out.println("🐾0🐾 VOLTAR");
		System.out.print("\nESCOLHA UMA OPÇÃO: ");
	}
	
	public void menuRankingGenerosFavoritos() {
		System.out.println("\n🐾🐾🐾🐾 RANKING DE GENEROS 🐾🐾🐾🐾");
		System.out.println("🐾1🐾 GENEROS FAVORITOS DE CÃES");
		System.out.println("🐾2🐾 GENEROS FAVORITOS DE GATOS");
		System.out.println("🐾3🐾 GENEROS FAVORITOS DE OUTRAS ESPECIES");
		System.out.println("🐾0🐾 VOLTAR");
		System.out.print("\nESCOLHA UMA OPÇÃO: ");
	}
	
	public void menuCadastro() {
		System.out.println("\n🐾🐾🐾🐾 CADASTRO 🐾🐾🐾🐾");
		System.out.println("🐾1🐾 CADASTRAR COMO CLIENTE");
		System.out.println("🐾2🐾 CADASTRAR COMO FUNCIONÁRIO\n");
		System.out.println("🐾0🐾 VOLTAR");
		System.out.print("\nESCOLHA UMA OPÇÃO: ");
	}
	
	public void menuListagem() {
		System.out.println("\n🐾🐾🐾🐾 LISTAGEM 🐾🐾🐾🐾");
		System.out.println("🐾1🐾 LISTAGEM DE CLIENTES");
		System.out.println("🐾2🐾 LISTAGEM DE FUNCIONÁRIOS\n");
		System.out.println("🐾0🐾 VOLTAR");
		System.out.print("\nESCOLHA UMA OPÇÃO: ");
	}
	
	public void menuHistorico() {
		System.out.println("\n🐾🐾🐾🐾 VISUALIZAR HISTORICO 🐾🐾🐾🐾");
		System.out.println("🐾1🐾 HISTORICO DE CLIENTES");
		System.out.println("🐾2🐾 HISTORICO DE FUNCIONÁRIOS\n");
		System.out.println("🐾0🐾 VOLTAR");
		System.out.print("\nESCOLHA UMA OPÇÃO: ");
	}

}
