package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Autowired
	BoardMapper mapper;
	
	@Test
	public void testSelect() {
		
		//BoardVO vo = new BoardVO();
		BoardVO vo = mapper.select(3);
		log.info(vo);
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("제목1");
		vo.setContent("내용1");
		vo.setWriter("누구?");
		log.info(vo);
	}
//	
//	@Test
//	public void testUpdate() {
//		
//		BoardVO vo = mapper.select(5);
//		vo.setTitle("수정된 제목");
//		vo.setContent("수정된 내용");
//		
//		//int count = mapper.update(vo);
//		
//		//log.info("update count: " + count);
//	}
	
	@Test
	public void testDelete() {
		int count = mapper.delete(6);
	
		log.info("update count: " + count);
	}
	


}
