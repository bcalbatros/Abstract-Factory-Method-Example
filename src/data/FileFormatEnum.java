package data;

public enum FileFormatEnum {
    AVI(".avi"),
    MP4(".mp4"),
    MKV(".mkv"),
    AXP(".axp"),
    RAW(".raw"),
    JPG(".jpg"),
    PNG(".png"),
    GIF(".gif"),
    TIFF(".tiff"),
    BMP(".bmp");

    private final String extension;

    FileFormatEnum(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return this.extension;
    }

    public static FileFormatEnum fromString(String text) {
        FileFormatEnum extension = null;

        for (FileFormatEnum value : FileFormatEnum.values()) {
            if (value.extension.equalsIgnoreCase(text)) {
                extension = value;
                break;
            }
        }

        return extension;
    }
}
