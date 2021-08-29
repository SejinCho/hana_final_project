package kr.ac.arttech.cobuying.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import kr.ac.arttech.artscan.vo.ReqTransactionVO;
import kr.ac.arttech.artscan.vo.WalletInfoVO;
import kr.ac.arttech.cobuying.dao.CobuyingDAO;
import kr.ac.arttech.cobuying.vo.ArtworkInfoVO;
import kr.ac.arttech.cobuying.vo.PurchaseInfoVO;
import kr.ac.arttech.member.dao.MemberDAO;
import kr.ac.arttech.openbanking.vo.AccountTransferInfoVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CobuyingServiceImpl implements CobuyingService {
	private final CobuyingDAO dao;
	private final MemberDAO memberDao;
	
	//goods list
	@Override
	public List<ArtworkInfoVO> getArtworkInfoList() {
		return dao.selectArtworkInfoList();
	}
	
	//goods detail
	@Override
	public Map<String, Object> getArtworkInfo(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		//정보 가져오기
		map.put("artworkInfo", dao.selectArtworkInfo(id));
		
		//이미지 가져오기
		map.put("artworkInfoImg", dao.selectArtworkInfoImgList(id));
		return map;
	}
	
	//easy password
	@Transactional
	@Override
	public String getEasyPassword(String id) {
		return memberDao.selectEasyPassword(id);
	}
	
	//구매정보 insert 조각 update
	@Override
	public boolean addPurchaseInfo(PurchaseInfoVO purchaseInfo) {
		boolean result = false;
		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("artworkInfoId", purchaseInfo.getArtworkInfoId());
		paramMap.put("pieceNo", purchaseInfo.getPieceNo());
		
		int cnt = dao.insertPurchaseInfo(purchaseInfo); //구매내역 insert
		cnt += dao.updateArtworkPieceInfo(paramMap); //조각 update
		
		//artcoin api 트랜잭션 add
		String wallet = dao.selectWallet(purchaseInfo.getMemberId());
		ReqTransactionVO reqTransaction = new ReqTransactionVO();
		reqTransaction.setArtId(purchaseInfo.getArtworkInfoId());
		reqTransaction.setReceiveWallet(wallet);
		reqTransaction.setValue(purchaseInfo.getPieceNo());
		System.out.println("리퀘스트 정보 : " + reqTransaction);
		String url = "http://localhost:18080/transaction";
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String> data = (Map<String, String>) restTemplate.postForObject(url,reqTransaction, Object.class);
		
		System.out.println("구매 후 트랜잭션 생성 : " + data.get("msg"));
		
		if(cnt == 2) {
			result = true;
		}
		return result;
	}
	
	//상태 update
	@Override
	public int modifyState() {
		int result = 0;
		
		result += dao.updateStateByStartDate(LocalDate.now().toString());
		result += dao.updateStateByEndDate(LocalDate.now().toString());
		
		return result;
	}
	
	//소유자 현황 list
	@Override
	public List<ArtworkInfoVO> getOwnershipList() {
		return dao.selectOwnershipList();
	}
	//해당 그림 소유 총 인원
	@Override
	public List<PurchaseInfoVO> getTotalOwnerList(String id) {
		return dao.selectTotalOwnerList(id);
	}
}
