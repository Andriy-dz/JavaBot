package ChangeDailyCategory;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class KeyboardDailyCategory {
       public void setButtonCategoryAdd(SendMessage sendMessage){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboardRowList = new ArrayList<>();
            KeyboardRow keyboardRow1 = new KeyboardRow();
            keyboardRow1.add(new KeyboardButton("Всі"));
            keyboardRow1.add(new KeyboardButton("Економіка"));
            keyboardRow1.add(new KeyboardButton("Здоров'я"));
            keyboardRow1.add(new KeyboardButton("За кородном"));
            keyboardRowList.add(keyboardRow1);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
            KeyboardRow keyboardRow2 = new KeyboardRow();
            keyboardRow2.add(new KeyboardButton("Київські новини"));
            keyboardRow2.add(new KeyboardButton("Курйози"));
            keyboardRow2.add(new KeyboardButton("Події"));
            keyboardRow2.add(new KeyboardButton("Політика"));
            keyboardRowList.add(keyboardRow2);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
            KeyboardRow keyboardRow3 = new KeyboardRow();
            keyboardRow3.add(new KeyboardButton("Політика України"));
            keyboardRow3.add(new KeyboardButton("Спорт"));
            keyboardRow3.add(new KeyboardButton("Суспільства"));
            keyboardRow3.add(new KeyboardButton("Технології"));
            keyboardRowList.add(keyboardRow3);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
            KeyboardRow keyboardRow4 = new KeyboardRow();
            keyboardRow4.add(new KeyboardButton("Фоторепортаж"));
            keyboardRow4.add(new KeyboardButton("Шоу-бізнес"));
            keyboardRow4.add(new KeyboardButton("Видалити"));
            keyboardRow4.add(new KeyboardButton("Готово"));
            keyboardRowList.add(keyboardRow4);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
        }
        public void setButtonCategoryDelete(SendMessage sendMessage){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboardRowList = new ArrayList<>();
            KeyboardRow keyboardRow1 = new KeyboardRow();
            keyboardRow1.add(new KeyboardButton("Всі"));
            keyboardRow1.add(new KeyboardButton("Економіка"));
            keyboardRow1.add(new KeyboardButton("Здоров'я"));
            keyboardRow1.add(new KeyboardButton("За кородном"));
            keyboardRowList.add(keyboardRow1);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
            KeyboardRow keyboardRow2 = new KeyboardRow();
            keyboardRow2.add(new KeyboardButton("Київські новини"));
            keyboardRow2.add(new KeyboardButton("Курйози"));
            keyboardRow2.add(new KeyboardButton("Події"));
            keyboardRow2.add(new KeyboardButton("Політика"));
            keyboardRowList.add(keyboardRow2);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
            KeyboardRow keyboardRow3 = new KeyboardRow();
            keyboardRow3.add(new KeyboardButton("Політика України"));
            keyboardRow3.add(new KeyboardButton("Спорт"));
            keyboardRow3.add(new KeyboardButton("Суспільства"));
            keyboardRow3.add(new KeyboardButton("Технології"));
            keyboardRowList.add(keyboardRow3);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
            KeyboardRow keyboardRow4 = new KeyboardRow();
            keyboardRow4.add(new KeyboardButton("Фоторепортаж"));
            keyboardRow4.add(new KeyboardButton("Шоу-бізнес"));
            keyboardRow4.add(new KeyboardButton("Готово"));
            keyboardRowList.add(keyboardRow4);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
        }
    }
