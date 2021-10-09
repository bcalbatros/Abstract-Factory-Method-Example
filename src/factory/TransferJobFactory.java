package factory;

import data.TransferTypeEnum;
import service.IExportJob;
import service.IImportJob;

public abstract class TransferJobFactory {
    public abstract IImportJob createImportJob(TransferTypeEnum transferType);
    public abstract IExportJob createExportJob(TransferTypeEnum transferType);
}
