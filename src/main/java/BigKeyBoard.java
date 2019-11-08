import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class BigKeyBoard {
    public void setBigKeyBoardChoises(SendMessage sendMessage){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        keyboardRow1.add(new KeyboardButton("Я хочу змінити категорії щоденних повідомлень"));
        keyboardRowList.add(keyboardRow1);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(new KeyboardButton("Я хочу змінити години надсилання повідомлень,\n"));
        keyboardRowList.add(keyboardRow2);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
        KeyboardRow keyboardRow3 = new KeyboardRow();
        keyboardRow3.add(new KeyboardButton("Я хочу змінити кількість повідомлень"));
        keyboardRowList.add(keyboardRow3);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
        KeyboardRow keyboardRow4 = new KeyboardRow();
        keyboardRow4.add(new KeyboardButton("Я хочу бачити свої новини своїх категорій іншими днями,годинами"));
        keyboardRowList.add(keyboardRow4);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
        KeyboardRow keyboardRow5 = new KeyboardRow();
        keyboardRow5.add(new KeyboardButton("Я хочу перезареєструватись"));
        keyboardRowList.add(keyboardRow5);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
        KeyboardRow keyboardRow6 = new KeyboardRow();
        keyboardRow6.add(new KeyboardButton("Я хочу перезареєструватись"));
        keyboardRowList.add(keyboardRow6);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }
}
