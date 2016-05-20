package chapter08;

public class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	public Time2(){
		this(0, 0, 0);
	}
	
	public Time2(int hour){
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute){
		this(hour, minute, 0);
	}
	
	public Time2(int hour, int minute, int second){
		if(hour < 0 || hour >=24)
			throw new IllegalArgumentException("hour must be between 0 and 23");
		if(minute < 0 || minute >=60)
			throw new IllegalArgumentException("hour minute be between 0 and 60");
		if(second < 0 || second >=60)
			throw new IllegalArgumentException("hour second be between 0 and 60");
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Time2(Time2 time){
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	public void setTime(int hour, int minute, int second){
		if(hour < 0 || hour >=24)
			throw new IllegalArgumentException("hour must be between 0 and 23");
		if(minute < 0 || minute >=60)
			throw new IllegalArgumentException("hour minute be between 0 and 60");
		if(second < 0 || second >=60)
			throw new IllegalArgumentException("hour second be between 0 and 60");
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;		
	}
	
	public void setHour(int hour){
		if(hour < 0 || hour >=24)
			throw new IllegalArgumentException("hour must be between 0 and 23");
		this.hour = hour;
	}
	
	public void setMinute(int minute){
		if(minute < 0 || minute >=60)
			throw new IllegalArgumentException("hour minute be between 0 and 60");
		this.minute = minute;
	}
	
	public void setSecond(int second){
		if(second < 0 || second >=60)
			throw new IllegalArgumentException("hour second be between 0 and 60");
		this.second = second;
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

}
