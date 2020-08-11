package pl.sda.advanced.wzorceProjektoweZadania.ChildList;

import java.util.*;

public class ChildrenListImpl implements IChildrenList {

    List<String> names;

    private Date date = new Date();

    public Date getDate() {
        return date;
    }


    public ChildrenListImpl() {
        this.names = new ArrayList<>();
    }

    @Override
    public void addChild(String name) {
        SingletoneExample singleton = SingletoneExample.getInstance();
        names.add(name + singleton.getNumer());

    }

    @Override
    public String getChildren() {
        return names.toString();
    }

    @Override
    public void sortChildren() {
        Collections.sort(names);
    }

    @Override
    public void removeDuplicate() {
        names = new ArrayList<>(new HashSet<>(names));
        sortChildren();
    }

    @Override
    public void setNamesToUpperCase() {
        for (int i = 0; i < names.size(); i++){
            names.set(i, names.get(i).toUpperCase());
        }

    }

    @Override
    public void setNamesToLowerCase() {
        for (int i = 0; i < names.size(); i++){
            names.set(i, names.get(i).toLowerCase());
        }
    }
}
