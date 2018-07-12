# OOP Practice

## BikeStore
 1. Create a BikeStore.java 
 that keeps track of an array of MotorBike
 objects 
 2. Write an add(MotorBike bike)
 3. Write a toString() for your BikeStore
 4. Write a randomAccelerate() that 
 will accelerate a random bike of bikes[]
 THEN MotorbikeProgram.java > main()
 5. create a BikeStore
 6. add 3 bikes to your store
 7. print BikeStore
 8. Call the randomAccelerate() method
 9. print BikeStore again

## ComIT Music Player
### Overview
- Create a simulation of a "Music Player"
- Note: You can hardcode some number for the SIZE of Song list right now
- Example output:
```java
**********************
*                    *
* COMIT MUSIC PLAYER *
*                    *
**********************
1- Show playlist
2- Play a song
3- Add a song 
4- Quit
Please enter your selection: 1

You currently have no songs in your playlist! Add a new one? [Y/N] N

1- Show playlist
2- Play a song
3- Add a song
4- Quit
Please enter your selection: 2

You currently have no songs in your playlist! Add a new one? [Y/N] Y

************
ADDING SONG
************
Enter the song's name: Twinkle twinkle little star
Enter the author's name: Wainny
Thank you! 'Twinkle twinkle little star by Wainny' had been added to the playlist!

1- Show playlist
2- Play a song
3- Add a song
4- Quit
Please enter your selection: 1

*********
PLAYLIST
*********
1. Twinkle twinkle little star by Wainny

1- Show playlist
2- Play a song
3- Add a song
4- Quit
Please enter your selection: 2

*********
PLAYLIST
*********
1. Twinkle twinkle little star by Wainny

Which song do you want to play? 1

*************
PLAYING MUSIC
*************
Currently playing Twinkle twinkle little star by Wainny...
.....Song ended.

1- Show playlist
2- Play a song
3- Add a song
4- Quit
Please enter your selection: 4

***************
Program ended
See you round!
***************
```

## Architecture
You can design this program however you'd want to. In fact I recommend you do some thinking of how to
structure this program before reading on! Here are some of my suggestions: 

1. Create a "Song.java" class
- This object will have 2 attributes: "title" and "author".
- For the methods we will write getters and setters for "title" and "author".
- We will add a "toString()" method to display information about the Song.
- We will add a "play()" method to show that the song is currently playing.

2. Create a "MusicPlayer.java" class
- This object will manage a list of Song objects.
- Create an "add(String title, String author)" method that will create a new Song object
with the parameters "title" and "author"; and add this newly created Song to our list of Song objects.
- Create a "play(int songIndex)" method that will play the Song object in our list[songIndex].
- Create a "showPlaylist()" method that will display the current Song objects in list.

3. Create a "MusicPlayerProgram.java" class
- This object will contain an instance/object of "MusicPlayer".
- This object will contain a `static void main(String[] args)` method that will display the menu, 
get the command from the user and perform the corresponding tasks.
- Create a "displayMenu()" method to display the menu.
- Create a "getCommand()" method that will get the corresponding command from the user and perform
corresponding action on the MusicPlayer object.
