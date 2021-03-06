/*
 * generated by Xtext 2.13.0
 */
package wodeledu.dsls.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import manager.ModelManager
import edutest.Program
import edutest.AlternativeResponse
import java.net.URL
import org.eclipse.core.runtime.FileLocator
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.URI
import exceptions.ModelNotFoundException
import org.osgi.framework.Bundle
import org.eclipse.core.runtime.Platform
import java.util.List
import wodeledu.dsls.generator.EduTestSuperGenerator.TestOption
import wodeledu.dsls.generator.EduTestSuperGenerator.Registry
import java.util.UUID
import edutest.MultiChoiceDiagram
import edutest.MultiChoiceEmendation
import edutest.MatchPairs
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.Locale
import edutest.Test
import java.util.AbstractMap.SimpleEntry

/**
 * @author Pablo Gomez-Abajo - eduTest code generator.
 * 
 * Generates the javascript and html code for the
 * test exercises application
 *  
 */
class EduTestMoodleGenerator extends EduTestSuperGenerator {

	private String fileName
	private String pageName
	private List<EObject> blocks

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		try {
			var i = 0;
			//loads the mutator model
			var xmiFileName = "file:/" + ModelManager.getWorkspaceAbsolutePath + "/" + manager.WodelContext.getProject +
			"/" + ModelManager.getOutputFolder + "/" + resource.URI.lastSegment.replaceAll(".test", ".model")
			val Bundle bundle = Platform.getBundle("wodel.models")
	   		val URL fileURL = bundle.getEntry("/models/MutatorEnvironment.ecore")
	   		val String mutatorecore = FileLocator.resolve(fileURL).getFile()
			//val String mutatorecore = ModelManager.getWorkspaceAbsolutePath + "/" + WodelContext.getProject() + "/resources/MutatorEnvironment.ecore";
			val List<EPackage> mutatorpackages = ModelManager.loadMetaModel(mutatorecore)
			//val EPackage epackage = mutatorpackages.get(0);
			//EPackage.Registry.INSTANCE.put(epackage.getNsURI(), epackage);
			val Resource mutatormodel = ModelManager.loadModel(mutatorpackages, URI.createURI(xmiFileName).toFileString)
			blocks = ModelManager.getObjectsOfType("Block", mutatormodel)

			for (p : resource.allContents.toIterable.filter(Program)) {
				if (i == 0) {
					fileName = 'xml/' + resource.URI.lastSegment.replaceAll(".test", "") + '.xml'
					pageName = resource.URI.lastSegment.replaceAll(".test", "") + '.xml'
				} else {
					fileName = 'xml/' + resource.URI.lastSegment.replaceAll(".test", "") + i + '.xml'
					pageName = resource.URI.lastSegment.replaceAll(".test", "") + i + '.xml'
				}
				fsa.generateFile(fileName, p.compile(resource))
				i++
			}
		}
		catch (ModelNotFoundException e) {
		}
	}

	def compile(Program program, Resource resource) '''
		�{buildOptions(program, resource, blocks, program.class); ""}�
		<?xml version="1.0" encoding="UTF-8"?>
		<quiz>
		  <question type="category">
		    <category>
		      <text>$course$/top/Por defecto en Automatas</text>
		    </category>
		    <info format="moodle_auto_format">
		      <text>Categoria por defecto para preguntas compartidas en el contexto Automatas.</text>
		    </info>
		    <idnumber></idnumber>
		  </question>
		
		
    	�var int i = 0�
		�FOR exercise : program.exercises�
    	�IF exercise instanceof AlternativeResponse�
		�FOR test : exercise.tests�
          <question type="truefalse">
		    <name>
		      <text>�test.question.replace("\"", "'")�</text>
		    </name>
		    <questiontext format="html">
		      <!-- �var diagram = rand.get(exercise).get(test).get(0)�-->
		      <!-- �var UUID uuid = UUID.randomUUID()�-->
		      <text><![CDATA[<p>�test.question.replace("\"", "'")�<br></p><p><img src="@@PLUGINFILE@@/exercise_�uuid�.png" alt="�test.question.replace("\"", "'")�" width="40%" height="40%" class="img-responsive atto_image_button_text-bottom"><br></p>]]></text>
		<file name="exercise_�uuid�.png" path="/" encoding="base64">�getStringBase64("diagrams/" + test.source.replace('.model', '') + "/" + diagram)�</file>
		    </questiontext>
		    <generalfeedback format="html">
		      <text></text>
		    </generalfeedback>
		    <defaultgrade>1.0000000</defaultgrade>
		    <penalty>1.0000000</penalty>
		    <hidden>0</hidden>
		    <idnumber></idnumber>
		      �IF diagram.equals(test.source.replace('.model', '.png'))�
		    <answer fraction="100" format="moodle_auto_format">
		      <text>true</text>
		      <feedback format="html">
		        <text></text>
		      </feedback>
		    </answer>
		    <answer fraction="0" format="moodle_auto_format">
		      <text>false</text>
		      <feedback format="html">
		        <text></text>
		      </feedback>
		    </answer>
		      �ELSE�
		    <answer fraction="0" format="moodle_auto_format">
		      <text>true</text>
		      <feedback format="html">
		        <text></text>
		      </feedback>
		    </answer>
		    <answer fraction="100" format="moodle_auto_format">
		      <text>false</text>
		      <feedback format="html">
		        <text></text>
		      </feedback>
		    </answer>
		      �ENDIF�
		  </question>
    	�ENDFOR�
		�ENDIF�
    	�IF exercise instanceof MultiChoiceDiagram�
		�FOR test : exercise.tests�
         <question type="multichoice">
           <name>
             <text>Question �i++�</text>
           </name>
           <questiontext format="html">
           <text><![CDATA[<p>�test.question.replace("\"", "'")�<br></p>]]></text>
           </questiontext>
           <generalfeedback format="html">
           <text></text>
           </generalfeedback>
           <defaultgrade>1.0000000</defaultgrade>
           <penalty>1.0000000</penalty>
           <hidden>0</hidden>
           <idnumber></idnumber>
           <single>true</single>
           <shuffleanswers>true</shuffleanswers>
           <answernumbering>abc</answernumbering>
           <correctfeedback format="html">
           <text>Respuesta correcta</text>
           </correctfeedback>
           <partiallycorrectfeedback format="html">
           <text>Respuesta parcialmente correcta.</text>
           </partiallycorrectfeedback>
           <incorrectfeedback format="html">
           <text>Respuesta incorrecta.</text>
           </incorrectfeedback>
           <shownumcorrect/>
           �FOR diagram : diagrams.get(exercise).get(test)�
		   <!-- �var UUID uuid = UUID.randomUUID()�-->
           �IF diagram.equals(test.source.replace('.model', '.png'))�
           <answer fraction="100" format="html">
           �ELSE�
           <answer fraction="0" format="html">
           �ENDIF�
           <text><![CDATA[<p><img src="@@PLUGINFILE@@/exercise_�uuid�.png" alt="" width="40%" height="40%" role="presentation" class="img-responsive atto_image_button_text-bottom"><br></p>]]></text>
           <file name="exercise_�uuid�.png" path="/" encoding="base64">�getStringBase64("diagrams/" + test.source.replace('.model', '') + "/" + diagram)�</file>
           <feedback format="html">
           <text></text>
           </feedback>
           </answer>
           �ENDFOR�
         </question>
    	�ENDFOR�
		�ENDIF�
		�IF exercise instanceof MultiChoiceEmendation�
		�FOR test : exercise.tests�
            <!--�var String diagram = ''�-->
			�IF (options.get(exercise).get(test) != null)�
			�FOR opt : options.get(exercise).get(test)�
			�IF opt.text.size > 0�
			�IF opt.solution == true�
				<!--�diagram = opt.path�-->
			�ENDIF�
			�ENDIF�
			�ENDFOR�
			�ENDIF�
			�IF !diagram.equals('')�
        <question type="multichoice">
          <name>
             <text>Question �i++�</text>
          </name>
          <questiontext format="html">
            <!-- �var UUID uuid = UUID.randomUUID()�-->
			<text><![CDATA[<p>�test.question.replace("\"", "'")�<br><br><img src="@@PLUGINFILE@@/exercise_�uuid�.png" alt="multiple choice" width="40%" height="40%" class="img-responsive atto_image_button_text-bottom"><br></p>]]></text>
            <file name="exercise_�uuid�.png" path="/" encoding="base64">�getStringBase64(diagram)�</file>
          </questiontext>
          <generalfeedback format="html">
          <text></text>
          </generalfeedback>
          <defaultgrade>1.0000000</defaultgrade>
          <penalty>0.3333333</penalty>
          <hidden>0</hidden>
          <idnumber></idnumber>
          <single>false</single>
          <shuffleanswers>true</shuffleanswers>
          <answernumbering>abc�/*var char car = 'a'��FOR opt : options.get(exercise).get(test)��car++��ENDFOR*/�</answernumbering>
          <correctfeedback format="html">
          <text>Respuesta correcta</text>
          </correctfeedback>
          <partiallycorrectfeedback format="html">
          <text>Respuesta parcialmente correcta.</text>
          </partiallycorrectfeedback>
          <incorrectfeedback format="html">
          <text>Respuesta incorrecta.</text>
          </incorrectfeedback>
          <shownumcorrect/>
          �var int solutions = 0�
          �IF (options.get(exercise).get(test) != null)�
          �FOR opt : options.get(exercise).get(test)�
          �IF opt.text.size > 0�
          �IF opt.solution == true�
                �{solutions++; ""}�
          �ENDIF�
          �ENDIF�
          �ENDFOR�
          �ENDIF�
          �IF options.get(exercise).get(test) != null�
          �FOR opt : options.get(exercise).get(test)�
          �IF opt.text.size > 0�
          �IF opt.solution == true�
          �IF 100 % solutions == 0�
          <answer fraction="�100/solutions�" format="html">
          �ELSE�
          <!--�var DecimalFormat formatter = (NumberFormat.getNumberInstance(new Locale("en", "UK")) as DecimalFormat)�-->
          �{formatter.applyPattern("###.#####"); ""}�
          <answer fraction="�formatter.format(100.0/solutions)�" format="html">
          �ENDIF�
          �ELSE�
          <answer fraction="0" format="html">
          �ENDIF�
          <text><![CDATA[<p>�opt.text.get(0).trim()�<br></p>]]></text>
          <feedback format="html">
          <text></text>
          </feedback>
          </answer>
          �ENDIF�
          �ENDFOR�
          �ENDIF�
        </question>
          �ENDIF�
		�ENDFOR�
		�ENDIF�
		�IF exercise instanceof MatchPairs�
        <question type="matching">
          <name>
             <text>Question �i++�</text>
          </name>
          <questiontext format="html">
          <text><![CDATA[<p>Match the diagram on the left with the correct option on the right.</p>]]></text>
          </questiontext>
          <generalfeedback format="html">
          <text></text>
          </generalfeedback>
          <defaultgrade>1.0000000</defaultgrade>
          <penalty>0.3333333</penalty>
          <hidden>0</hidden>
          <idnumber></idnumber>
          <shuffleanswers>true</shuffleanswers>
          <correctfeedback format="html">
          <text>Respuesta correcta</text>
          </correctfeedback>
          <partiallycorrectfeedback format="html">
          <text>Respuesta parcialmente correcta.</text>
          </partiallycorrectfeedback>
          <incorrectfeedback format="html">
          <text>Respuesta incorrecta.</text>
          </incorrectfeedback>
          <shownumcorrect/>
          �FOR Test test : exercise.tests�
          <!--�var String diagram = ''�-->
          �IF (options.get(exercise).get(test) != null && options.get(exercise).get(test).size() > 0)�
          �FOR TestOption opt : options.get(exercise).get(test)�
          �IF opt.path.contains(exercise.blocks.get(0).name)�
          <!--�diagram = opt.path�-->
          �FOR SimpleEntry<Resource, List<String>> entry: opt.reverse�
          <subquestion format="html">
            <!-- �var UUID uuid = UUID.randomUUID()�-->
            <!-- �var String question = test.question.replace("\"", "'")�-->
            <!-- �IF test.expression == true�-->
            <!-- �question += getText(entry.getKey().getURI().toFileString(), resource)�-->
            <!-- �System.out.println(entry.getKey().getURI().toFileString())�-->
            <!-- �ENDIF�-->
			<text><![CDATA[<p>�question�<br><br><img src="@@PLUGINFILE@@/exercise_�uuid�.png" alt="" width="40%" height="40%" role="presentation" class="img-responsive atto_image_button_text-bottom"><br></p>]]></text>
            <file name="exercise_�uuid�.png" path="/" encoding="base64">�getStringBase64(diagram)�</file>
          <answer>
          <text><![CDATA[<p>�entry.getValue().get(0).trim()�<br></p>]]></text>
          </answer>
          </subquestion>
          �ENDFOR�
          �ENDIF�
          �ENDFOR�
          �ENDIF�
          �ENDFOR�
        </question>
          �ENDIF�
	    �ENDFOR�
		</quiz>
	'''
}
