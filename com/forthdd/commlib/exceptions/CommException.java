package com.forthdd.commlib.exceptions;

public class CommException extends AbstractException
{
	public CommException(String str, int err)
	{
		super(str, err);
	}

	@Override
	public boolean disconnectRecommended()
	{
		return true;
	}
}