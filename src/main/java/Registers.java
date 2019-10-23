import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Registers extends Main {
    KeyBoards keyBoards = new KeyBoards();

    public int onUpdateReceived(Update update, int i) {
        Main main = new Main();
        Message message = update.getMessage();
        if (message != null && message.hasText()) {
            if (i == 0) {
                super.sendMsg(message, "Привіт, Я твій персональний бот по новинах.\n Якою мовою бажаєш бачити повідомлення?", "Language");
                i++;
                return i;
            } else if (i == 1) {
                switch (message.getText()) {
                    case "Українська":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Додайте категорії які ви хочете бачити щодня", "CategoryAdd");
                        i++;
                        return i;
                    case "Русский":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Додайте категорії які ви хочете бачити щодня", "CategoryAdd");
                        i++;
                        return i;
                    case "English":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Додайте категорії які ви хочете бачити щодня", "CategoryAdd");
                        i++;
                        return i;
                }
            } else if (i == 2) {
                switch (message.getText()) {
                    case "Всі":
                        //кинути данні в базу про користувача
                        break;

                    case "Економіка":
                        //кинути данні в базу про користувача
                        break;

                    case "Здоров'я":
                        //кинути данні в базу про користувача
                        break;

                    case "За кородном":
                        //кинути данні в базу про користувача
                        break;

                    case "Київські новини":
                        //кинути данні в базу про користувача
                        break;

                    case "Курйози":
                        //кинути данні в базу про користувача
                        break;

                    case "Події":
                        //кинути данні в базу про користувача
                        break;

                    case "Політика":
                        //кинути данні в базу про користувача
                        break;

                    case "Політика України":
                        //кинути данні в базу про користувача
                        break;

                    case "Спорт":
                        //кинути данні в базу про користувача
                        break;

                    case "Суспільства":
                        //кинути данні в базу про користувача
                        break;

                    case "Технології":
                        //кинути данні в базу про користувача
                        break;

                    case "Фоторепортаж":
                        //кинути данні в базу про користувача
                        break;

                    case "Шоу-бізнес":
                        //кинути данні в базу про користувача
                        break;

                    case "Видалити":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Видаліть категорії які ви не хочете бачити щодня", "CategoryDel");
                        i++;
                        return i;

                    case "Готово":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "О котрій годині ви бажаєте бачити повідомлення?", "Time");
                        i = 4;
                        return i;
                }
            } else if (i == 3) {
                switch (message.getText()) {
                    case "Всі":
                        //кинути данні в базу про користувача
                        break;

                    case "Економіка":
                        //кинути данні в базу про користувача
                        break;

                    case "Здоров'я":
                        //кинути данні в базу про користувача
                        break;

                    case "За кородном":
                        //кинути данні в базу про користувача
                        break;

                    case "Київські новини":
                        //кинути данні в базу про користувача
                        break;

                    case "Курйози":
                        //кинути данні в базу про користувача
                        break;

                    case "Події":
                        //кинути данні в базу про користувача
                        break;

                    case "Політика":
                        //кинути данні в базу про користувача
                        break;

                    case "Політика України":
                        //кинути данні в базу про користувача
                        break;

                    case "Спорт":
                        //кинути данні в базу про користувача
                        break;

                    case "Суспільства":
                        //кинути данні в базу про користувача
                        break;

                    case "Технології":
                        //кинути данні в базу про користувача
                        break;

                    case "Фоторепортаж":
                        //кинути данні в базу про користувача
                        break;

                    case "Шоу-бізнес":
                        //кинути данні в базу про користувача
                        break;

                    case "Додати":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Скільки останніх годин ви бажаєте бачити?", "CategoryAdd");
                        break;
                    case "Готово":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "О котрій годині ви бажаєте бачити повідомлення?", "Time");
                        i++;
                        return i;
                }
            } else if (i == 4) {
                switch (message.getText()) {
                    case "О 9:00 та 21:00":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Скільки бажаєте бачити останніх новин?", "setButtonNmbMessage");
                        i = 7;
                        return i;

                    case "Щогодини":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Скільки бажаєте бачити останніх новин?", "setButtonNmbMessage");
                        i = 7;
                        return i;

                    case "Ввести вручну":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Введіть годину в такому форматі: \"21:10\"", "OnlyMessage");
                        i++;
                        return i;
                }
            } else if (i == 5) {    // тут буде перевірка чи правильно користувач ввів годину

                if (message.getText().matches("[0-1]{1}[0-9]{1}:{1}[0-5]{1}[0-9]{1}")) {
                    super.sendMsg(message, "Чи бажаєте додати ще годину", "setButtonTimeChoise");
                    i++;
                    return i;
                    //кинути данні в базу про користувача
                } else if ((message.getText().matches("[2]{1}[0-4]{1}:{1}[0-5]{1}[0-9]{1}"))) {
                    super.sendMsg(message, "Чи бажаєте додати ще годину", "setButtonTimeChoise");
                    i++;
                    return i;
                    //кинути данні в базу про користувача
                } else {
                    super.sendMsg(message, "Ви ввели годину не вірно, спробуйте ще раз", "OnlyMessage");
                }
            } else if (i == 6) {
                switch (message.getText()) {
                    case "Додати ще":
                        super.sendMsg(message, "Введіть годину в такому форматі: \"21:10\"", "OnlyMessage");
                        i = 5;
                        return i;

                    case "Готово":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Скільки бажаєте бачити останніх новин?", "setButtonNmbMessage");
                        i = 7;
                        return i;
                }
            } else if (i == 7) {
                switch (message.getText()) {
                    case "10":
                        super.sendMsg(message, "Введіть годину в такому форматі: \"21:10\"", "OnlyMessage");
                        i = 5;
                        return i;

                    case "Ввести вручну":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Скільки бажаєте бачити останніх новин? Введіть чисто в межах від 1 до 99", "setButtonNmbMessage");
                        i = 8;
                        return i;
                }
            }else if (i == 8) {
                if (message.getText().matches("[0-9]{2}") && !message.getText().toString().equals("0")){
                    super.sendMsg(message, "Реєстрація пройшла успішно", "OnlyMessage");
                    i = 0;
                    return i;
                }else super.sendMsg(message, "Ви ввели або завелике число або ввели літери/знаки", "OnlyMessage");
            }
        }
        return i;
    }
}
