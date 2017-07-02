package tw.brad.j2ee;

public class BradAPI {
	// header string as ...
	// form-data; name="upload"; filename="C:\Users\user01\Documents\5414.png"
	// return 5414.png
	public static String getHeaderFileName(String header) {
		int start = header.indexOf("filename");
		String temp = header.substring(start+10);
		String filename = temp.substring(0, temp.lastIndexOf("\""));
		int s1 = filename.lastIndexOf("\\");
		String sfile = null;
		if (s1>=0) {
			sfile = filename.substring(
				filename.lastIndexOf("\\")+1);
		}else {
			sfile = filename;
		}
		return sfile;
	}
}
