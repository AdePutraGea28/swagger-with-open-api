package com.muf.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.muf.dto.request.SaveSampleRequestDTO;
import com.muf.dto.request.UpdateSampleRequestDTO;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @ApiOperation(value = "API untuk menampilkan seluruh data sample",
            notes = "Notes")
    @GetMapping("/v1/findAllSample")
    public ResponseEntity<?> findAllSample() {
        return ResponseEntity.ok().body("ini api untuk menampilkan seluruh data sample");
    }

    @ApiOperation(value = "API untuk menampilkan data sample berdasarkan id sample",
            notes = "Notes")
    @GetMapping("/v1/findById/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long sampleId) {
        return ResponseEntity.ok().body("ini api untuk menampilkan data sample berdasarkan id");
    }

    @ApiOperation(value = "View All Tasks",
            notes = "Notes")
    @PostMapping("/v1/save")
    public ResponseEntity<?> save(@RequestBody SaveSampleRequestDTO sampleData) {
        return ResponseEntity.ok().body("ini api untuk menyimpan data sample");
    }

    @ApiOperation(value = "API untuk update data sample berdasarkan sample id",
            notes = "Notes")
    @PutMapping("/v1/updateById")
    public ResponseEntity<?> updateById(@RequestParam(name = "id", required = false) Long sampleId,
        @RequestBody UpdateSampleRequestDTO sampleData
    ) {
        return ResponseEntity.ok().body("ini api untuk update data sample berdasarkan id user");
    }

    @ApiOperation(value = "API untuk delete data sample berdasarkan sample id",
            notes = "Notes")
    @DeleteMapping("/v1/deleteById")
    public ResponseEntity<?> deleteById(@RequestParam(name = "id", required = false) Long sampleId) {
        return ResponseEntity.ok().body("ini api untuk delete data sample berdasarkan id user");
    }
}
