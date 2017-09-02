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

package org.codepond.daggersample.feature2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.codepond.daggersample.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;


public class FeatureActivity2 extends AppCompatActivity {
    public static final String EXTRA_SOME_ID = "some_id";
    String someId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        someId = getIntent().getStringExtra(EXTRA_SOME_ID);
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
