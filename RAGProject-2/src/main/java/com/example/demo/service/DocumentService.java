package com.example.demo.service;




import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class DocumentService {

    public String processDocument(MultipartFile file) {
        // Logic to read PDF and extract content
        // Save content to the database
        return "Document uploaded successfully.";
    }

    public String answerQuestion(String question) {
        // Logic to retrieve relevant answers from the database
        return "Here is your answer.";
    }
}
