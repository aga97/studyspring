package me.jungwoo.springinitializr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="*")
@RestController
public class CrawlController {
    @Autowired
    private CrawlService crawlService;

    @GetMapping("/crawls")
    public String getData() {
        return crawlService.getData();
    }

}
