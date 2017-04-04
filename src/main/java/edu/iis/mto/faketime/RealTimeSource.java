package edu.iis.mto.faketime;

public class RealTimeSource implements ITimeSource {

	@Override
	public long currentTimeMillis() {

		return System.currentTimeMillis();
	}

}
