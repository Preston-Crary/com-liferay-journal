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

package com.liferay.journal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the JournalArticleLocalization service. Represents a row in the &quot;JournalArticleLocalization&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.journal.model.impl.JournalArticleLocalizationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.journal.model.impl.JournalArticleLocalizationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JournalArticleLocalization
 * @see com.liferay.journal.model.impl.JournalArticleLocalizationImpl
 * @see com.liferay.journal.model.impl.JournalArticleLocalizationModelImpl
 * @generated
 */
@ProviderType
public interface JournalArticleLocalizationModel extends BaseModel<JournalArticleLocalization>,
	MVCCModel, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a journal article localization model instance should use the {@link JournalArticleLocalization} interface instead.
	 */

	/**
	 * Returns the primary key of this journal article localization.
	 *
	 * @return the primary key of this journal article localization
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this journal article localization.
	 *
	 * @param primaryKey the primary key of this journal article localization
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this journal article localization.
	 *
	 * @return the mvcc version of this journal article localization
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this journal article localization.
	 *
	 * @param mvccVersion the mvcc version of this journal article localization
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the journal article localization ID of this journal article localization.
	 *
	 * @return the journal article localization ID of this journal article localization
	 */
	public long getJournalArticleLocalizationId();

	/**
	 * Sets the journal article localization ID of this journal article localization.
	 *
	 * @param journalArticleLocalizationId the journal article localization ID of this journal article localization
	 */
	public void setJournalArticleLocalizationId(
		long journalArticleLocalizationId);

	/**
	 * Returns the company ID of this journal article localization.
	 *
	 * @return the company ID of this journal article localization
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this journal article localization.
	 *
	 * @param companyId the company ID of this journal article localization
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the journal article pk of this journal article localization.
	 *
	 * @return the journal article pk of this journal article localization
	 */
	public long getJournalArticlePK();

	/**
	 * Sets the journal article pk of this journal article localization.
	 *
	 * @param journalArticlePK the journal article pk of this journal article localization
	 */
	public void setJournalArticlePK(long journalArticlePK);

	/**
	 * Returns the language ID of this journal article localization.
	 *
	 * @return the language ID of this journal article localization
	 */
	@AutoEscape
	public String getLanguageId();

	/**
	 * Sets the language ID of this journal article localization.
	 *
	 * @param languageId the language ID of this journal article localization
	 */
	public void setLanguageId(String languageId);

	/**
	 * Returns the title of this journal article localization.
	 *
	 * @return the title of this journal article localization
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this journal article localization.
	 *
	 * @param title the title of this journal article localization
	 */
	public void setTitle(String title);

	/**
	 * Returns the description of this journal article localization.
	 *
	 * @return the description of this journal article localization
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this journal article localization.
	 *
	 * @param description the description of this journal article localization
	 */
	public void setDescription(String description);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(JournalArticleLocalization journalArticleLocalization);

	@Override
	public int hashCode();

	@Override
	public CacheModel<JournalArticleLocalization> toCacheModel();

	@Override
	public JournalArticleLocalization toEscapedModel();

	@Override
	public JournalArticleLocalization toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}