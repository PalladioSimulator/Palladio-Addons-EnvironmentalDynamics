/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.provider;

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

import org.palladiosimulator.envdyn.environment.templatevariable.util.TemplatevariableAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplatevariableItemProviderAdapterFactory extends TemplatevariableAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
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
	public TemplatevariableItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateVariableDefinitionsItemProvider templateVariableDefinitionsItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemplateVariableDefinitionsAdapter()
	{
		if (templateVariableDefinitionsItemProvider == null)
		{
			templateVariableDefinitionsItemProvider = new TemplateVariableDefinitionsItemProvider(this);
		}

		return templateVariableDefinitionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateVariableItemProvider templateVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemplateVariableAdapter()
	{
		if (templateVariableItemProvider == null)
		{
			templateVariableItemProvider = new TemplateVariableItemProvider(this);
		}

		return templateVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.templatevariable.Argument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentItemProvider argumentItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.templatevariable.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentAdapter()
	{
		if (argumentItemProvider == null)
		{
			argumentItemProvider = new ArgumentItemProvider(this);
		}

		return argumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilisticTemplateFactorItemProvider probabilisticTemplateFactorItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProbabilisticTemplateFactorAdapter()
	{
		if (probabilisticTemplateFactorItemProvider == null)
		{
			probabilisticTemplateFactorItemProvider = new ProbabilisticTemplateFactorItemProvider(this);
		}

		return probabilisticTemplateFactorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenceRelationItemProvider dependenceRelationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependenceRelationAdapter()
	{
		if (dependenceRelationItemProvider == null)
		{
			dependenceRelationItemProvider = new DependenceRelationItemProvider(this);
		}

		return dependenceRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceRelationItemProvider persistenceRelationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersistenceRelationAdapter()
	{
		if (persistenceRelationItemProvider == null)
		{
			persistenceRelationItemProvider = new PersistenceRelationItemProvider(this);
		}

		return persistenceRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSliceRelationItemProvider timeSliceRelationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeSliceRelationAdapter()
	{
		if (timeSliceRelationItemProvider == null)
		{
			timeSliceRelationItemProvider = new TimeSliceRelationItemProvider(this);
		}

		return timeSliceRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateVariableGroupItemProvider templateVariableGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemplateVariableGroupAdapter()
	{
		if (templateVariableGroupItemProvider == null)
		{
			templateVariableGroupItemProvider = new TemplateVariableGroupItemProvider(this);
		}

		return templateVariableGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalVariableItemProvider logicalVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalVariableAdapter()
	{
		if (logicalVariableItemProvider == null)
		{
			logicalVariableItemProvider = new LogicalVariableItemProvider(this);
		}

		return logicalVariableItemProvider;
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
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
			{
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

		if (parentAdapterFactory != null)
		{
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
		if (templateVariableDefinitionsItemProvider != null) templateVariableDefinitionsItemProvider.dispose();
		if (templateVariableItemProvider != null) templateVariableItemProvider.dispose();
		if (argumentItemProvider != null) argumentItemProvider.dispose();
		if (probabilisticTemplateFactorItemProvider != null) probabilisticTemplateFactorItemProvider.dispose();
		if (dependenceRelationItemProvider != null) dependenceRelationItemProvider.dispose();
		if (persistenceRelationItemProvider != null) persistenceRelationItemProvider.dispose();
		if (timeSliceRelationItemProvider != null) timeSliceRelationItemProvider.dispose();
		if (templateVariableGroupItemProvider != null) templateVariableGroupItemProvider.dispose();
		if (logicalVariableItemProvider != null) logicalVariableItemProvider.dispose();
	}

}
