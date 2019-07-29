package poe.creator.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class ModifierUtils {

    private static final Logger LOG = LogManager.getLogger(ModifierUtils.class);

    public String populateDescription(Map<String, Object> modifiers, String template, Character suffix, Character prefix) {
        modifiers.forEach((key, value) -> {
            String regExp = suffix + key + prefix;
            if (!template.contains(regExp)) {
                LOG.error(String.format("Modifier with key %s is not exists in: %s", key, template));
                return;
            }
            template.replaceFirst(regExp, String.valueOf(value));
        });
        return template;
    }
}
