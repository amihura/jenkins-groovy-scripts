import com.sonyericsson.hudson.plugins.gerrit.trigger.config.Config
import com.sonyericsson.hudson.plugins.gerrit.trigger.GerritServer
import com.sonyericsson.hudson.plugins.gerrit.trigger.PluginImpl


  void setup_gerrit(
    String gerrit_hostname = null,
    String gerrit_key_path = null
    String gerrit_server_name = null,
    String gerrit_url = null,
    String gerrit_username = null
  ) {

    if (PluginImpl.getInstance().getServer(gerrit_server_name) == null) {

    GerritServer defaultServer = new GerritServer(gerrit_server_name)
    Config config = defaultServer.getConfig()
    PluginImpl.getInstance().addServer(defaultServer)
    defaultServer.start()
    // setting properties
    config.setGerritBuildCurrentPatchesOnly(true)
    config.setGerritHostName(gerrit_hostname)
    config.setGerritFrontEndURL(gerrit_url)
    config.setGerritUserName(gerrit_username)
    config.setGerritAuthKeyFile(new File(gerrit_key_path))
    PluginImpl.getInstance().save()
    } else {
      Config config = PluginImpl.getInstance().getServer(gerrit_server_name).getConfig()
      config.setGerritBuildCurrentPatchesOnly(true)
      config.setGerritHostName(gerrit_hostname)
      config.setGerritFrontEndURL(gerrit_url)
      config.setGerritUserName(gerrit_username)
      config.setGerritAuthKeyFile(new File(gerrit_key_path))
      PluginImpl.getInstance().save()
    }
  }
