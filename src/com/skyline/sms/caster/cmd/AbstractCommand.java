package com.skyline.sms.caster.cmd;


public abstract class AbstractCommand implements Command {
	
	private CommandType commandType; 
	
	@Override
	public String check() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String set() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String origin() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public byte[] stream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCommandType(CommandType commandType) {
		this.commandType = commandType;
		
	}

	@Override
	public CommandType getCommandType() {
		return commandType;
	}

	@Override
	public int getTimeout() {
		// TODO Auto-generated method stub
		return 300;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}
}
