/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage;

import org.palladiosimulator.envdyn.environment.templatevariable.provider.EnvironmentaldynamicsEditPlugin;

import tools.mdsd.modelingfoundations.identifier.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GroundRandomVariableItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundRandomVariableItemProvider(AdapterFactory adapterFactory) {
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

			addInstantiatedTemplatePropertyDescriptor(object);
			addDependenceStructurePropertyDescriptor(object);
			addLocalModelPropertyDescriptor(object);
			addAppliedObjectsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instantiated Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstantiatedTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroundRandomVariable_instantiatedTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroundRandomVariable_instantiatedTemplate_feature", "_UI_GroundRandomVariable_type"),
				 StaticmodelPackage.Literals.GROUND_RANDOM_VARIABLE__INSTANTIATED_TEMPLATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependence Structure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependenceStructurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroundRandomVariable_dependenceStructure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroundRandomVariable_dependenceStructure_feature", "_UI_GroundRandomVariable_type"),
				 StaticmodelPackage.Literals.GROUND_RANDOM_VARIABLE__DEPENDENCE_STRUCTURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroundRandomVariable_localModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroundRandomVariable_localModel_feature", "_UI_GroundRandomVariable_type"),
				 StaticmodelPackage.Literals.GROUND_RANDOM_VARIABLE__LOCAL_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Applied Objects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedObjectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroundRandomVariable_appliedObjects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroundRandomVariable_appliedObjects_feature", "_UI_GroundRandomVariable_type"),
				 StaticmodelPackage.Literals.GROUND_RANDOM_VARIABLE__APPLIED_OBJECTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns GroundRandomVariable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GroundRandomVariable"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GroundRandomVariable)object).getEntityName();
		return label == null || label.length() == 0 ?
			getString("_UI_GroundRandomVariable_type") :
			getString("_UI_GroundRandomVariable_type") + " " + label;
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
