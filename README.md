🏏 Super Over – Cricket Game Simulation
📌 Overview

Super Over is a fun Java-based cricket simulation game that lets players experience the thrill of a quick 6-ball match.
Players can register, play against each other, view past matches, and check out the live leaderboard.

This project demonstrates Object-Oriented Programming (OOP) concepts, usage of collections (HashMap, ArrayList), and handling of randomized events to make each game unique.

🎮 Features

👤 Player Management

Register new players

Pick from existing players

🏏 Gameplay

6-ball batting simulation

Randomized cricket events: runs, no-balls, wides, catches, run-outs, and clean-bowled

Player can choose how many runs to attempt each ball

📊 Statistics

Maintains a leaderboard of top scorers

Stores match history with player IDs, scores, and winners

Calculates strike rate for each player

🎲 Realistic Game Flow

Random outcomes for each shot

Extras (no-balls, wides) included

Tie detection

🗂 Project Structure
Welcome/               # Main package
│
├── Welcome.java       # Entry point – main menu & user interface
├── Game.java          # Manages players, rankings, and match flow
├── Over.java          # Core gameplay – simulates 6-ball over
├── DataBase.java      # Stores match history
│
└── Player/            # Subpackage for player class
    └── Player.java    # Player data (name, total runs, last match runs)

⚙️ Tech Stack

Language: Java (JDK 8+ recommended)

Concepts Used:

Object-Oriented Programming (OOP)

Collections (HashMap, ArrayList)

Randomized logic with Math.random()

Exception handling (try-catch)

Console-based user interaction with Scanner

📈 Learning Outcomes

Understanding of OOP principles: encapsulation, abstraction, object interaction

Usage of data structures like HashMaps and Lists

Implementation of a menu-driven Java console application

Handling of randomized simulations for real-life scenarios

🚀 Future Enhancements

Persist match history in a file or database (so it doesn’t reset on restart)

Add bowling logic

GUI-based version (JavaFX/Swing)

Multiplayer online mode

🙌 Contributing

Feel free to fork this repo and improve the game. Pull requests are welcome
