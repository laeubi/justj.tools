/**
 * Copyright (c) 2020 Eclipse contributors and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.justj.codegen.model;


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.justj.codegen.model.JVM#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.justj.codegen.model.JVM#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.justj.codegen.model.JVM#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.justj.codegen.model.JVM#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.justj.codegen.model.JVM#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.justj.codegen.model.JVM#getAboutTextExtra <em>About Text Extra</em>}</li>
 *   <li>{@link org.eclipse.justj.codegen.model.JVM#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see org.eclipse.justj.codegen.model.ModelPackage#getJVM()
 * @model
 * @generated
 */
public interface JVM extends Copyrightable, Touchable
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.justj.codegen.model.ModelPackage#getJVM_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.justj.codegen.model.JVM#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.eclipse.justj.codegen.model.ModelPackage#getJVM_Version()
   * @model required="true"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.eclipse.justj.codegen.model.JVM#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.eclipse.justj.codegen.model.ModelPackage#getJVM_Label()
   * @model required="true"
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.eclipse.justj.codegen.model.JVM#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.eclipse.justj.codegen.model.ModelPackage#getJVM_Description()
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyMultiLine='true'"
   *        extendedMetaData="kind='element'"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.justj.codegen.model.JVM#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.justj.codegen.model.Variant}.
   * It is bidirectional and its opposite is '{@link org.eclipse.justj.codegen.model.Variant#getJVM <em>JVM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see org.eclipse.justj.codegen.model.ModelPackage#getJVM_Variants()
   * @see org.eclipse.justj.codegen.model.Variant#getJVM
   * @model opposite="jVM" containment="true" required="true"
   *        extendedMetaData="name='variant' kind='element'"
   * @generated
   */
  EList<Variant> getVariants();

  /**
   * Returns the value of the '<em><b>Model</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.justj.codegen.model.Model#getJVMs <em>JV Ms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' container reference.
   * @see #setModel(Model)
   * @see org.eclipse.justj.codegen.model.ModelPackage#getJVM_Model()
   * @see org.eclipse.justj.codegen.model.Model#getJVMs
   * @model opposite="jVMs" resolveProxies="false"
   * @generated
   */
  Model getModel();

  /**
   * Sets the value of the '{@link org.eclipse.justj.codegen.model.JVM#getModel <em>Model</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' container reference.
   * @see #getModel()
   * @generated
   */
  void setModel(Model value);

  /**
   * Returns the value of the '<em><b>About Text Extra</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>About Text Extra</em>' attribute.
   * @see #setAboutTextExtra(String)
   * @see org.eclipse.justj.codegen.model.ModelPackage#getJVM_AboutTextExtra()
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyMultiLine='true'"
   *        extendedMetaData="kind='element'"
   * @generated
   */
  String getAboutTextExtra();

  /**
   * Sets the value of the '{@link org.eclipse.justj.codegen.model.JVM#getAboutTextExtra <em>About Text Extra</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>About Text Extra</em>' attribute.
   * @see #getAboutTextExtra()
   * @generated
   */
  void setAboutTextExtra(String value);

} // JVM
