package com.dnd.pololef.dndcharacter.charactersheet.FifthEdition.Race;

/**
 * Created by Pololef on 2017/2/28.
 * 特有屬性
 */

public class Characteristic {

    /**
     * 名稱
     */
    private String Name;

    /**
     * 屬性描述
     */
    private String PropertyDescription;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPropertyDescription() {
        return PropertyDescription;
    }

    public void setPropertyDescription(String propertyDescription) {
        PropertyDescription = propertyDescription;
    }
}
