
# Emoji键盘组件

## 依赖说明：

* 在项目根build.gradle的allprojects目录添加[maven { url 'https://jitpack.io' }]()
* 正式版添加gradle  [implementation 'com.github.rookievips:memojikeyboard:x.x.x']()

### 使用说明：
* Application初始化MEmojiConfig.init()，提供不同style，具体参考init方法
* MEmojiKeyboard.Builder().fromRootView(rootView).selectedIconColor(Color.parseColor("#FF6E00")).build(editText)
* Builder提供多种属性，功能设置,具体使用时可参考
* MEmojiKeyboard.show() MEmojiKeyboard.hide() MEmojiKeyboard.toggle()

### 注意!:对应的界面需要在manifest文件配置:android:windowSoftInputMode="stateVisible|adjustResize"


