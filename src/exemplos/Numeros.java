package exemplos;

import java.util.LinkedList;
import java.util.List;

import busca.AEstrela;
import busca.BuscaIterativo;
import busca.BuscaLargura;
import busca.BuscaProfundidade;
import busca.Estado;
import busca.Heuristica;
import busca.Nodo;

public class Numeros implements Estado, Heuristica {
	
	//static final String UNUSED = "unused";
	//static final String UNUSED2 = Numeros.UNUSED;
	
	private String op;
	private int num;
	
	public Numeros(int n,String op)
	{
		this.num = n;
		this.op = op;
	}
	
	public int h() {
		return (1000 - this.num)/2;
	}
	
	public List<Estado> sucessores()
	{
		List<Estado> suc = new LinkedList<Estado>();
		suc.add(new Numeros(num+1,"+1"));
		suc.add(new Numeros(num+2,"+2"));
		return suc;
	}
	
	public String toString()
	{
		return this.op +" ";
	}
	
	public String getDescricao() {
		return "Problemas dos números";
	}

	public boolean ehMeta() 
	{	
		return this.num == 1000;
	}

	public int custo() 
	{
		return 1;
	}

	public static void main(String args[])
	{
		
		//********************************************************************************************
		Numeros inicial = new Numeros(1,"");
		Nodo n05 = new AEstrela().busca(inicial);
		if (n05 == null)
		{
			System.out.println("Solução não encontrada");
		}
		else
		{
			System.out.println("Solução A Estrela: \n" + n05.montaCaminho()+ "\n\n");
		}
		
		//*********************************************************************************************
		Numeros estadoinicial = new Numeros(1,"");
		Nodo n01 = new BuscaLargura().busca(estadoinicial);
		if (n01 == null )
		{
			System.out.println("Solução não encontrada");
		}
		else
		{
			System.out.println("Solução Busca em largura: \n" + n01.montaCaminho()+ "\n\n");
		}
		
		//**********************************************************************************************
		BuscaProfundidade b2 = new BuscaProfundidade();
		Nodo n2 = b2.busca(new Numeros(1, "Busca em Profundidade"));
		
		if (n2 == null)
		{
			System.out.println("Solução");
		}
		else
		{
			System.out.print("Solução busca em Profundidade: \n" + n2.montaCaminho() +"\n\n");
		}
		
		
		//*************************************************************************************************
		BuscaIterativo b3 = new BuscaIterativo();
		Nodo n3 = b3.busca(new Numeros(1, "Busca iterativa"));
		
		if (n3 == null)
		{
			System.out.println("Sem solução");
		}
		else
		{
			System.out.println("Solução busca iterativa: \n" + n3.montaCaminho() + "");
		}
		
	}

	
	

}
