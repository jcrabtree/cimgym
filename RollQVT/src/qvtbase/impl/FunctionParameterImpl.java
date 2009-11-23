/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtbase.impl;

import emof.Parameter;

import emof.impl.ParameterImpl;

import essentialocl.EssentialoclPackage;
import essentialocl.LetExp;
import essentialocl.OclExpression;
import essentialocl.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import qvtbase.FunctionParameter;
import qvtbase.QvtbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link qvtbase.impl.FunctionParameterImpl#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link qvtbase.impl.FunctionParameterImpl#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link qvtbase.impl.FunctionParameterImpl#getBindParameter <em>Bind Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionParameterImpl extends ParameterImpl implements FunctionParameter {
	/**
	 * The cached value of the '{@link #getInitExpression() <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitExpression()
	 * @generated
	 * @ordered
	 */
	protected OclExpression initExpression;

	/**
	 * The cached value of the '{@link #getBindParameter() <em>Bind Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter bindParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtbasePackage.Literals.FUNCTION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getInitExpression() {
		return initExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitExpression(OclExpression newInitExpression, NotificationChain msgs) {
		OclExpression oldInitExpression = initExpression;
		initExpression = newInitExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION, oldInitExpression, newInitExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitExpression(OclExpression newInitExpression) {
		if (newInitExpression != initExpression) {
			NotificationChain msgs = null;
			if (initExpression != null)
				msgs = ((InternalEObject)initExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION, null, msgs);
			if (newInitExpression != null)
				msgs = ((InternalEObject)newInitExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION, null, msgs);
			msgs = basicSetInitExpression(newInitExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION, newInitExpression, newInitExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExp getLetExp() {
		if (eContainerFeatureID() != QvtbasePackage.FUNCTION_PARAMETER__LET_EXP) return null;
		return (LetExp)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLetExp(LetExp newLetExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLetExp, QvtbasePackage.FUNCTION_PARAMETER__LET_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetExp(LetExp newLetExp) {
		if (newLetExp != eInternalContainer() || (eContainerFeatureID() != QvtbasePackage.FUNCTION_PARAMETER__LET_EXP && newLetExp != null)) {
			if (EcoreUtil.isAncestor(this, newLetExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLetExp != null)
				msgs = ((InternalEObject)newLetExp).eInverseAdd(this, EssentialoclPackage.LET_EXP__VARIABLE, LetExp.class, msgs);
			msgs = basicSetLetExp(newLetExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtbasePackage.FUNCTION_PARAMETER__LET_EXP, newLetExp, newLetExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getBindParameter() {
		if (bindParameter != null && bindParameter.eIsProxy()) {
			InternalEObject oldBindParameter = (InternalEObject)bindParameter;
			bindParameter = (Parameter)eResolveProxy(oldBindParameter);
			if (bindParameter != oldBindParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtbasePackage.FUNCTION_PARAMETER__BIND_PARAMETER, oldBindParameter, bindParameter));
			}
		}
		return bindParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetBindParameter() {
		return bindParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindParameter(Parameter newBindParameter) {
		Parameter oldBindParameter = bindParameter;
		bindParameter = newBindParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtbasePackage.FUNCTION_PARAMETER__BIND_PARAMETER, oldBindParameter, bindParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtbasePackage.FUNCTION_PARAMETER__LET_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLetExp((LetExp)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION:
				return basicSetInitExpression(null, msgs);
			case QvtbasePackage.FUNCTION_PARAMETER__LET_EXP:
				return basicSetLetExp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QvtbasePackage.FUNCTION_PARAMETER__LET_EXP:
				return eInternalContainer().eInverseRemove(this, EssentialoclPackage.LET_EXP__VARIABLE, LetExp.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION:
				return getInitExpression();
			case QvtbasePackage.FUNCTION_PARAMETER__LET_EXP:
				return getLetExp();
			case QvtbasePackage.FUNCTION_PARAMETER__BIND_PARAMETER:
				if (resolve) return getBindParameter();
				return basicGetBindParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION:
				setInitExpression((OclExpression)newValue);
				return;
			case QvtbasePackage.FUNCTION_PARAMETER__LET_EXP:
				setLetExp((LetExp)newValue);
				return;
			case QvtbasePackage.FUNCTION_PARAMETER__BIND_PARAMETER:
				setBindParameter((Parameter)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION:
				setInitExpression((OclExpression)null);
				return;
			case QvtbasePackage.FUNCTION_PARAMETER__LET_EXP:
				setLetExp((LetExp)null);
				return;
			case QvtbasePackage.FUNCTION_PARAMETER__BIND_PARAMETER:
				setBindParameter((Parameter)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION:
				return initExpression != null;
			case QvtbasePackage.FUNCTION_PARAMETER__LET_EXP:
				return getLetExp() != null;
			case QvtbasePackage.FUNCTION_PARAMETER__BIND_PARAMETER:
				return bindParameter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				case QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION: return EssentialoclPackage.VARIABLE__INIT_EXPRESSION;
				case QvtbasePackage.FUNCTION_PARAMETER__LET_EXP: return EssentialoclPackage.VARIABLE__LET_EXP;
				case QvtbasePackage.FUNCTION_PARAMETER__BIND_PARAMETER: return EssentialoclPackage.VARIABLE__BIND_PARAMETER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				case EssentialoclPackage.VARIABLE__INIT_EXPRESSION: return QvtbasePackage.FUNCTION_PARAMETER__INIT_EXPRESSION;
				case EssentialoclPackage.VARIABLE__LET_EXP: return QvtbasePackage.FUNCTION_PARAMETER__LET_EXP;
				case EssentialoclPackage.VARIABLE__BIND_PARAMETER: return QvtbasePackage.FUNCTION_PARAMETER__BIND_PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionParameterImpl