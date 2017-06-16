package com.forthdd.commlib.exceptions;

public abstract class AbstractException extends Exception
{
	private final int err;

	protected AbstractException(String str, int err)
	{
		super(str);
		this.err = err;
	}

	public int getCode()
	{
		return err;
	}

	// Some exceptions are fatal to the connection - there's no point trying to continue
	// and it's better to just drop the connection.
	// Others are not so serious - you can just log them or report them, then carry on.
	// Subclasses should override this method to return true in the former case and
	// false in the latter.
	public abstract boolean disconnectRecommended();
}
