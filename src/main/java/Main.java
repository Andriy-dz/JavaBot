import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.util.ArrayList;
import java.util.List;

public class Main extends TelegramLongPollingBot {
    public static void main(String[] args)  {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Main());
        }catch(TelegramApiRequestException e){
            e.printStackTrace();
        }
    }



    public void sendMsg(Message message, String text){
        KeyBoards keyBoards = new KeyBoards();
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            keyBoards.setButtonLanguage(sendMessage);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if(message != null && message.hasText()){
            if(message.getText().equals("/start")){
                if(message == null){               //Тут буде перевірка на наявність користувача в азі данних

                } else {
                    sendMsg(message, "Привіт, Я твій персональний бот по новинах.\n Якою мовою бажаєш бачити повідомлення?");
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