# 葫芦娃大战蝎子精

## 设计思路
* 将生物抽象成一个父类(Creature)，由多个物种类继承，更贴合现实世界
* 将列阵行为(Formate)抽象成一个接口，方便不同的阵营实现不同的列队
* 抽象出物种(Species)、阵型(Formation)和葫芦娃的排行(Rank)两个枚举类以及常数(Constants)接口，实现跨模块调用
* 将显示阵型抽象成一个单独的类(ShowFormation)，并继承自JFrame，类功能定义更加明确
* 将战场抽象成二维点阵，将生物根据坐标放置在点阵上
* 将对象分为两个阵营，符合故事情节，也便于不同阵营的列阵

## 模块关系

### Creature(生物类，抽象父类)
#### *成员*
+ 姓名
+ 所属物种
+ 照片路径

#### *子类(不同的物种类）*
+ Calabash(葫芦娃类)
    + CalabashBrothers(葫芦娃内部类，定义每个葫芦娃)
    + 将无序的初始葫芦娃队列以二分法按照排行排序
+ Human(人类)
+ Snake(蛇类)
+ Scorpion(蝎子类)
+ Minion(小喽啰类)


### GoodSide(好人类)

#### *成员*
+ Calabash calabashBrothers(葫芦娃)
+ Human grandpa(老爷爷)

#### *方法*
+ 固定阵型的排列

### EvilSide(坏人类)

#### *成员*
+ Sanke snake(蛇精)
+ Scorpion scorpion(蝎子精)
+ Minions minions(小喽啰)

#### *方法*
+ 根据点击按钮的不同有不同的阵型排列，并且小喽啰的数量随不同的排列变化


### ShowFormation(继承自JFrame)
> *显示阵型并且是程序入口*

#### *成员*
+ 父窗体
+ 按钮控件
+ 角色所处的点阵

#### *方法*
+ 主方法：根据点击的按钮显示阵型
+ 初始化父窗体
+ 初始化点阵
+ 初始化各个按钮控件，并设置相应的监听事件


### image包
> *存放各自的照片以及背景图片*


