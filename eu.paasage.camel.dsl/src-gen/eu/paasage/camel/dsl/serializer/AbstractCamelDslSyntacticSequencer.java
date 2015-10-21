package eu.paasage.camel.dsl.serializer;

import com.google.inject.Inject;
import eu.paasage.camel.dsl.services.CamelDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractCamelDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CamelDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Excludes___AttributeConstraintsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q;
	protected AbstractElementAlias match_Feature_Impl___AttributesKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_Feature_Impl___SubFeaturesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_LocationRequirement_LocationRequirementKeyword_0_p;
	protected AbstractElementAlias match_LocationRequirement___LocationsKeyword_3_0_LeftSquareBracketKeyword_3_1_RightSquareBracketKeyword_3_3__q;
	protected AbstractElementAlias match_ProvidedCommunication_CommaKeyword_2_1_1_q;
	protected AbstractElementAlias match_ProvidedCommunication___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_ProviderModel___ConstraintsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_RequiredCommunication_CommaKeyword_2_1_1_q;
	protected AbstractElementAlias match_RequiredCommunication___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CamelDslGrammarAccess) access;
		match_Excludes___AttributeConstraintsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExcludesAccess().getAttributeConstraintsKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getExcludesAccess().getLeftCurlyBracketKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getExcludesAccess().getRightCurlyBracketKeyword_7_3()));
		match_Feature_Impl___AttributesKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFeature_ImplAccess().getAttributesKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_3_3()));
		match_Feature_Impl___SubFeaturesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFeature_ImplAccess().getSubFeaturesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_4_3()));
		match_LocationRequirement_LocationRequirementKeyword_0_p = new TokenAlias(true, false, grammarAccess.getLocationRequirementAccess().getLocationRequirementKeyword_0());
		match_LocationRequirement___LocationsKeyword_3_0_LeftSquareBracketKeyword_3_1_RightSquareBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLocationRequirementAccess().getLocationsKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getLocationRequirementAccess().getLeftSquareBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getLocationRequirementAccess().getRightSquareBracketKeyword_3_3()));
		match_ProvidedCommunication_CommaKeyword_2_1_1_q = new TokenAlias(false, true, grammarAccess.getProvidedCommunicationAccess().getCommaKeyword_2_1_1());
		match_ProvidedCommunication___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProvidedCommunicationAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getProvidedCommunicationAccess().getRightCurlyBracketKeyword_2_2()));
		match_ProviderModel___ConstraintsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProviderModelAccess().getConstraintsKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getProviderModelAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getProviderModelAccess().getRightCurlyBracketKeyword_3_3()));
		match_RequiredCommunication_CommaKeyword_2_1_1_q = new TokenAlias(false, true, grammarAccess.getRequiredCommunicationAccess().getCommaKeyword_2_1_1());
		match_RequiredCommunication___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequiredCommunicationAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getRequiredCommunicationAccess().getRightCurlyBracketKeyword_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Excludes___AttributeConstraintsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q.equals(syntax))
				emit_Excludes___AttributeConstraintsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Feature_Impl___AttributesKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_Feature_Impl___AttributesKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Feature_Impl___SubFeaturesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_Feature_Impl___SubFeaturesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LocationRequirement_LocationRequirementKeyword_0_p.equals(syntax))
				emit_LocationRequirement_LocationRequirementKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LocationRequirement___LocationsKeyword_3_0_LeftSquareBracketKeyword_3_1_RightSquareBracketKeyword_3_3__q.equals(syntax))
				emit_LocationRequirement___LocationsKeyword_3_0_LeftSquareBracketKeyword_3_1_RightSquareBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProvidedCommunication_CommaKeyword_2_1_1_q.equals(syntax))
				emit_ProvidedCommunication_CommaKeyword_2_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProvidedCommunication___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_ProvidedCommunication___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProviderModel___ConstraintsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_ProviderModel___ConstraintsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredCommunication_CommaKeyword_2_1_1_q.equals(syntax))
				emit_RequiredCommunication_CommaKeyword_2_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredCommunication___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_RequiredCommunication___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('attribute constraints ' '{' '}')?
	 */
	protected void emit_Excludes___AttributeConstraintsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('attributes ' '{' '}')?
	 */
	protected void emit_Feature_Impl___AttributesKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('sub-features ' '{' '}')?
	 */
	protected void emit_Feature_Impl___SubFeaturesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'location requirement '+
	 */
	protected void emit_LocationRequirement_LocationRequirementKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('locations ' '[' ']')?
	 */
	protected void emit_LocationRequirement___LocationsKeyword_3_0_LeftSquareBracketKeyword_3_1_RightSquareBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ProvidedCommunication_CommaKeyword_2_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_ProvidedCommunication___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('constraints ' '{' '}')?
	 */
	protected void emit_ProviderModel___ConstraintsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_RequiredCommunication_CommaKeyword_2_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_RequiredCommunication___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
