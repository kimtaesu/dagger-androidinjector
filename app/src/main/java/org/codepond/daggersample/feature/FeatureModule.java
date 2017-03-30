/*
 * Copyright 2017 Nimrod Dayan CodePond.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codepond.daggersample.feature;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Feature level module holds all the bindings needed for this feature.
 * Note that I chose to leave this class in Java instead of converting it to Kotlin since the equivalent
 * code in Kotlin didn't produce the same bytecode like the Java one. Let me know if you know what I was
 * doing wrong.
 *
 * <pre>
 * <code>
 *
 * &#064;Module
 * abstract class FeatureModule {
 *   &#064;Binds internal abstract fun provideFeatureView(featureActivity: FeatureActivity): FeatureView
 *   &#064;Module
 *   companion object {
 *     &#064;JvmStatic @Provides @Named("someId")
 *     fun provideSomeId(featureActivity: FeatureActivity): String {
 *       return featureActivity.someId
 *     }
 *   }
 * }
 * }
 * </code>
 * </pre>
 */
@Module
public abstract class FeatureModule {
    @Binds abstract FeatureView provideFeatureView(FeatureActivity featureActivity);

    @Provides @Named("someId") static String provideSomeId(FeatureActivity featureActivity) {
        return featureActivity.someId;
    }
}
