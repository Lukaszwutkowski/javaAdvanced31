package progAdvanced.songsPlayer;

import pl.sda.advanced.collections.Plane;

public class PlaylistTest {
    public static void main(String[] args) {
        Song song1 = new Song("Ulalala", 309);
        Song song2 = new Song("Nothing else matters", 300);
        int playlistLength = Playlist.playlistLength(song1, song2);
        System.out.printf("Wszystkie piosenki trwają: %d sekund, czyli\n", playlistLength);
        String formattedTime = Playlist.getFormattedTime(playlistLength);
        System.out.println(formattedTime);
    }
}
