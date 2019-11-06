package ChangeDailyCategory;

import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class ChangeDailyCategory extends Main {
        KeyBoards keyBoards = new KeyBoards();
        public int ChangeDailyCategory (Update update, int i) {
            Main main = new Main();
            Message message = update.getMessage();
            if (message != null && message.hasText()) {
                if( i==0){
                    super.sendMsg ( message, " Введіть категорії, які хочете бачити", "CategoryAdd");
                    i++;
                    return i;
                }else if (i==1){
                    switch (message.getText()) {
                        case "Всі":
                            //кинути данні в базу про користувача
                            break;

                        case "Економіка": //як зробити щоб обрати кілька категорій
                            //кинути данні в базу про користувача
                            break;  //i++; return i;

                        case "Здоров'я":
                            //кинути данні в базу про користувача
                            break;//i++; return i;

                        case "За кородном":
                            //кинути данні в базу про користувача
                            break; //i++; return i;

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
                            super.sendMsg(message, " Категорію видалено ", "CategoryDel");
                            i=2;
                            return i;


                    }}
                    else if (i==2){
                        switch ( message.getText()){
                         case "Готово"://після цього перехід на загальну клавіатуру?
                        //кинути данні в базу про користувача
                        super.sendMsg(message, "Категорії щоденних повідомлень змінено", "OnlyMessage");

                        }}

                    }
            return i;   }

        }