package 继承;

/**
 * @author： 吕二宁
 * @date： 2021-08-21 16:51
 */
public class HaoKe extends MaKe{
    private void c(){
        System.out.println("功能：自我修复");
    }
    public static void main(String[] args) {
        HaoKe haoKe = new HaoKe();
        haoKe.name = "浩克";
        haoKe.color = "红色";
        haoKe.movie = "复联2";
        haoKe.a();
        haoKe.c();
    }
}
