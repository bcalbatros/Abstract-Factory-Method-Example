package service;

public interface IImportJob {
    void startImport();
    void importPlanned();
    void importRunning();
    void importCancelled();
    void importFailed();
    void importPaused();
}
