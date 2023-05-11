package desafio01OO;

public class Principal {

    public static void main(String[] args) {
        Cachorro cachorro01 = new Cachorro();
        Cachorro cachorro02 = new Cachorro();

        cachorro01.nome = "mel";
        cachorro01.raca = "poodle";
        cachorro01.sexo = "fêmea";
        cachorro01.idade = 14;

        cachorro02.nome = "joey";
        cachorro02.raca = "vira-lata";
        cachorro02.sexo = "macho";
        cachorro02.idade = 6;

        System.out.println("CACHORRO 01");
        System.out.println("=======================================");
        System.out.println("Nome " + cachorro01.nome);
        System.out.println("Raça " + cachorro01.raca);
        System.out.println("Sexo " + cachorro01.sexo);
        System.out.println("Idade " + cachorro01.idade);
        System.out.println();

        System.out.println("CACHORRO 02");
        System.out.println("=======================================");
        System.out.println("Nome " + cachorro02.nome);
        System.out.println("Raça " + cachorro02.raca);
        System.out.println("Sexo " + cachorro02.sexo);
        System.out.println("Idade " + cachorro02.idade);
        System.out.println();

    }

}
