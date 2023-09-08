/**
 * Класс Main представляет точку входа в приложение.
 * В методе main создается экземпляр класса Core и запускается его метод run(),
 * что запускает выполнение игровой логики.
 */
import Core.Core;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса Core
        Core core = new Core();
        // Запуск метода run() для выполнения игровой логики
        core.run();
    }
}