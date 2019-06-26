package Control;

import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;





public class ReadFile {
	static private Scanner y;
	
	static public void openFileRead() {
		try {
			FileReader f = new FileReader("assemble.txt");
			y = new Scanner(f);
		} catch (Exception e) {
			System.out.println("nao consegui abrir o arquivo");
		}
	}
	
	static public void readFile() {
		y.close();
		openFileRead();
	}
	
	static public String TrimSpace(String s) {
		String s1 = "";
		
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				s1 += s.charAt(i);
			}
		}
		
		return s1;
	}
	
	static public int readIns(String instruc) {
		
		String[] parts;
		parts = instruc.split(",");
		parts = instruc.split(" "); // esplitando entre os ,
		
		instruc = TrimSpace(instruc); // retirando os espacos
		
		
		switch (parts[0]) {
			case "add":	
				print("add");
				return 0;
			case "lw":
				print("lw");
				return 1;
			case "beq":
				print("beq");
				return 2;
			case "j":
				print("j");
				return 3;
		}
		return -1;
	}
	
	static public void print(String s) {
		System.out.println(s);
	}
	
	static public void readFileEmOrEs(Vector <Bloco> Instruction) {
		String instruc;
		Bloco aux = new Bloco(); 
		
		while (y.hasNext()) {
			aux = new Bloco();
			instruc = y.nextLine();
			aux.setComand(instruc);
			aux.setIt(readIns(instruc));
			Instruction.add(aux);	
			
		}

	}
	
	static public void closeRead() {
		y.close();
	}
	static public Vector <Bloco> readAll() {
		Vector<Bloco> Instruction = new Vector<Bloco>();
		openFileRead();
		readFileEmOrEs(Instruction);
		closeRead();
		return Instruction;
	}
	public static void main(String[] args) {
		
		Vector <Bloco> Instructions = readAll();
		
		
		
		for (int i = 0; i < Instructions.size(); i++) {
			Instructions.elementAt(i);
			print("" + Instructions.elementAt(i).getIt() + " : " + Instructions.elementAt(i).getComand() );
		}
		
		
		
	}
}
