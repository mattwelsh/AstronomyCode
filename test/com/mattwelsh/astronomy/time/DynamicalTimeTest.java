/*
 * Copyright (C) 2019 by Matt Welsh
 * This library is free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation; either version
 * 2.1 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of the GNU
 * Lesser General Public License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */
package com.mattwelsh.astronomy.time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DynamicalTimeTest {

  @Before
  public void setUp() throws Exception {

    DeltaTCalculator meeus = DynamicalTime.MEEUS.getCalculator();
    DeltaTCalculator chapront = DynamicalTime.CHAPRONT.getCalculator();

  }

  @After
  public void tearDown() throws Exception {}

  @Test
  public void getStartDateGregorian() throws Exception {
  }


}