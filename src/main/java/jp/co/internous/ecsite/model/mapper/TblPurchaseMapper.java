package jp.co.internous.ecsite.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.internous.ecsite.model.dto.HistoryDto;

@Mapper
public interface TblPurchaseMapper {
	
	//購入履歴を検索するためのメソッド
	List<HistoryDto> findHistory(int userId);
	
	//SQL文なし⇒Mapper.xmlに書く
	int insert(int userId,int goodsId, String goodsName, int itemCount, int total);
	

}
