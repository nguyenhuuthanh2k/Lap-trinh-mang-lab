package DichSo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class LuongLamViec extends Thread {
	Socket socketClient;
	int id = -1;
	
	/**
	 * @param socketClient
	 * @param id
	 */

	public LuongLamViec(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
		
	}



	@Override
	public void run() {
		try {
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = socketClient.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
		
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
			while(true) {
				
			//moi nhap 1 so (0-9)
				//String chuoimoinhap_gui = "Mời nhập 1 so tu (0-9)";
				//buffwrite.write(chuoimoinhapa_gui + "\n");
				//buffwrite.flush();
				
			//nhan cau tra loi
				//String chuoimoinhan_nhan = buffRead.readLine();
				
				
				
			String chuoiNhan = buffR.readLine();
			int i = Integer.parseInt(chuoiNhan);
			//xu li
			switch(i) {
				case 0: chuoiNhan="Zero"; break;
				case 1: chuoiNhan="Zero"; break;
				case 2: chuoiNhan="Zero"; break;
				case 3: chuoiNhan="Zero"; break;
				case 4: chuoiNhan="Zero"; break;
				case 5: chuoiNhan="Zero"; break;
				case 6: chuoiNhan="Zero"; break;
				case 7: chuoiNhan="Zero"; break;
				case 8: chuoiNhan="Zero"; break;
				case 9: chuoiNhan="Zero"; break;
				case 10: break;
			}
			buffW.flush();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	
}
	}
