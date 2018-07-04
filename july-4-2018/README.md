# Java Array Practices

## 1D Battleship Game
Create a 2-player game simulation of the game "Battleship". 

It will be YOU versus the COMPUTER.

- Each player will have a battlefield board.
  - Each board will have 10 spots and will look similar like this:
  ```python
   ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
  |     |     |     |     |     |     |     |     |     |     |
   ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
     1     2     3     4     5     6     7     8     9     10   
  ```
- Each player will have 2 boats: 
  - A short boat that takes up **1** spot of the board.
  - A long boat that takes up **2** spots of the board. 
  - Each player will place the 2 boats above on the board 
    - COMPUTER will randomly place boats. 
    - The boat will be marked with a *
    ```java
     ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
    |     |     |     |  *  |     |     |     |  *  |  *  |     |
     ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
       1     2     3     4     5     6     7     8     9     10
     ``` 
   
- Each player will take turn to choose a tile on the board to shoot. 
  - A perfect shot is one that aimed correctly at some boat and will be marked by an 'X'.
  
  ```java
       ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
      |     |     |     |  *  |     |     |     |  X  |  *  |     |
       ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
         1     2     3     4     5     6     7     8     9     10
  ```
   - A missed shot will be marked by '-'.
  ```java
       ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
      |     |     |     |  *  |     |  -  |     |  X  |  *  |     |
       ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
         1     2     3     4     5     6     7     8     9     10
  ```
- Whoever takes down the enemy's boats first WIN the game. 


### Example output: 

```java
****************************
*                          *
* WELCOME TO 1D BATTLESHIP *
*                          *
****************************

Please enter your name and press enter: Wainny

Welcome Wainny! My name is COMPUTER LAB and I will be your opponent today. Get ready to battle!!

Here is your current battle-board. Please choose where to place your short boat: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|     |     |     |     |     |     |     |     |     |     |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10

Enter a spot (1 - 10): 4

Here is your current battle-board. Please choose where to place your long boat:
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|     |     |     |  *  |     |     |     |     |     |     |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10

Enter a spot for the head of your long boat (1-10): 8

All set up! BATTLE BEGINS. 

WAINNY: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|     |     |     |  *  |     |     |     |  *  |  *  |     |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10

COMPUTER: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|  ?  |  ?  |  ?  |  ?  |  ?  |  ?  |  ?  |  ?  |  ?  |  ?  |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10   
   
Where do you want to shoot? (Enter 1-10): 6
WAINNY got a perfect shot at a COMPUTER's ship!!!
COMPUTER chooses to shoot at spot 5.
COMPUTER missed. 

WAINNY: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|     |     |     |  *  |  -  |     |     |  *  |  *  |     |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10

COMPUTER: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|  ?  |  ?  |  ?  |  ?  |  ?  |  X  |  ?  |  ?  |  ?  |  ?  |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10   
   
Where do you want to shoot? (Enter 1-10): 7
WAINNY got a perfect shot at a COMPUTER's ship!!!
COMPUTER chooses to shoot at spot 9.
COMPUTER got a perfect shot at a WAINNY's ship!!! 

WAINNY: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|     |     |     |  *  |  -  |     |     |  *  |  X  |     |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10

COMPUTER: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|  ?  |  ?  |  ?  |  ?  |  ?  |  X  |  X  |  ?  |  ?  |  ?  |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10   
   
Where do you want to shoot? (Enter 1-10): 4
WAINNY missed.
COMPUTER chooses to shoot at spot 1.
COMPUTER missed. 

WAINNY: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|  -  |     |     |  *  |  -  |     |     |  *  |  X  |     |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10

COMPUTER: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|  ?  |  ?  |  ?  |  -  |  ?  |  X  |  X  |  ?  |  ?  |  ?  |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10   
   
Where do you want to shoot? (Enter 1-10): 3
WAINNY got a perfect shot at a COMPUTER's ship!!!
COMPUTER chooses to shoot at spot 8.
COMPUTER got a perfect shot at a WAINNY's ship!!!


Final board:
WAINNY: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|  -  |     |     |  *  |  -  |     |     |  X  |  X  |     |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10

COMPUTER: 
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
|  ?  |  ?  |  X  |  -  |  ?  |  X  |  X  |  ?  |  ?  |  ?  |
 ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
   1     2     3     4     5     6     7     8     9     10   
 
 Wainny had taken down all ships of computer!!!
 Wainny won the game!!

```
