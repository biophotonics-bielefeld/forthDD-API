package com.forthdd.commlib.exceptions;

public class MemoryException extends AbstractException
{
	public MemoryException(String str, int err)
	{
		super(str, err);
	}

	@Override
	public boolean disconnectRecommended()
	{
		return false;
	}
}