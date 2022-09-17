package com.client;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindByPageResponse<T> {
	List<T> pageResponse;
	Integer pageSize;
	Long totalElm;
	Integer curentPage;
	Integer totalPage;
}
