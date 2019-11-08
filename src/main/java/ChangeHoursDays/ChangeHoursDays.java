package ChangeHoursDays;

import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class ChangeHoursDays extends Main {
    KeyBoards keyBoards = new KeyBoards();

    public int changeHoursDays(Update update, int i) {
        Main main = new Main();
        Message message = update.getMessage();
        if (message != null && message.hasText()) {
            if (i == 0) {
                super.sendMsg(message, "В які дні вам надсилати новини?", "Data");
                i++;
                return i;
            } else if (i == 1) {
                switch (message.getText()) {
                    case "За вчорашній день":
                        super.sendMsg(message, "В які години вам надсилати повідомлення?", "Time");
                        i = 4;
                        return i;
                    case "За останній тиждень":
                        super.sendMsg(message, "В які години вам надсилати повідомлення?", "Time");
                        i = 4;
                        return i;
                    case "Ввести дату вручну":
                        super.sendMsg(message, "Введіть дату в такому форматі \"24/02/2019\" або \"24/02/2019-27/02/2019\"", "OnlyMessage");
                        i++;
                        return i;
                }
            } else if (i == 2) {    //перевіряється чи користувач правильно ввів дату(чи правильний формат вводу)
                if (message.getText().matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\\\d\\\\d)")) {
                    super.sendMsg(message, "В які години вам надсилати повідомлення??", "Time");
                    i++;
                    return i;
                } else if (message.getText().matches("((0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(19|20))-((0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\\\d\\\\d))")) {
                    //тут ми перейдемо до кроку який виводить новиную
                    super.sendMsg(message, "В які години вам надсилати повідомлення?", "Time");
                    i++;
                    return i;
                } else {
                    super.sendMsg(message, "Ви ввели дату невірно, спробуйте ще раз", "OnlyMessage");
                }
            } else if (i == 3) {
                switch (message.getText()) {
                    case "Додати ще":
                        super.sendMsg(message, "Введіть дату в такому форматі \"24/02/2019\" або \"24/02/2019-27/02/2019\"", "OnlyMessage");
                        i = 2;     //якщо дата введена невірно,повертаємось назад до процесу(кроку) перевірки правельності формату
                        return i;

                    case "Готово":
                        super.sendMsg(message, "В які години вам надсилати повідомлення?", "Time");
                        i = 4;
                        return i;

                }

            }else if (i == 4){
            switch (message.getText()){
                case "За весь день":
                    i = 6;
                    return i;
                //Далі буде відбуватися вивід новини
                case"Ввести годину вручну":
                    super.sendMsg(message, "Введіть годину в такому форматі: \"21:10\"", "OnlyMessage");
                    i++;
                    return i;
            }
            }else if(i == 4){
                //Додати ще години
                if (message.getText().matches("[0-1]{1}[0-9]{1}:{1}[0-5]{1}[0-9]{1}")) {
                    super.sendMsg(message, "////////////Вивід новини", "setButtonTimeChoiseElse");
                    i++;
                    return i;
                    //кинути данні в базу про користувача
                }else if(message.getText().matches("([0-1]{1}[0-9]{1}:{1}{1}[0-5]{1}[0-9]{1}):{1}([0-1]{1}[0-9]{1}:{1}{1}[0-5]{1}[0-9]{1})")){
                    super.sendMsg(message, "////////////Вивід новини", "setButtonTimeChoiseElse");
                    i++;
                    return i;
                }else if ((message.getText().matches("[2]{1}[0-4]{1}:{1}{1}[0-5]{1}[0-9]{1}"))) {
                    super.sendMsg(message, "//////////////Вивід новини", "setButtonTimeChoiseElse");
                    i++;
                    return i;
                    //кинути данні в базу про користувача
                }else if ((message.getText().matches("([2]{1}[0-4]{1}:{1}[0-5]{1}[0-9]{1}):([2]{1}[0-4]{1}:{1}[0-5]{1}[0-9]{1})"))) {
                    super.sendMsg(message, "//////////////Вивід новини", "setButtonTimeChoiseElse");
                    i++;
                    return i;
                    //кинути данні в базу про користувача
                }
                else{
                    super.sendMsg(message, "Ви ввели годину невірно, спробуйте ще раз", "OnlyMessage");
                }
            }else if(i == 5){
                switch(message.getText()){
                    case "Додати ще":
                        super.sendMsg(message, "Введіть годину в такому форматі: \"21:10\"", "OnlyMessage");
                        i = 4;     //якщо година введена невірно,повертаємось назад до процесу перевірки правельності формату
                        return i;
                    case"Готово":
                        i = 6;
                        return i;
                }
            }
        }
        return i; }
}