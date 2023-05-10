package edu.wctc.isp;

import java.time.*;

public interface Album extends Product {
    Duration getPlayingTime();

    String getArtist();
}
