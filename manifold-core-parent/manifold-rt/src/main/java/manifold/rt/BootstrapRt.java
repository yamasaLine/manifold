/*
 * Copyright (c) 2020 - Manifold Systems LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package manifold.rt;

import manifold.rt.api.IBootstrap;
import manifold.util.NecessaryEvilUtil;

public class BootstrapRt implements IBootstrap
{
  private boolean _booted;

  @Override
  public boolean boot()
  {
    if( !_booted )
    {
      _booted = true;
      NecessaryEvilUtil.bypassJava9Security();
    }
    return true;
  }
}
