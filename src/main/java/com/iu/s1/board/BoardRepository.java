package com.iu.s1.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
	public List<BoardVO> boardList() throws Exception;
}
