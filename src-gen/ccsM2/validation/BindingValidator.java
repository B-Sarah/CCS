/**
 *
 * $Id$
 */
package ccsM2.validation;

import ccsM2.Port;
import ccsM2.PortConfiguration;

/**
 * A sample validator interface for {@link ccsM2.Binding}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BindingValidator {
	boolean validate();

	boolean validatePort(Port value);

	boolean validatePortconfiguration(PortConfiguration value);
}
