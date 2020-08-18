package pl.sda.advanced.wzorceProjektoweZadania.iterator.nameList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NameListImpl implements INameList{

    List<String> names = new ArrayList<>();

    @Override
    public String getNames() {
        return names.toString();
    }

    @Override
    public void deleteName(String name) {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.equals(name)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(names);
    }

    @Override
    public void add(String name) {
        names.add(name);

    }
}
