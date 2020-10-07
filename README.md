# tictactoe
Play Tic Tac Toe

This Java based simple Tic Tac Toe game can be played by yourself or with a friend!

To start, please clone this repository or download all the files into an empty directory.
Compile with:

```bash
javac *.java
```

to compile all java files.
run with:

```bash
java Game
```

You will be asked for the type of each player and the name of each player.
* Human Player: A human player who will manually enter the desired row and column of their mark (X or O).
* Random Player: A player who will choose the row and column at random.
* Blocking Player: Extends Random player. A player who will choose the row and column based on whether they detect a potential win from the opponent in the following move. It will choose to block the other player, otherwise it will choose a random row and column.
* Smart Player: Extends Blocking player. Will prioritize winning, and choose the row and column that will produce a win. Otherwise will follow the action of a Blocking Player.

This program utilizes polymorphism, abstraction, and object oriented programming (OOP).
