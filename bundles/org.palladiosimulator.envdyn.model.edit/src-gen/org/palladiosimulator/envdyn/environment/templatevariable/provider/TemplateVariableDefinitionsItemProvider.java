/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariableFactory;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;

import tools.mdsd.modelingfoundations.identifier.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateVariableDefinitionsItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateVariableDefinitionsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES);
			childrenFeatures.add(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__FACTORS);
			childrenFeatures.add(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS);
			childrenFeatures.add(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__RELATION);
			childrenFeatures.add(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TemplateVariableDefinitions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemplateVariableDefinitions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TemplateVariableDefinitions)object).getEntityName();
		return label == null || label.length() == 0 ?
			getString("_UI_TemplateVariableDefinitions_type") :
			getString("_UI_TemplateVariableDefinitions_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TemplateVariableDefinitions.class)) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES:
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__FACTORS:
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS:
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__RELATION:
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES,
				 TemplatevariableFactory.eINSTANCE.createTemplateVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__FACTORS,
				 TemplatevariableFactory.eINSTANCE.createProbabilisticTemplateFactor()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS,
				 TemplatevariableFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__RELATION,
				 TemplatevariableFactory.eINSTANCE.createDependenceRelation()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__RELATION,
				 TemplatevariableFactory.eINSTANCE.createPersistenceRelation()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__RELATION,
				 TemplatevariableFactory.eINSTANCE.createTimeSliceRelation()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS,
				 TemplatevariableFactory.eINSTANCE.createTemplateVariableGroup()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EnvironmentaldynamicsEditPlugin.INSTANCE;
	}

}
