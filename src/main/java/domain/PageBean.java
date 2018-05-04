package domain;

import java.util.List;

public class PageBean<T> {
    private int pc;//��ǰҳ���ҳ����  jsp����
    private int ps;//��ǰҳ��ļ�¼��  �Լ�����
    private int all;//���ݿ���ܼ�¼��  ���ݿ��ѯ
    private String url;//ҳ���·��  ���ݿ��ѯ
    private List<T> beanlist;//�������ݵļ���
    /**
     * ������������ȡ���ҳ��
     * �ܼ�¼��all���Ե�ǰҳ���¼��psȡ����tp
     * �����������ҳ������һ tp+=1
     * @return
     */
    public int getTp(){
    	int tp = (int) Math.ceil(1.0 * all / ps);
		return tp;
    }
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public int getAll() {
		return all;
	}
	public void setAll(int all) {
		this.all = all;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<T> getBeanlist() {
		return beanlist;
	}
	public void setBeanlist(List<T> beanlist) {
		this.beanlist = beanlist;
	}
    
    
}
