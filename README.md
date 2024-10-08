![GOF23](https://socialify.git.ci/FearlessPeople/GOF23/image?description=1&forks=1&language=1&name=1&owner=1&pulls=1&stargazers=1&theme=Light)

<h1 align="center">Java23种设计模式学习笔记及代码示例</h1>

<div align="center">

[个人网站](http://www.fangzheng.tech) | [cnblogs链接](https://www.cnblogs.com/meet/p/5116504.html) | [学习交流](#学习交流) 

🚀「Java23种设计模式学习笔记及代码示例」是一个学习设计模式过程中的笔记记录，感谢互联网各大资源共享，如果本项目对你有用，点个Start，方便回顾知识~
<p align="center">
<img src="./images/gof23.png" style="border-radius: 15px;">
</p>
</div>


## ✨列表

1. [单例模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/singleton) - 保证一个类只有一个实例，并且提供一个访问该实例的全局访问点
2. [工厂模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/factory) - 用来生产同一等级结构中的任意产品
3. [抽象工厂模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/factory) - 抽象工厂模式是工厂模式的一种升级版本
4. [建造者模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/builder) - 分离了对象子组件的单独构造（由Builder来负责构建，由Director来负责组装），从而可以构造出复杂的对象。
5. [原型模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/prototype) - 通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
6. [模板方法模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/templateMethod) - 定义一个操作中的算法骨架，而将一些步骤延迟到子类中。
7. [命令模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/command) -（不常用）将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志。以及支持可撤销的操作。
8. [迭代器模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/iterator) - 提供一种方法顺序的访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。
9. [观察者模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/observer) - 也叫（发布-订阅模式）定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，这个主题对象在状态发生变化时，会通知所有观察者对象。使它们能够自动更新自己。
10. [中介者模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/mediator) - 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显示地相互引用。从而使其耦合松散，而且可以独立地改变它们之间的交互。
11. [备忘录模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/memento) - 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可将该对象恢复到原先保存的状态。
12. [解释器模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/interpreter) -（不常用）给定一个语言，定义它的文法一种表示。
13. [状态模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/state) - 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况。
14. [策略模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/strategy) - 它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的客户。
15. [职责链模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/chainOfResponsibility) - 将能够处理同一类请求的对象连成一条链，使这些对象都有机会处理请求，所提交的请求沿着链传递，从而避免请求的发送者和接受者之间的耦合关系。链上的对象逐个判断是否有能力处理该请求，如果能则就处理，如果不能，则传给链上的下一个对象，直到有一个对象处理它为止。
16. [访问者模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/visitor) -（不常用）表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
17. [适配器模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/adapter) - 将一个类的接口转换成客户希望的另外一个接口，Adapter模式使得原本由于接口不兼容而不能一起工作的类可以一起工作。
18. [桥接模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/bridge) - 将抽象部分与它的实现部分分离，使它们都可以独立的变化。而不会直接影响到其他部分。桥接模式解决了多层继承的结构，处理多维度变化的场景，将各个维度设计成独立的继承结构。使各个维度可以独立的扩展在抽象层建立联系。
19. [装饰模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/decorator) - 也叫装饰者模式或者装饰器模式，表示动态的给一个对象添加一些新的功能（利用子类继承父类也可以实现），但是比生成子类方式更灵活。
20. [组合模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/composite) - 将对象组合成树形结构以表示：部分--整体 的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。基本上见到的树形结构都使用到了组合模式。
21. [外观模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/facade) - 为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口。这个接口使得这一子系统更加容易使用。遵守迪米特法则（最少知识原则）。
22. [享元模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/flyWeight) - 运用共享技术有效的支持大量细粒度对象的重用。它能做到共享的关键就是区分了内部状态（可以共享，不会随环境变化而变化）和外部状态（不可以共享，会随环境变化而变化）。
23. [代理模式](https://github.com/FearlessPeople/GOF23/tree/master/com/fz/proxy) - 为其他对象提供一种代理以便控制对这个对象的访问。

## ❤️使用

1. clone本仓库
2. 根据首页README.md中每个文章链接，打开`com.fz`包中的README.md文档和对应代码进行学习

## 🖥参考资料

- 大话设计模式(带目录完整版).pdf
- HEAD_FIRST设计模式（中文版）.pdf
- 尚学堂_高淇_java300集最全视频教程_【GOF23设计模式】


