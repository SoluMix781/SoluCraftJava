package solucraft.common;

import java.util.ArrayList;
import java.util.List;

import solucraft.network.PacketManager;
import solucraft.network.PacketShowToggle;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

/**
 * @author AbrarSyed
 */
public class CommandShow extends CommandBase
{

	@Override
	public String getCommandName()
	{
		return "srm-show";
	}

	@Override
	public int getRequiredPermissionLevel()
	{
		return 0;
	}

	@SuppressWarnings("rawtypes")
    @Override
	public List getCommandAliases()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("show");
		return list;
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2)
	{
	    PacketManager.sendToPlayer(new PacketShowToggle(), CommandBase.getCommandSenderAsPlayer(var1));
	}

    @Override
    public String getCommandUsage(ICommandSender icommandsender)
    {
        return "";
    }

	@Override
	public int compareTo(Object arg0) {
		return 0;
	}
}