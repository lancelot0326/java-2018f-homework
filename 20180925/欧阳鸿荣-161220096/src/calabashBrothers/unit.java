package calabashBrothers;

import calabashBrothers.beings.Creature;

/**
 * @ Author     ：Young
 * @ Description：空间上的格点，映射到BattleField的容器
 */
public class unit<T> {
    private Coordinate pos; //格点的坐标
    private T content;      //格点的内容物

    public unit(int x, int y) {
        pos = new Coordinate(x,y);
        this.content = null;
    }

    public int getX() {
        return pos.getX();
    }

    public int getY() {
        return pos.getY();
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        if(this.content==null){
            this.content = content;
        }else{
            System.out.println("Collision When setting" + content.toString());
        }
    }

    public boolean none(){
        return this.content==null;
    }

    public void removeContent(){
        this.content = null;
    }

    public void showContent(){
        this.content.toString(); //用了泛型后，这里就不能用原来的方法了
    }

}
