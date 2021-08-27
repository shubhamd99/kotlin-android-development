## Kotlin Android Development 11

#### Steps To Open Project
1. Open a folder in Android Studio For Example 1-SimpleDataBinding
2. If you see any gradle plugin update message click on update
3. Click Build -> Rebuild Project
4. Sometimes you have to Clear cache by File -> Invalidate Caches / Restart

#### Data Binding
The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.

* Why Not to use findViewById - In an larger android application, there can be many layouts and 100s of views, Therefore going through the View hierarchy again and again in the runtime is not a good idea, it reduces the performance of the large android application 

* How Data Binding Works - When we are using data binding we create a binding object that contains a reference to each view for layout, once the binding object has been created over the components of the app can access the views and other data through the binding object, thus the android system needs not to go to the view hierarchy again and again searching for view both the time. In that way data binding improves the perfomance of our app a lot. It makes our code concise, easier to read and maintain. Recognize error during the complie time.

* Steps to Enable Data Binding - Enable data binding, then Wrap xml with layout tags, and construct a data binding object

* Kotlin Synthetic (KTX) can be used to avoid findViewById()  for smaller projects. It is very easy to use and really helpful in some situations. But it is not a recommended best practice(by google) . Also you will miss a lot of advantages provided by data binding for larger complex projects.