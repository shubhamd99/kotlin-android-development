## Kotlin Android Development 11

*Jetpack - https://developer.android.com/jetpack

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

#### Activity
The Activity class is a crucial component of an Android app, and the way activities are launched and put together is a fundamental part of the platform's application model. Unlike programming paradigms in which apps are launched with a main() method, the Android system initiates code in an Activity instance by invoking specific callback methods that correspond to specific stages of its lifecycle.

If you have worked with C, C++ or Java programming language then you must have seen that your program starts from main() function. Very similar way, Android system initiates its program with in an Activity starting with a call on onCreate() callback method. There is a sequence of callback methods that start up an activity and a sequence of callback methods that tear down an activity as shown in the below Activity life cycle diagram:

![activity](https://www.tutorialspoint.com/android/images/activity.jpg)

#### Fragments
A Fragment represents a reusable portion of your app's UI. A fragment defines and manages its own layout, has its own lifecycle, and can handle its own input events. Fragments cannot live on their own--they must be hosted by an activity or another fragment. 

![fragments](https://developer.android.com/images/guide/fragments/fragment-screen-sizes.png)

#### lateinit
The lateinit keyword stands for late initialization. Lateinit comes very handy when a non-null initializer cannot be supplied in the constructor, but the developer is certain that the variable will not be null when accessing it, thus avoiding null checks when referencing it later.

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

#### View Model Factory
We can not create ViewModel on our own. We need ViewModelProviders utility provided by Android to create ViewModels. But ViewModelProviders can only instantiate ViewModels with no arg constructor. So if we have a ViewModel with multiple arguments, then we need to use a Factory that we can pass to ViewModelProviders to use when an instance of MyViewModel is required.


#### View Model Live Data
LiveData is an observable data holder class. Unlike a regular observable, LiveData is lifecycle-aware, meaning it respects the lifecycle of other app components, such as activities, fragments, or services. This awareness ensures LiveData only updates app component observers that are in an active lifecycle state.

We can write code to observe the data in the view model from the activity of fragment and if any change or update to those data happens, with live data we can write code to automatically update the activity of fragment. With Live data we don't have to write codes to handle life cycles manually, since live data is aware of life cycle state changes they cleanup themselves when there associated lifecycle is destroyed therefore no memory leaks or crashes will happen.

#### Navigation Architecture Component
Jetpack Navigation Architecture Component library makes our development task much easier by providing many built-in tools to handle everything needed for in-app navigation. The new trend in Android development is Single activity with multiple fragments model.

Its not recommended to pass data between destinations, best practice is listing a view model and get the data from the view model.

* NavigationGraph - Its an XML resource file that contains all navigation related information, this allows us to manage navigation related task from single from single location.

* NavHostFragment - Its an empty container we keep on the activity to hold the navigation graph.

* NavController - Its a class generated by the navigation library to manage the navigation between distinations we added to the navigation graph.

* Navigation Animations Example - https://stackoverflow.com/questions/5151591/android-left-to-right-slide-animation

#### RecyclerView

When you have a long list of items to show you can use RecyclerView. It has the ability to reuse its views. In RecyclerView when the View goes out of the screen or not visible to the user it won???t destroy it, it will reuse these views. This feature helps in reducing power consumption and providing more responsiveness to the application. 

A LayoutManager is responsible for measuring and positioning item views within a RecyclerView as well as determining the policy for when to recycle item views that are no longer visible to the user.

#### Kotlin Coroutines

A coroutine is a concurrency design pattern that you can use on Android to simplify code that executes asynchronously.

On Android, coroutines help to manage long-running tasks that might otherwise block the main thread and cause your app to become unresponsive. Over 50% of professional developers who use coroutines have reported seeing increased productivity. One thread can have many coroutine on that thread. Coroutines are seperate processes running on the same thread.

Scope in Kotlin's coroutines can be defined as the restrictions within which the Kotlin coroutines are being executed. Scopes help to predict the lifecycle of the coroutines.
Global Scope is used to launch top level coroutines which are operating on the whole application lifetime, we rarely use this in development.

Dispatchers describe the kind of thread where the coroutine should be run in kotlin, it is always recommneded to start coroutines using main thread and then switch to background threads. To launch the coroutines in the main thread we use Dispatchers.Main (UI Thread), Others we have Dipstachers.IO (Background Thread), Dispatchers.Default (For CPU intensive tasks such as sorting a large list), Dispacthers.Unconfined (will run in the current thread, but if it is suspended and resumed it will run on suspending function's thread)

Launch builder launches a new coroutine without blocking the current thread. Returns an instance of Job, which can be used as a reference to the coroutine. We use this builder for coroutines that does not have any result as the return value.

Async builder launches a new coroutine without blocking the main thread. Returns an instance of Deferred<T>. We need to invoke await() to get the value. We use this builder for coroutines that does have a result as the return value.

Produce builder is for coroutines which produces a stream of elements, Returns an instance of Receive Channel.

RunBlocking - The coroutine we creare using this thread will block the thread while the coroutine is executing. It is used mostly for testing.

In Kotlin Coroutines, whenever a coroutine is suspended, the current stack frame of the function is copied and saved in the memory. When the function resumes after completing its task, the stack frame is copied back from where it was saved and starts running again. Example - withContext, delay, withTimtout, await, withTimeoutOrNull, supervisorScope, join, coroutineScope.

#### Structured Concurrency

It is a set of language features and best practises introduced for Kotlin Coroutines to avoid leaks and to manage them productively. 
