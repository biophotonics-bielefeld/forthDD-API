package com.forthdd.commlib.exceptions;

public class TimeoutException extends AbstractException
{
	public TimeoutException(String str, int err)
	{
		super(str, err);
	}

	@Override
	public boolean disconnectRecommended()
	{
		return true;
	}
}