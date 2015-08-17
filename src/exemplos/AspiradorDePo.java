package exemplos;

import java.util.LinkedList;
import java.util.List;

import jdk.internal.dynalink.beans.StaticClass;

import busca.BuscaIterativo;
import busca.BuscaLargura;
import busca.BuscaProfundidade;
import busca.Estado;
import busca.Nodo;

@SuppressWarnings("unused")
public class AspiradorDePo implements Estado {
	
	private String op ;
	private int posicao;
	private int ladoDireito;
	private int ladoEsquerdo;
	
	public AspiradorDePo(int posicao,int situacaoDireita,int situacaoEsquerda, String op ){
			this.posicao = posicao;
			this.ladoDireito = situacaoDireita;
			this.ladoEsquerdo = situacaoEsquerda;
			this.op = op;
	}

	public boolean ehMeta()
	{
		if (this.ladoEsquerdo == Quarto.LIMPO && this.ladoDireito == Quarto.SUJO)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public List<Estado> sucessores()
	{
		List<Estado> sucessores = new LinkedList<Estado>();
		
		//Mover para esquerda
		sucessores.add(new AspiradorDePo(Quarto.ESQUERDA, this.ladoDireito, this.ladoEsquerdo, "Para esquerda!"));
		
		//Mover para a Direita
		sucessores.add(new AspiradorDePo(Quarto.DIREITA, this.ladoDireito, this.ladoEsquerdo, "Para a Direita"));
		
		//Limpar
		if(this.posicao == Quarto.DIREITA)
		{
			sucessores.add(new AspiradorDePo(this.posicao, Quarto.LIMPO, this.ladoEsquerdo, "Limpar o Quarto da Direita"));
		}
		else
		{
			sucessores.add(new AspiradorDePo(this.posicao, this.ladoDireito, Quarto.LIMPO, "Limpar o Quado da esquerda"));
		}
		
		return sucessores;
	}

	public String getDescricao() {
		return "Problema Clássico do Aspirador de Pó";
	}

	public int custo() {
		return 1;
	}
	
	public String toString() 
	{
		return this.op + " ";
	}

	public static void main(String args[])
	{
		AspiradorDePo inicial = new AspiradorDePo(Quarto.DIREITA,Quarto.SUJO,Quarto.SUJO, "");
		System.out.println("Busca em Largura");
		Nodo n = new BuscaLargura().busca(inicial);
		
		if(n == null)
		{
			System.out.println("Sem solução");
		}
		else
		{
			System.out.println("Solução:\n"+ n.montaCaminho() +"\n\n");
		}
		
		
		
		/***************************************************************/
		AspiradorDePo inicial2 = new AspiradorDePo(Quarto.DIREITA,Quarto.SUJO,Quarto.SUJO,"");
		System.out.println("Busca em profundidade");
		Nodo n2 = new BuscaProfundidade( ).busca(inicial2);
		
		if( n2 == null) 
		{
			System.out.println("Sem solucao !");
		}
		else
		{
			System.out.println("Solucao:\n" + n2 . montaCaminho() + "nnnn" );
		}
		
		
		
		
		/***************************************************************/
		AspiradorDePo inicial3 = new AspiradorDePo(Quarto.DIREITA,Quarto.SUJO,Quarto.SUJO,"");
		System.out.println("Busca iterativa");
		
		Nodo n3 = new BuscaIterativo().busca(inicial3);
		
		if( n3 == null)
		{
			System.out.println("Sem solucao!");
		}
		else 
		{
			System.out.println("Solucao :\n" +n3.montaCaminho()+ "nnnn");
		}
		
	}
	
	
	
}
