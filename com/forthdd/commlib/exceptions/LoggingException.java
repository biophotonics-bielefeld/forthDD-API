package com.forthdd.commlib.exceptions;

public class LoggingException extends AbstractException
{
	public LoggingException(String str, int err)
	{
		super(str, err);
	}

	@Override
	public boolean disconnectRecommended()
	{
		return false;
	}
}