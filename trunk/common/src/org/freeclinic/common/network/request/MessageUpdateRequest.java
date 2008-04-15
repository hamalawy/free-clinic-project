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
package org.freeclinic.common.network.request;

import java.util.Date;

import org.freeclinic.common.type.ClinicRequest;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageUpdateRequest extends ClinicRequest {
	
	public static final String LAST_UPDATE = "lastUpdate";

	public MessageUpdateRequest() {
		super(RequestType.MESSAGE_UPDATE);
		setLastUpdate(new Date(0L));
	}
	
	public MessageUpdateRequest(Date date)
	{
		super(RequestType.MESSAGE_UPDATE);
		setLastUpdate(date);
	}	
	
	public MessageUpdateRequest(JSONObject json) throws JSONException {
		super(json);
	}
	
	@Override
	protected void init() {
		super.init();
		registerLong(LAST_UPDATE);
	}
	
	public Date getLastUpdate() {
		return new Date(getLong(LAST_UPDATE));
	}
	
	public void setLastUpdate(Date lastUpdate) {
		setLong(LAST_UPDATE, lastUpdate.getTime());
	}
	

}
