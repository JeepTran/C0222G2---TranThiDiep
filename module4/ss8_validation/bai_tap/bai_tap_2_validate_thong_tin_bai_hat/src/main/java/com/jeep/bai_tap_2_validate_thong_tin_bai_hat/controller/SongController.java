package com.jeep.bai_tap_2_validate_thong_tin_bai_hat.controller;

import com.jeep.bai_tap_2_validate_thong_tin_bai_hat.dto.SongDto;
import com.jeep.bai_tap_2_validate_thong_tin_bai_hat.model.Song;
import com.jeep.bai_tap_2_validate_thong_tin_bai_hat.repository.ISongRepository;
import com.jeep.bai_tap_2_validate_thong_tin_bai_hat.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/music")
public class SongController {

    @Autowired
    private ISongService songService;

    @GetMapping("/list")
    public ModelAndView displaySongList(){
        return new ModelAndView("list-song","songList",songService.findAll());
    }
    @GetMapping("/create")
    public String displayCreateForm(Model model){
        model.addAttribute("songDto", new SongDto());
        return "create-song";
    }

    @PostMapping("/create")
    public String createNewSong(@Valid @ModelAttribute SongDto songDto,
                                BindingResult bindingResult, RedirectAttributes redirectAttributes){

        if(bindingResult.hasErrors()){
            return "create-song";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto,song);
        this.songService.save(song);
        redirectAttributes.addFlashAttribute("success","Edit song successfully!");
        return "redirect:/music/list";
    }
    @GetMapping("/{id}/edit")
    public String displayEditForm(@PathVariable int id, Model model){
        model.addAttribute("songDto", songService.findById(id));
        return "edit-song";
    }

    @PostMapping("/edit")
    public String editSong(@ModelAttribute @Valid SongDto songDto,
                                BindingResult bindingResult, RedirectAttributes redirectAttributes){

        if(bindingResult.hasErrors()){
            return "edit-song";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto,song);
        this.songService.save(song);
        redirectAttributes.addFlashAttribute("success","Add new song successfully!");
        return "redirect:/music/list";
    }
}
