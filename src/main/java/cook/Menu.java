/*
 * Copyright 2017-Present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class Menu {

	private final String feed;

	private final String prime;

	private final String name;

	private final String azure;

	private final String logging;

	private final String monitoring;

	private final String rabbitmq; 

	public Menu(
			@Value("${feed:none}") String feed,
			@Value("${prime:none}") String prime,
			@Value("${name:none}") String name,
			@Value("${azure:none}") String azure,
			@Value("${logging:none}") String logging,
			@Value("${monitoring:none}") String monitoring,
			@Value("${rabbitmq:none}") String rabbitmq) {
		this.feed = feed;
		this.prime = prime;
		this.name = name;
		this.azure = azure;
		this.logging = logging;
		this.monitoring = monitoring;
		this.rabbitmq = rabbitmq;
	}

	public String getFeed() {
		return feed;
	}

	public String getPrime() {
		return prime;
	}

	public String getName() {
		return name;
	}

	public String getAzure() {
		return azure;
	}

	public String getLogging() {
		return logging;
	}

	public String getMonitoring() {
		return monitoring;
	}

	public String getRabbitMQ() {
		return rabbitmq;
	}

	public String writeOutput(){
		String output = "<b>Feed: </b>" + getFeed() + "<br>" + "<b>Prime: </b>" + getPrime() + "<br>" + "<b>Name: </b>" + getName() + "<br>" + "<b>Azure: </b>" + getAzure() + "<br>" + "<b>Logging:</b>" + getLogging() + "<br>" + "<b>Monitoring:</b> " + getMonitoring() + "<br>" + "<b>Rabbit: </b> " + getRabbitMQ();
		return output; 
	}		
}
