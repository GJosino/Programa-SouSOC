package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("lorem2");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque id dignissim lacus. Nulla quis euismod dui.");
		bw.newLine();
		bw.write("Vestibulum lacinia, leo eget eleifend sodales, quam libero aliquam augue, vel aliquet odio massa eu elit. ");
		
		
		bw.close(); 
		
		
	}

}
