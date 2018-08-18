# Image-Carousel-over-Video-Background

In this project I have tried to make am image carousel over video backgroung. The sailent features of this project are as follow:

- Endless Horizontal Scroll of 7 images
- Background video with play/pause
- Never ending video playback

# Libraries Used

- **Picasso** - For rendering images

# Project Structure

- com.carousel.imagecarousel.activities - Contains all the activities.
- com.carousel.imagecarousel.adapters - Contails all the adapter. In this project only the Recycler Adapters.
- com.carousel.imagecarousel.viewholders - Contains all view holders of the adapters.
- com.carousel.imagecarousel.models - Contains the model classes of the entities in the project.
- com.carousel.imagecarousel.utilities - Contains all helper classes.

# MVP

The MPV pattren is used to develop this application. In each activity package you can find a presentaion layer for that particular activity. All of the application logic and functionality about any particular activity is implemented in it's respective presenter. So, essentially I tried to seperate my application logic from my views. If there is any change in future or some additional feature needs to be added then we shall be sure about where exactly the change is going to happen in the code.

Using MVP pattren makes this application highly scalable and maintainable.

## Authors

* **Abdullah Nasim**

