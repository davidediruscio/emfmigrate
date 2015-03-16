/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui;

/**
 * A class used to initialize default preference values.
 */
public class EmigPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigAntlrTokenHelper tokenHelper = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigBracketSet bracketSet = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigBracketSet(null, null);
		final java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
