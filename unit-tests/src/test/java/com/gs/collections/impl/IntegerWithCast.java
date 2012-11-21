/*
 * Copyright 2012 Goldman Sachs.
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

package com.gs.collections.impl;

import com.gs.collections.api.block.function.Function;

public final class IntegerWithCast
{
    public static final Function<Integer, IntegerWithCast> CONSTRUCT = new Function<Integer, IntegerWithCast>()
    {
        public IntegerWithCast valueOf(Integer value)
        {
            return new IntegerWithCast(value);
        }
    };

    private final int value;

    public IntegerWithCast(int value)
    {
        this.value = value;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null)
        {
            return false;
        }

        IntegerWithCast that = (IntegerWithCast) o;
        return this.value == that.value;
    }

    @Override
    public int hashCode()
    {
        return this.value;
    }
}