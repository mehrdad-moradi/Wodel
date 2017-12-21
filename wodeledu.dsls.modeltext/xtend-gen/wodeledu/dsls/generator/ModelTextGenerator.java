/**
 * generated by Xtext
 */
package wodeledu.dsls.generator;

import com.google.common.collect.Iterables;
import manager.ModelManager;
import manager.WodelContext;
import modeltext.IdentifyElements;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import wodeledu.dsls.ModelTextUtils;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ModelTextGenerator implements IGenerator {
  private String fileName;
  
  private String path;
  
  private String xmiFileName;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _workspaceAbsolutePath = ModelManager.getWorkspaceAbsolutePath();
    String _plus = (_workspaceAbsolutePath + "/");
    String _project = WodelContext.getProject();
    String _plus_1 = (_plus + _project);
    this.path = _plus_1;
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<IdentifyElements> _filter = Iterables.<IdentifyElements>filter(_iterable, IdentifyElements.class);
    for (final IdentifyElements e : _filter) {
      {
        URI _uRI = resource.getURI();
        String _lastSegment = _uRI.lastSegment();
        this.fileName = _lastSegment;
        String _workspaceAbsolutePath_1 = ModelManager.getWorkspaceAbsolutePath();
        String _plus_2 = ("file:/" + _workspaceAbsolutePath_1);
        String _plus_3 = (_plus_2 + "/");
        String _project_1 = WodelContext.getProject();
        String _plus_4 = (_plus_3 + _project_1);
        String _plus_5 = (_plus_4 + "/src/");
        String xTextFileName = (_plus_5 + this.fileName);
        String _workspaceAbsolutePath_2 = ModelManager.getWorkspaceAbsolutePath();
        String _plus_6 = ("file:/" + _workspaceAbsolutePath_2);
        String _plus_7 = (_plus_6 + "/");
        String _project_2 = WodelContext.getProject();
        String _plus_8 = (_plus_7 + _project_2);
        String _plus_9 = (_plus_8 + "/");
        String _outputFolder = ModelManager.getOutputFolder();
        String _plus_10 = (_plus_9 + _outputFolder);
        String _plus_11 = (_plus_10 + "/");
        String _replaceAll = this.fileName.replaceAll(".modeltext", "_modeltext.model");
        String _plus_12 = (_plus_11 + _replaceAll);
        this.xmiFileName = _plus_12;
        ModelTextUtils.serialize(xTextFileName, this.xmiFileName);
      }
    }
  }
}