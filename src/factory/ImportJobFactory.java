package factory;

import data.TransferTypeEnum;
import service.*;

public class ImportJobFactory extends TransferJobFactory {
    @Override
    public IImportJob createImportJob(TransferTypeEnum transferType) {
        IImportJob importJob = null;

        if (transferType == TransferTypeEnum.PICTURE_EXPORT) {
            importJob = new PictureImportJob();
        } else if (transferType == TransferTypeEnum.VIDEO_EXPORT) {
            importJob = new VideoImportJob();
        }

        return importJob;
    }

    @Override
    public IExportJob createExportJob(TransferTypeEnum transferType) {
        return null;
    }
}
