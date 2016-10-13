/*
 * generated by Xtext
 */
package wodeledu.dsls.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import modelgraph.MutatorGraph
import manager.WodelContext
import manager.ModelManager
import modelgraph.NodeType
import modelgraph.NodeShape

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ModelGraphGenerator implements IGenerator {
	private String fileName;
	private String className;
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var i = 0;
		for(e: resource.allContents.toIterable.filter(MutatorGraph)) {
		
			if (i == 0) {
				fileName = resource.URI.lastSegment.replace(".graph", "") + '_Graph.java'
			}
			else {
				fileName = resource.URI.lastSegment.replace(".graph", "") + i + '_Graph.java'
			}
			className = fileName.replaceAll(".java", "")
			fsa.generateFile(fileName, e.compile)
			i++
		}
	}
	
	def compile(MutatorGraph graph) '''
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.PrintWriter;
	import java.io.IOException;
	import java.lang.InterruptedException;
	import java.util.Arrays;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	
	import org.eclipse.emf.ecore.EAttribute;
	import org.eclipse.emf.ecore.EObject;
	import org.eclipse.emf.ecore.EPackage;
	import org.eclipse.emf.ecore.EReference;
	import org.eclipse.emf.ecore.resource.Resource;
	
	import exceptions.MetaModelNotFoundException;
	import exceptions.ModelNotFoundException;
	import manager.ModelManager;
	
	public class «className» implements manager.IMutatorGraph {
		
   		«var String folder = ModelManager.getWorkspaceAbsolutePath() + '/' 
	   			+ WodelContext.getProject()»

		public static void generateGraphs(File file, String folder, ArrayList<EPackage> packages, File exercise) throws ModelNotFoundException, FileNotFoundException {
			if (file.isFile()) {
				String pathfile = file.getPath();
				if (pathfile.endsWith(".model") == true) {
					Resource model = ModelManager.loadModel(packages, pathfile);
					String path = exercise.getName() + "/";
					List<String> folders = Arrays.asList(folder.split("/"));
					if (folders.size() > 0) {
						for (String folderName : folders) {
							path += folderName + "/";
						}
					}
					String dotfile = "«folder»/src-gen/html/diagrams/" + "/" +
						path + file.getName().replace(".model", ".dot");
					String pngfile = "«folder»/src-gen/html/diagrams/" + "/" +
						path + file.getName().replace(".model", ".png");
					HashMap<String, String> dotnodes = new HashMap<String, String>();
					HashMap<String, String> dotedges = new HashMap<String, String>();
					// COUNTER: «var counter = 0»
					«FOR node : graph.nodes»
					ArrayList<EObject> lnode_«counter» = ModelManager.getObjectsOfType("«node.name.name»", model);
					for (EObject node : lnode_«counter») {
						String name = "";
						for (EAttribute att : node.eClass().getEAllAttributes()) {
							if (att.getName().equals("name")) {
								name = (String) node.eGet(att);
								break;
							}
						}
						for (EAttribute att : node.eClass().getEAllAttributes()) {
							if (att.getName().equals("«node.attribute.name»")) {
								Boolean value = (Boolean) node.eGet(att);
								«IF node.negation == true»
								if (value == false) {
								«IF node.type == NodeType.MARKEDNODE»
									if (dotnodes.containsKey("_nil") == false) {
										dotnodes.put("_nil", "style = invis");
									}
								«IF node.shape == NodeShape.DOUBLECIRCLE»
									dotnodes.put(name, "shape = «node.shape»");
								«ENDIF»
								«IF node.shape == NodeShape.CIRCLE»
									if (dotnodes.containsKey(name) == false) {
										dotnodes.put(name, "shape = «node.shape»");
									}
								«ENDIF»
								dotedges.put("_nil -> " + name, "");
								«ENDIF»
								«IF node.type == NodeType.NODE»
								«IF node.shape == NodeShape.DOUBLECIRCLE»
								dotnodes.put(name, "shape = «node.shape»");
								«ENDIF»
								«IF node.shape == NodeShape.CIRCLE»
								if (dotnodes.containsKey(name) == false) {
									dotnodes.put(name, "shape = «node.shape»");
								}
								«ENDIF»
								«ENDIF»
								}
								«ELSE»
								if (value == true) {
								«IF node.type == NodeType.MARKEDNODE»
									if (dotnodes.containsKey("_nil") == false) {
										dotnodes.put("_nil", "style = invis");
									}
								«IF node.shape == NodeShape.DOUBLECIRCLE»
									dotnodes.put(name, "shape = «node.shape»");
								«ENDIF»
								«IF node.shape == NodeShape.CIRCLE»
									if (dotnodes.containsKey(name) == false) {
										dotnodes.put(name, "shape = «node.shape»");
									}
								«ENDIF»
								dotedges.put("_nil -> " + name, "");
								«ENDIF»
								«IF node.type == NodeType.NODE»
								«IF node.shape == NodeShape.DOUBLECIRCLE»
								dotnodes.put(name, "shape = «node.shape»");
								«ENDIF»
								«IF node.shape == NodeShape.CIRCLE»
								if (dotnodes.containsKey(name) == false) {
									dotnodes.put(name, "shape = «node.shape»");
								}
								«ENDIF»
								«ENDIF»
							}
							«ENDIF»
						}
					}
				}
				// COUNTER: «counter = counter + 1»
				«ENDFOR»
				// COUNTER: «counter = 0»
				«FOR edge : graph.edges»
				ArrayList<EObject> ledge_«counter» = ModelManager.getObjectsOfType("«edge.name.name»", model);
				for (EObject edge : ledge_«counter») {
					String source = "";
					String target = "";
					String label = "";
					for (EReference ref : edge.eClass().getEAllReferences()) {
						if (ref.getName().equals("«edge.source.name»")) {
							EObject src = (EObject) edge.eGet(ref);
							for (EAttribute att : src.eClass().getEAllAttributes()) {
								if (att.getName().equals("name")) {
									source = (String) src.eGet(att);
									break;
								}
							}
						}
						if (ref.getName().equals("«edge.target.name»")) {
							EObject tar = (EObject) edge.eGet(ref);
							for (EAttribute att : tar.eClass().getEAllAttributes()) {
								if (att.getName().equals("name")) {
									target = (String) tar.eGet(att);
									break;
								}
							}
						}
						if (ref.getName().equals("«edge.label.name»")) {
							EObject lbl = (EObject) edge.eGet(ref);
							for (EAttribute att : lbl.eClass().getEAllAttributes()) {
								if (att.getName().equals("«edge.label.name»")) {
									label = (String) lbl.eGet(att);
									break;
								}
							}
						}
					}
					if (dotedges.containsKey(source + " -> " + target) == true) {
						String prevlbl = dotedges.get(source + " -> " + target);
						label = prevlbl + ", " + label;
					}
					dotedges.put(source + " -> " + target, label);
				}
				// COUNTER: «counter = counter + 1»
				«ENDFOR»
				ArrayList<String> dotcode = new ArrayList<String>();
				dotcode.add("digraph «graph.name.name» {\n");
				for (String dotnode : dotnodes.keySet()) {
					if (dotnodes.get(dotnode).equals("")) {
						dotcode.add(dotnode + ";\n");
					}
					else {
						dotcode.add(dotnode + " [" + dotnodes.get(dotnode) + "];\n");
					}
				}
				for (String dotedge : dotedges.keySet()) {
					if (dotedges.get(dotedge).equals("")) {
						dotcode.add(dotedge + ";\n");
					}
					else {
						dotcode.add(dotedge + " [label = \"" + dotedges.get(dotedge) + "\"];\n");
					}
				}
				dotcode.add("}");
				System.out.println(dotcode);
				System.out.println(dotfile);
				File diagramsfolder = new File("«folder»/src-gen/html/diagrams/");
				if (diagramsfolder.exists() != true) {
					diagramsfolder.mkdir();
				}
				File exercisefolder = new File("«folder»/src-gen/html/diagrams/" + exercise.getName() + "/");
				if (exercisefolder.exists() != true) {
					exercisefolder.mkdir();
				}
				path = exercise.getName() + "/";
				folders = Arrays.asList(folder.split("/"));
				if (folders.size() > 0) {
					for (String folderName : folders) {
						path += folderName + "/";
						exercisefolder = new File("«folder»/src-gen/html/diagrams/" + path);
						if (exercisefolder.exists() != true) {
							exercisefolder.mkdir();
						}
					}
				}
				System.out.println("path: " + path);
				PrintWriter dotwriter = new PrintWriter(dotfile);
				for (String dotline : dotcode) {
					dotwriter.println(dotline);
				}
				dotwriter.close();
				String[] command = {"dot", "-Tpng", dotfile, "-o", pngfile};
				try {
					Process proc = Runtime.getRuntime().exec(command);
					proc.waitFor(); 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			if (file.getName().equals("registry") != true) {
				File[] filesBlock = file.listFiles();
				for (File fileBlock : filesBlock) {
					generateGraphs(fileBlock, folder + "/" + file.getName(), packages, exercise);
				}
			}
		}
	}
	
	public void generate() throws MetaModelNotFoundException, ModelNotFoundException, FileNotFoundException {
			
		String metamodel = "«ModelManager.getMetaModel().replace("\\", "/")»";
		ArrayList<EPackage> packages = ModelManager.loadMetaModel(metamodel);
	
		// GENERATES PNG FILES FROM SOURCE MODELS
		File folder = new File("«folder»/model");
		for (File file : folder.listFiles()) {
			if (file.isFile()) {
				String pathfile = file.getPath();
				if (pathfile.endsWith(".model") == true) {
					Resource model = ModelManager.loadModel(packages, pathfile);
					String dotfile = "«folder»/src-gen/html/diagrams/" + 
						file.getName().replace(".model", "") + "/" +
						file.getName().replace(".model", ".dot");
					String pngfile = "«folder»/src-gen/html/diagrams/" + 
						file.getName().replace(".model", "") + "/" +
						file.getName().replace(".model", ".png");
					
					HashMap<String, String> dotnodes = new HashMap<String, String>();
					HashMap<String, String> dotedges = new HashMap<String, String>();
					// COUNTER: «counter = 0»
					«FOR node : graph.nodes»
						ArrayList<EObject> lnode_«counter» = ModelManager.getObjectsOfType("«node.name.name»", model);
						for (EObject node : lnode_«counter») {
							String name = "";
							for (EAttribute att : node.eClass().getEAllAttributes()) {
								if (att.getName().equals("name")) {
									name = (String) node.eGet(att);
									break;
								}
							}
							for (EAttribute att : node.eClass().getEAllAttributes()) {
								if (att.getName().equals("«node.attribute.name»")) {
									Boolean value = (Boolean) node.eGet(att);
									«IF node.negation == true»
									if (value == false) {
										«IF node.type == NodeType.MARKEDNODE»
										if (dotnodes.containsKey("_nil") == false) {
											dotnodes.put("_nil", "style = invis");
										}
										«IF node.shape == NodeShape.DOUBLECIRCLE»
										dotnodes.put(name, "shape = «node.shape»");
										«ENDIF»
										«IF node.shape == NodeShape.CIRCLE»
										if (dotnodes.containsKey(name) == false) {
											dotnodes.put(name, "shape = «node.shape»");
										}
										«ENDIF»
										dotedges.put("_nil -> " + name, "");
										«ENDIF»
										«IF node.type == NodeType.NODE»
										«IF node.shape == NodeShape.DOUBLECIRCLE»
										dotnodes.put(name, "shape = «node.shape»");
										«ENDIF»
										«IF node.shape == NodeShape.CIRCLE»
										if (dotnodes.containsKey(name) == false) {
											dotnodes.put(name, "shape = «node.shape»");
										}
										«ENDIF»
										«ENDIF»
									}
									«ELSE»
									if (value == true) {
										«IF node.type == NodeType.MARKEDNODE»
										if (dotnodes.containsKey("_nil") == false) {
											dotnodes.put("_nil", "style = invis");
										}
										«IF node.shape == NodeShape.DOUBLECIRCLE»
										dotnodes.put(name, "shape = «node.shape»");
										«ENDIF»
										«IF node.shape == NodeShape.CIRCLE»
										if (dotnodes.containsKey(name) == false) {
											dotnodes.put(name, "shape = «node.shape»");
										}
										«ENDIF»
										dotedges.put("_nil -> " + name, "");
										«ENDIF»
										«IF node.type == NodeType.NODE»
										«IF node.shape == NodeShape.DOUBLECIRCLE»
										dotnodes.put(name, "shape = «node.shape»");
										«ENDIF»
										«IF node.shape == NodeShape.CIRCLE»
										if (dotnodes.containsKey(name) == false) {
											dotnodes.put(name, "shape = «node.shape»");
										}
										«ENDIF»
										«ENDIF»
									}
									«ENDIF»
								}
							}
						}
						// COUNTER: «counter = counter + 1»
					«ENDFOR»
					// COUNTER: «counter = 0»
					«FOR edge : graph.edges»
						ArrayList<EObject> ledge_«counter» = ModelManager.getObjectsOfType("«edge.name.name»", model);
						for (EObject edge : ledge_«counter») {
							String source = "";
							String target = "";
							String label = "";
							for (EReference ref : edge.eClass().getEAllReferences()) {
								if (ref.getName().equals("«edge.source.name»")) {
									EObject src = (EObject) edge.eGet(ref);
									for (EAttribute att : src.eClass().getEAllAttributes()) {
										if (att.getName().equals("name")) {
											source = (String) src.eGet(att);
											break;
										}
									}
								}
								if (ref.getName().equals("«edge.target.name»")) {
									EObject tar = (EObject) edge.eGet(ref);
									for (EAttribute att : tar.eClass().getEAllAttributes()) {
										if (att.getName().equals("name")) {
											target = (String) tar.eGet(att);
											break;
										}
									}
								}
								if (ref.getName().equals("«edge.label.name»")) {
									EObject lbl = (EObject) edge.eGet(ref);
									for (EAttribute att : lbl.eClass().getEAllAttributes()) {
										if (att.getName().equals("«edge.label.name»")) {
											label = (String) lbl.eGet(att);
											break;
										}
									}
								}
							}
							if (dotedges.containsKey(source + " -> " + target) == true) {
								String prevlbl = dotedges.get(source + " -> " + target);
								label = prevlbl + ", " + label;
							}
							dotedges.put(source + " -> " + target, label);
						}
						// COUNTER: «counter = counter + 1»
					«ENDFOR»
					ArrayList<String> dotcode = new ArrayList<String>();
					dotcode.add("digraph «graph.name.name» {\n");
					for (String dotnode : dotnodes.keySet()) {
						if (dotnodes.get(dotnode).equals("")) {
							dotcode.add(dotnode + ";\n");
						}
						else {
							dotcode.add(dotnode + " [" + dotnodes.get(dotnode) + "];\n");
						}
					}
					for (String dotedge : dotedges.keySet()) {
						if (dotedges.get(dotedge).equals("")) {
							dotcode.add(dotedge + ";\n");
						}
						else {
							dotcode.add(dotedge + " [label = \"" + dotedges.get(dotedge) + "\"];\n");
						}
					}
					dotcode.add("}");
					System.out.println(dotcode);
					System.out.println(dotfile);
					File diagramsfolder = new File("«folder»/src-gen/html/diagrams/");
					if (diagramsfolder.exists() != true) {
						diagramsfolder.mkdir();
					}
					File dotfolder = new File("«folder»/src-gen/html/diagrams/" + 
						file.getName().replace(".model", "") + "/");
					if (dotfolder.exists() != true) {
						dotfolder.mkdir();
					}
					PrintWriter dotwriter = new PrintWriter(dotfile);
					for (String dotline : dotcode) {
						dotwriter.println(dotline);
					}
					dotwriter.close();
					String[] command = {"dot", "-Tpng", dotfile, "-o", pngfile};
					try {
						Process proc = Runtime.getRuntime().exec(command);
						proc.waitFor(); 
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		// GENERATES PNG FILES FROM MUTANTS
		folder = new File("«folder»/out");
		for (File exercise : folder.listFiles()) {
			if (exercise.isDirectory()) {
				for (File file : exercise.listFiles()) {
					if (file.isFile()) {
						String pathfile = file.getPath();
						if (pathfile.endsWith(".model") == true) {
							Resource model = ModelManager.loadModel(packages, pathfile);
							String dotfile = "«folder»/src-gen/html/diagrams/" + exercise.getName() + "/" +
								file.getName().replace(".model", ".dot");
							String pngfile = "«folder»/src-gen/html/diagrams/" + exercise.getName() + "/" +
								file.getName().replace(".model", ".png");
							HashMap<String, String> dotnodes = new HashMap<String, String>();
							HashMap<String, String> dotedges = new HashMap<String, String>();
							// COUNTER: «counter = 0»
							«FOR node : graph.nodes»
							ArrayList<EObject> lnode_«counter» = ModelManager.getObjectsOfType("«node.name.name»", model);
							for (EObject node : lnode_«counter») {
								String name = "";
								for (EAttribute att : node.eClass().getEAllAttributes()) {
									if (att.getName().equals("name")) {
										name = (String) node.eGet(att);
										break;
									}
								}
								for (EAttribute att : node.eClass().getEAllAttributes()) {
									if (att.getName().equals("«node.attribute.name»")) {
										Boolean value = (Boolean) node.eGet(att);
										«IF node.negation == true»
										if (value == false) {
											«IF node.type == NodeType.MARKEDNODE»
											if (dotnodes.containsKey("_nil") == false) {
												dotnodes.put("_nil", "style = invis");
											}
											«IF node.shape == NodeShape.DOUBLECIRCLE»
											dotnodes.put(name, "shape = «node.shape»");
											«ENDIF»
											«IF node.shape == NodeShape.CIRCLE»
											if (dotnodes.containsKey(name) == false) {
												dotnodes.put(name, "shape = «node.shape»");
											}
											«ENDIF»
											dotedges.put("_nil -> " + name, "");
										«ENDIF»
										«IF node.type == NodeType.NODE»
										«IF node.shape == NodeShape.DOUBLECIRCLE»
										dotnodes.put(name, "shape = «node.shape»");
										«ENDIF»
										«IF node.shape == NodeShape.CIRCLE»
										if (dotnodes.containsKey(name) == false) {
											dotnodes.put(name, "shape = «node.shape»");
										}
										«ENDIF»
										«ENDIF»
									}
									«ELSE»
									if (value == true) {
										«IF node.type == NodeType.MARKEDNODE»
											if (dotnodes.containsKey("_nil") == false) {
												dotnodes.put("_nil", "style = invis");
											}
											«IF node.shape == NodeShape.DOUBLECIRCLE»
											dotnodes.put(name, "shape = «node.shape»");
										«ENDIF»
											«IF node.shape == NodeShape.CIRCLE»
											if (dotnodes.containsKey(name) == false) {
												dotnodes.put(name, "shape = «node.shape»");
											}
											«ENDIF»
											dotedges.put("_nil -> " + name, "");
											«ENDIF»
											«IF node.type == NodeType.NODE»
											«IF node.shape == NodeShape.DOUBLECIRCLE»
											dotnodes.put(name, "shape = «node.shape»");
											«ENDIF»
											«IF node.shape == NodeShape.CIRCLE»
											if (dotnodes.containsKey(name) == false) {
												dotnodes.put(name, "shape = «node.shape»");
											}
											«ENDIF»
											«ENDIF»
										}
										«ENDIF»
									}
								}
							}
							// COUNTER: «counter = counter + 1»
							«ENDFOR»
							// COUNTER: «counter = 0»
							«FOR edge : graph.edges»
							ArrayList<EObject> ledge_«counter» = ModelManager.getObjectsOfType("«edge.name.name»", model);
							for (EObject edge : ledge_«counter») {
								String source = "";
								String target = "";
								String label = "";
								for (EReference ref : edge.eClass().getEAllReferences()) {
									if (ref.getName().equals("«edge.source.name»")) {
										EObject src = (EObject) edge.eGet(ref);
										for (EAttribute att : src.eClass().getEAllAttributes()) {
											if (att.getName().equals("name")) {
												source = (String) src.eGet(att);
												break;
											}
										}
									}
									if (ref.getName().equals("«edge.target.name»")) {
										EObject tar = (EObject) edge.eGet(ref);
										for (EAttribute att : tar.eClass().getEAllAttributes()) {
											if (att.getName().equals("name")) {
												target = (String) tar.eGet(att);
												break;
											}
										}
									}
									if (ref.getName().equals("«edge.label.name»")) {
										EObject lbl = (EObject) edge.eGet(ref);
										for (EAttribute att : lbl.eClass().getEAllAttributes()) {
											if (att.getName().equals("«edge.label.name»")) {
												label = (String) lbl.eGet(att);
												break;
											}
										}
									}
								}
								if (dotedges.containsKey(source + " -> " + target) == true) {
									String prevlbl = dotedges.get(source + " -> " + target);
									label = prevlbl + ", " + label;
								}
								dotedges.put(source + " -> " + target, label);
							}
							// COUNTER: «counter = counter + 1»
							«ENDFOR»
							ArrayList<String> dotcode = new ArrayList<String>();
							dotcode.add("digraph «graph.name.name» {\n");
							for (String dotnode : dotnodes.keySet()) {
								if (dotnodes.get(dotnode).equals("")) {
									dotcode.add(dotnode + ";\n");
								}
								else {
									dotcode.add(dotnode + " [" + dotnodes.get(dotnode) + "];\n");
								}
							}
							for (String dotedge : dotedges.keySet()) {
								if (dotedges.get(dotedge).equals("")) {
									dotcode.add(dotedge + ";\n");
								}
								else {
									dotcode.add(dotedge + " [label = \"" + dotedges.get(dotedge) + "\"];\n");
								}
							}
							dotcode.add("}");
							System.out.println(dotcode);
							System.out.println(dotfile);
							File diagramsfolder = new File("«folder»/src-gen/html/diagrams/");
							if (diagramsfolder.exists() != true) {
								diagramsfolder.mkdir();
							}
							File dotfolder = new File("«folder»/src-gen/html/diagrams/" + exercise.getName() + "/");
							if (dotfolder.exists() != true) {
								dotfolder.mkdir();
							}
							PrintWriter dotwriter = new PrintWriter(dotfile);
							for (String dotline : dotcode) {
								dotwriter.println(dotline);
							}
							dotwriter.close();
							String[] command = {"dot", "-Tpng", dotfile, "-o", pngfile};
							try {
								Process proc = Runtime.getRuntime().exec(command);
								proc.waitFor(); 
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					else {
						if (file.getName().equals("registry") != true) {
							File[] filesBlock = file.listFiles();
							for (File fileBlock : filesBlock) {
								generateGraphs(fileBlock, file.getName(), packages, exercise);
							}
						}
					}
				}
			}
		}
	}
}

	'''
}
