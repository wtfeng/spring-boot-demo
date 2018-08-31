/**
 *-------------------------------------------------<br>
 * Copyright (c) 2015-2017 AIA . All Rights Reserved.  <br>
 *-------------------------------------------------<br>
 * Description:  
 * @author: Feng, Vincent-WT
 * @date: Aug 21, 2018
 */

package com.vincent.prototype;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
