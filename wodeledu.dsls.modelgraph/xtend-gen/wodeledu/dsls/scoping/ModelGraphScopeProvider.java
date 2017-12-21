/**
 * generated by Xtext
 */
package wodeledu.dsls.scoping;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import manager.ModelManager;
import modelgraph.Content;
import modelgraph.Edge;
import modelgraph.Information;
import modelgraph.Level;
import modelgraph.MutatorGraph;
import modelgraph.Node;
import modelgraph.NodeEnumerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * @author Pablo Gomez-Abajo
 * 
 * Scope provider for the modelGraph language.
 */
@SuppressWarnings("all")
public class ModelGraphScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_Item_name(final MutatorGraph graph, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EClass> scope = new ArrayList<EClass>();
      String _metamodel = graph.getMetamodel();
      List<EClass> _eClasses = this.getEClasses(_metamodel);
      scope.addAll(_eClasses);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Item_name(final Node node, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EClass> scope = new ArrayList<EClass>();
      EObject _eContainer = node.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      List<EClass> _eClasses = this.getEClasses(_metamodel);
      scope.addAll(_eClasses);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Item_name(final Edge edge, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EClass> scope = new ArrayList<EClass>();
      EObject _eContainer = edge.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      List<EClass> _eClasses = this.getEClasses(_metamodel);
      scope.addAll(_eClasses);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Node_reference(final Node node, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EReference> scope = new ArrayList<EReference>();
      EObject _eContainer = node.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = node.getName();
      String _name_1 = _name.getName();
      List<EReference> _eReferences = this.getEReferences(_metamodel, _name_1);
      scope.addAll(_eReferences);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_BooleanAttribute_att(final Node node, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EObject _eContainer = node.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = node.getName();
      String _name_1 = _name.getName();
      List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name_1);
      scope.addAll(_eAttributes);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_NamedItem_attName(final Node node, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EObject _eContainer = node.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = node.getName();
      String _name_1 = _name.getName();
      List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name_1);
      scope.addAll(_eAttributes);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_NamedItem_attName(final Edge edge, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EObject _eContainer = edge.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = edge.getName();
      String _name_1 = _name.getName();
      List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name_1);
      scope.addAll(_eAttributes);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_NamedItem_attName(final Content content, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EObject _eContainer = content.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = content.getName();
      String _name_1 = _name.getName();
      List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name_1);
      scope.addAll(_eAttributes);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_NamedItem_attName(final Level level, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EObject _eContainer = level.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = level.getName();
      String _name_1 = _name.getName();
      List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name_1);
      scope.addAll(_eAttributes);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Edge_source(final Edge edge, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EReference> scope = new ArrayList<EReference>();
      EObject _eContainer = edge.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = edge.getName();
      String _name_1 = _name.getName();
      List<EReference> _eReferences = this.getEReferences(_metamodel, _name_1);
      scope.addAll(_eReferences);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Edge_target(final Edge edge, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EReference> scope = new ArrayList<EReference>();
      EObject _eContainer = edge.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = edge.getName();
      String _name_1 = _name.getName();
      List<EReference> _eReferences = this.getEReferences(_metamodel, _name_1);
      scope.addAll(_eReferences);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Relation_reference(final Edge edge, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EReference> scope = new ArrayList<EReference>();
      EObject _eContainer = edge.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = edge.getName();
      String _name_1 = _name.getName();
      List<EReference> _eReferences = this.getEReferences(_metamodel, _name_1);
      scope.addAll(_eReferences);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Relation_label(final Edge edge, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EReference _reference = edge.getReference();
      boolean _notEquals = (!Objects.equal(_reference, null));
      if (_notEquals) {
        EObject _eContainer = edge.eContainer();
        String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
        EReference _reference_1 = edge.getReference();
        EClassifier _eType = _reference_1.getEType();
        String _name = _eType.getName();
        List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name);
        scope.addAll(_eAttributes);
      } else {
        EObject _eContainer_1 = edge.eContainer();
        String _metamodel_1 = ((MutatorGraph) _eContainer_1).getMetamodel();
        EClass _name_1 = edge.getName();
        String _name_2 = _name_1.getName();
        List<EAttribute> _eAttributes_1 = this.getEAttributes(_metamodel_1, _name_2);
        scope.addAll(_eAttributes_1);
      }
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Relation_src_label(final Edge edge, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EObject _eContainer = edge.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = edge.getName();
      String _name_1 = _name.getName();
      List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name_1);
      scope.addAll(_eAttributes);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Relation_tar_label(final Edge edge, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EObject _eContainer = edge.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = edge.getName();
      String _name_1 = _name.getName();
      List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name_1);
      scope.addAll(_eAttributes);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Level_upper(final Level level, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EReference> scope = new ArrayList<EReference>();
      EObject _eContainer = level.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = level.getName();
      String _name_1 = _name.getName();
      List<EReference> _eReferences = this.getEReferences(_metamodel, _name_1);
      scope.addAll(_eReferences);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Content_attName(final Content content, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EObject _eContainer = content.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = content.getName();
      String _name_1 = _name.getName();
      List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name_1);
      scope.addAll(_eAttributes);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_NodeEnumerator_att(final Content content, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EObject _eContainer = content.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = content.getName();
      String _name_1 = _name.getName();
      List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name_1);
      scope.addAll(_eAttributes);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Enumerator_literal(final NodeEnumerator nodenum, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EEnumLiteral> scope = new ArrayList<EEnumLiteral>();
      EObject _eContainer = nodenum.eContainer();
      EObject _eContainer_1 = ((Content) _eContainer).eContainer();
      String _metamodel = ((MutatorGraph) _eContainer_1).getMetamodel();
      EAttribute _att = nodenum.getAtt();
      EClassifier _eType = _att.getEType();
      String _name = _eType.getName();
      List<EEnumLiteral> _eLiterals = this.getELiterals(_metamodel, _name);
      scope.addAll(_eLiterals);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Information_type(final Content content, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EReference> scope = new ArrayList<EReference>();
      EObject _eContainer = content.eContainer();
      String _metamodel = ((MutatorGraph) _eContainer).getMetamodel();
      EClass _name = content.getName();
      String _name_1 = _name.getName();
      List<EReference> _eReferences = this.getEReferences(_metamodel, _name_1);
      scope.addAll(_eReferences);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Information_att(final Information info, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ArrayList<EAttribute> scope = new ArrayList<EAttribute>();
      EObject _eContainer = info.eContainer();
      EObject _eContainer_1 = ((Content) _eContainer).eContainer();
      String _metamodel = ((MutatorGraph) _eContainer_1).getMetamodel();
      EReference _type = info.getType();
      EClassifier _eType = _type.getEType();
      String _name = _eType.getName();
      List<EAttribute> _eAttributes = this.getEAttributes(_metamodel, _name);
      scope.addAll(_eAttributes);
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  /**
   * It returns the list of classes defined in a meta-model.
   * @param String file containing the metamodel
   * @return List<EClass>
   */
  private List<EClass> getEClasses(final String metamodelFile) {
    try {
      final List<EPackage> metamodel = ModelManager.loadMetaModel(metamodelFile);
      final List<EClass> classes = new ArrayList<EClass>();
      for (final EPackage pck : metamodel) {
        EList<EClassifier> _eClassifiers = pck.getEClassifiers();
        for (final EClassifier cl : _eClassifiers) {
          if ((cl instanceof EClass)) {
            classes.add(((EClass) cl));
          }
        }
      }
      return classes;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * It return the list of attributes of a class.
   * @param String file containing the metamodel
   * @param String class name
   * @return List<EAttribute> list of attributes
   */
  private List<EAttribute> getEAttributes(final String metamodelFile, final String eclassName) {
    try {
      final List<EPackage> metamodel = ModelManager.loadMetaModel(metamodelFile);
      EObject _objectOfType = ModelManager.getObjectOfType(eclassName, metamodel);
      final EClass eclass = ((EClass) _objectOfType);
      final ArrayList<EAttribute> atts = new ArrayList<EAttribute>();
      boolean _notEquals = (!Objects.equal(eclass, null));
      if (_notEquals) {
        EList<EAttribute> _eAllAttributes = eclass.getEAllAttributes();
        atts.addAll(_eAllAttributes);
        EList<EClass> _eSuperTypes = eclass.getESuperTypes();
        for (final EClass c : _eSuperTypes) {
          EList<EAttribute> _eAllAttributes_1 = c.getEAllAttributes();
          atts.addAll(_eAllAttributes_1);
        }
      }
      return atts;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * It returns the list of references of a class.
   * @param String file containing the metamodel
   * @param String class name
   * @return List<EReference>
   */
  private List<EReference> getEReferences(final String metamodelFile, final String eclassName) {
    try {
      final List<EPackage> metamodel = ModelManager.loadMetaModel(metamodelFile);
      EObject _objectOfType = ModelManager.getObjectOfType(eclassName, metamodel);
      final EClass eclass = ((EClass) _objectOfType);
      final ArrayList<EReference> refs = new ArrayList<EReference>();
      boolean _notEquals = (!Objects.equal(eclass, null));
      if (_notEquals) {
        EList<EReference> _eAllReferences = eclass.getEAllReferences();
        refs.addAll(_eAllReferences);
        EList<EClass> _eSuperTypes = eclass.getESuperTypes();
        for (final EClass c : _eSuperTypes) {
          EList<EReference> _eAllReferences_1 = c.getEAllReferences();
          refs.addAll(_eAllReferences_1);
        }
      }
      return refs;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * It returns the list of literals of a enum.
   * @param String file containing the metamodel
   * @param String class name
   * @return List<EReference>
   */
  private List<EEnumLiteral> getELiterals(final String metamodelFile, final String eenumName) {
    try {
      final List<EPackage> metamodel = ModelManager.loadMetaModel(metamodelFile);
      EObject _objectOfType = ModelManager.getObjectOfType(eenumName, metamodel);
      final EEnum eenum = ((EEnum) _objectOfType);
      final ArrayList<EEnumLiteral> lits = new ArrayList<EEnumLiteral>();
      boolean _notEquals = (!Objects.equal(eenum, null));
      if (_notEquals) {
        EList<EEnumLiteral> _eLiterals = eenum.getELiterals();
        lits.addAll(_eLiterals);
      }
      return lits;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}