//package com.yb.spring.files.upload.service;
//
//import com.fasterxml.jackson.dataformat.csv.CsvMapper;
//import com.fasterxml.jackson.dataformat.csv.CsvSchema;
//import com.yb.spring.files.upload.controller.FilesController;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class CsvToJson {
//
//    FilesController filesController;
//
//    @Autowired
//    public CsvToJson(FilesController filesController) {
//        this.filesController = filesController;
//    }
//
//    public CsvToJson(String filename) throws IOException {
//        File input = new File(filename);
//        File output = new File("C:\\shared\\output.json");
//
//        CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).build();
//        CsvMapper csvMapper = new CsvMapper();
//
//        // Read data from CSV file
//        List<Object> readAll;
//        readAll = csvMapper.readerFor(Map.class).with(csvSchema).readValues(input).readAll();
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        // Write JSON formated data to output.json file
//
//        jsonList(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(readAll));
//
//        // Write JSON formated data to stdout
//
////        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(readAll));
//    }
//
//    public ResponseEntity<String> jsonList(String jsondata) {
//        return filesController.getJsonFile(jsondata);
//    }
//
//}
//

