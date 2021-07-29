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

import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticModel;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage;

import org.palladiosimulator.envdyn.environment.templatevariable.provider.EnvironmentaldynamicsEditPlugin;

import tools.mdsd.modelingfoundations.identifier.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalProbabilisticModelItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalProbabilisticModelItemProvider(AdapterFactory adapterFactory) {
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

			addInstantiatedFactorPropertyDescriptor(object);
			addDistributionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instantiated Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstantiatedFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalProbabilisticModel_instantiatedFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalProbabilisticModel_instantiatedFactor_feature", "_UI_LocalProbabilisticModel_type"),
				 StaticmodelPackage.Literals.LOCAL_PROBABILISTIC_MODEL__INSTANTIATED_FACTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distribution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistributionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalProbabilisticModel_distribution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalProbabilisticModel_distribution_feature", "_UI_LocalProbabilisticModel_type"),
				 StaticmodelPackage.Literals.LOCAL_PROBABILISTIC_MODEL__DISTRIBUTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns LocalProbabilisticModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LocalProbabilisticModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LocalProbabilisticModel)object).getEntityName();
		return label == null || label.length() == 0 ?
			getString("_UI_LocalProbabilisticModel_type") :
			getString("_UI_LocalProbabilisticModel_type") + " " + label;
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
