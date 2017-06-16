package com.forthdd.commlib.exceptions;

public class BoardException extends AbstractException
{
	public BoardException(String str, int err)
	{
		super(str, err);
	}

	@Override
	public boolean disconnectRecommended()
	{
		return false;
	}
}