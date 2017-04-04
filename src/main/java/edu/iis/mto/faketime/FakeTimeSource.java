package edu.iis.mto.faketime;

public class FakeTimeSource implements ITimeSource {
	
	private final long THIRTY_HOURS = 30 * 60 * 60 * 1000;
	
	@Override
	public long currentTimeMillis() {
		
		return System.currentTimeMillis() + THIRTY_HOURS;
	}

}
