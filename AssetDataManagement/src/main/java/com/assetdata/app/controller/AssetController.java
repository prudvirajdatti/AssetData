package com.assetdata.app.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assetdata.app.bean.AssetDetails;
import com.assetdata.app.dao.AssetDaoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class AssetController {

	private final AssetDaoService assetDao;
	
	@RequestMapping(value="/getAssets",  produces = MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public List<AssetDetails> getAllAssets(){
		List<AssetDetails> assetDetails= null;
		assetDetails = assetDao.getAllAssets();
		return assetDetails;
	}
	
}
