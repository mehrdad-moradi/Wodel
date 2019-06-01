/**
 * generated by Xtext 2.13.0
 */
package wodeledu.dsls.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import mutatext.Configuration;
import mutatext.Option;
import mutatext.Text;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import wodeledu.dsls.services.MutaTextGrammarAccess;

@SuppressWarnings("all")
public class MutaTextFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MutaTextGrammarAccess _mutaTextGrammarAccess;
  
  protected void _format(final Configuration configuration, @Extension final IFormattableDocument document) {
    EList<Option> _options = configuration.getOptions();
    for (final Option option : _options) {
      document.<Option>format(option);
    }
  }
  
  protected void _format(final Option option, @Extension final IFormattableDocument document) {
    document.<Text>format(option.getValid());
    document.<Text>format(option.getInvalid());
  }
  
  public void format(final Object configuration, final IFormattableDocument document) {
    if (configuration instanceof XtextResource) {
      _format((XtextResource)configuration, document);
      return;
    } else if (configuration instanceof Configuration) {
      _format((Configuration)configuration, document);
      return;
    } else if (configuration instanceof Option) {
      _format((Option)configuration, document);
      return;
    } else if (configuration instanceof EObject) {
      _format((EObject)configuration, document);
      return;
    } else if (configuration == null) {
      _format((Void)null, document);
      return;
    } else if (configuration != null) {
      _format(configuration, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(configuration, document).toString());
    }
  }
}