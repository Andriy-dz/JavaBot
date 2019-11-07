package CategoryAndDataChoise;

import CategoryAndDataChoise.KeyBoardCategoryDataChoise;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Work extends Registers {
    //наслідуємо клас Registers
    KeyBoardCategoryDataChoise keyBoardCategoryDataChoise = new KeyBoardCategoryDataChoise();                   //Ініціалізація клавіатури
    KeyBordChangeHoursDays keyBordChangeHoursDays = new KeyBordChangeHoursDays();
    int j = 0;     //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!лічильник який буде переходити між клавіатруо

    public int regester(Update update, int j) {           // j - сюди ви маєте помістити на яке повідомлення буде реагувати кожне наступне повідомлення, тобтопо якій "стежці" має піти, якщо не поняли напишіть в бесіду
        Main main = new Main();                           //  хтось має створити під це клавіатуру!!! ето важно
        Message message = update.getMessage();
        if (message != null && message.hasText()) {
            switch (j) {
                case "1":
                    //Я хочу поміняти категорії щоденних повідомлень
                    //Ви маєте стврорити відповідний клас, якому будете передавати "Message". в класі ви маєте опреділит кожну кнопку, шо робити в кожному з випадків(так як і в мене) P.S. називайте клами і методи відповідно до фенкціоналу хоч приблизно
                case "2":
                    //Я хоті поміняти мову
                case "3":
                    //Я хочу поміняти час повідомлень
                case "4":
                    //Я хочу поміняти кількість повідомлень
                case "5":
                    //Я хочу побачити зараз повідомлення моїх категорій
                case "6":
                    //я хочу бачити свої новини своїх
                    //категорій іншими днями годинами
                    switch(message.getText()){
                        case "Data":
                            SendMessage sendMessage;
                        try {
                            keyBordChangeHoursDays.setButtonDataChoise(sendMessage);
                            execute(sendMessage);
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                        break;

                        case "setButtonDataChoiseElse":
                            try {
                                keyBordChangeHoursDays.setButtonDataChoiseElse(sendMessage);
                                execute(sendMessage);
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                            break;

                        case "Time":
                            try {
                                keyBordChangeHoursDays.setButtonTime(sendMessage);
                                execute(sendMessage);
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                            break;

                        case "setButtonTimeChoiseElse":
                            try {
                                keyBordChangeHoursDays.setButtonTimeChoiseElse(sendMessage);
                                execute(sendMessage);
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                            break;

                        case "OnlyMessage":
                            try {
                                execute(sendMessage);      //тут у мене помилка,можливо хтось знає чому
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                            break;


                    }
                case "7":
                    //я хочу бачити новини певних категорій() певних днів і годин
                    switch (message.getText()) {
                        case "CategoryAdd":
                            SendMessage sendMessage;
                            try {
                                keyBoardCategoryDataChoise.setButtonCategoryAdd(sendMessage);
                                execute(sendMessage);
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                            break;

                        case "Data":
                            try {
                                keyBoardCategoryDataChoise.setButtonDataChoise(sendMessage);
                                execute(sendMessage);
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                            break;

                        case "Time":
                            try {
                                keyBoardCategoryDataChoise.setButtonTime(sendMessage);
                                execute(sendMessage);
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                            break;

                        case "setButtonTimeChoiseElse":
                            try {
                                keyBoardCategoryDataChoise.setButtonTimeChoiseElse(sendMessage);
                                execute(sendMessage);
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                            break;

                        case "OnlyMessage":
                            try {
                                execute(sendMessage);       //тут у мене помилка,можливо хтось знатиме чому
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                            break;
                    }
            }
        }
        return j;
    }
}



//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! я закометував бо код покіщо видає помилку (кейси не заповнені діями)!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1