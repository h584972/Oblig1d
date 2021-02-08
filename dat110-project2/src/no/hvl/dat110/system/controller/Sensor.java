package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {
		
		int temp = 0;
		
		// TODO
		// implement marshalling, call and unmarshalling for read RPC method
		
		byte[] send = RPCUtils.marshallVoid(RPCID);
		
		byte[] motta = rpcclient.call(send);
		
		temp = RPCUtils.unmarshallInteger(motta);
		
		
		
		return temp;
	}
	
}
