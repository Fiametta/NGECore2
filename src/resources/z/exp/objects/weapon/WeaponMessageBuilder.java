/*******************************************************************************
 * Copyright (c) 2013 <Project SWG>
 * 
 * This File is part of NGECore2.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Using NGEngine to work with NGECore2 is making a combined work based on NGEngine. 
 * Therefore all terms and conditions of the GNU Lesser General Public License cover the combination.
 ******************************************************************************/
package resources.z.exp.objects.weapon;

import java.util.Map;

import resources.z.exp.objects.Baseline;
import resources.z.exp.objects.Builder;
import resources.z.exp.objects.tangible.TangibleMessageBuilder;

public class WeaponMessageBuilder extends TangibleMessageBuilder {
	
	public WeaponMessageBuilder(WeaponObject weaponObject) {
		super(weaponObject);
	}
	
	public WeaponMessageBuilder() {
		super();
	}
	
	@Override
	public void buildBaseline3(Map<Integer, Builder> baselineBuilders, Map<Integer, Builder> deltaBuilders) {
		super.buildBaseline3(baselineBuilders, deltaBuilders);
	}
	
	@Override
	public void buildBaseline6(Map<Integer, Builder> baselineBuilders, Map<Integer, Builder> deltaBuilders) {
		super.buildBaseline6(baselineBuilders, deltaBuilders);
		
		baselineBuilders.put(13, new Builder() {
			
			public byte[] build() {
				return Baseline.createBuffer(4).putInt(((WeaponObject) object).getWeaponType()).array();
			}
			
		});
		
		deltaBuilders.put(13, new Builder() {
			
			public byte[] build() {
				return Baseline.createBuffer(4).putInt(((WeaponObject) object).getWeaponType()).array();
			}
			
		});
		
	}
	
	@Override
	public void buildBaseline8(Map<Integer, Builder> baselineBuilders, Map<Integer, Builder> deltaBuilders) {
		super.buildBaseline8(baselineBuilders, deltaBuilders);
	}
	
	@Override
	public void buildBaseline9(Map<Integer, Builder> baselineBuilders, Map<Integer, Builder> deltaBuilders) {
		super.buildBaseline9(baselineBuilders, deltaBuilders);
	}
	
}
