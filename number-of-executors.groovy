import jenkins.model.*

// Allows to set the number of executors for master
// ARGS: type Number (example: 4)

void set_executors(String n) {
  Jenkins jenkins = Jenkins.getInstance()
  if (jenkins.getNumExecutors() != Integer.parseInt(n)) {
    jenkins.setNumExecutors(Integer.parseInt(n))
    jenkins.save()
  }
}
