package HomeWork.HW18.Decorator.Proxy;

/**
 * Created by 1 on 11.09.2016.
 */
public class Client implements Chat {
    @Override
    public String getStatus(String login) {
        System.out.println("Происходии загрузка данных пользователя");
        return String.format("Пользователь  зашел в сеть \"%s\"", login);
    }
}
