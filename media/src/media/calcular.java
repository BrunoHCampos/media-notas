package media;

import java.util.Scanner;

public class calcular {
 
private double nota1;
private double nota2;
private double media;

	Scanner scan = new Scanner (System.in);
	
	public void coletarDados() {

	System.out.println(" Digite a primeira nota ");
	nota1=scan.nextDouble();
	
	if(nota1>10|| nota1<0) {
	do {
	System.out.println(" Nota tem que estar entre 0 e 10 ");
	nota1=scan.nextDouble();
	
	
	
	}while(nota1>10||nota1<0);
	}

	System.out.println(" Digite a segunda nota ");
	nota2=scan.nextDouble();
	
	if(nota2>10|| nota2<0) {
	do {
	System.out.println(" Nota tem que estar entre 0 e 10 ");
	nota2=scan.nextDouble();
	
	}while(nota2>10||nota2<0);

	}
	}
	public double calcular() {

	 media=(nota1+nota2)/2;
	 return media;
	

	
	}
	public void mostrarCalculo() {
	
	System.out.println(" A primeira nota "+nota1);
	System.out.println(" A segunda nota "+nota2);
	System.out.println(" A média do aluno "+calcular());
	
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}



}


