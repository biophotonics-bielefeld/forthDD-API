package com.forthdd.commlib.exceptions;

public class PacketException extends AbstractException
{
	public PacketException(String str, int err)
	{
		super(str, err);
	}

	@Override
	public boolean disconnectRecommended()
	{
		return true;
	}
}