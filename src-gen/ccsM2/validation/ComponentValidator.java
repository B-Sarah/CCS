/**
 *
 * $Id$
 */
package ccsM2.validation;

import ccsM2.Configuration;
import ccsM2.IComponentElement;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ccsM2.Component}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComponentValidator {
	boolean validate();

	boolean validateConfiguration(Configuration value);

	boolean validateIcomponentelement(EList<IComponentElement> value);
}