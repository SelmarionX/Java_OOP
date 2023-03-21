package HomeWork.HW6.service;

import HomeWork.HW6.model.builder.Contact;
import HomeWork.HW6.model.builder.ContactBuilder;
import HomeWork.HW6.model.singleton.Logger;
import HomeWork.HW6.ui.UIConsole;


public class Service {
    UIConsole console = new UIConsole();

    public void start() {
        console.printMessage("Старт программы.\n");
        Contact contact1 = new ContactBuilder()
                .name("Иван")
                .surname("Иванов")
                .phone("11111111")
                .email("ivan@yandex.ru")
                .patronymic("Иванович")
                .address("неизвестно")
                .build();
        Logger.getLogger().addLogInfo("Создана запись\n" + contact1);
        Contact contact2 = new ContactBuilder()
                .surname("Попов")
                .name("Павел")
                .address("Сибирь")
                .build();
        Logger.getLogger().addLogInfo("Создана запись\n" + contact2);
        console.printMessage(Logger.getLogger().readLog());
        console.printMessage("Работа программы завершена");
    }
}
