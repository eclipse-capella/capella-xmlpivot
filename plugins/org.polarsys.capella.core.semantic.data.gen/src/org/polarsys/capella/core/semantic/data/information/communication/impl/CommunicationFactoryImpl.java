/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *     
 * Contributors:
 *    Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.core.semantic.data.information.communication.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.semantic.data.information.communication.CommunicationFactory;
import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLink;
import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkKind;
import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol;
import org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage;
import org.polarsys.capella.core.semantic.data.information.communication.Message;
import org.polarsys.capella.core.semantic.data.information.communication.MessageReference;
import org.polarsys.capella.core.semantic.data.information.communication.Signal;
import org.polarsys.capella.core.semantic.data.information.communication.SignalInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationFactoryImpl extends EFactoryImpl implements CommunicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationFactory init() {
		try {
			CommunicationFactory theCommunicationFactory = (CommunicationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/capella/core/information/communication/0.8.0/semantic"); 
			if (theCommunicationFactory != null) {
				return theCommunicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommunicationPackage.EXCEPTION: return createException();
			case CommunicationPackage.MESSAGE: return createMessage();
			case CommunicationPackage.MESSAGE_REFERENCE: return createMessageReference();
			case CommunicationPackage.SIGNAL: return createSignal();
			case CommunicationPackage.SIGNAL_INSTANCE: return createSignalInstance();
			case CommunicationPackage.COMMUNICATION_LINK: return createCommunicationLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CommunicationPackage.COMMUNICATION_LINK_KIND:
				return createCommunicationLinkKindFromString(eDataType, initialValue);
			case CommunicationPackage.COMMUNICATION_LINK_PROTOCOL:
				return createCommunicationLinkProtocolFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CommunicationPackage.COMMUNICATION_LINK_KIND:
				return convertCommunicationLinkKindToString(eDataType, instanceValue);
			case CommunicationPackage.COMMUNICATION_LINK_PROTOCOL:
				return convertCommunicationLinkProtocolToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.capella.core.semantic.data.information.communication.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageReference createMessageReference() {
		MessageReferenceImpl messageReference = new MessageReferenceImpl();
		return messageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstance createSignalInstance() {
		SignalInstanceImpl signalInstance = new SignalInstanceImpl();
		return signalInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLink createCommunicationLink() {
		CommunicationLinkImpl communicationLink = new CommunicationLinkImpl();
		return communicationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkKind createCommunicationLinkKindFromString(EDataType eDataType, String initialValue) {
		CommunicationLinkKind result = CommunicationLinkKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationLinkKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkProtocol createCommunicationLinkProtocolFromString(EDataType eDataType, String initialValue) {
		CommunicationLinkProtocol result = CommunicationLinkProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationLinkProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPackage getCommunicationPackage() {
		return (CommunicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationPackage getPackage() {
		return CommunicationPackage.eINSTANCE;
	}

} //CommunicationFactoryImpl