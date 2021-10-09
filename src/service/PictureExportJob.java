package service;

import service.IExportJob;

public class PictureExportJob implements IExportJob {
    @Override
    public void startExport() {}

    @Override
    public void exportPlanned() {}

    @Override
    public void exportRunning() {}

    @Override
    public void exportCancelled() {}

    @Override
    public void exportFailed() {}

    @Override
    public void exportPaused() {}
}
