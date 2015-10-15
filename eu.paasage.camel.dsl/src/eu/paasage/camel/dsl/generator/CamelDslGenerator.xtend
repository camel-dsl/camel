/*
 * generated by Xtext
 */
package eu.paasage.camel.dsl.generator

import eu.paasage.camel.CamelModel
import eu.paasage.camel.deployment.CommunicationPort
import eu.paasage.camel.deployment.Component
import eu.paasage.camel.deployment.HostingPort
import java.io.ByteArrayOutputStream
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.util.StringInputStream
import java.util.HashMap
import org.eclipse.emf.ecore.xmi.XMIResource

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CamelDslGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {

		val objit = resource.allContents
		val fileName = (resource.contents.get(0) as CamelModel).getName();
		val xmires = new XMIResourceImpl()
		xmires.contents.addAll(resource.contents)

		val baos = new ByteArrayOutputStream()
		val HashMap<String, Object> opts = new HashMap<String, Object>();
		opts.put(XMIResource.OPTION_SCHEMA_LOCATION, true);
		xmires.save(baos, opts)
		val result = baos.toString
		fsa.generateFile(fileName + '.xmi', result)

		val instream = new StringInputStream(result)

	}
}
