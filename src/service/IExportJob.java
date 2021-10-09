package service;

public interface IExportJob {
    void startExport();
    void exportPlanned();
    void exportRunning();
    void exportCancelled();
    void exportFailed();
    void exportPaused();
}
