package kr.ac.arttech.cobuying.service;

import java.util.List;
import java.util.Map;

import kr.ac.arttech.cobuying.vo.ArtworkInfoVO;
import kr.ac.arttech.cobuying.vo.PurchaseInfoVO;

public interface CobuyingService {
	public List<ArtworkInfoVO> getArtworkInfoList(); //goods list
	public Map<String, Object> getArtworkInfo(String id); //goods detail
	public String getEasyPassword(String id); //easy password
	public boolean addPurchaseInfo(PurchaseInfoVO purchaseInfo); //구매정보 insert
	
	public int modifyState();  //상태 update
	public List<ArtworkInfoVO> getOwnershipList();//소유자 현황 list
	public List<PurchaseInfoVO> getTotalOwnerList(String id); //해당 그림 소유 list
}
