public class App {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            vetor.adiciona("elemento 5");
            vetor.adiciona("elemento 6");
            vetor.adiciona("elemento 7");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());

        vetor.remove(2);

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());
    }
}