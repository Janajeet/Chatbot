import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        PostRequest ob = new PostRequest();
        Scanner scanner = new Scanner(System.in);
        GUI gui = new GUI();
        gui.createGUI();
        gui.aiAsks();
        gui.handleEvents();

    }

}
