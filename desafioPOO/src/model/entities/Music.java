package model.entities;

public class Music {
	
	private String name;
	private Integer durationInSeconds;
	
	public Music(String name, Integer duration) {
		this.name = name;
		this.durationInSeconds = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDurationInSeconds() {
		return durationInSeconds;
	}

	public void setDurationInSeconds(Integer durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}	

}
