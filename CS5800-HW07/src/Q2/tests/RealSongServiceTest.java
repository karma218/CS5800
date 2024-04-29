package Q2.tests;

import org.junit.Test;
import Q2.RealSongService;
import Q2.Song;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RealSongServiceTest {

    @Test
    public void testSearchById() {
        RealSongService realSongService = new RealSongService();
        Song song = realSongService.searchById(1);
        assertNotNull(song);
        assertEquals("Song 1", song.getTitle());
        assertEquals("Artist 1", song.getArtist());
        assertEquals("Album 1", song.getAlbum());
        assertEquals(180, song.getDuration());
    }
}
