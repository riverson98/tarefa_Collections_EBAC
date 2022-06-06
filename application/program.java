package application;

import entities.Pessoa;

import java.util.*;

public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa;
        List<Pessoa> pessoasSexoMasculino = new ArrayList<>();
        List<Pessoa> pessoasSexoFeminino = new ArrayList<>();

        do {
            System.out.print("Digite o nome e o sexo separados por virgula ");
            String[] split = sc.next().split(",");
            pessoa = new Pessoa(split[0], split[1]);


            if (pessoa.getSexo().equalsIgnoreCase("M")){
                pessoasSexoMasculino.add(pessoa);
                for (Pessoa pessoas : pessoasSexoMasculino){
                    System.out.println(pessoas);
                }
            }
            else {
                pessoasSexoFeminino.add(pessoa);
                for (Pessoa pessoas : pessoasSexoFeminino){
                    System.out.println(pessoas);
                }
            }
            System.out.print("Gostaria de adicionar mais pessoas a lista? ");

        }while (sc.next().equalsIgnoreCase("Sim"));

        System.out.println(pessoasSexoMasculino);
        System.out.println(pessoasSexoFeminino);
        System.out.println("Obrigado");
            sc.close();
    }

}
