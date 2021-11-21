/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("1 + 2 = " + new Calculator().add(1, 2));
	}

	@Loggable
	public int add(int a, int b) {
		return a + b;
	}

}
