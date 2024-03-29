/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.palladiosimulator.envdyn.environment.dynamicmodel.util.DynamicmodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicmodelItemProviderAdapterFactory extends DynamicmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicmodelItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicBehaviourRepositoryItemProvider dynamicBehaviourRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicBehaviourRepositoryAdapter()
	{
		if (dynamicBehaviourRepositoryItemProvider == null) {
			dynamicBehaviourRepositoryItemProvider = new DynamicBehaviourRepositoryItemProvider(this);
		}

		return dynamicBehaviourRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicBehaviourExtensionItemProvider dynamicBehaviourExtensionItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicBehaviourExtensionAdapter()
	{
		if (dynamicBehaviourExtensionItemProvider == null) {
			dynamicBehaviourExtensionItemProvider = new DynamicBehaviourExtensionItemProvider(this);
		}

		return dynamicBehaviourExtensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InductiveDynamicBehaviourItemProvider inductiveDynamicBehaviourItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInductiveDynamicBehaviourAdapter()
	{
		if (inductiveDynamicBehaviourItemProvider == null) {
			inductiveDynamicBehaviourItemProvider = new InductiveDynamicBehaviourItemProvider(this);
		}

		return inductiveDynamicBehaviourItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterTimeSliceInductionItemProvider interTimeSliceInductionItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterTimeSliceInductionAdapter()
	{
		if (interTimeSliceInductionItemProvider == null) {
			interTimeSliceInductionItemProvider = new InterTimeSliceInductionItemProvider(this);
		}

		return interTimeSliceInductionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntraTimeSliceInductionItemProvider intraTimeSliceInductionItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntraTimeSliceInductionAdapter()
	{
		if (intraTimeSliceInductionItemProvider == null) {
			intraTimeSliceInductionItemProvider = new IntraTimeSliceInductionItemProvider(this);
		}

		return intraTimeSliceInductionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalDynamicItemProvider temporalDynamicItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemporalDynamicAdapter()
	{
		if (temporalDynamicItemProvider == null) {
			temporalDynamicItemProvider = new TemporalDynamicItemProvider(this);
		}

		return temporalDynamicItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose()
	{
		if (dynamicBehaviourRepositoryItemProvider != null) dynamicBehaviourRepositoryItemProvider.dispose();
		if (dynamicBehaviourExtensionItemProvider != null) dynamicBehaviourExtensionItemProvider.dispose();
		if (inductiveDynamicBehaviourItemProvider != null) inductiveDynamicBehaviourItemProvider.dispose();
		if (interTimeSliceInductionItemProvider != null) interTimeSliceInductionItemProvider.dispose();
		if (intraTimeSliceInductionItemProvider != null) intraTimeSliceInductionItemProvider.dispose();
		if (temporalDynamicItemProvider != null) temporalDynamicItemProvider.dispose();
	}

}
