import hudson.markup.RawHtmlMarkupFormatter
import hudson.markup.EscapedMarkupFormatter
import org.jenkinsci.plugins.UnsafeMarkupFormatter

// Allows to use Raw HTML, Plain Text or unsafe markup
// ARGS: markup: raw-html, plain-text or unsafe

  void set_markup(String markup) {
    if (markup == "raw-html") {
      Jenkins.instance.setMarkupFormatter(new RawHtmlMarkupFormatter(false))
    } else if (markup == "plain-text") {
      Jenkins.instance.setMarkupFormatter(new EscapedMarkupFormatter())
    } else if (markup == "unsafe") {
      Jenkins.instance.setMarkupFormatter(new UnsafeMarkupFormatter())
    }
    Jenkins.instance.save()
  }
