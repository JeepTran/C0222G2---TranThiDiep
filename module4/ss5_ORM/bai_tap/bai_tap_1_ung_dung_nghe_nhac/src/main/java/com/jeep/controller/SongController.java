package com.jeep.controller;

import com.jeep.model.Song;
import com.jeep.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private ISongService songService;

    @GetMapping("/create")
    public ModelAndView displayCreatePage() {
        ModelAndView modelAndView = new ModelAndView("create", "song", new Song());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Song song) {
        this.songService.create(song);
        return "redirect:/songs/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Song> songList = this.songService.findAll();
        model.addAttribute("songList", songList);
        return "list";
    }

    @GetMapping("/{id}/edit")
    public String displayEditPage(@PathVariable int id, Model model) {
        Song song = this.songService.findById(id);
        model.addAttribute("song", song);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Song song, RedirectAttributes redirectAttributes) {
        this.songService.update(song);
        redirectAttributes.addFlashAttribute("success", "Update song successfully!");
        return "redirect:/songs/list";
    }

    @GetMapping("/{id}/delete")
    public String displayDeletePage(@PathVariable int id, Model model) {
        Song song = this.songService.findById(id);
        model.addAttribute("song", song);
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Song song, RedirectAttributes redirectAttributes) {
        this.songService.delete(song.getId());
        redirectAttributes.addFlashAttribute("success", "Delete song successfully!");
        return "redirect:/songs/list";
    }
}
