package ccs.archi.connector;

import ccsM2.Mode;
import ccsM2.Role;
import ccsM2.impl.CCSFactoryImpl;
import ccsM2.impl.ConnectorImpl;

public class RPC extends ConnectorImpl {
	
	public enum RoleName{
		caller,
		called,
		callerResponse,
		calledResponse
	}

	public RPC() {
		Role caller = CCSFactoryImpl.eINSTANCE.createRole();
		Role called = CCSFactoryImpl.eINSTANCE.createRole();
		Role callerResponse = CCSFactoryImpl.eINSTANCE.createRole();
		Role calledResponse = CCSFactoryImpl.eINSTANCE.createRole();
		
		calledResponse.setMode(Mode.REQUIRED);
		caller.setMode(Mode.REQUIRED);
		called.setMode(Mode.OFFERED);
		callerResponse.setMode(Mode.OFFERED);
		
		this.role.add(caller);
		this.role.add(called);
		this.role.add(callerResponse);
		this.role.add(calledResponse);
	}

}
