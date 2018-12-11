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