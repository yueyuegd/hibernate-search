/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.elasticsearch.client.impl;

import java.util.Properties;

import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.sniff.Sniffer;
import org.hibernate.search.engine.service.spi.Service;


/**
 * Creates the Elasticsearch client and sniffer.
 *
 * @author Yoann Rodiere
 */
public interface ElasticsearchClientFactory extends Service {

	RestClient createClient(String scopeName, Properties properties);

	Sniffer createSniffer(String scopeName, RestClient client, Properties properties);

}
