// 
// Decompiled by Procyon v0.6.0
// 

package com.autogrinder.gold.commands;

import net.minecraft.command.CommandException;
import com.autogrinder.gold.AutoGrinder;
import net.minecraft.command.ICommandSender;

import net.minecraft.command.CommandBase;

import java.util.ArrayList;
import java.util.List;

public class StartCommand extends CommandBase
{
    @Override
    public String getCommandName() {
        return "gstart";
    }

    @Override
    public String getCommandUsage(final ICommandSender commandSender) {
        return String.valueOf(new StringBuilder().append("/").append(this.getCommandName()));
    }

    @Override
    public void processCommand(final ICommandSender commandSender, final String[] array) throws CommandException {
        AutoGrinder.getInstance().getDriver().toggle();
    }
    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}

