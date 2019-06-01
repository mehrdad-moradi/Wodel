/**
 * generated by Xtext 2.13.0
 */
package wodeledu.dsls.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import wodeledu.dsls.EduTestRuntimeModule;
import wodeledu.dsls.EduTestStandaloneSetup;
import wodeledu.dsls.ide.EduTestIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class EduTestIdeSetup extends EduTestStandaloneSetup {
  @Override
  public Injector createInjector() {
    EduTestRuntimeModule _eduTestRuntimeModule = new EduTestRuntimeModule();
    EduTestIdeModule _eduTestIdeModule = new EduTestIdeModule();
    return Guice.createInjector(Modules2.mixin(_eduTestRuntimeModule, _eduTestIdeModule));
  }
}