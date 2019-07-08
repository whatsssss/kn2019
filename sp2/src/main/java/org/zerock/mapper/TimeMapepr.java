package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapepr {
	//Äõ¸®¹®
	@Select("select now()")
	public String getTime();

	public String getTime2();
}
