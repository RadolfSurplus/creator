package poe.creator.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import poe.creator.data.models.Type;
import poe.creator.data.models.modifiers.Implicit;
import poe.creator.data.models.modifiers.explicits.Prefix;
import poe.creator.data.models.modifiers.explicits.Suffix;

import javax.annotation.PostConstruct;
import java.util.Collection;

@Service
public class LocalRepository {

    private static Collection<Suffix> suffixCollection;
    private static Collection<Prefix> prefixCollection;
    private static Collection<Implicit> implicitCollection;
    private static Collection<Type> typeCollection;

    @Value("{datafile.name.type}")
    private String typeFile;

    @Value("{datafile.name.implicit}")
    private String implicitFile;

    @Value("{datafile.name.suffix}")
    private String suffixFile;

    @Value("{datafile.name.prefix}")
    private String prefixFile;

    @PostConstruct
    private void uploadData() {
        //TODO Add asynchronous data download from xml files
    }
}
