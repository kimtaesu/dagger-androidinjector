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

package org.codepond.daggersample;

import android.app.Activity;

import org.codepond.daggersample.feature.FeatureActivity;
import org.codepond.daggersample.feature.FeatureSubComponent;
import org.codepond.daggersample.feature2.FeatureActivity2;
import org.codepond.daggersample.feature2.FeatureSubComponent2;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * This module contains all the binding to the sub component builders in the app
 */
@Module
public abstract class BuildersModule {
    @Binds
    @IntoMap
    @ActivityKey(FeatureActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindFeatureActivityInjectorFactory(FeatureSubComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(FeatureActivity2.class)
    abstract AndroidInjector.Factory<? extends Activity> bindFeatureActivity2InjectorFactory(FeatureSubComponent2.Builder builder);

    // Add another builder binding here
}
