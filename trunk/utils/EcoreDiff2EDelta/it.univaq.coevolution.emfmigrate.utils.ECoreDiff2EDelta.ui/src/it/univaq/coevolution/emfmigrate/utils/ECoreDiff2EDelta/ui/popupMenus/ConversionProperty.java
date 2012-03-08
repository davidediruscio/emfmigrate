package it.univaq.coevolution.emfmigrate.utils.ECoreDiff2EDelta.ui.popupMenus;

public class ConversionProperty {

	private String path_mmEcoreDiff;
	private String path_metamodels;
	private String path_target;
	

	protected ConversionProperty(String path_mmEcoreDiff,
								String path_metamodels,
								String path_target) {

		this.path_mmEcoreDiff = path_mmEcoreDiff;
		this.path_metamodels = path_metamodels;
		this.path_target = path_target;
	}

	public String getPath_metamodels() {
		return path_metamodels;
	}

	public String getPath_mmEcoreDiff() {
		return path_mmEcoreDiff;
	}

	public String getPath_target() {
		return path_target;
	}

}