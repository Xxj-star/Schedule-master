# Schedule-master
  自定义占位布局，封装到Base页面，使用更方便。基于StateView扩展了占位布局作为参数，以及空数据页面时点击也会回调（原生库并没有直接给空页面重试回调）。


# 功能

参考StateView，inject的时候可以额外添加一个布局R.layout.xxxx作为参数，实现底部占位布局效果。


# 使用方法：
```
        stateView = StateView.inject(this, R.layout.skeletona);
        stateView.setAnimatorProvider(new RotateAnimatorProvider());
        stateView.showLoading();
```

版本说明

# 当前版本

[![release](https://img.shields.io/badge/release-v1.0-orange.svg)](https://github.com/xuxinjiang/Schedule-master/blob/master/update.md)

## build.gradle设置
```
dependencies {
 implementation 'com.github.xuxinjiang:Schedule-master:v1.0'
}
```
# 演示（请star支持）

![image text](https://github.com/xuxinjiang/Schedule-master/blob/master/gif/dd.gif)

# 联系方式

本群旨在为使用我github项目的人提供方便，如果遇到问题欢迎在群里提问。

### 欢迎加入QQ交流群（Q群574181465）

![image text](https://github.com/xuxinjiang/NetworkCue-/blob/master/gif/qqqun.png)



