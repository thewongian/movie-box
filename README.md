# Movie Box

Movie Box is an app that allows userse to browse newly releasd movies in theaters from the Movie Database API http://docs.themoviedb.apiary.io/#

### User Stories


#### REQUIRED (10pts)
- [x] (70pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.
- [x] (10pts) Views should be responsive for both landscape/portrait mode.
   - [x] (5pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [x] (5pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.
- [x] (20pts) Improved the user interface by experimenting with styling and coloring.

### App Walkthough GIF

<img src="https://i.imgur.com/te2uAkN.gif" width=100><br>

### Notes
Looking at what additional things the api provided and deciding what else to include was a balance between realistic and challenging.  
In the end, I settled on also adding genre and rating

### Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids
