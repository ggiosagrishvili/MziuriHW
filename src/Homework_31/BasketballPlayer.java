package Homework_31;

import java.util.*;

class BasketballPlayer {
    String firstName;
    String lastName;
    int pointsScored;
    int rebounds;
    int blocks;
    int assists;
    int turnovers;

    public BasketballPlayer(String firstName, String lastName, int pointsScored, int rebounds, int blocks, int assists, int turnovers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pointsScored = pointsScored;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.assists = assists;
        this.turnovers = turnovers;
    }

    public double calculateRating() {
        return pointsScored * 1 + rebounds * 1 + blocks * 2 + assists * 1.5 - turnovers * 2;
    }

    @Override
    public String toString() {
        return firstName +  lastName + calculateRating();
    }
}

class BasketballApp {
    public static void main(String[] args) {
        List<BasketballPlayer> players = new ArrayList<>();
        players.add(new BasketballPlayer("LeBron", "James", 63, 15, 5, 10, 0));
        players.add(new BasketballPlayer("Stephen", "Curry", 30, 5, 1, 8, 2));
        players.add(new BasketballPlayer("Kevin", "Durant", 57, 11, 2, 6, 4));
        players.add(new BasketballPlayer("Giannis", "Antetokounmpo", 32, 10, 2, 5, 5));
        players.add(new BasketballPlayer("Luka", "Doncic", 27, 9, 1, 11, 6));


        for (int i = 0; i < players.size() - 1; i++) {
            for (int j = i + 1; j < players.size(); j++) {
                if (players.get(i).calculateRating() < players.get(j).calculateRating()) {
                    BasketballPlayer temp = players.get(i);
                    players.set(i, players.get(j));
                    players.set(j, temp);
                }
            }
        }
        System.out.println("Players sorted by descending rating:");
        for (BasketballPlayer player : players) {
            System.out.println(player);
        }

        for (int i = 0; i < players.size() - 1; i++) {
            for (int j = i + 1; j < players.size(); j++) {
                if (players.get(i).calculateRating() > players.get(j).calculateRating()) {
                    BasketballPlayer temp = players.get(i);
                    players.set(i, players.get(j));
                    players.set(j, temp);
                }
            }
        }
        System.out.println("Players sorted by ascending rating:");
        for (BasketballPlayer player : players) {
            System.out.println(player);
        }
    }
}


