/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cache.support;

import java.util.concurrent.Callable;

import org.springframework.cache.Cache;
import org.springframework.util.Assert;

/**
 * A no operation {@link Cache} implementation suitable for disabling caching.
 *
 * <p>Will simply accept any items into the cache not actually storing them.
 *
 * @author Costin Leau
 * @author Stephane Nicoll
 * @since 4.3.4
 */
public class NoOpCache implements Cache {

	private final String name;


	/**
	 * Create a {@link NoOpCache} instance with the specified name
	 * @param name the name of the cache
	 */
	public NoOpCache(String name) {
		Assert.notNull(name, "Cache name must not be null");
		this.name = name;
	}


	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Object getNativeCache() {
		return null;
	}

	@Override
	public ValueWrapper get(Object key) {
		return null;
	}

	@Override
	public <T> T get(Object key, Class<T> type) {
		return null;
	}

	@Override
	public <T> T get(Object key, Callable<T> valueLoader) {
		try {
			return valueLoader.call();
		}
		catch (Exception ex) {
			throw new ValueRetrievalException(key, valueLoader, ex);
		}
	}

	@Override
	public void put(Object key, Object value) {
	}

	@Override
	public ValueWrapper putIfAbsent(Object key, Object value) {
		return null;
	}

	@Override
	public void evict(Object key) {
	}

	@Override
	public void clear() {
	}

}
