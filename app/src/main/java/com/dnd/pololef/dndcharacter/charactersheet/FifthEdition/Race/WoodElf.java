package com.dnd.pololef.dndcharacter.charactersheet.FifthEdition.Race;

/**
 * Created by Pololef on 2017/2/28.
 */

public class WoodElf extends Elf {
    public WoodElf() {
        Speed = 35;
        AddtionalWis = 1;

        //熟練的武器
        WeaponsGoodAt.add(Enumration.Weapon.LongBow);
        WeaponsGoodAt.add(Enumration.Weapon.ShortBow);
        WeaponsGoodAt.add(Enumration.Weapon.LongSword);
        WeaponsGoodAt.add(Enumration.Weapon.ShortSword);

        addCharacteristics("以天為屏","當你因植物、大雨、飄雪、薄霧等自然現像獲得輕度遮蔽時，你可以嘗試躲藏。");
    }
}
