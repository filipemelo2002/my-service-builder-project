/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.model.H7G5Folder;
import com.liferay.h7g5.service.base.H7G5FolderLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the h7g5 folder local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.h7g5.service.H7G5FolderLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see H7G5FolderLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.h7g5.model.H7G5Folder",
	service = AopService.class
)
public class H7G5FolderLocalServiceImpl extends H7G5FolderLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.h7g5.service.H7G5FolderLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.h7g5.service.H7G5FolderLocalServiceUtil</code>.
	 */

	public H7G5Folder addMyCustomH7G5Folder(String description, String name) {
		System.out.println(
			"Invoking H7G5FolderServiceImpl#addMyCustomH7G5Folder(" +
				description + ", " + name + ")");

		H7G5Folder h7g5Folder = h7g5FolderLocalService.createH7G5Folder(
			System.currentTimeMillis());

		h7g5Folder.setDescription(description);
		h7g5Folder.setName(name);

		h7g5FolderLocalService.addH7G5Folder(h7g5Folder);

		return h7g5Folder;
	}
}
