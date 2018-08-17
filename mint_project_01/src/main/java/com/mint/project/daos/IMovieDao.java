package com.mint.project.daos;

import java.util.List;

import com.mint.project.dtos.MovieDto;

public interface IMovieDao {

	
//	-영화 (MovieDaoImp.java):
	

	// 영화신규추가
	public int insertMovie(MovieDto mdto);

	// 영화정보수정	
	public boolean updateMovie(MovieDto mdto);
	
	// 영화삭제
	public boolean delMovie(int mseq);
	
	// 영화한편정보
	public MovieDto getMovieinfo(int mseq);
	
	// 특정 영화 정보
	public List<MovieDto> getCertainMovieinfo(String search);
	
	// 영화전체정보
	public List<MovieDto> getAllMovieinfo();
	
	// 팔로우 유저 추가, 삭제
	public boolean updateFollow(int useq);
	
	
	
	
}