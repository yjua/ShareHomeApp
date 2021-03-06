# ShareHomeApp
致力于开发一个免费无中介直租共享房源平台App项目~

# 当前状态：开发进行中。。。

# 更新信息

房屋信息接口发布  <a href="http://www.521geek.com/swagger-ui.html" target="_blank">Share Home App API </a>

## 开发工具和技术清单

### 辅助工具

[截图神器 Snipaste](https://www.snipaste.com/)

[取色器 彗星小助手](http://www.it608.com/Item/ca.html)

### Web后台

开发环境：[JDK 1.8（64位）](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)+ [Intellij Idea(2018.2)](https://www.jetbrains.com/idea/download/#section=windows) + [MySQL Community Server 8.0.12](https://dev.mysql.com/downloads/installer/)

技术清单：Spring Boot(2.0.4)+ Dev Tools +Web + Thymeleaf+ JPA + MySQL+ Swagger2

### Web前端：

开发环境：[HBuilder.9.1.14.Windows](http://www.dcloud.io/)

技术清单: [BootStrap 4](https://v4.bootcss.com/) + [Vue.js](https://cn.vuejs.org/)+ [Angular JS](https://angularjs.org/)

### Android端：

开发环境：[Android Studio(3.1.4)](http://www.android-studio.org/) + [Genymotion(模拟器)](https://www.genymotion.com/)+ [Intel® Hardware Accelerated Execution Manager(硬件加速器)](https://software.intel.com/en-us/articles/intel-hardware-accelerated-execution-manager-intel-haxm)

技术清单：OkHttpUtils(网络请求库) + butterknife(视图数据绑定)

## 目录层级说明

source/FrontEnd-----------Web前端源码

source/web----------Web后台源码

source/android-----------Android 源码

source/ios-----------IOS源码

preview-------效果图

## API接口规范

public class AppResponse  implements Serializable {
	
    private Boolean resultStatus;// true:Request Success false: Request fail
    
    private Integer resultCode;// response code
    
    private String resultMessage;// response message
    
    private Object resultData;// business data
    
    private Object extendField;// 扩展字段 
    
}

 返回成功:
 
	{"resultStatus":true,"resultCode":200,"resultMessage":"响应成功","resultData":null,"extendField":null}
 
 返回失败：
 
 {"resultStatus":false,"resultCode":500,"resultMessage":"响应失败","resultData":null,"extendField":null}
 
 resultStatus: 返回状态
 
 resultCode : 返回状态码
 
 resultMessage:返回信息
 
 resultData: 业务逻辑参数,该字段为泛型，可为null, Object, List<Object> 等多种数据类型

 extendField: 扩展字段,默认是 null
 
## 开发小组 - 任务分配列表

1. Web 后台模块

负责人：星云 ，张鹏

租个家模块 ------开发进行中----星云

找工作模块-------开发进行中-----张鹏

交朋友模块-------开发进行中

个人中心模块-------开发进行中

2. Web前端

负责人：DIN , 小宁

租个家模块 -------开发进行中

找工作模块--------开发进行中

交朋友模块--------开发进行中

个人中心模块-------开发进行中

3. Android 端

负责人：星云

租个家模块 -------开发进行中

找工作模块-------开发进行中

交朋友模块-------开发进行中

个人中心模块-------开发进行中

4. IOS
 
负责人：海纳百川

租个家模块 -------开发进行中

找工作模块-------开发进行中

交朋友模块-------开发进行中

个人中心模块-------开发进行中

5. UI

负责人：黄月月

6. 心灵按摩师

负责人：巧儿

7. 运营

负责人：CorS

## 效果图进度更新

Android 框架初始化完成

![Alt text](/preview/android_preview.png)

## 数据库字典

房屋信息主表

	private Long homeInfoId;//房屋信息Id
	private String homeInfoTitle;//房源标题
	private String homeInfoMoneyByOneMonth;//月付金额
	private String homeInfoArea;//房屋面积
	private String homeInfoType;//房屋类型
	private String homeInfoFloor;//房屋楼层
	private String homeInfoOrientation;//房屋朝向
	private String homeInfoSubway;//房屋地铁
	private String homeInfoCommunity;//房屋小区
	private String homeInfoAddress;//房屋地址
	private String homeInfoPhone;//联系电话
	private Long homeInfoPublishTime;//发布时间
	private String homeInfoRentalmethod;//租赁方式
	private String homeInfoSupportPayMethod;//付款方式
	private String homeInfoHeatingMethod;//供暖方式
	private Integer homeInfoPicListId;//房屋图片列表Id ----外键关联
	private Integer homeInfoDeviceListId;//房屋设备列表Id----外键关联
