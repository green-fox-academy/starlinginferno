public class HumptyDumpty {
    public static void main(String[] args) {
        String humpty1 = "All the king's horses and all the king's men";
        String humpty2 = "Humpty Dumpty had a great fall.";
        String humpty3 = "Humpty Dumpty sat on a wall,";
        String humpty4 = "Couldn't put Humpty together again.";

        String temp1 = humpty1;
        humpty1 = humpty3;
        humpty3 = temp1;

        System.out.println(humpty1 + '\n' + humpty2 + '\n' + humpty3 + '\n' + humpty4);


    }
}
