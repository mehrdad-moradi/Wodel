/*
 * generated by Xtext
 */
package org.identifyelements.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.emf.ecore.EClass
import java.util.List
import org.eclipse.emf.ecore.EPackage
import manager.ModelManager
import java.util.ArrayList
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import identifyelements.Element
import identifyelements.IdentifyElements
import org.eclipse.xtext.scoping.Scopes
import identifyelements.Variable
import identifyelements.Attribute

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 *
 */
class IdentifyElementsScopeProvider extends AbstractDeclarativeScopeProvider {

	def IScope scope_Element_type(Element element, EReference ref) {
		val scope = new ArrayList<EClass>()
		scope.addAll(getEClasses((element.eContainer as IdentifyElements).metamodel))
       	Scopes.scopeFor(scope)
	}
	
	def IScope scope_Element_ref(Element element, EReference ref) {
		val scope = new ArrayList<EReference>()
		if (element.type != null) {
			scope.addAll(getEReferences((element.eContainer as IdentifyElements).metamodel, element.type.name))
		}
       	Scopes.scopeFor(scope)
	}

	def IScope scope_Variable_id(Variable variable, EReference ref) {
		val scope = new ArrayList<EAttribute>()
		if (variable.ref == null) {
			scope.addAll(getEAttributes((variable.eContainer.eContainer as IdentifyElements).metamodel, (variable.eContainer as Element).type.name))
		}
		if (variable.ref != null) {
			scope.addAll(getEAttributes((variable.eContainer.eContainer as IdentifyElements).metamodel, (variable.ref as EReference).getEType.name))
		}
       	Scopes.scopeFor(scope)
	}
	
	def IScope scope_Variable_ref(Variable variable, EReference ref) {
		val scope = new ArrayList<EReference>()
		scope.addAll(getEReferences((variable.eContainer.eContainer as IdentifyElements).metamodel, (variable.eContainer as Element).type.name))
       	Scopes.scopeFor(scope)
	}


	def IScope scope_Attribute_att(Attribute att, EReference ref) {
		val scope = new ArrayList<EAttribute>()
		scope.addAll(getEAttributes((att.eContainer.eContainer as IdentifyElements).metamodel, (att.eContainer as Element).type.name))
       	Scopes.scopeFor(scope)
	}

	/** 
	 * It returns the list of classes defined in a meta-model.
	 * @param String file containing the metamodel
	 * @return List<EClass>
	 */
	 def private List<EClass> getEClasses (String metamodelFile) {
        val List<EPackage> metamodel = ModelManager.loadMetaModel(metamodelFile)
        val List<EClass>   classes   = new ArrayList<EClass>()
        for (EPackage pck : metamodel)
          for (EClassifier cl : pck.EClassifiers)
            if (cl instanceof EClass)
           		classes.add(cl as EClass)
        return classes
	 }
	 
	 /**
	   * It return the list of attributes of a class.
	   * @param String file containing the metamodel
	   * @param String class name
	   * @return List<EAttribute> list of attributes
	   */ 
	 def private List<EAttribute> getEAttributes (String metamodelFile, String eclassName) {
	   	System.out.println("def private List<EAttribute> getEAttributes (String metamodelFile=" + metamodelFile + ", String eclassName=" + eclassName + ")")
	  	val List<EPackage>    metamodel  = ModelManager.loadMetaModel(metamodelFile)
	  	val EClass            eclass     = ModelManager.getObjectOfType(eclassName, metamodel) as EClass
	  	if (eclass!=null) {
	  		return eclass.EAllAttributes
		}
	  	else {
	  		return new ArrayList<EAttribute>()
	  	}
  	}
  	
  	/** 
	 * It returns the list of references of a class.
	 * @param String file containing the metamodel
	 * @param String class name
	 * @return List<EReference>
	 */
	 def private List<EReference> getEReferences (String metamodelFile, String eclassName) {
        val List<EPackage>   metamodel  = ModelManager.loadMetaModel(metamodelFile)
        val EClass            eclass     = ModelManager.getObjectOfType(eclassName, metamodel) as EClass
        if (eclass != null) {
        	return eclass.EAllReferences
        }
        else {
        	return new ArrayList<EReference>()
        }
	 }
}
