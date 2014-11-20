package com.changhong.common.utils;

/**
 * User: Jack Wang
 * Date: 14-11-20
 * Time: 下午5:01
 */
public class PagingUtils {

    private int currentPage  = 1;
    /**
     * This parameter is used for check every page has how many items
     */
    private int maxItems = 20;
    /**
     * This parameter is used for check how many items in total list
     */
    private int numItems = 1;

    public PagingUtils(int numItems) {
		setNumItems(numItems);
	}

    public int getMaxItems(){
        return maxItems;
    }
    public int getStartPosition(){
        return (currentPage - 1) * maxItems;
    }

	public void setNumItems(int numItems) {
		if (numItems >= 0) this.numItems = numItems;
	}

	private void setCurrentPage(int currentPage) {
		final int numPages = getNumPages();
		if (currentPage > numPages) currentPage = numPages;
		if (currentPage < 1) currentPage = 1;
	  this.currentPage = currentPage;
  }

	public void setCurrentPage(String currentPage) {
		try {
			setCurrentPage(Integer.parseInt(currentPage));
		} catch (NumberFormatException e) {
			setCurrentPage(0);
		}
	}

	private void setMaxItems(int maxItems) {
		if (maxItems > 0) this.maxItems = maxItems;
	}

	public int getBegin() {
		return (currentPage - 1) * maxItems;
	}

	public int getEnd() {
		int end = currentPage * maxItems;
		return end > numItems ? numItems : end;
	}

	public int getNumItems() {
		return numItems;
	}

	public int getNumPages() {
		int num = numItems / maxItems;
		if (numItems % maxItems > 0) num++;
		return num;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getNextPage() {
		int next = currentPage + 1;
		if (next > getNumPages()) return -1;
		return currentPage + 1;
	}

	public int getPrevPage() {
		final int prev = currentPage - 1;
		if (prev < 1) return -1;
		return prev;
	}
}
