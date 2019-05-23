package world.bentobox.dimensionaltrees.commands;

import world.bentobox.bentobox.api.commands.CompositeCommand;
import world.bentobox.bentobox.api.commands.admin.AdminReloadCommand;
import world.bentobox.bentobox.api.user.User;

import java.util.List;
import java.util.Optional;

public class DTReloadCommand extends AdminReloadCommand {

    public DTReloadCommand(CompositeCommand adminCommand) {
        super(adminCommand);
    }

    @Override
    public boolean execute(User user, String label, List<String> args) {
        getAddon().onReload();
        getPlugin().reloadConfig();
        user.sendMessage("§aDimensionalTrees has been reloaded.");
        return true;
    }

    public Optional<List<String>> tabComplete(User user, String alias, List<String> args) {
        return Optional.empty();
    }
}
