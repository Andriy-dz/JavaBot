package CategoryAndDataChoise;

import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class CategoryAndDataChoise extends Main {
     KeyBoards keyBoards = new KeyBoards();
    public int categoryAndDataChoise(Update update, int i){
        Main main = new Main();
        Message message = update.getMessage();
        if (message != null && message.hasText()){
            if(i == 0){                //i-для кроку
                super.sendMsg(message,"Введіть категорію яку хочете бачити","CategoryAdd");
                i++;
                return i;
            }else if(i == 1)
            {
                switch(message.getText()){
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

                    case "Готово":
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "За яке число ви хочете бачити новини?", "Data");
                        i++;
                        return i;
                }
            }else if(i == 2){
                switch (message.getText()){
                    case "За вчорашній день":
                        super.sendMsg(message,"За які години новини вам показати?","Time");
                        i = 5;       //перходимо до кроку i = 5 "Готово"
                        return i;
                    case "За останній тиждень":
                        super.sendMsg(message,"За які години новини вам показати?","Time");
                        i = 5;
                        return i;
                    case "Ввести дату вручну":
                        super.sendMsg(message,"Введіть дату в такому форматі \"24/02/2019\" або \"24/02/2019-27/02/2019\"","OnlyMessage");
                        i++;            //переходимо до кроку i = 3,перевірка правельності формату
                        return i;
                }
            }else if (i == 3){    //перевіряється чи користувач правильно ввів дату(чи правильний формат вводу)
               if(message.getText().matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\\\d\\\\d)")){
                   super.sendMsg(message,"За які години вам показати новини?","Time");
                   i++;
                   return i;
               }else if(message.getText().matches("((0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(19|20))-((0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\\\d\\\\d))")){
                   //Далі буде відбуватися вивід новини
               }else {
                   super.sendMsg(message, "Ви ввели дату невірно, спробуйте ще раз", "OnlyMessage");
               }
            }else if(i == 4){
                switch(message.getText()){
                    case "Додати ще":
                        super.sendMsg(message, "Введіть дату в такому форматі \"24/02/2019\" або \"24/02/2019-27/02/2019\"", "OnlyMessage");
                        i = 3;     //якщо дата введена невірно,повертаємось назад до процесу(кроку) перевірки правельності формату
                        return i;

                    case "Готово":
                        super.sendMsg(message,"За які години вам показати новини?" ,"Time");
                        i = 5;
                        return i;

                }
            }else if(i == 5){
                switch (message.getText()){
                    case "За весь день":
                        i = 8;          //перходимо до кроку i = 8 "Готово"
                        return i;
                    //Далі буде відбуватися вивід новини
                    case"Ввести годину вручну":
                        super.sendMsg(message, "Введіть годину в такому форматі: \"21:10\"", "OnlyMessage");
                        i++;
                        return i;
                }
            }else if(i == 6){
                //Додати ще години
                if (message.getText().matches("[0-1]{1}[0-9]{1}:{1}[0-5]{1}[0-9]{1}")) {
                    super.sendMsg(message, "////////////Вивід новини", "setButtonTimeChoiseElse");
                    i++;
                    return i;
                    //кинути данні в базу про користувача
                }else if(message.getText().matches("([0-1]{1}[0-9]{1}:{1}[0-5]{1}[0-9]{1}):{1}([0-1]{1}[0-9]{1}:{1}[0-5]{1}[0-9]{1})")){
                    super.sendMsg(message, "////////////Вивід новини", "setButtonTimeChoiseElse");
                    i++;
                    return i;
                }else if ((message.getText().matches("[2]{1}[0-4]{1}:{1}[0-5]{1}[0-9]{1}"))) {
                    super.sendMsg(message, "//////////////Вивід новини", "setButtonTimeChoiseElse");
                    i++;
                    return i;
                    //кинути данні в базу про користувача
                }else if ((message.getText().matches("([2]{1}[0-4]{1}:{1}[0-5]{1}[0-9]{1}):{1}([2]{1}[0-4]{1}:{1}[0-5]{1}[0-9]{1})"))) {
                    super.sendMsg(message, "//////////////Вивід новини", "setButtonTimeChoiseElse");
                    i++;
                    return i;
                    //кинути данні в базу про користувача
                }
                else{
                    super.sendMsg(message, "Ви ввели годину невірно, спробуйте ще раз", "OnlyMessage");
                }
            }else if(i == 7){
                switch(message.getText()){
                    case "Додати ще":
                        super.sendMsg(message, "Введіть годину в такому форматі: \"21:10\"", "OnlyMessage");
                        i = 6;     //якщо година введена невірно,повертаємось назад до процесу перевірки правельності формату
                        return i;
                    case"Готово":
                        i = 8;
                        return i;
                    //Далі буде відбуватися вивід новини
                }
            }
        }
        return i;
    }

}
