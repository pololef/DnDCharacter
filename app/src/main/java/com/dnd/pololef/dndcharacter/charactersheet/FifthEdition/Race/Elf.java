package com.dnd.pololef.dndcharacter.charactersheet.FifthEdition.Race;

/**
 * Created by Pololef on 2017/2/28.
 * 基本精靈
 */

public class Elf extends RaceBasic {
    public Elf() {
        Speed = 30;
        Body = Enumration.BodySize.Medium;
        AddtionalAgi = 2;

        //擅長觀察
        SkillsGoodAt.add(Enumration.Skill.Observe);

        //會的語言
        Languages.add(Enumration.Languaage.Elf);
        Languages.add(Enumration.Languaage.Genal);

        //設定特性
        String[] characteristicTitle = new String[]{
                "黑暗視覺",
                "精裔血統",
                "冥想"
        };
        String[] characteristicdes = new String[]{
                "60 尺以內的微光對你而言如同亮光，黑暗如同微光。在這情況下你只能辨別黑白。",
                "你的扺抗迷惑的豁免帶有優勢，而且魔法不能使你陷入睡眠。",
                "精靈不需要睡覺。取而代之，他們每天要進行四小時的深層冥想，其中會做夢。這些夢其實是經年累月培養出來的直覺式心靈訓練。這樣的休息可以逹到相同於人類睡眠八小時的效果。"
        };
        setCharacteristics(characteristicTitle, characteristicdes);
    }
}
