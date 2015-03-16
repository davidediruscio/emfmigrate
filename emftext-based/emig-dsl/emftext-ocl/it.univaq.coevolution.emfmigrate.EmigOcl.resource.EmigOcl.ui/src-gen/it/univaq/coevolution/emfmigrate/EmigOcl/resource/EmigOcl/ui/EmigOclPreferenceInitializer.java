/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui;

/**
 * A class used to initialize default preference values.
 */
public class EmigOclPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclAntlrTokenHelper tokenHelper = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclBracketSet bracketSet = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclBracketSet(null, null);
		final java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclMetaInformation metaInformation) {
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
			it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
