/*
 * generated by Xtext
 */
package wodeledu.dsls;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ModelTextUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return wodeledu.dsls.ui.internal.ModelTextActivator.getInstance().getInjector("wodeledu.dsls.ModelText");
	}
	
}