package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("lorem2");
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2"));
//		PrintStream ps = new PrintStream("lorem2");
		
		PrintWriter ps = new PrintWriter("lorem2", "UTF-8");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque id dignissim lacus. Nulla quis euismod dui.");
		ps.println();
		ps.println();
		ps.println("Vestibulum lacinia, leo eget eleifend sodales, quam libero aliquam augue, vel aliquet odio massa eu elit. ");
		
		
		ps.close(); 
		
		
	}

}
