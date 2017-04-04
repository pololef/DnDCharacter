package com.dnd.pololef.dndcharacter.charactersheet.FifthEdition.Race;

import com.dnd.pololef.dndcharacter.charactersheet.FifthEdition.Spell.SpellBasic;

import java.util.ArrayList;

/**
 * Created by Pololef on 2017/2/28.
 * 種族基底
 */

public class RaceBasic {

    /**
     * 速度(呎)
     */
    protected int Speed = 30;

    /**
     * 體型
     */
    protected Enumration.BodySize Body = Enumration.BodySize.Medium;

    /**
     * 額外的種族加值
     */
    protected int AddtionalStr = 0;
    protected int AddtionalAgi = 0;
    protected int AddtionalVit = 0;
    protected int AddtionalInt = 0;
    protected int AddtionalWis = 0;
    protected int AddtionalCha = 0;

    /**
     * 熟練的豁免
     */
    protected ArrayList<Enumration.Exemption> ExemptionsGoodAt = new ArrayList<>();

    /**
     * 熟練的技能
     */
    protected ArrayList<Enumration.Skill> SkillsGoodAt = new ArrayList<>();

    /**
     * 種族特有屬性
     */
    protected ArrayList<Characteristic> Characteristics = new ArrayList<>();

    /**
     * 天生會的語言
     */
    protected ArrayList<Enumration.Languaage> Languages = new ArrayList<>();

    /**
     * 是否有額外的語言
     */
    protected int AddtionalLanguages = 0;

    /**
     * 熟練的武器
     */
    protected ArrayList<Enumration.Weapon> WeaponsGoodAt = new ArrayList<>();

    /**
     *
     */
    protected ArrayList<SpellBasic> AddtionalSpell = new ArrayList<>();

    /**
     * 設定特有屬性
     * @param ChaName 屬性名稱
     * @param des 屬性描述
     */
    protected void setCharacteristics(String[] ChaName, String[] des) {
        int i = 0;
        for (String title : ChaName) {
            Characteristic singleCha = new Characteristic();
            singleCha.setName(title);
            singleCha.setPropertyDescription(des[i]);
            Characteristics.add(singleCha);
            i++;
        }
    }

    /**
     * 新增特有屬性
     * @param name 屬性名稱
     * @param description 屬性描述
     */
    protected  void addCharacteristics(String name,String description){
        Characteristic singleCha = new Characteristic();
        singleCha.setName(name);
        singleCha.setPropertyDescription(description);
        Characteristics.add(singleCha);
    }
}
