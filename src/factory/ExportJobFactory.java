package factory;

import data.TransferTypeEnum;
import service.IImportJob;
import service.PictureExportJob;
import service.VideoExportJob;
import service.IExportJob;

public class ExportJobFactory extends TransferJobFactory {
    @Override
    public IImportJob createImportJob(TransferTypeEnum transferType) {
        return null;
    }

    @Override
    public IExportJob createExportJob(TransferTypeEnum transferType) {
        IExportJob exportJob = null;

        if (transferType == TransferTypeEnum.PICTURE_EXPORT) {
            exportJob = new PictureExportJob();
        } else if (transferType == TransferTypeEnum.VIDEO_EXPORT) {
            exportJob = new VideoExportJob();
        }

        return exportJob;
    }
}
