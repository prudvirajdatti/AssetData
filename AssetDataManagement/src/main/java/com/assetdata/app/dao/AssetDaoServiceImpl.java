package com.assetdata.app.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assetdata.app.bean.AssetDetails;
import com.assetdata.app.repo.AssetRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AssetDaoServiceImpl implements AssetDaoService {

	private final AssetRepository assetRepo;
	
	@Override
	public List<AssetDetails> getAllAssets(){
		return assetRepo.findAll();
	}

}
