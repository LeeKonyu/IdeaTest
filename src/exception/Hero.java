package exception;

/**
 * @author : 猕猴桃
 * @create 2019/7/10 19:23
 */
public class Hero {
    public String name;
    protected float hp;
    public void attackHero(Hero h)throws EnemyHeroIsDeadException{
        if(h.hp==0)
            throw new EnemyHeroIsDeadException(h.name+"已经挂了，不需要再释放技能了");
    }
    public String toString(){
        return name;
    }
    class  EnemyHeroIsDeadException extends Exception{
        public EnemyHeroIsDeadException(){

        }
        public EnemyHeroIsDeadException(String msg){
            super(msg);
        }
    }

    public static void main(String[] args) {
        Hero h1=new Hero();
        h1.name="garen";
        h1.hp=3000f;
        Hero h2=new Hero();
        h2.name="teemo";
        h2.hp=0f;
        try{
            h1.attackHero(h2);
        }catch (EnemyHeroIsDeadException e){
            e.printStackTrace();
            System.out.println("异常的具体原因："+e.getMessage());
        }
    }
}
