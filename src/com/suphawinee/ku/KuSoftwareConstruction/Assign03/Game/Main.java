package src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.Game;

public class Main {
    public static void main(String[] args) {
        // ข้อ 1: ทดลองเปลี่ยนค่า MAX_HEALTH
        // GameSettings.MAX_HEALTH = 200; // จะ error ถ้า MAX_HEALTH เป็น final

        // ข้อ 2: ทดสอบ displayStats()
        Player p = new Player("Harry");
        p.displayStats();

        // ข้อ 3: ทดสอบ castSpell() ของ Mage
        Mage m = new Mage("Drake");
        m.displayStats();
        m.castSpell(20);
    }
}
