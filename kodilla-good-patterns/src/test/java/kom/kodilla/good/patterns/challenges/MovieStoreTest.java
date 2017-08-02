package kom.kodilla.good.patterns.challenges;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieStoreTest {

    @Test
    public void CombineTranslations() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Stream<String> joinedCollections = Stream.of(ironManTranslations, avengersTranslations, flashTranslations)
                .flatMap(Collection::stream);
        Collection<String> translations =
                joinedCollections.collect(Collectors.toList());
        String translationsModified = translations.toString().replaceAll(", ","!");

        System.out.println(translationsModified);

    }

}
