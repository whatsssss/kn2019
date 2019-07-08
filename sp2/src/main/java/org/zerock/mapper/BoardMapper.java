package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {

	
	public void insert(BoardVO vo);
	
	public BoardVO select(Integer vno);
	
	public int update(BoardVO vo);
	@Delete("delete from tbl_board where bno=#{bno}")
	public int delete(Integer bno);
	
	@Select("Select * from tbl_board")
	public List<BoardVO> selectAll();
	
}
