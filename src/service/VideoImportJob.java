package service;

public class VideoImportJob  implements IImportJob{
    @Override
    public void startImport() {}

    @Override
    public void importPlanned() {}

    @Override
    public void importRunning() {}

    @Override
    public void importCancelled() {}

    @Override
    public void importFailed() {}

    @Override
    public void importPaused() {}
}
