//llena Earl laurece A
//Final Chall no.5

import java.util.Scanner;

class SongNode {
    //name of the song
    String songName;
    //pointer to the next song
    SongNode next;
    //pointer to the privious
    SongNode prev;

    SongNode(String songName) {
        this.songName = songName;
        this.next = null;
        this.prev = null;
    }
}
//
class CircularDoublyLinkedList {
    SongNode head; //pointer for tge next song
    SongNode tail;//pointer for the last song
    SongNode current;//pointer for the curret song

    CircularDoublyLinkedList() {
        head = null;
        tail = null;
        current = null;
    }
    //will add a song
    void addSong(String songName) {
        SongNode newSong = new SongNode(songName);
        if (head == null) {
            head = newSong;
            tail = newSong;
            newSong.next = newSong;
            newSong.prev = newSong;
            current = newSong;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            newSong.next = head;
            head.prev = newSong;
            tail = newSong;
        }
    }
    //will remove a song
    void removeSong(String songName) {
        if (head == null) return;

        SongNode temp = head;
        do {
            if (temp.songName.equals(songName)) {
                if (temp == current) {
                    current = (current.next != temp) ? current.next : current.prev;
                }

                if (temp == head && temp == tail) {
                    // Only one song in the list
                    head = null;
                    tail = null;
                    current = null;
                } else {
                    if (temp == head) {
                        head = head.next;
                        tail.next = head;
                        head.prev = tail;
                    } else if (temp == tail) {
                        tail = tail.prev;
                        tail.next = head;
                        head.prev = tail;
                    } else {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                    }
                }
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }
    //will go to the next song
    void nextSong() {
        if (current != null) {
            current = current.next;
        }
    }
    //will go back to the lprivious song 
    void previousSong() {
        if (current != null) {
            current = current.prev;
        }
    }

    //show the current song 
    void displayCurrentSong() {
        if (current != null) {
            System.out.println("Current Song: " + current.songName);
        } else {
            System.out.println("No songs in the playlist.");
        }
    }
    //will display the playlist
    void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        SongNode temp = head;
        System.out.print("Playlist: ");
        do {
            System.out.print(temp.songName + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class Song {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CircularDoublyLinkedList playlist = new CircularDoublyLinkedList();
            String command;

            System.out.println("Welcome to the Music Playlist Manager!");
            do {
                //display the option 
                System.out.println("Choose an option:");
                System.out.println("1. Add Song");
                System.out.println("2. Remove Song");
                System.out.println("3. Next Song");
                System.out.println("4. Previous Song");
                System.out.println("5. Display Current Song");
                System.out.println("6. Display Playlist");
                System.out.println("7. Exit");
                //ask you to inpu the option you pick
                System.out.print("Enter an option: ");

                //read user input
                command = scanner.nextLine();

                switch (command) {
                     //aks the user to input a new song on the playlist
                    case "1":
                        System.out.print("Enter song name to add: ");
                        String songNameToAdd = scanner.nextLine();
                        playlist.addSong(songNameToAdd);
                        System.out.println("Added: " + songNameToAdd);
                        break;

                    //aks the user to remove a song
                    case "2":
                        System.out.print("Enter song name to remove: ");
                        String songNameToRemove = scanner.nextLine();
                        playlist.removeSong(songNameToRemove);
                        System.out.println("Attempted to remove: " + songNameToRemove);
                        break;

                    //will make you move to the nextsong
                    case "3":
                        playlist.nextSong();
                        System.out.println("Moved to the next song.");
                        playlist.displayCurrentSong();
                        break;

                    //will make you go to previous song    
                    case "4":
                        playlist.previousSong();
                        System.out.println("Moved to the previous song.");
                        playlist.displayCurrentSong();
                        break;

                    //will display the current song
                    case "5":
                        playlist.displayCurrentSong();
                        break;

                    //display the song play list
                    case "6":
                        playlist.displayPlaylist();
                        break;

                    case "7":
                        System.out.println("Exiting the Music Playlist Manager. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (!command.equals("7"));
        }
    }
}