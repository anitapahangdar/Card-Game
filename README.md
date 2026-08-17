# Standard Deck Card Game — Java Console Application

A two-player console card game created by **Anita Pahangdar**. The program builds and shuffles a standard 52-card deck, deals a user-selected number of cards, scores both hands, and announces the result.

## Highlights

- Generates all 52 cards using a two-dimensional array
- Uses a Fisher–Yates shuffle
- Deals 1–26 cards to each player
- Scores number cards, face cards, and aces
- Handles invalid and non-numeric card-count input
- Correctly identifies Player 1 wins, Player 2 wins, and ties

## Technology

- Java
- Arrays and `ArrayList`
- Methods
- Random number generation
- Console input validation
- Enhanced for loops

## Run locally

Install a Java Development Kit (JDK) 8 or newer, then run:

```bash
javac CardGame.java
java CardGame
```

## How scoring works

| Rank | Points |
|---|---:|
| Ace | 1 |
| 2–10 | Face value |
| Jack, Queen, King | 10 |

Both hands are displayed after dealing. The player with the higher point total wins; equal totals produce a tie.

## Project structure

```text
.
├── CardGame.java  # Deck creation, shuffle, dealing, and scoring
├── .gitignore     # Java build and IDE exclusions
└── README.md
```

## Current scope

This is a focused Java fundamentals project. It plays a single scored hand per launch and displays both players' cards in the console.

## Possible next steps

- Represent cards and players with dedicated classes
- Add repeated rounds and a running score
- Hide each player's hand during two-person play
- Add automated tests for deck creation, dealing, and scoring

## Author

**Anita Pahangdar**

Created as a Java course project.
