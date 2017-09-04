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

package org.codepond.daggersample.di;


import org.codepond.daggersample.scope.ActivityScope;
import org.codepond.daggersample.ui.detail.DetailActivity;
import org.codepond.daggersample.ui.detail.DetailActivityModule;
import org.codepond.daggersample.ui.detail.DetailsFragmentProviderModule;
import org.codepond.daggersample.ui.main.MainActivity;
import org.codepond.daggersample.ui.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by cadri on 2017. 08. 01..
 */

@Module
public abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = {DetailActivityModule.class, DetailsFragmentProviderModule.class})
    abstract DetailActivity bindDeatilActivity();

}
