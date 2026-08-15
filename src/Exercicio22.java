public class Exercicio22 {
    public static void main(String[] args){
        Casa casa1 = new Casa(5, 3, "Centro");
        Casa casa2 = new Casa(20, 10, "Sitio");
        Casa casa3 = new Casa("Maresinha");
        Casa casa4 = new Casa();

        casa1.endereco = "Castelo";
        System.out.println(casa1.endereco);

        System.out.println(casa1.numPortas);
        casa1.addPorta();
        System.out.println(casa1.numPortas);
    }
}
