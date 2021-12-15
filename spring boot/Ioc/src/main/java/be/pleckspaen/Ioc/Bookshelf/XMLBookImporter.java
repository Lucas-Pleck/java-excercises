package be.pleckspaen.Ioc.Bookshelf;

import org.springframework.stereotype.Component;

@Component("xmlImporter")
public class XMLBookImporter implements IBookImporter{

    @Override
    public void bookImport() {
        System.out.println("import books through XML");
    }
}
