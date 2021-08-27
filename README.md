## Kotlin Android Development 11

#### Steps To Open Project
1. Open a folder in Android Studio For Example 1-SimpleDataBinding
2. If you see any gradle plugin update message click on update
3. Click Build -> Rebuild Project
4. Sometimes you have to Clear cache by File -> Invalidate Caches / Restart

#### Jetpack
Jetpack is a suite of libraries to help developers follow best practices, reduce boilerplate code, and write code that works consistently across Android versions and devices so that developers can focus on the code they care about. Jetpack is a suite of libraries to help developers follow best practices, reduce boilerplate code, and write code that works consistently across Android versions and devices so that developers can focus on the code they care about. Allow apps to run on all Android platform versions. Backward compatibility. Enhances process of app development. Better testability.

#### MVP (Model View Presenter)
MVP (Model View Presenter) pattern is a derivative from the well known MVC (Model View Controller), and one of the most popular patterns to organize the presentation layer in Android Applications.

The MVP pattern allows separating the presentation layer from the logic so that everything about how the UI works is agnostic from how we represent it on screen. 

For an application to be easily extensible and maintainable, we need to define well-separated layers. MVP makes views independent from our data source. We divide the application into at least three different layers, which lets us test them independently. With MVP we take most of the logic out from the activities so that we can test it without using instrumentation tests.

#### Data Binding
The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.

* Why Not to use findViewById - In an larger android application, there can be many layouts and 100s of views, Therefore going through the View hierarchy again and again in the runtime is not a good idea, it reduces the performance of the large android application 

* How Data Binding Works - When we are using data binding we create a binding object that contains a reference to each view for layout, once the binding object has been created over the components of the app can access the views and other data through the binding object, thus the android system needs not to go to the view hierarchy again and again searching for view both the time. In that way data binding improves the perfomance of our app a lot. It makes our code concise, easier to read and maintain. Recognize error during the complie time.

* Steps to Enable Data Binding - Enable data binding, then Wrap xml with layout tags, and construct a data binding object

* Kotlin Synthetic (KTX) can be used to avoid findViewById()  for smaller projects. It is very easy to use and really helpful in some situations. But it is not a recommended best practice(by google) . Also you will miss a lot of advantages provided by data binding for larger complex projects.

#### View Model
The ViewModel class is designed to store and manage UI-related data in a lifecycle conscious way. The ViewModel class allows data to survive configuration changes such as screen rotations. The Android framework manages the lifecycles of UI controllers, such as activities and fragments. The framework may decide to destroy or re-create a UI controller in response to certain user actions or device events that are completely out of your control.

If the system destroys or re-creates a UI controller, any transient UI-related data you store in them is lost. For example, your app may include a list of users in one of its activities. When the activity is re-created for a configuration change, the new activity has to re-fetch the list of users. View model instance will live in the memory holding activities data during config changes.

A ViewModel's onCleared() is called when the app is put into the background and the app process is killed in order to free up the system's memory.