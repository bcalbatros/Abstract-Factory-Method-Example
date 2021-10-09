package data;

public class JobParameters {
    private boolean isEnabledPassword;
    private boolean isEnabledWatermark;
    private boolean isAddPlayer;
    private String password;
    private String watermarkText;
    private double watermarkFontSize;
    private ScreenLocationEnum watermarkPosition;
    private FileFormatEnum extension;

    public boolean isEnabledPassword() {
        return isEnabledPassword;
    }

    public void setEnabledPassword(boolean enabledPassword) {
        isEnabledPassword = enabledPassword;
    }

    public boolean isEnabledWatermark() {
        return isEnabledWatermark;
    }

    public void setEnabledWatermark(boolean enabledWatermark) {
        isEnabledWatermark = enabledWatermark;
    }

    public boolean isAddPlayer() {
        return isAddPlayer;
    }

    public void setAddPlayer(boolean addPlayer) {
        isAddPlayer = addPlayer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWatermarkText() {
        return watermarkText;
    }

    public void setWatermarkText(String watermarkText) {
        this.watermarkText = watermarkText;
    }

    public double getWatermarkFontSize() {
        return watermarkFontSize;
    }

    public void setWatermarkFontSize(double watermarkFontSize) {
        this.watermarkFontSize = watermarkFontSize;
    }

    public ScreenLocationEnum getWatermarkPosition() {
        return watermarkPosition;
    }

    public void setWatermarkPosition(ScreenLocationEnum watermarkPosition) {
        this.watermarkPosition = watermarkPosition;
    }

    public FileFormatEnum getExtension() {
        return extension;
    }

    public void setExtension(FileFormatEnum extension) {
        this.extension = extension;
    }
}
