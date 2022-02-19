# FX-Android-App
This app provides exchange rates . Users can get exchange rates by selecting a currency on the drop down box. 
Exchange rates are given against the USD. 
The App also provides a graph showing rates for the last 30 Days.

I used the MVVM architecture, Single Activity principle and Databinding.
I also used Dagger for dependency injection.
I used the https://fxmarketapi.com/ API for the data.
Retrofit2 was used to access the API data. 
Retrofit 2 helped me to kill 2 birds with one stone.
1. Helped me to access the API
2. Helped me to load the data asynchronously therefore I did not have to use Work Manager.

I also wrote instrumented unit test using JUNIT 4 and Expresso.
