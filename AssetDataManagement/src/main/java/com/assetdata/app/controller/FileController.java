package com.assetdata.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assetdata.app.bean.FileData;
import com.assetdata.app.dao.FileDaoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class FileController {

	private final FileDaoService fileDao;

	@RequestMapping(value = "/getFileData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getJsonData(@ModelAttribute FileData fileData) {
		return fileDao.getJsonData(fileData);
	}

}
