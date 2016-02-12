import hudson.markup.RawHtmlMarkupFormatter
import hudson.markup.EscapedMarkupFormatter
import org.jenkinsci.plugins.UnsafeMarkupFormatter

// Allows to use Raw HTML, Plain Text or unsafe markup

  void set_markup(String markup) {
    if (markup == "raw-html") {
      Jenkins.instance.setMarkupFormatter(new RawHtmlMarkupFormatter(false))
      Jenkins.instance.save()
    } else if (markup == "plain-text") {
      Jenkins.instance.setMarkupFormatter(new EscapedMarkupFormatter())
      Jenkins.instance.save()
    } else if (markup == "unsafe") {
      Jenkins.instance.setMarkupFormatter(new UnsafeMarkupFormatter())
      Jenkins.instance.save()
    }
  }
