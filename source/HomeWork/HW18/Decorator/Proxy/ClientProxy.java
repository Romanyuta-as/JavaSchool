package HomeWork.HW18.Decorator.Proxy;

import java.util.HashMap;
import java.util.*;

/**
 * Created by 1 on 11.09.2016.
 */
public class ClientProxy implements Chat {
    private Chat user = new Client();
    @Override
    public String getStatus(String login) {
            String image = user.getStatus(login);
            return image;
        }
    }


