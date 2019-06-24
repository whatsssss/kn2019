package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeDiffMapper {
	
	@Select("select DATEDIFF('2019-06-19', '2019-06-10')")
	public int calcGap();
	

	@Select("select datediff(now(), #{day})")
	public int calcGapDay(String day);
	
	
}
