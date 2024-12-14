package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
			
		String dir = "C:\\temp\\in.txt";
		List<Accounts> acc = new ArrayList<>();
		List<Atributos> atr = new ArrayList<>();
		List<SshAccounts> sshAcc = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(dir))){
			String line = br.readLine();
			while(line != null) {
				//Seção Accounts
				if(line.contains("accounts") && line.contains("INSERT INTO") && !line.contains("ssh_accounts")) {
					line = br.readLine();
					while(!line.contains(";")) {

						//Logica de armazenamento de dados do accounts
						String[] data = line.split(",");
						acc.add(new Accounts(data[0],data[1],
								data[2],data[3],data[4],data[5],data[6],data[7],
								data[8],data[9],data[10],data[11],data[12],data[13],
								data[14],data[15],data[16], data[17], data[18]));
						line = br.readLine();
					}
				}
				//Seção Atributos
				if(line.contains("atribuidos") && line.contains("INSERT INTO")) {
					line = br.readLine();
					while(!line.contains(";")) {

						//Logica de armazenamento de dados do atribuidos
						String[] data = line.split(",");
						atr.add(new Atributos(data[0],data[1],
								data[2],data[3],data[4],data[5],data[6],data[7],
								data[8],data[9],data[10],data[11],data[12]));
						line = br.readLine();
					}
				}
				//Seção Ssh_Accounts
				if(line.contains("ssh_accounts") && line.contains("INSERT INTO")) {
					line = br.readLine();
					while(!line.contains(";")) {

						//Logica de armazenamento de dados do ssh_accounts
						String[] data = line.split(",");
						sshAcc.add(new SshAccounts(data[0],data[1],
								data[2],data[3],data[4],data[5],data[6],data[7],
								data[8],data[9],data[10],data[11],data[12],data[13],
								data[14],data[15]));
						line = br.readLine();
					}
				}
				line = br.readLine();
			}
			line = br.readLine();
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		String out = "C:\\temp\\out.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(out))){
//			for(Accounts e : acc) {
//				bw.write(e.toString());
//				bw.newLine();
//			}
//			for(Atributos e : atr) {
//				bw.write(e.toString());
//				bw.newLine();
//			}
			for(SshAccounts e : sshAcc) {
				bw.write(e.toString());
				bw.newLine();
			}
			System.out.println("Finalizado com sucesso!");
		}
		catch(IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
