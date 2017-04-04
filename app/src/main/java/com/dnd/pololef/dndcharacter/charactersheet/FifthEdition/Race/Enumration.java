package com.dnd.pololef.dndcharacter.charactersheet.FifthEdition.Race;

/**
 * Created by Pololef on 2017/2/28.
 */

public class Enumration {

    public enum BodySize{
        Small,
        Medium,
        Large,
    }

    /**
     * 豁免
     */
    public enum Exemption{
        Str,
        Agi,
        Vit,
        Int,
        Wis,
        Cha,
    }

    /**
     * 技能
     */
    public enum Skill{
        /**
         * 運動
         */
        Sport,

        /**
         * 體操
         */
        Gym,

        /**
         * 手上把戲
         */
        HandTrick,

        /**
         * 隱匿
         */
        Hide,

        /**
         * 奧秘(秘密)
         */
        Mystery,

        /**
         * 歷史
         */
        History,

        /**
         * 調查
         */
        Detect,

        /**
         * 自然
         */
        Nature,

        /**
         * 宗教
         */
        Religion,

        /**
         * 馴養動物
         */
        TrainingAnimal,

        /**
         * 洞察
         */
        Insight,

        /**
         * 醫藥
         */
        Medicine,

        /**
         * 觀察
         */
        Observe,

        /**
         * 生存
         */
        Survive,

        /**
         * 欺騙
         */
        Cheat,

        /**
         * 威嚇
         */
        Threat,

        /**
         * 表演
         */
        Show,

        /**
         * 遊說
         */
        persu,
    }

    /**
     * 語言
     */
    public enum Languaage{
        Genal,
        Elf,
    }

    /**
     * 武器
     */
    public enum Weapon{
        LongSword,
        ShortSword,
        ShortBow,
        LongBow,
    }
}
