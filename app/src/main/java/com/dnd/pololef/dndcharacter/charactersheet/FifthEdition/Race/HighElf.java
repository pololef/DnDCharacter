package com.dnd.pololef.dndcharacter.charactersheet.FifthEdition.Race;

/**
 * Created by Pololef on 2017/2/28.
 */

public class HighElf extends Elf {
    public HighElf(){
        AddtionalInt = 1;

        //熟練的武器
        WeaponsGoodAt.add(Enumration.Weapon.LongBow);
        WeaponsGoodAt.add(Enumration.Weapon.ShortBow);
        WeaponsGoodAt.add(Enumration.Weapon.LongSword);
        WeaponsGoodAt.add(Enumration.Weapon.ShortSword);

        //額外的語言
        AddtionalLanguages = 1;
    }
}
