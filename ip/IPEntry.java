package ip;


/**
 * <pre>
 * һ��IP��Χ��¼�������������Һ�����Ҳ������ʼIP�ͽ���IP
 * </pre>
 * 
 * @author �����
 */
public class IPEntry {
    public String beginIp;
    public String endIp;
    public String country;
    public String area;
    
    /**
     * ���캯��
     */
    public IPEntry() {
        beginIp = endIp = country = area = "";
    }
}