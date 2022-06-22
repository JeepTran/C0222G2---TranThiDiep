package com.jeep.controller;

import com.jeep.model.Song;
import com.jeep.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UploadSongController {
    @Autowired
    private ISongService songService;

    @GetMapping("/muzik")
    public ModelAndView uploadPage() {
        ModelAndView modelAndView = new ModelAndView("upload", "song", new Song());
        String[] musicKind = {"Pop", "Country", "Rock", "R&B", "Dance", "Jazz", "Blues"};
        modelAndView.addObject("musicKind", musicKind);
        return modelAndView;
    }

    @PostMapping("/upload")
    public String update(@ModelAttribute Song song) {
        this.songService.save(song);
        return "redirect: /list";
    }
    @GetMapping("/list")
    public String list(Model model){
        List<Song> songList = this.songService.getAll();
        model.addAttribute("songList",songList);
        return "list";
    }
}
