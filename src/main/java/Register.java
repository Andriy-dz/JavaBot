/*import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Register extends TelegramLongPollingBot {
    KeyBoards keyBoards = new KeyBoards();
    int i = 0;
    public void sendMsg(Message message, String text, String numbKeyBoard){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        switch(numbKeyBoard) {
            case "Language":
                try {
                    keyBoards.setButtonLanguage(sendMessage);
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
            case "CategoryAdd":
                try {
                    keyBoards.setButtonCategoryAdd(sendMessage);
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
            case "CategoryDel":
                try {
                    keyBoards.setButtonCategoryDelete(sendMessage);
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
            case "Time":
                try {
                    keyBoards.setButtonTime(sendMessage);
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
            case "OnlyMessage":
                try {
                    i = 1;
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if(message != null && message.hasText()){
            if (i == 0){
                switch(message.getText()) {
                    case "/start":
                        sendMsg(message, "Привіт, Я твій персональний бот по новинах.\n Якою мовою бажаєш бачити повідомлення?", "Language");
                        break;
                    case "Українська":
                        //кинути данні в базу про користувача
                        sendMsg(message, "Додайте категорії які ви хочете бачити щодня", "CategoryAdd");
                        break;
                    case "Русский":
                        //кинути данні в базу про користувача
                        sendMsg(message, "Додайте категорії які ви хочете бачити щодня", "CategoryAdd");
                        break;
                    case "English":
                        //кинути данні в базу про користувача
                        sendMsg(message, "Додайте категорії які ви хочете бачити щодня", "CategoryAdd");
                        break;
                    case "Всі(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Економіка(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Здоров'я(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "За кородном(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Київські новини(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Курйози(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Події(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Політика(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Політика України(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Спорт(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Суспільства(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Технології(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Фоторепортаж(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Шоу-бізнес(add)":
                        //кинути данні в базу про користувача
                        break;

                    case "Видалити":
                        //кинути данні в базу про користувача
                        sendMsg(message, "Видаліть категорії які ви не хочете бачити щодня", "CategoryDel");
                        break;

                    case "Готово":
                        //кинути данні в базу про користувача
                        sendMsg(message, "О котрій годині ви бажаєте бачити повідомлення?", "Time");
                        break;

                    case "Всі(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Економіка(dell)":
                        //кинути данні в базу про користувача
                        break;

                    case "Здоров'я(dell)":
                        //кинути данні в базу про користувача
                        break;

                    case "За кородном(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Київські новини(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Курйози(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Події(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Політика(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Політика України(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Спорт(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Суспільства(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Технології(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Фоторепортаж(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Шоу-бізнес(del)":
                        //кинути данні в базу про користувача
                        break;

                    case "Додати":
                        //кинути данні в базу про користувача
                        sendMsg(message, "Скільки останніх годин ви бажаєте бачити?", "CategoryAdd");
                        break;
                    case "О 9:00 та 21:00":

                        //кинути данні в базу про користувача
                        break;

                    case "Щогодини":
                        //кинути данні в базу про користувача
                        break;

                    case "Ввести вручну":
                        //кинути данні в базу про користувача
                        sendMsg(message, "Введіть годину в такому форматі: \"21:10\"", "OnlyMessage");
                        break;
                }
            }else if (i == 1){    // тут буде перевірка чи правильно користувач ввів годину
                sendMsg(message, "Хорошо", "OnlyMessage");
               /* if ((message.getText().matches("[0-1]{1}[0-9]{1}:{1}[0-5]{1}[0-9]{1}"))){
                    sendMsg(message, "Хорошо", "OnlyMessage");
                    //кинути данні в базу про користувача
                }else if ((message.getText().matches("[2]{1}[0-4]{1}:{1}[0-5]{1}[0-9]{1}"))){
                    sendMsg(message, "Хорошо", "OnlyMessage");
                    //кинути данні в базу про користувача
                }else{
                    sendMsg(message, "Ви ввели годину не вірно, спробуйте ще раз таким форматом \"21:10\"", "OnlyMessage");
                }
            }
        }
    }
    @Override
    public String getBotUsername() {
        return "JAVA_BOTforNEWS";
    }

    @Override
    public String getBotToken() {
        return "818126080:AAEwnAotwDJYaTZknhMieqvNomgbgJUWTJ8";
    }
}
*/