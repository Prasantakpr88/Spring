package com.pks.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics=Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Core Java Framework", "Core Java Framework Description"),
			new Topic("JavaScript", "JavaScript Framework", "javaScript Framework Description")
			);
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}

}
