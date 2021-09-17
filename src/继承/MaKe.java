package 继承;

/**
 * @author： 吕二宁
 * @date： 2021-08-21 16:44
 */
public class MaKe {
    protected String name;
    protected String color;
    protected String movie;
    public void a(){
        System.out.println("名字：" + name);
        System.out.println("颜色：" + color);
        System.out.println("首次出现的电影：" + movie);
    }
    private void b(){
        System.out.println("功能：射出火焰");
    }

    public static void main(String[] args) {
        MaKe demo01 = new MaKe();
        demo01.name = "马克1";
        demo01.color = "银色";
        demo01.movie = "钢铁侠1";
        demo01.a();
        demo01.b();
    }

}
