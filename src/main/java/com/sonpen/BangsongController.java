package com.sonpen;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sonikju on 2018-09-02.
 */
@RestController
public class BangsongController {

    @CrossOrigin
    @GetMapping("/bs")
    public Bangsong bangsong() {
        Bangsong bangsong = new Bangsong();
        bangsong.setStreamerName("sonikju");
        bangsong.setTitle("스프링부트");

        return bangsong;
   }
}
