/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.analyzer.definition;

/**
 * @author Yoann Rodiere
 *
 * @hsearch.experimental The specific API of this DSL is a prototype.
 */
public interface LuceneCharFilterDefinitionContext extends LuceneAnalyzerDefinitionWithTokenizerContext {

	/**
	 * Set a char filter parameter.
	 *
	 * @param name The name of the parameter.
	 * @param value The value of the parameter.
	 * @return This context, allowing to chain calls.
	 */
	@Override
	LuceneCharFilterDefinitionContext param(String name, String value);

}
