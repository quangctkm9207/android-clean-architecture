# Android clean architecture

This serves as a starting point for Android clean-architecture-base project.
I do not want to create boilerplate codes over and over again.

The concept of clean architecture is from Uncle Bob, and there are a lot of implementation ways down to Android.
My implementation is just one of them, it fits for me and it might fit for you too.

## Structure
It basically includes 3 modules which is arranged in outward order as in Uncle Bob diagram.
domain -> data -> app(presentation)
- `domain`[Java library]: contains business logic stuffs (use cases, entities, repository)
- `data`[Android library]: contains implementations related to data manipulation and persistence (exchange data with server, persist data in database)
- `app`[Android module]: contains all UI components which displays information and interact with users

## Language
Kotlin

## Libraries
- Android support libraries (appcompat, design, annotations, cardview, recyclerview, constraint layout)
- RxJava2
- OkHttp/Retrofit
- Gson
- Room
- JUnit/Hamcrest/Mockito/MockitoKotlin
- Glide
- Timber

## How to use it
1. Fork the repository
2. Change package names
3. Change app name
4. Start developing your own app

## Programming flow
In this Android clean architecture, there are 3 main modules representing for 3 layers in increasing and dependency order as following: `domain` <-`data` <-`app`.  
`domain` is the lowest-level layer and the higher ones depend on it. The next one is the `data` layer, and finally `app` (presentation) module. In many other implementations, `app` module is renamed to `presentation` to map with the name used in Clean Architecture documentation of Uncle Bob. However, I want to keep it `app` because it is a short name, and in Android project structure, this module is placed highest position that matches with our perspective.  

**For programming flow**  
When we add a new function (a business logic) to our app, we should go from bottom to top (lower to higher).  
Firstly, we add business logic codes (`usecase`, `repository`, `entity`) into `domain` module.  
After that, we move into a higher module `data` to add codes that actually implement data-related parts (connect to server, save caches). Finally, we add ui-related parts in `app` module. In this part, currently, it is implemented by MVP architecture. So, the connectiton between use cases and view should be put in Presenter classes. One screen in this project usually starts with 3 basic classes: Contract, Presenter, and View(Activity or Fragment).  

## Keep going for a better implementation
Let's improve and update this project for a better implementation. It strives for the following characteristics of a software project.
- Clean codes
- Easy to learn and apply
- Easy to maintain (add new features and fix issues)
- Easy to test
- Match with software principles: DRY, SOLID
