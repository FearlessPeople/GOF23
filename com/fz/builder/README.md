## 模式介绍

建造者模式：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示,构建与表示分离，同构建不同表示

假如一个对象的构建很复杂，需要很多步骤。则可以使用建造者模式，将其构建对象和组装成一个对象这两步给分开来。构建部分为（builder）和组织部分（director），实现了构建和装配的解耦。

不同的构建器，相同的装配也可以做出不同的对象。

相同的构建器，不同的装配顺序也可以做出不同的对象。

例如：现在要生产一个汽车，会有很多零件，有了零件还需要把这些零件组装成一个完整的汽车。**建造者模式就是将构建零件（builder）和组装零件（director）两个操作给分开**

与抽象工厂的区别：

在建造者模式里，有个指导者，由指导者来管理建造者，用户是与指导者联系的，指导者联系建造者最后得到产品。即建造模式可以强制实行一种分步骤进行的建造过程。

## 实例代码

代码的具体实现：宇宙飞船的实现

1、假如现在要构建一个宇宙飞船对象，先定义一个宇宙飞船对象，有一些简单的属性。

```java
/**
 * 宇宙飞船
 */
public class AirShip {
    private OrbitalModule orbitalModule;//轨道舱
    private Engine engine;//发动机
    private EscapeTower escapeTower;//逃逸塔
    //省略get，set，构造器
}

//轨道舱
class OrbitalModule {
    private String name;
    //省略get，set，构造器
}

//发动机
class Engine {
    private String name;
    //省略get，set，构造器
}

//逃逸塔
class EscapeTower {
    private String name;
    //省略get，set，构造器
}
```

2、有了以上属性后，接下来就可以将飞船中部分零件给构建出来了。为了以后构建不同种类的飞船，这里使用接口来定义构建。有什么类型的飞船就用什么类来实现该接口。

```java
/**
 * 构建接口:用来构建AirShipz中组件的接口
 */
public interface AirShipBuilder {
    Engine builderEngine();//构建发动机

    OrbitalModule builderOrbitalModule();//构建轨道舱

    EscapeTower builderEscapeTower();//构建逃逸塔
}
```

3、把这些零件构建完成后，就需要把构建好的这些组件构建成一个完整的飞船（AirShip）了。使用接口来定义，不同类型的飞船组装可以用不同的具体实现。

```java
/**
 * 组装接口:用于将飞船组件组装起来
 */
public interface AirShipDirector {
    /**
     * 组装飞船
     * @return
     */
    AirShip directorAirShip();
}
```

4、开始真正的实现飞船的构建和飞船的组装 4.1、 飞船的构建的实现

```java
/**
 * 具体飞船的构造
 */
public class FzAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        System.out.println("万能牌发动机");
        return new Engine("万能牌发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("万能牌轨道舱");
        return new OrbitalModule("万能牌轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("万能牌逃逸塔");
        return new EscapeTower("万能牌逃逸塔");
    }
}
```

4.2、 具体飞船的组装实现：这里需要注意，组装是需要依赖于构建的（飞船的完整组装需要飞机的各部件构建成功才能组装）

```java
/**
 * 具体飞船的组装
 */
public class FzAirShipDirector implements AirShipDirector {
    private AirShipBuilder builder;//创建构建者的引用

    public FzAirShipDirector(AirShipBuilder airShipBuilder) {
        this.builder = airShipBuilder;
    }

    /**
     * 组装具体的对象，为了简单，这里的组装步骤比较简单。实际产品中较复杂
     */
    @Override
    public AirShip directorAirShip() {
        Engine e = builder.builderEngine();//构建发动机
        EscapeTower et = builder.builderEscapeTower();//构建逃逸塔
        OrbitalModule o = builder.builderOrbitalModule();//构建轨道舱
        //装配对象
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);
        return ship;
    }

}
```

5、在我们客户具体使用的时候，只需要知道构建接口、组装接口和一个飞船对象，我们根本不需要知道内部怎么组装的，内部有多少零件。只需要知道怎么使用组装即可。

```java
public static void main(String[]args){

        AirShipDirector shipDirector=new FzAirShipDirector(new FzAirShipBuilder());
        AirShip airShip=shipDirector.directorAirShip();//构建对象
        // System.out.println(airShip.getEngine());
        }
```

结果如下：

万能牌发动机 万能牌逃逸塔 万能牌轨道舱

## 总结

### 常见应用场景

- 如果一个对象的构建很复杂，需要很多步骤，则考虑使用建造者模式，把对象的构建和最后的组装分离开来。
- 在平常使用的类中如果后缀为builder则就是建造者模式
- StringBuilder类的apend方法
- SQL中的PreparedStatement
- JDOM中的DomBuilder、SAXBuilder
