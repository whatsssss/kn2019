package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapepr {
	//������
	@Select("select now()")
	public String getTime();

	public String getTime2();
}
