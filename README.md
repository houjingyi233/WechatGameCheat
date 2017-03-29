# WechatGameCheat
基于xposed框架的微信掷骰子和剪刀石头布作弊器，原理是根据别人一篇博客：http://blog.csdn.net/jiangwei0910410003/article/details/52892330  

使用前请确保手机获得root权限并安装了xposed框架。本框架在微信6.3.9版本下通过测试，微信6.3.9下载：https://pan.baidu.com/s/1nvPVnoH  

![image](https://github.com/houjingyi233/Screenshots/blob/master/QQ%E5%9B%BE%E7%89%8720170329143520.png)  
gameType为2表示是剪刀石头布游戏，gameType为5表示是掷骰子游戏。在剪刀石头布游戏中，返回值0,1,2分别代表剪刀、石头和布；在掷骰子游戏中，返回值0到5分别代表1点到6点。有需要的话请修改源代码并重新编译，在bin目录下有编译好的apk，演示gif如下。  
<img src="https://github.com/houjingyi233/Screenshots/blob/master/example1%2000_00_00-00_00_58.gif" width = "200" height = "400" alt="图片名称" align=center />
  
