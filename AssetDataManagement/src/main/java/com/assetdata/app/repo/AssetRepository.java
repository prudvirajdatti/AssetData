package com.assetdata.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assetdata.app.bean.AssetDetails;

public interface AssetRepository extends JpaRepository<AssetDetails, Integer>{


}
