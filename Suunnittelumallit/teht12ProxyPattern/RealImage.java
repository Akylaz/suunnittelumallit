package teht12ProxyPattern;

class RealImage implements Image {
	private boolean loaded;
    private String filename = null;
    /**
     * Constructor
     * @param filename
     */
    public RealImage(final String filename) {
        this.filename = filename;
        loaded = false;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
    	loaded = true;
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
    	if(!loaded) {
    		loadImageFromDisk();
    	}
        System.out.println("Displaying " + filename);
    }

	@Override
	public void showData() {
		System.out.println(filename);

	}

}

