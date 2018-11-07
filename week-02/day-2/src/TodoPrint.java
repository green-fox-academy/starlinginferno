public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        String todo = "My todo:";
        String games = " - Download games";
        String diablo = "   - Diablo";
        System.out.println(todo.concat("\n" + todoText + "\n" + games + "\n" + diablo));
    }
}
