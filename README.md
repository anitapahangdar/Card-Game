# Standard Deck Card Game – Java Console Application

A Java implementation of a simple **two-player card game** using a standard 52-card deck. The game deals cards to each player, calculates points based on card values, and determines a winner for each hand.

---

## Gameplay Overview

1. The dealer (program) shuffles a standard 52-card deck.  
2. Each player receives a chosen number of cards (1–26).  
3. The hands of both players are displayed (without peeking at each other’s cards).  
4. Points are calculated:  
   - Number cards = face value  
   - J, Q, K = 10 points  
   - Ace = 1 point  
5. The player with the higher total points wins the round.  
6. To play again, restart the program.

---

## How to Run

1. **Download** the project folder containing the `.java` files.  
2. **Open Eclipse** (or any Java IDE).  
3. Create a new Java project and **import** the `.java` files.  
4. Run the `CardGame.java` file to start the game.  

---

## Technical Details

- **Language:** Java  
- **Console Application:** Text-based interface  
- **Features:**  
  - Standard 52-card deck creation using arrays  
  - Fisher-Yates shuffle implemented with `ArrayList`  
  - Dynamic dealing of cards based on user input  
  - Point calculation based on card ranks  
  - Winner determination after each hand

---

## Troubleshooting

- Ensure **all `.java` files** are present and correctly placed in the source folder.  
- Verify your IDE is set up to **run Java applications**.  
- Input validation prevents entering invalid card counts (1–26).  

---
