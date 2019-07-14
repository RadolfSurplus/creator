package poe.creator.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import poe.creator.constants.MainConstants;
import poe.creator.data.models.Item;

import javax.servlet.http.HttpSession;

public class SessionUtils {

    public static Object getAttribute(String attribute) {
        return getCurrentSession().getAttribute(attribute);
    }

    public static void storeAttribute(String attribute, Object object) {
        getCurrentSession().setAttribute(attribute, object);
    }

    public static Item getCurrentItem() {
        HttpSession currentSession = getCurrentSession();
        Item currentItem = (Item) currentSession.getAttribute(MainConstants.ITEM_SESSION_CODE.getCode());
        if (currentItem == null) {
            currentItem = new Item();
            currentSession.setAttribute(MainConstants.ITEM_SESSION_CODE.getCode(), currentItem);
        }
        return currentItem;
    }

    private static HttpSession getCurrentSession() {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        return attr.getRequest().getSession();
    }
}
