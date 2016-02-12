import hudson.plugins.gearman.GearmanPluginConfig

// Alows to configure Gearman plugin

void gearman_conf(String host, String port, String gearman_enable) {

  GearmanPluginConfig conf = GearmanPluginConfig.get()

  conf.host = host
  conf.port = Integer.parseInt(port)
  conf.enablePlugin = Boolean.parseBoolean(gearman_enable)
  conf.save()
}
