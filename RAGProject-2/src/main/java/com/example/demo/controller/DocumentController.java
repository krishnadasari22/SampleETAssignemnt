package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.service.DocumentService;





@RestController
@RequestMapping("/api")
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @PostMapping("/upload")
    public String uploadDocument(@RequestParam("file") MultipartFile file) {
        return documentService.processDocument(file);
    }

    @GetMapping("/ask")
    public String askQuestion(@RequestParam("question") String question) {
        return documentService.answerQuestion(question);
    }
}
