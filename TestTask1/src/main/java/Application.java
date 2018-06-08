import controller.MainController;


//Просто старт приложения
public class Application {
    private MainController mainController;

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        mainController = new MainController();
    }
}
