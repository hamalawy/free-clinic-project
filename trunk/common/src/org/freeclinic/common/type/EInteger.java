/*	
 
  	Free Clinic Project
 
 	Copyright (c) 2007, 2008  Free Clinic Project  
 		A project by students of the University of California San Diego.  All rights reserved.
	
	This file is part of the Free Clinic Project.

    The Free Clinic Project is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    The Free Clinic Project is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with the Free Clinic Project.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.freeclinic.common.type;

import org.json.JSONException;
import org.json.JSONObject;

public class EInteger extends Extra<Integer> implements JSONSerializable {

	@Override
	public JSONObject JSON() throws JSONException {
		JSONObject output = super.JSON();
		output.put(NUGGET,nugget);
		return output;
	}

	@Override
	public void unmarshallJSON(JSONObject json) throws JSONException {
		super.unmarshallJSON(json);
		set(json.getInt(NUGGET));
	}

	public EInteger(Integer nug) {
		super(nug);
	}
	public EInteger(JSONObject json) throws JSONException {
		super(json);
		this.unmarshallJSON(json);
	}
}
