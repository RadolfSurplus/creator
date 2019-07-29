package poe.creator.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poe.creator.dao.LocalRepository;
import poe.creator.data.models.Base;
import poe.creator.data.models.Item;
import poe.creator.data.models.Type;
import poe.creator.data.models.modifiers.explicits.Prefix;
import poe.creator.data.models.modifiers.explicits.Suffix;
import poe.creator.utils.SessionUtils;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/create")
public class CreationController {

    private static final Logger LOG = LogManager.getLogger(CreationController.class);

    @Autowired
    private LocalRepository localRepository;

    @GetMapping("/current")
    public Item getCurrent() {
        return SessionUtils.getCurrentItem();
    }

    @PostMapping("/base/{selectedBase}")
    public Item selectBase(@PathVariable String selectedBase) {
        Item currentItem = SessionUtils.getCurrentItem();
        currentItem.setBase(Base.valueOf(selectedBase));
        SessionUtils.storeItem(currentItem);
        return currentItem;
    }

    @PostMapping("/type/{selectedType}")
    public Item selectType(@PathVariable String selectedType) {
        //TODO Add selected type to user current item
        Item currentItem = SessionUtils.getCurrentItem();
        Optional<Type> relevantType = localRepository.getRelevantTypeByBase(Base.valueOf(selectedType));
        relevantType.ifPresent(currentItem::setType);
        SessionUtils.storeItem(currentItem);
        return currentItem;
    }

    @PostMapping("/suffix/{selectedSuffix}")
    public Item selectSuffix(@PathVariable String selectedSuffix) {
        //TODO Add selected suffix to user current item
        Item currentItem = SessionUtils.getCurrentItem();
        Collection<Suffix> suffixCollection = currentItem.getSuffixCollection();
        suffixCollection.add(null);
        currentItem.setSuffixCollection(suffixCollection);
        SessionUtils.storeItem(currentItem);
        return currentItem;
    }

    @PostMapping("/prefix/{selectedPrefix}")
    public Item selectPrefix(@PathVariable String selectedPrefix) {
        //TODO Add selected prefix to user current item
        Item currentItem = SessionUtils.getCurrentItem();
        Collection<Prefix> prefixCollection = currentItem.getPrefixCollection();
        prefixCollection.add(null);
        currentItem.setPrefixCollection(prefixCollection);
        SessionUtils.storeItem(currentItem);
        return currentItem;
    }
}
