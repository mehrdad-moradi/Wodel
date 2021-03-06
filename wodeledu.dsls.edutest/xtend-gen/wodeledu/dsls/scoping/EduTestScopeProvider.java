/**
 * generated by Xtext 2.13.0
 */
package wodeledu.dsls.scoping;

import edutest.MutatorTests;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import manager.ModelManager;
import manager.WodelContext;
import mutatorenvironment.Block;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.osgi.framework.Bundle;

/**
 * @author Pablo Gomez-Abajo
 * 
 * Scope provider for the eduTest language.
 */
@SuppressWarnings("all")
public class EduTestScopeProvider extends AbstractDeclarativeScopeProvider {
  /**
   * MutatorTests.block can refers to any block declared in the .mutator file.
   */
  public IScope scope_MutatorTests_block(final MutatorTests mts, final EReference ref) {
    try {
      IScope _xblockexpression = null;
      {
        String _workspaceAbsolutePath = ModelManager.getWorkspaceAbsolutePath();
        String _plus = ("file:/" + _workspaceAbsolutePath);
        String _plus_1 = (_plus + "/");
        String _project = WodelContext.getProject();
        String _plus_2 = (_plus_1 + _project);
        String _plus_3 = (_plus_2 + "/");
        String _outputFolder = ModelManager.getOutputFolder();
        String _plus_4 = (_plus_3 + _outputFolder);
        String _plus_5 = (_plus_4 + "/");
        String _replaceAll = mts.eResource().getURI().lastSegment().replaceAll("test", "model");
        final String xmiFileName = (_plus_5 + _replaceAll);
        final Bundle bundle = Platform.getBundle("wodel.models");
        final URL fileURL = bundle.getEntry("/models/MutatorEnvironment.ecore");
        final String ecore = FileLocator.resolve(fileURL).getFile();
        final List<EPackage> mutatorpackages = ModelManager.loadMetaModel(ecore);
        final Resource mutatormodel = ModelManager.loadModel(mutatorpackages, URI.createURI(xmiFileName).toFileString());
        final ArrayList<EObject> eobjects = ModelManager.getObjectsOfType("Block", mutatormodel);
        ArrayList<Block> blocks = null;
        for (final EObject eobject : eobjects) {
          blocks.add(((Block) eobject));
        }
        _xblockexpression = Scopes.scopeFor(blocks);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
