import jenkins.model.*


void set_executors(String n) {
  Jenkins jenkins = Jenkins.getInstance()
  if (jenkins.getNumExecutors() != Integer.parseInt(n)) {
    jenkins.setNumExecutors(Integer.parseInt(n))
    jenkins.save()
  }
}
