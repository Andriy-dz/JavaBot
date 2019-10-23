import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

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
    int i = 0;
    public void sendMsg(Message message, String text, String numbKeyBoard){
        KeyBoards keyBoards = new KeyBoards();
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
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;

            case "setButtonTimeChoise":
                try {
                    keyBoards.setButtonTimeChoise(sendMessage);
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
            case "setButtonNmbMessage":
                try {
                    keyBoards.setButtonNmbMessage(sendMessage);
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
        //if( User.id is in base){}   в нас ше нема бази

        //else:
        Registers registers = new Registers();
        i = registers.regester(update, i);
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