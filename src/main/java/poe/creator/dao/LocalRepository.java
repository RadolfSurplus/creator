package poe.creator.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import poe.creator.data.models.Base;
import poe.creator.data.models.Type;
import poe.creator.data.models.modifiers.Implicit;
import poe.creator.data.models.modifiers.explicits.Prefix;
import poe.creator.data.models.modifiers.explicits.Suffix;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class LocalRepository {

    private static List<Suffix> suffixCollection;
    private static List<Prefix> prefixCollection;
    private static List<Implicit> implicitCollection;
    private static List<Type> typeCollection;

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

    public Optional<Type> getRelevantTypeByBase(Base selectedBase) {
        return typeCollection.stream()
                .filter(type -> type.getRelevantBase().equals(selectedBase))
                .findFirst();
    }

    public Optional<Suffix> getRelevantSuffixByName(String suffixName) {
        return suffixCollection.stream()
                .filter(suffix -> suffix.getName().equals(suffixName))
                .findFirst();
    }

    public Optional<Prefix> getRelevantPrefixByName(String prefixName) {
        return prefixCollection.stream()
                .filter(prefix -> prefix.getName().equals(prefixName))
                .findFirst();
    }

    public Optional<Implicit> getRelevantImplicitByTypeName(String typeName) {
        return implicitCollection.stream()
                .filter(implicit -> implicit.getRelevantType().getName().equals(typeName))
                .findFirst();
    }
}
