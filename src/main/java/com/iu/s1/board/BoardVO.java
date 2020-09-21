package com.iu.s1.board;

import lombok.Data;

@Data
public class BoardVO {
	private int num;
	private String title;
	private String writer;
	private String password;
	private String contents;
	private String regDate;
	private String modDate;
	private int hit;
	private int del;
}

