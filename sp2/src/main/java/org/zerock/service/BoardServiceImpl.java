package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
@AllArgsConstructor
@Service
@Log4j
public class BoardServiceImpl implements BoardService {

	//@Setter(onMethod_ = @Autowired)  or @AllArgsConstructor
	private BoardMapper mapper; //실직적인 함수긴 해도 mapper 없인 안돌아가잖아.
	


	@Override
	public void register(BoardVO vo) {
		// TODO Auto-generated method stub
		log.info(vo);
		mapper.insert(vo);

	}
	@Override
	public BoardVO get(Integer key) {
		// TODO Auto-generated method stub
		return mapper.select(key);
	}

	@Override
	public int modify(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.update(vo);
	}

	@Override
	public int remove(Integer key) {
		// TODO Auto-generated method stub
		return mapper.delete(key);
	}

	@Override
	public List<BoardVO> listAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}
	

}
