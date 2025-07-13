# Testing General Store .apk app for Mobile testing

### **Connect an Emulator**

- [ ] Download an emulator in Android Studio  
- [ ] Open CMD, go to the location below:  
      **C:\\Users\\COMPUTER WORLD\\AppData\\Local\\Android\\Sdk\\emulator**  
- [ ] To get the list of emulators  
       **emulator \-list-avds**  
- [ ] To run the emulator: **emulator @\<mobile\_emulator\_name\>**  
- [ ] Open CMD again, go to this location below:  
      **C:\\Users\\COMPUTER WORLD\\AppData\\Local\\Android\\Sdk\\platform-tools**  
- [ ] To know the details of the connected device type: **adb devices**

—---------------------------------------------------------------------------------------------------------------------------------------------------

**To install an APK file:**

- [ ] Run the emulator or a real device  
- [ ] Drag and drop the file into the emulator  
- [ ] Goto the cmd  
- [ ] cmd command: **adb \-s \<device\_id\_number\> install \<appname.apk\>**

   
**For example, on my pc:**   
                        adb \-s emulator-5554 install "C:\\Users\\COMPUTER WORLD\\Downloads\\General-Store.apk"

**To get all the installed apps list**

- [ ] Download- **APK info** app in the emulator from the Play Store  
- [ ] Get the .apk file’s first activity number:

**Process to get the first activity number using a third-party app:**

- [ ] Go to the **APK info** app  
- [ ] search the installed .**apk app**  
- [ ] Click the app  
- [ ] Click the activities  
- [ ] You get **com.adroidsample.\<app\_name\>.spalshActivity**

**Process to get the first activity number using cmd :** 

- [ ] Type: **adb shell dumpsys window | find "mCurrentFocus"**  
- [ ] Open the **.apk app** and click the keyboard enter button in the cmd  
- [ ] you get **com. androidsample.\<app\_name\>.spalshActivity**

**To get xpath and locators, we use Appium.**

- [ ] Open CMD, type: appium  
- [ ] Then open the Appium file 

**Fill in the desired capabilities:**

- [ ] platformName , text, Android  
- [ ] automationName, text, UiAutomator2  
- [ ] **If emulator:** deviceName, text, \<emulator\_device\_name\>  
- [ ] **If Real or emulator Device**: udid, text, \<device\_id\_number\>  
- [ ] appPackage, text, com.androidsample.\<appname\>  
- [ ] appActivity, text, com.. androidsample.\<app\_name\>.spalshActivity

- [ ] **Click the Checkbox** to automatically add the necessary   
- [ ] **Click** the start session button  
- [ ] It will take a screenshot of the app screen

***We can also download the testing App with Appium***

- [ ] In Cmd type:  appium  
- [ ] Then open the Appium file   
- [ ] Below are the **desired capabilities**  
- [ ] input : 

            platformName , text, Android  
            automationName, text, UiAutomator2  
            If emulator: deviceName, text, \<emulator\_device\_name\>  
            If Real or emulator Device: udid, text, \<device\_id\_number\>  
            app.text,\<pate the .apk file location\_in your pc\>

- [ ] **Click the Checkbox** to automatically add the necessary   
- [ ] **Click** the start session button  
- [ ] It will take a screenshot of the app screen

**To save the session**

- [ ] click save as   
- [ ] It will be saved in the **Save capabilities set**

**Start Testing:**

* **Run Emulator**  
* **Run appium**  
* **Goto IDE**   
* **Open IntelliJ**

* Create a Maven Project, same as Selenium   
* Remove Junit dependency  
* At **POM.xml**, add some below dependencies

**Appium**: https://mvnrepository.com/artifact/io.appium/java-client/9.5.0   
**TestNg**: https://mvnrepository.com/artifact/org.testng/testng/7.11.0  
**Selenium**:https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.34.0  
**Common io**:https://mvnrepository.com/artifact/commons-io/commons-io/2.19.0  
**Common lang3**:https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.17.0  
**Commons validator:** https://mvnrepository.com/artifact/commons-validator/commons-validator/1.9.0

              goto appium \> click saved capabilities\>Click Edit icon  
Start the session

* **Write desired codes in the Java/src/test folder.**  
* **Add the General-Store.apk file to the resources folder.**  
* **Run the Test code.**

