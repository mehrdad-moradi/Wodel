
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import manager.ModelManager;
import metrics.MutatorMetrics;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import commands.*;
import commands.selection.strategies.*;
import commands.strategies.*;

import exceptions.*;

import appliedMutations.*;

import mutatorenvironment.MutatorEnvironment;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.EList;
import org.osgi.framework.Bundle;

import org.eclipse.core.runtime.IProgressMonitor;

public class wco5 extends mutator.MutatorUtils implements manager.IMutatorExecutor {
	
   	//RESET COUNTER: 0
   	//RESET COUNTER: 0
   	//RESET COUNTER: 0
   	//RESET COUNTER: 0
   	//RESET COUNTER: 0
   	//RESET COUNTER: 0
	//RESET COUNTER: 0
//COUNTER: 1
//METHOD NAME:mutation1
	private ArrayList<Mutator> mutation1(ArrayList<EPackage> packages, Resource model, HashMap<String, EObject> hmObjects, HashMap<String, List<EObject>> hmList) throws ReferenceNonExistingException {
		ArrayList<Mutator> mutations = new ArrayList<Mutator>();
//SELECT OBJECT mutation1
	ObSelectionStrategy containerSelection = null;
	SpecificReferenceSelection referenceSelection = null;
	//
	//true
	RandomTypeSelection rts = new RandomTypeSelection(packages, model, "Constraint");
	
	List<EObject> objects = rts.getObjects();
	//EXPRESSION LIST: []
	//EXPRESSION LEVEL: 0
	//EXPRESSION LEVEL: true
	Expression exp0 = new Expression();
	//INDEX EXPRESSION: 
	exp0.first = new ReferenceEvaluation();
	//REFERENCE: 
	((ReferenceEvaluation) exp0.first).name = "operations";
	((ReferenceEvaluation) exp0.first).refName = null;
	((ReferenceEvaluation) exp0.first).operator = "different";
	((ReferenceEvaluation) exp0.first).value = null;
	   		exp0.operator = new ArrayList<Operator>();
	   		//OPNAME: 
	   		exp0.second = new ArrayList<Evaluation>();
	   		//EVNAME: 
   				List<EObject> selectedObjects = evaluate(objects, exp0);
	EObject object = null;
	if (selectedObjects.size() > 0) {
		object = selectedObjects.get(ModelManager.getRandomIndex(selectedObjects));
	}
	ObSelectionStrategy objectSelection = null; 
	if (object != null) {
		objectSelection = new SpecificObjectSelection(packages, model, object);
	}
		SelectObjectMutator mut = new SelectObjectMutator(model, packages, referenceSelection, containerSelection, objectSelection);
		//INC COUNTER: 0
		if (mut != null) {
			mut.setId("m1");
			mutations.add(mut);
		}
		//END SELECT OBJECT mutation1
		return mutations;	
	}
//COUNTER: 1
//METHOD NAME:registry1
//REGISTRY COUNTER: 0
private AppMutation registry1(Mutator mut, HashMap<String, EObject> hmMutator, Resource seed, List<String> mutPaths, ArrayList<EPackage> packages) {
	AppMutation appMut = null;
appMut = AppliedMutationsFactory.eINSTANCE.createAppMutation();
appMut.setDef(hmMutator.get("m1"));
	return appMut;
}
//COUNTER: 2
//METHOD NAME:mutation2
	private ArrayList<Mutator> mutation2(ArrayList<EPackage> packages, Resource model, HashMap<String, EObject> hmObjects, HashMap<String, List<EObject>> hmList) throws ReferenceNonExistingException {
		ArrayList<Mutator> mutations = new ArrayList<Mutator>();
//SELECT OBJECT mutation2
	ObSelectionStrategy containerSelection = null;
	SpecificReferenceSelection referenceSelection = null;
	//
	if (hmObjects.get("c") != null) {
		containerSelection = new SpecificObjectSelection(packages, model, hmObjects.get("c"));
		   			} else {
		   				if (hmList.get("c") != null) {
		   					containerSelection = new SpecificObjectSelection(packages, model, hmList.get("c"));
		   				}
		   				else {
			return mutations;
		}
	}
	if (hmObjects.get("c") != null) {
		referenceSelection = new SpecificReferenceSelection(packages, model, "operations", hmObjects.get("c"));
			   			} else {
			   				return mutations;
	}
	RandomTypeSelection rts = new RandomTypeSelection(packages, model, "Operation", referenceSelection, containerSelection);
	EObject object = rts.getObject();
	
	ObSelectionStrategy objectSelection = null; 
	if (object != null) {
		objectSelection = new SpecificObjectSelection(packages, model, object);
	}
		SelectObjectMutator mut = new SelectObjectMutator(model, packages, referenceSelection, containerSelection, objectSelection);
		//INC COUNTER: 1
		if (mut != null) {
			mut.setId("m2");
			mutations.add(mut);
		}
		//END SELECT OBJECT mutation2
		return mutations;	
	}
//COUNTER: 2
//METHOD NAME:registry2
//REGISTRY COUNTER: 1
private AppMutation registry2(Mutator mut, HashMap<String, EObject> hmMutator, Resource seed, List<String> mutPaths, ArrayList<EPackage> packages) {
	AppMutation appMut = null;
appMut = AppliedMutationsFactory.eINSTANCE.createAppMutation();
appMut.setDef(hmMutator.get("m2"));
	return appMut;
}
//COUNTER: 3
//METHOD NAME:mutation3
	private ArrayList<Mutator> mutation3(ArrayList<EPackage> packages, Resource model, HashMap<String, EObject> hmObjects, HashMap<String, List<EObject>> hmList) throws ReferenceNonExistingException {
		ArrayList<Mutator> mutations = new ArrayList<Mutator>();
//CREATE OBJECT mutation3
ObSelectionStrategy containerSelection = new SpecificObjectSelection(packages, model, hmObjects.get("oper"));
SpecificReferenceSelection referenceSelection = null;
if (hmObjects.get("oper") != null) {
	referenceSelection = new SpecificReferenceSelection(packages, model, "operators", hmObjects.get("oper"));
		   			} else {
	return mutations;
}
HashMap<String, AttributeConfigurationStrategy> atts = new HashMap<String, AttributeConfigurationStrategy>();
ObSelectionStrategy objectSelection = null;
HashMap<String, ObSelectionStrategy> refs = new HashMap<String, ObSelectionStrategy>();
CreateObjectMutator mut = new CreateObjectMutator(model, packages, referenceSelection, containerSelection, atts, refs, "Operator");
//INC COUNTER: 2
if (mut != null) {
	mut.setId("m3");
	mutations.add(mut);
}
//END CREATE OBJECT mutation3
		return mutations;	
	}
//COUNTER: 3
//METHOD NAME:registry3
//REGISTRY COUNTER: 2
private AppMutation registry3(Mutator mut, HashMap<String, EObject> hmMutator, Resource seed, List<String> mutPaths, ArrayList<EPackage> packages) {
	AppMutation appMut = null;
ObjectCreated cMut = AppliedMutationsFactory.eINSTANCE.createObjectCreated();
if ((mutPaths != null) && (packages != null)) {
	try {
		Resource mutant = null;
		EObject object = null;
		for (String mutatorPath : mutPaths) {
			mutant = ModelManager.loadModel(packages, mutatorPath);
			object = ModelManager.getObject(mutant, mut.getObject());
			if (object != null) {
				System.out.println("FOUND!!!");
				break;
			}
			//Reload input
	    			try {
				mutant.unload();
				mutant.load(null); 
			} catch (Exception e) {}
		}
		if (object != null) {
			cMut.getObject().add(object);
		}
		else {
			cMut.getObject().add(mut.getObject());
		}
	} catch (ModelNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
cMut.setDef(hmMutator.get("m3"));
appMut = cMut;
	return appMut;
}
//COUNTER: 4
//METHOD NAME:mutation4
	private ArrayList<Mutator> mutation4(ArrayList<EPackage> packages, Resource model, HashMap<String, EObject> hmObjects, HashMap<String, List<EObject>> hmList) throws ReferenceNonExistingException {
		ArrayList<Mutator> mutations = new ArrayList<Mutator>();
	//MODIFY INFORMATION mutation4
	ObSelectionStrategy objectSelection = null;
	if (hmObjects.get("op") != null) {
		objectSelection = new SpecificObjectSelection(packages, model, hmObjects.get("op"));
	} else {
		if (hmList.get("op") != null) {
			objectSelection = new SpecificObjectSelection(packages, model, hmList.get("op"));
		}
		else {
			return mutations;
		}
	}
			
	HashMap<String, List<AttributeConfigurationStrategy>> attsList = new HashMap<String, List<AttributeConfigurationStrategy>>();
	//COUNTER:
	//COUNTER:0
	//NAME:operator
	if (objectSelection != null) {
		List<AttributeConfigurationStrategy> atts = null;
		if (attsList.get("operator") != null) {
			atts = attsList.get("operator");
		}
		else {
			atts = new ArrayList<AttributeConfigurationStrategy>();
		}
		//NAME:operator
		atts.add((ModelManager.getAttribute("operator", (objectSelection != null) ? objectSelection.getObject() : null) instanceof EObject) ? new ListConfigurationStrategy((EObject) ModelManager.getAttribute("operator", (objectSelection != null) ? objectSelection.getObject() : null), "[not]", "operator") : null
		);
		   		attsList.put("operator", atts);
	}
	   				
	HashMap<String, List<ReferenceConfigurationStrategy>> refsList = new HashMap<String, List<ReferenceConfigurationStrategy>>();
	HashMap<String, List<AttributeConfigurationStrategy>> attsRefList = new HashMap<String, List<AttributeConfigurationStrategy>>();
	ArrayList<EObject> objsAttRef = new ArrayList<EObject>();
	//COUNTER:0
if (objectSelection != null) {
	ModifyInformationMutator mut = new ModifyInformationMutator(model, packages, objectSelection, attsList, refsList, objsAttRef, attsRefList);
	//INC COUNTER: 3
	if (mut != null) {
		mut.setId("m4");
				mutations.add(mut);
			}
}
	//END MODIFY INFORMATION mutation4
		return mutations;	
	}
//COUNTER: 4
//METHOD NAME:registry4
//REGISTRY COUNTER: 3
private AppMutation registry4(Mutator mut, HashMap<String, EObject> hmMutator, Resource seed, List<String> mutPaths, ArrayList<EPackage> packages) {
	AppMutation appMut = null;
	InformationChanged icMut = AppliedMutationsFactory.eINSTANCE.createInformationChanged();
	icMut.setObject(mut.getObject());
	EList<AttributeChanged> attsMut = icMut.getAttChanges();
	Object oldAttVal = null;
	Object newAttVal = null;
	//ATTRIBUTE COUNTER: 
//
//
AttributeChanged attMut0 = null;
attMut0 = AppliedMutationsFactory.eINSTANCE.createAttributeChanged();
attMut0.setAttName("operator");
oldAttVal = ((ModifyInformationMutator) mut).getOldAttValue("operator");
newAttVal = ((ModifyInformationMutator) mut).getNewAttValue("operator");
if (oldAttVal != null) {
	attMut0.setOldVal(oldAttVal.toString());
}
if (newAttVal != null) {
	attMut0.setNewVal(newAttVal.toString());
}
attMut0.setDef(hmMutator.get("m4"));
attsMut.add(attMut0);
icMut.setDef(hmMutator.get("m4"));
//ATTRIBUTE COUNTER INC: 0
	appMut = icMut;
	return appMut;
}
public void execute(int maxAttempts, int numMutants, boolean registry, boolean metrics, boolean debugMetrics, IProgressMonitor monitor) throws ReferenceNonExistingException, WrongAttributeTypeException, 
											  MaxSmallerThanMinException, AbstractCreationException, ObjectNoTargetableException, 
 												  ObjectNotContainedException, MetaModelNotFoundException, ModelNotFoundException, IOException {
 		
	if (maxAttempts <= 0) {
		maxAttempts = 1;
	}
	int totalTasks = 0;
	if (metrics == true) {
		totalTasks++;
	}
	if (debugMetrics == true) {
		totalTasks++;
	}
	//2
   	numMutants = 2;

   	int totalMutants = numMutants * 1;
	totalTasks += totalMutants;
	monitor.beginTask("Generating mutants", totalTasks);
	HashMap<String, List<String>> hashmapMutVersions = new HashMap<String, List<String>>();
	
	
	    String ecoreURI = "C:/eclipse/runtime-EclipseApplication/wco5/data/model/UMLClassDiagram.ecore";
	    
	    String modelURI = "C:/eclipse/runtime-EclipseApplication/wco5/data/model/";
	    String modelsURI = "C:/eclipse/runtime-EclipseApplication/wco5/data/out/";
	    //String resourcesURI = "C:/eclipse/runtime-EclipseApplication/wco5/resources/";
	    
	    HashMap<String, String> hashmapModelFilenames = new HashMap<String, String>();
	    File[] files = new File(modelURI).listFiles();
	    for (int i = 0; i < files.length; i++) {
	    	if (files[i].isFile() == true) {
	    		String pathfile = files[i].getPath();
	    		if (pathfile.endsWith(".model") == true) {
	    			hashmapModelFilenames.put(pathfile, modelsURI + files[i].getName().substring(0, files[i].getName().length() - ".model".length()));
	    		}
	    	}
	    }
	    
	    //Load MetaModel
	    ArrayList<EPackage> packages = ModelManager.loadMetaModel(ecoreURI);
	    
	    //Load Model
	    Set<String> modelFilenames = hashmapModelFilenames.keySet();
	    int count = 0;
	    for (String modelFilename : modelFilenames) {
	    	HashSet<String> hashsetMutants = new HashSet<String>();
	    	hashsetMutants.add(modelFilename);
	    	Resource model = ModelManager.loadModel(packages, modelFilename);
	    	Resource seed = ModelManager.loadModel(packages, modelFilename);
	    
	   	   		//Generate metrics model
	   	Bundle bundle = Platform.getBundle("wodel.models");
	   		   	URL fileURL = bundle.getEntry("/models/MutatorEnvironment.ecore");
	   		   	String mutatorecore = FileLocator.resolve(fileURL).getFile();
	   	
	   	//Load MetaModel
	   	ArrayList<EPackage> mutatorpackages = ModelManager.loadMetaModel(mutatorecore);
	   	Resource mutatormodel = ModelManager.loadModel(mutatorpackages, URI.createURI("file:/C:/eclipse/runtime-EclipseApplication/wco5/data/out/wco5.model").toFileString());
	   	
	   	HashMap<String, EObject> hmMutator = getMutators(ModelManager.getObjects(mutatormodel));
	   			
	   	   	   	for (int i = 0; i < numMutants; i++) {
	   	   	   		HashMap<String, EObject> hashmapEObject = new HashMap<String, EObject>();
	   		HashMap<String, List<EObject>> hashmapList = new HashMap<String, List<EObject>>();
	   	   	   		String mutFilename = hashmapModelFilenames.get(modelFilename) + "/" + "Output" + i + ".model";
	   	   	   		monitor.subTask("Mutant " + (count * numMutants + i + 1) + "/" + totalMutants + ": " + mutFilename);
	   	   	   		String mutPath = hashmapModelFilenames.get(modelFilename) + "/" + "Output" + i + "vs";
	   	   	   		boolean isRepeated = true;
	   	   			int attempts = 0;
	   	   			int max = 0;
	   	   			while ((isRepeated == true) && (attempts < maxAttempts)) {
	   			List<String> mutPaths = new ArrayList<String>();
	   			Mutations muts = AppliedMutationsFactory.eINSTANCE.createMutations();
	   	   				attempts++;
	   	   				//RESET COUNTER: 0
	   	   				//RESET COUNTER: 0
	   	   				//RESET COUNTER: 0
	   	   				//RESET COUNTER: 0
	   	   				//RESET COUNTER: 0
	   	   				//RESET COUNTER: 0
	   	   				//RESET COUNTER: 0
	   	
	   	   	   			   	   	//COUNTER: 1	
	   	   	   			//COMMAND: 13
	   	   	   			//REGISTRY COUNTER: 1
	   	   	   			max = 1;
	   	   	   			for (int j = 0; j < max; j++) {
	   	   	   			//NAME:c13
	   	   	   			//METHOD NAME:mutation1
	   	   	   			
	   	   	   			ArrayList<Mutator> lc13 = mutation1(packages, model, hashmapEObject, hashmapList);
	   	   	   			//COUNTER: 1
	   	   	   			//REGISTRY METHOD NAME:registry1
	   	   	   			
	   	   	   			if (lc13 != null) {
	   	   	   				int k = 0;
	   	   	   				for (Mutator mut : lc13) {
	   	   	   					if (mut != null) {
	   	   	   						Object mutated = mut.mutate();
	   	   	   						if (mutated != null) {
	   	   	   							if (mutated instanceof EObject) {
	   	   	   							hashmapEObject.put("c", mut.getObject());
	   	   	   							}
	   	   	   							AppMutation appMut = registry1(mut, hmMutator, seed, mutPaths, packages);
	   	   	   							if (appMut != null) {
	   	   	   								muts.getMuts().add(appMut);
	   	   	   							}
	   	   	   						}
	   	   	   					}
	   	   	   					k++;
	   	   	   				}
	   	   	   			}
	   	   	   			}
	   	   	   			   	   	//COUNTER: 2	
	   	   	   			//COMMAND: 14
	   	   	   			//REGISTRY COUNTER: 2
	   	   	   			max = 1;
	   	   	   			for (int j = 0; j < max; j++) {
	   	   	   			//NAME:oper14
	   	   	   			//METHOD NAME:mutation2
	   	   	   			
	   	   	   			ArrayList<Mutator> loper14 = mutation2(packages, model, hashmapEObject, hashmapList);
	   	   	   			//COUNTER: 2
	   	   	   			//REGISTRY METHOD NAME:registry2
	   	   	   			
	   	   	   			if (loper14 != null) {
	   	   	   				int k = 0;
	   	   	   				for (Mutator mut : loper14) {
	   	   	   					if (mut != null) {
	   	   	   						Object mutated = mut.mutate();
	   	   	   						if (mutated != null) {
	   	   	   							if (mutated instanceof EObject) {
	   	   	   							hashmapEObject.put("oper", mut.getObject());
	   	   	   							}
	   	   	   							AppMutation appMut = registry2(mut, hmMutator, seed, mutPaths, packages);
	   	   	   							if (appMut != null) {
	   	   	   								muts.getMuts().add(appMut);
	   	   	   							}
	   	   	   						}
	   	   	   					}
	   	   	   					k++;
	   	   	   				}
	   	   	   			}
	   	   	   			}
	   	   	   			   	   	//COUNTER: 3	
	   	   	   			//COMMAND: 15
	   	   	   			//REGISTRY COUNTER: 3
	   	   	   			max = 1;
	   	   	   			for (int j = 0; j < max; j++) {
	   	   	   			//NAME:op15
	   	   	   			//METHOD NAME:mutation3
	   	   	   			
	   	   	   			ArrayList<Mutator> lop15 = mutation3(packages, model, hashmapEObject, hashmapList);
	   	   	   			//COUNTER: 3
	   	   	   			//REGISTRY METHOD NAME:registry3
	   	   	   			
	   	   	   			if (lop15 != null) {
	   	   	   				int k = 0;
	   	   	   				for (Mutator mut : lop15) {
	   	   	   					if (mut != null) {
	   	   	   						Object mutated = mut.mutate();
	   	   	   						if (mutated != null) {
	   	   	   							if (mutated instanceof EObject) {
	   	   	   							hashmapEObject.put("op", mut.getObject());
	   	   	   							}
	   	   	   							String mutatorPath = mutPath + "/Output" + i + "_" + j + "_" + k + "_3.model";
	   	   	   							ModelManager.saveOutModel(model, mutatorPath);
	   	   	   							if (mutPaths.contains(mutatorPath) == false) {
	   	   	   								mutPaths.add(mutatorPath);
	   	   	   							}
	   	   	   							AppMutation appMut = registry3(mut, hmMutator, seed, mutPaths, packages);
	   	   	   							if (appMut != null) {
	   	   	   								muts.getMuts().add(appMut);
	   	   	   							}
	   	   	   						}
	   	   	   					}
	   	   	   					k++;
	   	   	   				}
	   	   	   			}
	   	   	   			}
	   	   	   			   	   	//COUNTER: 4	
	   	   	   			//COMMAND: 16
	   	   	   			//REGISTRY COUNTER: 4
	   	   	   			max = 1;
	   	   	   			for (int j = 0; j < max; j++) {
	   	   	   			//NAME:16
	   	   	   			//METHOD NAME:mutation4
	   	   	   			
	   	   	   			ArrayList<Mutator> l16 = mutation4(packages, model, hashmapEObject, hashmapList);
	   	   	   			//COUNTER: 4
	   	   	   			//REGISTRY METHOD NAME:registry4
	   	   	   			
	   	   	   			if (l16 != null) {
	   	   	   				int k = 0;
	   	   	   				for (Mutator mut : l16) {
	   	   	   					if (mut != null) {
	   	   	   						Object mutated = mut.mutate();
	   	   	   						if (mutated != null) {
	   	   	   							String mutatorPath = mutPath + "/Output" + i + "_" + j + "_" + k + "_4.model";
	   	   	   							ModelManager.saveOutModel(model, mutatorPath);
	   	   	   							if (mutPaths.contains(mutatorPath) == false) {
	   	   	   								mutPaths.add(mutatorPath);
	   	   	   							}
	   	   	   							AppMutation appMut = registry4(mut, hmMutator, seed, mutPaths, packages);
	   	   	   							if (appMut != null) {
	   	   	   								muts.getMuts().add(appMut);
	   	   	   							}
	   	   	   						}
	   	   	   					}
	   	   	   					k++;
	   	   	   				}
	   	   	   			}
	   	   	   			}
	   	      
	   	      
	   	      			//MUTANT COMPLETION AND REGISTRY
	   	       			HashMap<String, ArrayList<String>> rules = new HashMap<String, ArrayList<String>>();
	   	      			
	   	      			
	   			isRepeated = registryMutant(ecoreURI, packages, seed, model, rules, muts, modelFilename, mutFilename, registry, hashsetMutants, hashmapModelFilenames, i, mutPaths, hashmapMutVersions);
	   	
	   		    		//Reload input
	   		    		try {
	   				model.unload();
	   				model.load(null); 
	   			} catch (Exception e) {}
	   	   			}
	   		monitor.worked(1);
	   	   		}
	   	count++;
	
	}

	//Generate metrics model
	Bundle bundle = Platform.getBundle("wodel.models");
   	URL fileURL = bundle.getEntry("/models/MutatorMetrics.ecore");
   	String metricsecore = FileLocator.resolve(fileURL).getFile();
   		//String metricsecore = "C:/eclipse/runtime-EclipseApplication/wco5/resources/MutatorMetrics.ecore";
   		
   		if (metrics == true) {
   			ArrayList<EPackage> metricspackages = ModelManager.loadMetaModel(metricsecore);
   			monitor.subTask("Generating dynamic net metrics");
   			MutatorMetrics.generateMetrics(metricspackages, "C:/eclipse/runtime-EclipseApplication/wco5/data/out/", "C:/eclipse/runtime-EclipseApplication/wco5/data/model/UMLClassDiagram.ecore", "C:/eclipse/runtime-EclipseApplication/wco5/data/model/", "wco5", "C:/eclipse/runtime-EclipseApplication/wco5", hashmapMutVersions);
   			monitor.worked(1);
   		}
   		if (debugMetrics == true) {
		ArrayList<EPackage> metricspackages = ModelManager.loadMetaModel(metricsecore);
   			monitor.subTask("Generating dynamic debug metrics");
   			MutatorMetrics.generateDebugMetrics(metricspackages, "C:/eclipse/runtime-EclipseApplication/wco5/data/out/", "C:/eclipse/runtime-EclipseApplication/wco5/data/model/UMLClassDiagram.ecore", "C:/eclipse/runtime-EclipseApplication/wco5/data/model/", "wco5", "C:/eclipse/runtime-EclipseApplication/wco5", hashmapMutVersions);
   			monitor.worked(1);   			
   		}
   	}
}

