package com.mlos.News.controllers;

import com.mlos.News.models.News;
import com.mlos.News.repo.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/news")
    public String news(Model model) {
        model.addAttribute("title", "Новости");
        Iterable<News> news = newsRepository.findAll();
        model.addAttribute("news", news);
        return "news";
    }

    @GetMapping("/news/add")
    public String newsAdd(Model model) {
        return "news-add";
    }

    @PostMapping("/news/add")
    public String newsPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model) {
        News post = new News(title, anons, full_text);
        newsRepository.save(post);
        return "redirect:/news";
    }

}