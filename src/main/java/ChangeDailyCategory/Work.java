package ChangeDailyCategory;

import ChangeDailyCategory.KeyboardDailyCategory;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Work  extends Registers {
    KeyboardDailyCategory keyboardDailyCategory = new KeyboardDailyCategory();
    int j=0;
    public int regester(Update update, int j) {
        Main main = new Main();
        Message message = update.getMessage();
        if (message != null && message.hasText()) {

            switch (j) {
                case "1":
                    //Я хочу поміняти категорії щоденних повідомлень
                    switch (j) {
                        case "CategoryAdd":
                            SendMessage sendMessage;
                            try{
                                keyboardDailyCategory.setButtonCategoryAdd( sendMessage);
                                execute( sendMessage);
                            } catch ( TelegramApiException e){
                                e.printStackTrace();
                            }
                            break;
                        case " CategoryDel":
                           // SendMessage sendMessage;
                            try{
                                keyboardDailyCategory.setButtonCategoryDelete( sendMessage);
                                execute( sendMessage);
                            } catch ( TelegramApiException e){
                                e.printStackTrace();
                            }
                            break;
                    }
                case "2":
                    //Я хоті поміняти мову
                case "3":
                    //Я хочу поміняти час повідомлень
                case "4":
                    //Я хочу поміняти кількість повідомлень
                case "5":
                    //Я хочу побачити зараз повідомлення моїх категорій
                case "6":
                    //Я хочу перезареєструватись
                case "7":
                    //я хочу бачити новини певних категорій() певних днів і годин
            }

        }
        return j; }
}